package com.jmr.batch.processor.loan;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.loan.TransCltbAccColllnkdtlUpdPK;
import com.jmr.batch.entity.loan.TransCltbAccompSchUpload;
import com.jmr.batch.entity.loan.TransCltbAccompSchUploadPK;
import com.jmr.batch.model.loan.TransCltbAccompSchUploadModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProCltbAccompSchUpload
	implements ItemProcessor<TransCltbAccompSchUploadModel, TransCltbAccompSchUpload> {
	
	@Override
	public TransCltbAccompSchUpload process(TransCltbAccompSchUploadModel item) throws Exception {
		TransCltbAccompSchUpload transCltbAccompSchUpload = new TransCltbAccompSchUpload();
		transCltbAccompSchUpload.setSourceCode(item.getSource_code());
         transCltbAccompSchUpload.setFormulaName(item.getFormula_name());
		transCltbAccompSchUpload.setPaymentMode(item.getPayment_mode());
		transCltbAccompSchUpload.setPmntProdAc(item.getPmnt_prod_ac());
		transCltbAccompSchUpload.setPaymentDetails(item.getPayment_details());
		transCltbAccompSchUpload.setBenAccount(item.getBen_account());
		transCltbAccompSchUpload.setBenBank(item.getBen_bank());

		transCltbAccompSchUpload.setBenName(item.getBen_name());
		transCltbAccompSchUpload.setScheduleFlag(item.getSchedule_flag());
		transCltbAccompSchUpload.setUnit(item.getUnit());
		transCltbAccompSchUpload.setCapitalized(item.getCapitalized());
		transCltbAccompSchUpload.setWaiverFlag(item.getWaiver_flag());
		transCltbAccompSchUpload.setDaysMth(item.getDays_mth());
		transCltbAccompSchUpload.setDaysYear(item.getDays_year());
		if(!JMRUtil.isNullOrEmpty(item.getNo_of_schedules())){transCltbAccompSchUpload.setNoOfSchedules(new BigDecimal(item.getNo_of_schedules()));}
		if(!JMRUtil.isNullOrEmpty(item.getFrequency())){transCltbAccompSchUpload.setFrequency(new BigDecimal(item.getFrequency()));}
		if(!JMRUtil.isNullOrEmpty(item.getAmount())){transCltbAccompSchUpload.setAmount(new BigDecimal(item.getAmount()));}
		if(!JMRUtil.isNullOrEmpty(item.getCompound_days())){transCltbAccompSchUpload.setCompoundDays(new BigDecimal(item.getCompound_days()));}
		if(!JMRUtil.isNullOrEmpty(item.getCompound_months())){transCltbAccompSchUpload.setCompoundMonths(new BigDecimal(item.getCompound_months()));}
		if(!JMRUtil.isNullOrEmpty(item.getCompound_years())){transCltbAccompSchUpload.setCompoundYears(new BigDecimal(item.getCompound_years()));}
		if(!JMRUtil.isNullOrEmpty(item.getEmi_amount())){transCltbAccompSchUpload.setEmiAmount(new BigDecimal(item.getEmi_amount()));}
		if(!JMRUtil.isNullOrEmpty(item.getDue_dates_on())){transCltbAccompSchUpload.setDueDatesOn(new BigDecimal(item.getDue_dates_on()));}
		
		if(!JMRUtil.isNullOrEmpty(item.getSch_end_date())){transCltbAccompSchUpload.setSchEndDate(JMRDateUtil.getDateFromString(item.getSch_end_date(),JMRDateUtil.DATE_FORMATMMddyyyy));}

		
		 TransCltbAccompSchUploadPK transCltbAccompSchUploadPK = new TransCltbAccompSchUploadPK();
		 transCltbAccompSchUploadPK.setBranchCode(item.getBranch_code());
		 transCltbAccompSchUploadPK.setExtRefNo(item.getExt_ref_no());
		 transCltbAccompSchUploadPK.setProcessCode(item.getProcess_code());
		 transCltbAccompSchUploadPK.setComponentName(item.getComponent_name());
		 transCltbAccompSchUploadPK.setScheduleType(item.getSchedule_type());
		 transCltbAccompSchUploadPK.setComponentName(item.getComponent_name());
			if (!JMRUtil.isNullOrEmpty(item.getSequence_no())) {
				transCltbAccompSchUploadPK.setSequenceNo(new Long(item.getSequence_no()));
			}
			if(!JMRUtil.isNullOrEmpty(item.getSch_start_date())){transCltbAccompSchUploadPK.setSchStartDate(JMRDateUtil.getDateFromString(item.getSch_start_date(),JMRDateUtil.DATE_FORMATMMddyyyy));}
		
		if(!JMRUtil.isNullOrEmpty(item.getFirst_due_date())){transCltbAccompSchUploadPK.setFirstDueDate(JMRDateUtil.getDateFromString(item.getFirst_due_date(),JMRDateUtil.DATE_FORMATMMddyyyy));}
	
		 transCltbAccompSchUpload.setId(transCltbAccompSchUploadPK);
		
	return transCltbAccompSchUpload ;}	

}
