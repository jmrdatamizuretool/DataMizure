package com.jmr.batch.listener;

import java.util.Optional;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.CsvUploadMonitor;
import com.jmr.repository.CsvUploadMonitorRepository;
@Component
public class StepResultListener implements StepExecutionListener{
	@Autowired
	private CsvUploadMonitorRepository repo;
	private ExecutionContext executionContext;
	@BeforeStep
	public void beforeStep(StepExecution stepExecution) {
		this.executionContext = stepExecution.getExecutionContext();
	}

	@AfterStep
	public ExitStatus afterStep(StepExecution stepExecution) {
		
		Integer totalRecords = Integer.sum(stepExecution.getReadCount(), stepExecution.getReadSkipCount());
		Integer totalSkipped = Integer.sum(stepExecution.getWriteSkipCount(), stepExecution.getProcessSkipCount());
		Integer failedRecords = Integer.sum(totalSkipped, stepExecution.getReadSkipCount());
		
		
		/*System.out.println("Total records>>>>: " + totalRecords);
		System.out.println("Number of success records>>>: " + stepExecution.getWriteCount());
		System.out.println("Number of failed records>>>>: " + failedRecords);
		
		
		System.out.println("readCount	"+stepExecution.getReadCount());
		System.out.println("writeCount	"+stepExecution.getWriteCount());
		System.out.println("commitCount	"+stepExecution.getCommitCount());
		System.out.println("rollbackCount	"+stepExecution.getRollbackCount());
		System.out.println("readSkipCount	"+stepExecution.getReadSkipCount());
		System.out.println("processSkipCount	"+stepExecution.getProcessSkipCount());
		System.out.println("writeSkipCount	"+stepExecution.getWriteSkipCount());*/
		
		
		String trans_table = stepExecution.getStepName();
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById(trans_table);
		csvUploadMonitor.get().setTotal_records(totalRecords.longValue());
		csvUploadMonitor.get().setSuccess_records(Long.valueOf(stepExecution.getWriteCount()));
		csvUploadMonitor.get().setFailed_records(failedRecords.longValue());
		repo.save(csvUploadMonitor.get());
		
		
		return stepExecution.getExitStatus();
		
	}

	public ExecutionContext getExecutionContext() {
		return executionContext;
	}

	public void setExecutionContext(ExecutionContext executionContext) {
		this.executionContext = executionContext;
	}

}
