package com.jmr.controller;

import java.util.Optional;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jmr.batch.entity.CsvUploadMonitor;
import com.jmr.repository.CsvUploadMonitorRepository;

@RestController
@RequestMapping("/springbatch")
public class CsvUploadController {
	@Autowired
	private JobLauncher jobLauncher;

	// CIF Jobs
	@Autowired
	private Job sttmuploadcustomer;
	@Autowired
	private Job sttmuploadcustpersonal;
	@Autowired
	private Job sttmuploadcustprofessional;
	@Autowired
	private Job sttmuploadcustcorporate;
	@Autowired
	private Job sttmuploadcorpdirectors;
	@Autowired
	private Job sttmautoliabupload;
	@Autowired
	private Job sttmuploadcustdomestic;
	@Autowired
	private Job mitmuploadcustomerdefault;
	@Autowired
	private Job sttmuploaddocchklst;
	@Autowired
	private Job cstmfunctionuserdeffields;

	// CASA Jobs
	@Autowired
	private Job sttbuploadcustaccount;
	@Autowired
	private Job ictmuploadacc;
	@Autowired
	private Job ictmaccprupload;
	@Autowired
	private Job ictmacceffdtupload;
	@Autowired
	private Job ictmaccudevalsupload;
	@Autowired
	private Job sttmuploadchqbkreq;
	@Autowired
	private Job sttmuploadaccountchannel;
	/*
	 * @Autowired private Job sttmuploadsweepdtls;
	 */
	@Autowired
	private Job mitbuploadclassmapping;
	@Autowired
	private Job svtmuploadaccsigmaster;
	@Autowired
	private Job svtmuploadaccsigdet;
	@Autowired
	private Job sttbuploadcustlinkages;
	@Autowired
	private Job sttbuploadlinkedentities;
	@Autowired
	private Job casacstmfunctionuserdeffields;

	// LOAN Jobs
	@Autowired
	private Job cltbacudeupload;
	@Autowired
	private Job cltbaccountupload;
	@Autowired
	private Job cltbaccompupload;
	@Autowired
	private Job cltbaccpartiesupload;
	@Autowired
	private Job cltbacccolllnkdtlupd;
	@Autowired
	private Job cltbaccompschupload;

	// CHEQUE BOOK Jobs
	@Autowired
	private Job catmuploadcheckbook;
	@Autowired
	private Job catmuploadcheckdetails;

	// AMOUNT BLOCK Jobs
	@Autowired
	private Job catmuploadamountblocks;

	// CASA BALANCE Jobs
	@Autowired
	private Job detbuploadmastercasabal;
	@Autowired
	private Job detbuploaddetailcasabal;
	// GL BALANCE Jobs
	@Autowired
	private Job detbuploadmasterglbal;
	@Autowired
	private Job detbuploaddetailglbal;
	// SIGNATURES Jobs
	@Autowired
	private Job svtmcifsigmasterupload;
	// INSTRUMENT Jobs
	@Autowired
	private Job istmuploadinstrumentmaster;
	@Autowired
	private Job istmuploadinstrumentdetail;
	@Autowired
	private Job istminstrtxn;
	@Autowired
	private Job actbsreconmaster;

	@Autowired
	private CsvUploadMonitorRepository repo;

	// BILLS AND COLLECTIONS Jobs
	@Autowired
	private Job bctbUploadPartiesJob;
	
	@Autowired
	private Job bctbUploadLimitsJob;
	
	@Autowired
	private Job bctbUploadPartiesAddressesJob;
	
	@Autowired
	private Job bctbUploadDocsClausesJob;
	
	@Autowired
	private Job bctbUploadInvoiceDetailJob;
	
	@Autowired
	private Job bctbUploadDraftsDetailsJob;
	
	@Autowired
	private Job bctbUploadFftJob;
	
	@Autowired
	private Job ldtbUploadLinkagesJob;
	
	@Autowired
	private Job tftbUploadFxLinkageJob;
	
	@Autowired
	private Job bctmUploadLoanIccfJob;
	
	@Autowired
	private Job bctbUploadMasterJob;
	
	@Autowired
	private Job bctbUploadGoodsJob;
	
	@Autowired
	private Job bctbUploadShipmentInfoJob;
	
	@Autowired
	private Job bctbUploadPayExcJob;
	
	@Autowired
	private Job bctbUploadPayFateJob;
	
	@Autowired
	private Job bctbUploadAccExcJob;
	
	@Autowired
	private Job bctbUploadAccFateJob;
	
	@Autowired
	private Job bctbUploadReserveJob;
	
	@Autowired
	private Job bctbUploadInvoiceMasterJob;
	
	@Autowired
	private Job bctbUploadInsuranceJob;
	
	@Autowired
	private Job bctmUploadLoanPreferenceJob;

	@Autowired
	private Job lctbUploadCollateralJob;
	
	@Autowired
	private Job bctbUploadPackCreditDtlsJob;
	
	@Autowired
	private Job bctbUploadBrokMasterJob;
	
	@Autowired
	private Job bctbUploadBrokDetailJob;
	
	@Autowired
	private Job bctbUploadMultitnrJob;
	
	@Autowired
	private Job lctbUploadLicUtlDtlJob;
	
	@Autowired
	private Job bctbUploadAssigneeDetailsJob;
	
	// TDRD Jobs
	@Autowired
	private Job tdrdsttbuploadcustaccount;
	@Autowired
	private Job tdrdictmuploadacc;
	@Autowired
	private Job tdrdictmaccprupload;
	@Autowired
	private Job tdrdictmacceffdtupload;
	@Autowired
	private Job tdrdictmaccudevalsupload;
	@Autowired
	private Job tdrdmitbuploadclassmapping;
	@Autowired
	private Job tdrdsttbuploadlinkedentities;
	@Autowired
	private Job tdrdictmuploadtdpayoutdet;
	@Autowired
	private Job tdrdictmuploadtdpayindet;
	@Autowired
	private Job tdrdictmuploadtddetails;

	/*
	 * CIF Module starts here
	 */
	// 1. STTM_UPLOAD_CUSTOMER
	@RequestMapping(value = "/sttmuploadcustomer", method = RequestMethod.GET)
	public BatchStatus startBatchSttmUploadCustomer() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(sttmuploadcustomer, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTM_UPLOAD_CUSTOMER");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 2. STTM_UPLOAD_CUST_PERSONAL
	@RequestMapping(value = "/sttmuploadcustpersonal", method = RequestMethod.GET)
	public BatchStatus startBatchSttmUploadCustPersonal() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(sttmuploadcustpersonal, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTM_UPLOAD_CUST_PERSONAL");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 3. STTM_UPLOAD_CUST_PROFESSIONAL
	@RequestMapping(value = "/sttmuploadcustprofessional", method = RequestMethod.GET)
	public BatchStatus startBatchSttmUploadCustProfessional() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(sttmuploadcustprofessional, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTM_UPLOAD_CUST_PROFESSIONAL");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 4. STTM_UPLOAD_CUST_CORPORATE
	@RequestMapping(value = "/sttmuploadcustcorporate", method = RequestMethod.GET)
	public BatchStatus startBatchSttmUploadCustCorporate() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(sttmuploadcustcorporate, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTM_UPLOAD_CUST_CORPORATE");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 5. STTM_UPLOAD_CORP_DIRECTORS
	@RequestMapping(value = "/sttmuploadcorpdirectors", method = RequestMethod.GET)
	public BatchStatus startBatchSttmUploadCorpDirectors() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(sttmuploadcorpdirectors, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTM_UPLOAD_CORP_DIRECTORS");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 6. STTM_AUTO_LIAB_UPLOAD
	@RequestMapping(value = "/sttmautoliabupload", method = RequestMethod.GET)
	public BatchStatus startBatchSttmAutoLiabUpload() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(sttmautoliabupload, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTM_AUTO_LIAB_UPLOAD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 7. STTM_UPLOAD_CUST_DOMESTIC
	@RequestMapping(value = "/sttmuploadcustdomestic", method = RequestMethod.GET)
	public BatchStatus startBatchSttmUploadCustDomestic() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(sttmuploadcustdomestic, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTM_UPLOAD_CUST_DOMESTIC");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 8. MITM_UPLOAD_CUSTOMER_DEFAULT
	@RequestMapping(value = "/mitmuploadcustomerdefault", method = RequestMethod.GET)
	public BatchStatus startBatchMitmUploadCustomerDefault() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(mitmuploadcustomerdefault, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_MITM_UPLOAD_CUSTOMER_DEFAULT");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 9. STTM_UPLOAD_DOC_CHKLST
	@RequestMapping(value = "/sttmuploaddocchklst", method = RequestMethod.GET)
	public BatchStatus startBatchSttmuploaddocchklst() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(sttmuploaddocchklst, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTM_UPLOAD_DOC_CHKLST");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 10. CSTM_FUNCTION_USERDEF_FIELDS
	@RequestMapping(value = "/cstmfunctionuserdeffields", method = RequestMethod.GET)
	public BatchStatus startBatchCstmFunctionUserdefFields() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(cstmfunctionuserdeffields, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_CSTM_FUNCTION_USERDEF_FIELDS");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());

		return jobExecution.getStatus();
	}
	/*
	 * CIF Module ends here
	 */

	/*
	 * CASA Module starts here
	 */

	// 1. STTB_UPLOAD_CUST_ACCOUNT
	@RequestMapping(value = "/sttbuploadcustaccount", method = RequestMethod.GET)
	public BatchStatus startBatchSttbUploadCustAccount() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(sttbuploadcustaccount, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTB_UPLOAD_CUST_ACCOUNT");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 2. ICTM_UPLOAD_ACC
	@RequestMapping(value = "/ictmuploadacc", method = RequestMethod.GET)
	public BatchStatus startBatchIctmUploadAcc() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(ictmuploadacc, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ICTM_UPLOAD_ACC");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 3. ICTM_ACC_PR_UPLOAD
	@RequestMapping(value = "/ictmaccprupload", method = RequestMethod.GET)
	public BatchStatus startBatchIctmAccPrUpload() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(ictmaccprupload, jobParameters);

		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ICTM_ACC_PR_UPLOAD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 4. ICTM_ACC_EFFDT_UPLOAD
	@RequestMapping(value = "/ictmacceffdtupload", method = RequestMethod.GET)
	public BatchStatus startBatchIctmAccEffdtUpload() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(ictmacceffdtupload, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ICTM_ACC_EFFDT_UPLOAD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());

		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 5. ICTM_ACC_UDEVALS_UPLOAD
	@RequestMapping(value = "/ictmaccudevalsupload", method = RequestMethod.GET)
	public BatchStatus startBatchIctmAccUdevalsUpload() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(ictmaccudevalsupload, jobParameters);

		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ICTM_ACC_UDEVALS_UPLOAD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 6. STTM_UPLOAD_CHQBK_REQ
	@RequestMapping(value = "/sttmuploadchqbkreq", method = RequestMethod.GET)
	public BatchStatus startBatchSttmUploadChqbkReq() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(sttmuploadchqbkreq, jobParameters);

		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTM_UPLOAD_CHQBK_REQ");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 7. STTM_UPLOAD_ACCOUNT_CHANNEL
	@RequestMapping(value = "/sttmuploadaccountchannel", method = RequestMethod.GET)
	public BatchStatus startBatchSttmUploadAccountChannel() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(sttmuploadaccountchannel, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTM_UPLOAD_ACCOUNT_CHANNEL");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}
	/*
	 * // 8. STTM_UPLOAD_SWEEP_DTLS
	 * 
	 * @RequestMapping(value = "/sttmuploadsweepdtls", method = RequestMethod.GET)
	 * public BatchStatus startBatchSttmUploadSweepDtls() throws
	 * JobParametersInvalidException, JobExecutionAlreadyRunningException,
	 * JobRestartException, JobInstanceAlreadyCompleteException { JobParameters
	 * jobParameters = new JobParametersBuilder().addLong("time",
	 * System.currentTimeMillis()) .toJobParameters();
	 * 
	 * JobExecution jobExecution = jobLauncher.run(sttmuploadsweepdtls,
	 * jobParameters); Optional<CsvUploadMonitor> csvUploadMonitor =
	 * repo.findById("TRANS_STTM_UPLOAD_SWEEP_DTLS");
	 * csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
	 * csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
	 * csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
	 * repo.save(csvUploadMonitor.get()); return jobExecution.getStatus(); }
	 */

	// 9. MITB_UPLOAD_CLASS_MAPPING
	@RequestMapping(value = "/mitbuploadclassmapping", method = RequestMethod.GET)
	public BatchStatus startMitbUploadClassMapping() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(mitbuploadclassmapping, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_MITB_UPLOAD_CLASS_MAPPING");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 10. SVTM_UPLOAD_ACC_SIG_MASTER
	@RequestMapping(value = "/svtmuploadaccsigmaster", method = RequestMethod.GET)
	public BatchStatus startBatchSvtmUploadAccSigMaster() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(svtmuploadaccsigmaster, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_SVTM_UPLOAD_ACC_SIG_MASTER");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 11. SVTM_UPLOAD_ACC_SIG_DET
	@RequestMapping(value = "/svtmuploadaccsigdet", method = RequestMethod.GET)
	public BatchStatus startBatchSvtmUploadAccSigDet() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(svtmuploadaccsigdet, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_SVTM_UPLOAD_ACC_SIG_DET");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 12. STTB_UPLOAD_CUST_LINKAGES
	@RequestMapping(value = "/sttbuploadcustlinkages", method = RequestMethod.GET)
	public BatchStatus startBatchSttbUploadCustLinkages() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(sttbuploadcustlinkages, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTB_UPLOAD_CUST_LINKAGES");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 13. STTB_UPLOAD_LINKED_ENTITIES
	@RequestMapping(value = "/sttbuploadlinkedentities", method = RequestMethod.GET)
	public BatchStatus startBatchSttbUploadLinkedEntities() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(sttbuploadlinkedentities, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTB_UPLOAD_LINKED_ENTITIES");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 14. CASA_CSTM_FUNCTION_USERDEF_FIELDS
	@RequestMapping(value = "/casacstmfunctionuserdeffields", method = RequestMethod.GET)
	public BatchStatus startBatchCasaCstmFunctionUserdefFields() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(casacstmfunctionuserdeffields, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_CASA_CSTM_FUNCTION_USERDEF_FIELDS");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}
	/*
	 * CASA Module ends here
	 */

	/*
	 * LOAN Module starts here
	 */

	// 1. CLTB_AC_UDE_UPLOAD
	@RequestMapping(value = "/cltbacudeupload", method = RequestMethod.GET)
	public BatchStatus startBatchCltbAcUdeUpload() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(cltbacudeupload, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_CLTB_AC_UDE_UPLOAD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 2. CLTB_ACCOUNT_UPLOAD
	@RequestMapping(value = "/cltbaccountupload", method = RequestMethod.GET)
	public BatchStatus startBatchCltbAccountUpload() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(cltbaccountupload, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_CLTB_ACCOUNT_UPLOAD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 3. CLTB_AC_COMP_UPLOAD
	@RequestMapping(value = "/cltbaccompupload", method = RequestMethod.GET)
	public BatchStatus startBatchCltbAcCompUpload() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(cltbaccompupload, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_CLTB_AC_COMP_UPLOAD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 4. CLTB_ACC_PARTIES_UPLOAD
	@RequestMapping(value = "/cltbaccpartiesupload", method = RequestMethod.GET)
	public BatchStatus startBatchCltbAccPartiesUpload() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(cltbaccpartiesupload, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_CLTB_ACC_PARTIES_UPLOAD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 5. CLTB_ACC_COLLLNKDTL_UPD
	@RequestMapping(value = "/cltbacccolllnkdtlupd", method = RequestMethod.GET)
	public BatchStatus startBatchCltbAccColllnkdtlUpd() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(cltbacccolllnkdtlupd, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_CLTB_ACC_COLLLNKDTL_UPD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 6. CLTB_ACCOMP_SCH_UPLOAD
	@RequestMapping(value = "/cltbaccompschupload", method = RequestMethod.GET)
	public BatchStatus startBatchCltbAccompSchUpload() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(cltbaccompschupload, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_CLTB_ACCOMP_SCH_UPLOAD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	/*
	 * LOAN Module ends here
	 */
	/*
	 * CHEQUE BOOK Module starts here
	 */
	@RequestMapping(value = "/catmuploadcheckbook", method = RequestMethod.GET)
	public BatchStatus startBatchuploadCheckBook() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(catmuploadcheckbook, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_CATM_UPLOAD_CHECK_BOOK");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	@RequestMapping(value = "/catmuploadcheckdetails", method = RequestMethod.GET)
	public BatchStatus startBatchcatmUploadCheckDetails() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(catmuploadcheckdetails, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_CATM_UPLOAD_CHECK_DETAILS");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}
	/*
	 * CHEQUE BOOK Module ends here
	 */
	/*
	 * AMOUNT BLOCK Module starts here
	 */

	// 1. CATM_UPLOAD_AMOUNT_BLOCKS
	@RequestMapping(value = "/catmuploadamountblocks", method = RequestMethod.GET)
	public BatchStatus startBatchcatmUploadAmountBlock() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(catmuploadamountblocks, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_CATM_UPLOAD_AMOUNT_BLOCKS");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}
	/*
	 * AMOUNT BLOCK Module ends here
	 */
	/*
	 * CASA BALANCE Module starts here
	 */

	// 1. TRANS_DETB_UPLOAD_MASTER_CASABAL
	@RequestMapping(value = "/detbuploadmastercasabal", method = RequestMethod.GET)
	public BatchStatus startBatchdetbUploadMasterCasabal() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(detbuploadmastercasabal, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_DETB_UPLOAD_MASTER_CASABAL");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 2. TRANS_DETB_UPLOAD_DETAIL_CASABAL
	@RequestMapping(value = "/detbuploaddetailcasabal", method = RequestMethod.GET)
	public BatchStatus startBatchdetbUploadDetailCasaBal() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(detbuploaddetailcasabal, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_DETB_UPLOAD_DETAIL_CASABAL");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();

	}
	/*
	 * CASA BALANCE Module ends here
	 */

	/*
	 * GL BALANCE Module starts here
	 */
	// 1. TRANS_DETB_UPLOAD_MASTER_GLBAL
	@RequestMapping(value = "/detbuploadmasterglbal", method = RequestMethod.GET)
	public BatchStatus startBatchdetbUploadMasterGlbal() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(detbuploadmasterglbal, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_DETB_UPLOAD_MASTER_GLBAL");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 2. TRANS_DETB_UPLOAD_DETAIL_GLBAL
	@RequestMapping(value = "/detbuploaddetailglbal", method = RequestMethod.GET)
	public BatchStatus startBatchdetbUploadDetailGlbal() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(detbuploaddetailglbal, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_DETB_UPLOAD_DETAIL_GLBAL");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	/*
	 * GL BALANCE Module ends here
	 */
	/*
	 * SIGNATURES Module starts here
	 */
	// 1. SVTM_CIF_SIG_MASTER_UPLOAD
	@RequestMapping(value = "/svtmcifsigmasterupload", method = RequestMethod.GET)
	public BatchStatus startBatchSvtmCifSigMasterUpload() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(svtmcifsigmasterupload, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_SVTM_CIF_SIG_MASTER_UPLOAD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}
	/*
	 * SIGNATURES Module ends here
	 */
	/*
	 * INSTRUMENT Module starts here
	 */

	// 1.ISTM_UPLOAD_INSTRUMENT_MASTER
	@RequestMapping(value = "/istmuploadinstrumentmaster", method = RequestMethod.GET)
	public BatchStatus startBatchistmInstrumentMaster() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(istmuploadinstrumentmaster, jobParameters);

		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ISTM_UPLOAD_INSTRUMENT_MASTER");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 2.ISTM_UPLOAD_INSTRUMENT_DETAIL
	@RequestMapping(value = "/istmuploadinstrumentdetail", method = RequestMethod.GET)
	public BatchStatus startBatchistmInstrumentDetail() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(istmuploadinstrumentdetail, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ISTM_UPLOAD_INSTRUMENT_DETAIL");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 3. ISTM_INSTR_TXN
	@RequestMapping(value = "/istminstrtxn", method = RequestMethod.GET)
	public BatchStatus startBatchistmInstrTxn() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(istminstrtxn, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ISTM_INSTR_TXN");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 4.ACTBS_RECON_MASTER
	@RequestMapping(value = "/actbsreconmaster", method = RequestMethod.GET)
	public BatchStatus startBatchACTBReconMaster() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(actbsreconmaster, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ACTBS_RECON_MASTER");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	/*
	 * INSTRUMENT Module Ends here
	 */
	/*
	 * BILLS AND COLLECTIONS Module starts here
	 */

	// 1.BCTB_UPLOAD_PARTIES
	@RequestMapping(value = "/bctbuploadparties", method = RequestMethod.GET)
	public BatchStatus startBatchBctbUploadParties() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(bctbUploadPartiesJob, jobParameters);

		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_PARTIES");
		if (csvUploadMonitor.isPresent()) {
			csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
			csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
			csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
			repo.save(csvUploadMonitor.get());
		}

		return jobExecution.getStatus();
	}
	
	//2.BCTB_UPLOAD_LIMITS
	@RequestMapping(value = "/bctbUploadLimits", method = RequestMethod.GET)
	public BatchStatus startBatchBctbUploadLimits() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(bctbUploadLimitsJob, jobParameters);

		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_LIMITS");
		if (csvUploadMonitor.isPresent()) {
			csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
			csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
			csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
			repo.save(csvUploadMonitor.get());
		}

		return jobExecution.getStatus();
	}
	
	//3.Bctb_Upload_Parties_Addresses
		@RequestMapping(value = "/bctbUploadPartiesAddresses", method = RequestMethod.GET)
		public BatchStatus startBatchBctbUploadPartiesAddresses() throws JobParametersInvalidException,
				JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

			JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
					.toJobParameters();

			JobExecution jobExecution = jobLauncher.run(bctbUploadPartiesAddressesJob, jobParameters);

			Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_PARTIES_ADDRESSES");
			if (csvUploadMonitor.isPresent()) {
				csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
				csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
				csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
				repo.save(csvUploadMonitor.get());
			}

			return jobExecution.getStatus();
		}
		
				//4.Bctb_Upload_Docs_Clauses
				@RequestMapping(value = "/bctbUploadDocsClauses", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadDocsClauses() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadDocsClausesJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_DOCS_CLAUSES");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//5.Bctb_Upload_Invoice_Detail
				@RequestMapping(value = "/bctbUploadInvoiceDetail", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadInvoiceDetail() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadInvoiceDetailJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_INVOICE_DETAIL");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
	
				//6.Bctb_Upload_Drafts_Details
				@RequestMapping(value = "/bctbUploadDraftsDetails", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadDraftsDetails() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadDraftsDetailsJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_DRAFTS_DETAILS");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//7.Bctb_Upload_Fft
				@RequestMapping(value = "/bctbUploadFft", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadFft() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadFftJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_FFT");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//8.Ldtb_Upload_Linkages
				@RequestMapping(value = "/ldtbUploadLinkages", method = RequestMethod.GET)
				public BatchStatus startBatchLdtbUploadLinkages() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(ldtbUploadLinkagesJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_LDTB_UPLOAD_LINKAGES");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//9.Tftb_Upload_Fx_Linkage
				@RequestMapping(value = "/tftbUploadFxLinkage", method = RequestMethod.GET)
				public BatchStatus startBatchTftbUploadFxLinkage() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(tftbUploadFxLinkageJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_TFTB_UPLOAD_FX_LINKAGES");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//10.Bctm_Upload_Loan_Iccf
				@RequestMapping(value = "/bctmUploadLoanIccf", method = RequestMethod.GET)
				public BatchStatus startBatchBctmUploadLoanIccf() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctmUploadLoanIccfJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTM_UPLOAD_LOAN_ICCF");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//11.Bctb_Upload_Master
				@RequestMapping(value = "/bctbUploadMaster", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadMaster() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadMasterJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_MASTER");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//12.Bctb_Upload_Goods
				@RequestMapping(value = "/bctbUploadGoods", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadGoods() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadGoodsJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_GOODS");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				
				
				//13.Bctb_Upload_Shipment_Info
				@RequestMapping(value = "/bctbUploadShipmentInfo", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadShipmentInfo() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadShipmentInfoJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_SHIPMENT_INFO");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//14.Bctb_Upload_Pay_Exc
				@RequestMapping(value = "/bctbUploadPayExc", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadPayExc() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadPayExcJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_PAY_EXC");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//15.Bctb_Upload_Pay_Fate
				@RequestMapping(value = "/bctbUploadPayFate", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadPayFate() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadPayFateJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_PAY_FATE");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//16.Bctb_Upload_Acc_Exc
				@RequestMapping(value = "/bctbUploadAccExc", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadAccExc() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadAccExcJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_ACC_EXC");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//17.Bctb_Upload_Acc_Fate
				@RequestMapping(value = "/bctbUploadAccFate", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadAccFate() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadAccFateJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_ACC_FATE");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//18.Bctb_Upload_Reserve
				@RequestMapping(value = "/bctbUploadReserve", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadReserve() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadReserveJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_RESERVE");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//19.Bctb_Upload_Invoice_Master
				@RequestMapping(value = "/bctbUploadInvoiceMaster", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadInvoiceMaster() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadInvoiceMasterJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_INVOICE_MASTER");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//20.Bctb_Upload_Insurance
				@RequestMapping(value = "/bctbUploadInsurance", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadInsurance() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadInsuranceJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_INSURANCE");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//21.Bctm_Upload_Loan_Preference
				@RequestMapping(value = "/bctmUploadLoanPreference", method = RequestMethod.GET)
				public BatchStatus startBatchBctmUploadLoanPreference() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctmUploadLoanPreferenceJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTM_UPLOAD_LOAN_PREFERENCE");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//22.Lctb_Upload_Collateral
				@RequestMapping(value = "/lctbUploadCollateral", method = RequestMethod.GET)
				public BatchStatus startBatchLctbUploadCollateral() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(lctbUploadCollateralJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_LCTB_UPLOAD_COLLATERAL");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//23.Bctb_upld_pack_credit_dtls
				@RequestMapping(value = "/bctbUploadPackCreditDtls", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadPackCreditDtls() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadPackCreditDtlsJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_PACK_CREDIT_DTLS");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//24.Bctb_Upload_Brok_Master
				@RequestMapping(value = "/bctbUploadBrokMaster", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadBrokMaster() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadBrokMasterJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_BROK_MASTER");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//25.Bctb_Upload_Brok_Detail
				@RequestMapping(value = "/bctbUploadBrokDetail", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadBrokDetail() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadBrokDetailJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_BROK_DETAIL");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//26.Bctb_Upload_Multitnr
				@RequestMapping(value = "/bctbUploadMultitnr", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadMultitnr() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadMultitnrJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_MULTITNR");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//27.LCTB_UPLOAD_LIC_UTL_DTL
				@RequestMapping(value = "/lctbUploadLicUtlDtl", method = RequestMethod.GET)
				public BatchStatus startBatchLctbUploadLicUtlDtl() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(lctbUploadLicUtlDtlJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_LCTB_UPLOAD_LIC_UTL_DTL");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				
				//28.Bctb_Upload_Assignee_Details
				@RequestMapping(value = "/bctbUploadAssigneeDetails", method = RequestMethod.GET)
				public BatchStatus startBatchBctbUploadAssigneeDetails() throws JobParametersInvalidException,
						JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

					JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
							.toJobParameters();

					JobExecution jobExecution = jobLauncher.run(bctbUploadAssigneeDetailsJob, jobParameters);

					Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_BCTB_UPLOAD_ASSIGNEE_DETAILS");
					if (csvUploadMonitor.isPresent()) {
						csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
						csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
						csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
						repo.save(csvUploadMonitor.get());
					}

					return jobExecution.getStatus();
				}
				

	/*
	 * BILLS AND COLLECTIONS Module end here
	 */
				
	/*
	 * TD and RD Module starts here
	 */

	// 1. TDRD_STTB_UPLOAD_CUST_ACCOUNT
	@RequestMapping(value = "/tdrdsttbuploadcustaccount", method = RequestMethod.GET)
	public BatchStatus startBatchtdrdSttbUploadCustAccount() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(tdrdsttbuploadcustaccount, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTB_UPLOAD_CUST_ACCOUNT");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 2. TDRD_ICTM_UPLOAD_ACC
	@RequestMapping(value = "/tdrdictmuploadacc", method = RequestMethod.GET)
	public BatchStatus startBatchtdrdIctmUploadAcc() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(tdrdictmuploadacc, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ICTM_UPLOAD_ACC");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 3. TDRD_ICTM_ACC_PR_UPLOAD
	@RequestMapping(value = "/tdrdictmaccprupload", method = RequestMethod.GET)
	public BatchStatus startBatchtdrdIctmAccPrUpload() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(tdrdictmaccprupload, jobParameters);

		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ICTM_ACC_PR_UPLOAD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 4. TDRD_ICTM_ACC_EFFDT_UPLOAD
	@RequestMapping(value = "/tdrdictmacceffdtupload", method = RequestMethod.GET)
	public BatchStatus startBatchtdrdIctmAccEffdtUpload() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(tdrdictmacceffdtupload, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ICTM_ACC_EFFDT_UPLOAD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());

		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 5. TDRD_ICTM_ACC_UDEVALS_UPLOAD
	@RequestMapping(value = "/tdrdictmaccudevalsupload", method = RequestMethod.GET)
	public BatchStatus startBatchtdrdIctmAccUdevalsUpload() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(tdrdictmaccudevalsupload, jobParameters);

		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ICTM_ACC_UDEVALS_UPLOAD");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 6. TDRD_MITB_UPLOAD_CLASS_MAPPING
	@RequestMapping(value = "/tdrdmitbuploadclassmapping", method = RequestMethod.GET)
	public BatchStatus startBatchtdrdMitbUploadClassMapping() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		JobExecution jobExecution = jobLauncher.run(tdrdmitbuploadclassmapping, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_MITB_UPLOAD_CLASS_MAPPING");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 7. TDRD_STTB_UPLOAD_LINKED_ENTITIES
	@RequestMapping(value = "/tdrdsttbuploadlinkedentities", method = RequestMethod.GET)
	public BatchStatus startBatchtdrdSttbUploadLinkedEntities() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(tdrdsttbuploadlinkedentities, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_STTB_UPLOAD_LINKED_ENTITIES");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 8. ICTM_UPLOAD_TDPAYOUT_DET
	@RequestMapping(value = "/tdrdictmuploadtdpayoutdet", method = RequestMethod.GET)
	public BatchStatus startBatchIctmUploadTdpayoutDet() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(tdrdictmuploadtdpayoutdet, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ICTM_UPLOAD_TDPAYOUT_DET");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 9. ICTM_UPLOAD_TDPAYIN_DET
	@RequestMapping(value = "/tdrdictmuploadtdpayindet", method = RequestMethod.GET)
	public BatchStatus startBatchIctmUploadTdpayinDet() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(tdrdictmuploadtdpayindet, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ICTM_UPLOAD_TDPAYIN_DET");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}

	// 10. ICTM_UPLOAD_TD_DETAILS
	@RequestMapping(value = "/tdrdictmuploadtddetails", method = RequestMethod.GET)
	public BatchStatus startBatchIctmUploadTdDetails() throws JobParametersInvalidException,
			JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(tdrdictmuploadtddetails, jobParameters);
		Optional<CsvUploadMonitor> csvUploadMonitor = repo.findById("TRANS_ICTM_UPLOAD_TD_DETAILS");
		csvUploadMonitor.get().setStart_date(jobExecution.getCreateTime());
		csvUploadMonitor.get().setEnd_date(jobExecution.getEndTime());
		csvUploadMonitor.get().setStatus(jobExecution.getStatus().toString());
		repo.save(csvUploadMonitor.get());
		return jobExecution.getStatus();
	}
	
	/*
	 * TD and RD Module end here
	 */
}
