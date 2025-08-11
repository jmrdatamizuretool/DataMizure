package com.jmr.batch.processor.loan;
import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.loan.TransCltbAccountUpload;
import com.jmr.batch.model.loan.TransCltbAccountUploadModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProCltbAccountUpload
	implements ItemProcessor<TransCltbAccountUploadModel, TransCltbAccountUpload> {
	
	@Override
	public TransCltbAccountUpload process(TransCltbAccountUploadModel item) throws Exception {
		TransCltbAccountUpload transCltbAccountUpload = new TransCltbAccountUpload();
		transCltbAccountUpload.setSourceCode(item.getSource_code());
		transCltbAccountUpload.setAccountNumber(item.getAccount_number());
		transCltbAccountUpload.setBranchCode(item.getBranch_code());
		transCltbAccountUpload.setAltAccNo(item.getAlt_acc_no());
		transCltbAccountUpload.setApplicationNum(item.getApplication_num());
		transCltbAccountUpload.setCustomerId(item.getCustomer_id());
		transCltbAccountUpload.setProductCode(item.getProduct_code());
		transCltbAccountUpload.setProductCategory(item.getProduct_category());
		if (!JMRUtil.isNullOrEmpty(item.getBook_date())) { transCltbAccountUpload.setBookDate( JMRDateUtil.getDateFromString(item.getBook_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getValue_date())) { transCltbAccountUpload.setValueDate( JMRDateUtil.getDateFromString(item.getValue_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getMaturity_date())) { transCltbAccountUpload.setMaturityDate( JMRDateUtil.getDateFromString(item.getMaturity_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getAmount_financed())) { transCltbAccountUpload.setAmountFinanced(new BigDecimal(item.getAmount_financed())); }
		if (!JMRUtil.isNullOrEmpty(item.getDownpayment_amount())) { transCltbAccountUpload.setDownpaymentAmount(new BigDecimal(item.getDownpayment_amount())); }
		transCltbAccountUpload.setCurrency(item.getCurrency());
		if (!JMRUtil.isNullOrEmpty(item.getOriginal_st_date())) { transCltbAccountUpload.setOriginalStDate( JMRDateUtil.getDateFromString(item.getOriginal_st_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transCltbAccountUpload.setPrimaryApplicantId(item.getPrimary_applicant_id());
		transCltbAccountUpload.setPrimaryApplicantName(item.getPrimary_applicant_name());
		transCltbAccountUpload.setUserDefinedStatus(item.getUser_defined_status());
		transCltbAccountUpload.setCalcReqd(item.getCalc_reqd());
		if (!JMRUtil.isNullOrEmpty(item.getBack_val_eff_dt())) { transCltbAccountUpload.setBackValEffDt( JMRDateUtil.getDateFromString(item.getBack_val_eff_dt(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transCltbAccountUpload.setAutoManRollover(item.getAuto_man_rollover());
		transCltbAccountUpload.setScheduleBasis(item.getSchedule_basis());
		transCltbAccountUpload.setUdeRolloverBasis(item.getUde_rollover_basis());
		transCltbAccountUpload.setRolloverType(item.getRollover_type());
		if (!JMRUtil.isNullOrEmpty(item.getSpecial_amount())) { transCltbAccountUpload.setSpecialAmount(new BigDecimal(item.getSpecial_amount())); }
		transCltbAccountUpload.setRateCodePref(item.getRate_code_pref());
		transCltbAccountUpload.setPassbookFacility(item.getPassbook_facility());
		transCltbAccountUpload.setAtmFacility(item.getAtm_facility());
		transCltbAccountUpload.setAllowBackPeriodEntry(item.getAllow_back_period_entry());
		transCltbAccountUpload.setIntStmt(item.getInt_stmt());
		transCltbAccountUpload.setTrackReceivableAliq(item.getTrack_receivable_aliq());
		transCltbAccountUpload.setTrackReceivableMliq(item.getTrack_receivable_mliq());
		transCltbAccountUpload.setLiquidationMode(item.getLiquidation_mode());
		transCltbAccountUpload.setAmendPastPaidSchedule(item.getAmend_past_paid_schedule());
		transCltbAccountUpload.setChequeBookFacility(item.getCheque_book_facility());
		transCltbAccountUpload.setLiqBackValuedSchedules(item.getLiq_back_valued_schedules());
		transCltbAccountUpload.setLiqCompDatesFlag(item.getLiq_comp_dates_flag());
		if (!JMRUtil.isNullOrEmpty(item.getRetries_auto_liq())) { transCltbAccountUpload.setRetriesAutoLiq(new BigDecimal(item.getRetries_auto_liq())); }
		if (!JMRUtil.isNullOrEmpty(item.getResidual_amount())) { transCltbAccountUpload.setResidualAmount(new BigDecimal(item.getResidual_amount())); }
		transCltbAccountUpload.setAccountStatus(item.getAccount_status());
		transCltbAccountUpload.setAuthStat(item.getAuth_stat());
		if (!JMRUtil.isNullOrEmpty(item.getVersion_no())) { transCltbAccountUpload.setVersionNo(new BigDecimal(item.getVersion_no())); }
		if (!JMRUtil.isNullOrEmpty(item.getLatest_esn())) { transCltbAccountUpload.setLatestEsn(new BigDecimal(item.getLatest_esn())); }
		if (!JMRUtil.isNullOrEmpty(item.getNext_accr_date())) { transCltbAccountUpload.setNextAccrDate( JMRDateUtil.getDateFromString(item.getNext_accr_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transCltbAccountUpload.setHasProblems(item.getHas_problems());
		if (!JMRUtil.isNullOrEmpty(item.getProcess_no())) { transCltbAccountUpload.setProcessNo(new BigDecimal(item.getProcess_no())); }
		if (!JMRUtil.isNullOrEmpty(item.getAmount_disbursed())) { transCltbAccountUpload.setAmountDisbursed(new BigDecimal(item.getAmount_disbursed())); }
		transCltbAccountUpload.setStopAccruals(item.getStop_accruals());
		if (!JMRUtil.isNullOrEmpty(item.getFunded_status())) { transCltbAccountUpload.setFundedStatus(new BigDecimal(item.getFunded_status())); }
		transCltbAccountUpload.setAmortized(item.getAmortized());
		transCltbAccountUpload.setRecalcActionCode(item.getRecalc_action_code());
		transCltbAccountUpload.setMakerId(item.getMaker_id());
		if (!JMRUtil.isNullOrEmpty(item.getMaker_dt_stamp())) { transCltbAccountUpload.setMakerDtStamp( JMRDateUtil.getDateFromString(item.getMaker_dt_stamp(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transCltbAccountUpload.setCheckerId(item.getChecker_id());
		if (!JMRUtil.isNullOrEmpty(item.getChecker_dt_stamp())) { transCltbAccountUpload.setCheckerDtStamp( JMRDateUtil.getDateFromString(item.getChecker_dt_stamp(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transCltbAccountUpload.setArvnApplied(item.getArvn_applied());
		transCltbAccountUpload.setPartialLiquidation(item.getPartial_liquidation());
		transCltbAccountUpload.setAliqReversedPmt(item.getAliq_reversed_pmt());
		if (!JMRUtil.isNullOrEmpty(item.getNo_of_installments())) { transCltbAccountUpload.setNoOfInstallments(new BigDecimal(item.getNo_of_installments())); }
		if (!JMRUtil.isNullOrEmpty(item.getFrequency())) { transCltbAccountUpload.setFrequency(new BigDecimal(item.getFrequency())); }
		transCltbAccountUpload.setFrequencyUnit(item.getFrequency_unit());
		if (!JMRUtil.isNullOrEmpty(item.getFirst_ins_date())) { transCltbAccountUpload.setFirstInsDate( JMRDateUtil.getDateFromString(item.getFirst_ins_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transCltbAccountUpload.setLinkedReference(item.getLinked_reference());
		transCltbAccountUpload.setLinkageType(item.getLinkage_type());
		transCltbAccountUpload.setFieldChar1(item.getField_char_1());
		transCltbAccountUpload.setFieldChar2(item.getField_char_2());
		transCltbAccountUpload.setFieldChar3(item.getField_char_3());
		transCltbAccountUpload.setFieldChar4(item.getField_char_4());
		transCltbAccountUpload.setFieldChar5(item.getField_char_5());
		transCltbAccountUpload.setFieldChar6(item.getField_char_6());
		transCltbAccountUpload.setFieldChar7(item.getField_char_7());
		transCltbAccountUpload.setFieldChar8(item.getField_char_8());
		transCltbAccountUpload.setFieldChar9(item.getField_char_9());
		transCltbAccountUpload.setFieldChar10(item.getField_char_10());
		transCltbAccountUpload.setFieldChar11(item.getField_char_11());
		transCltbAccountUpload.setFieldChar12(item.getField_char_12());
		transCltbAccountUpload.setFieldChar13(item.getField_char_13());
		transCltbAccountUpload.setFieldChar14(item.getField_char_14());
		transCltbAccountUpload.setFieldChar15(item.getField_char_15());
		transCltbAccountUpload.setFieldChar16(item.getField_char_16());
		transCltbAccountUpload.setFieldChar17(item.getField_char_17());
		transCltbAccountUpload.setFieldChar18(item.getField_char_18());
		transCltbAccountUpload.setFieldChar19(item.getField_char_19());
		transCltbAccountUpload.setFieldChar20(item.getField_char_20());
		if (!JMRUtil.isNullOrEmpty(item.getField_number_1())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_1())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_2())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_2())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_3())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_3())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_4())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_4())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_5())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_5())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_6())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_6())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_7())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_7())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_8())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_8())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_9())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_9())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_10())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_10())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_11())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_11())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_12())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_12())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_13())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_13())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_14())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_14())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_15())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_15())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_16())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_16())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_17())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_17())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_18())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_18())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_19())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_19())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_number_20())) { transCltbAccountUpload.setFieldNumber1(new BigDecimal(item.getField_number_20())); }
		if (!JMRUtil.isNullOrEmpty(item.getField_date_1())) { transCltbAccountUpload.setFieldDate1( JMRDateUtil.getDateFromString(item.getField_date_1(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getField_date_2())) { transCltbAccountUpload.setFieldDate2( JMRDateUtil.getDateFromString(item.getField_date_2(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getField_date_3())) { transCltbAccountUpload.setFieldDate3( JMRDateUtil.getDateFromString(item.getField_date_3(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getField_date_4())) { transCltbAccountUpload.setFieldDate4( JMRDateUtil.getDateFromString(item.getField_date_4(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getField_date_5())) { transCltbAccountUpload.setFieldDate5( JMRDateUtil.getDateFromString(item.getField_date_5(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getField_date_6())) { transCltbAccountUpload.setFieldDate6( JMRDateUtil.getDateFromString(item.getField_date_6(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getField_date_7())) { transCltbAccountUpload.setFieldDate7( JMRDateUtil.getDateFromString(item.getField_date_7(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getField_date_8())) { transCltbAccountUpload.setFieldDate8( JMRDateUtil.getDateFromString(item.getField_date_8(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getField_date_9())) { transCltbAccountUpload.setFieldDate9( JMRDateUtil.getDateFromString(item.getField_date_9(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getField_date_10())) { transCltbAccountUpload.setFieldDate10( JMRDateUtil.getDateFromString(item.getField_date_10(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transCltbAccountUpload.setRollBy(item.getRoll_by());
		transCltbAccountUpload.setMaturityType(item.getMaturity_type());
		if (!JMRUtil.isNullOrEmpty(item.getNet_principal())) { transCltbAccountUpload.setNetPrincipal(new BigDecimal(item.getNet_principal())); }
		if (!JMRUtil.isNullOrEmpty(item.getIndex_xrate())) { transCltbAccountUpload.setIndexXrate(new BigDecimal(item.getIndex_xrate())); }
		transCltbAccountUpload.setDrPaymentMode(item.getDr_payment_mode());
		transCltbAccountUpload.setCrPaymentMode(item.getCr_payment_mode());
		transCltbAccountUpload.setDrProdAc(item.getDr_prod_ac());
		transCltbAccountUpload.setCrProdAc(item.getCr_prod_ac());
		transCltbAccountUpload.setDrAccBrn(item.getDr_acc_brn());
		transCltbAccountUpload.setCrAccBrn(item.getCr_acc_brn());
		transCltbAccountUpload.setExtAccNoCr(item.getExt_acc_no_cr());
		transCltbAccountUpload.setExtAccNameCr(item.getExt_acc_name_cr());
		transCltbAccountUpload.setClgBankCodeCr(item.getClg_bank_code_cr());
		transCltbAccountUpload.setClgBrnCodeCr(item.getClg_brn_code_cr());
		transCltbAccountUpload.setPcCatCr(item.getPc_cat_cr());
		transCltbAccountUpload.setExtAccNoDr(item.getExt_acc_no_dr());
		transCltbAccountUpload.setExtAccNameDr(item.getExt_acc_name_dr());
		transCltbAccountUpload.setClgBankCodeDr(item.getClg_bank_code_dr());
		transCltbAccountUpload.setClgBrnCodeDr(item.getClg_brn_code_dr());
		transCltbAccountUpload.setPcCatDr(item.getPc_cat_dr());
		transCltbAccountUpload.setCardNo(item.getCard_no());
		transCltbAccountUpload.setInstrumentNoCr(item.getInstrument_no_cr());
		transCltbAccountUpload.setRoutingNoCr(item.getRouting_no_cr());
		transCltbAccountUpload.setEndPointCr(item.getEnd_point_cr());
		transCltbAccountUpload.setClgProdCodeCr(item.getClg_prod_code_cr());
		transCltbAccountUpload.setSectorCodeCr(item.getSector_code_cr());
		transCltbAccountUpload.setInstrumentNoDr(item.getInstrument_no_dr());
		transCltbAccountUpload.setRoutingNoDr(item.getRouting_no_dr());
		transCltbAccountUpload.setEndPointDr(item.getEnd_point_dr());
		transCltbAccountUpload.setClgProdCodeDr(item.getClg_prod_code_dr());
		transCltbAccountUpload.setSectorCodeDr(item.getSector_code_dr());
		transCltbAccountUpload.setUploadSourceDr(item.getUpload_source_dr());
		transCltbAccountUpload.setUploadSourceCr(item.getUpload_source_cr());
		if (!JMRUtil.isNullOrEmpty(item.getEmi_amount())) { transCltbAccountUpload.setEmiAmount(new BigDecimal(item.getEmi_amount())); }
		transCltbAccountUpload.setCutoffTransaction(item.getCutoff_transaction());
		transCltbAccountUpload.setDelinquencyStatus(item.getDelinquency_status());
		if (!JMRUtil.isNullOrEmpty(item.getExecution_date())) { transCltbAccountUpload.setExecutionDate( JMRDateUtil.getDateFromString(item.getExecution_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getMigration_date())) { transCltbAccountUpload.setMigrationDate( JMRDateUtil.getDateFromString(item.getMigration_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transCltbAccountUpload.setUsgtStatus(item.getUsgt_status());
		if (!JMRUtil.isNullOrEmpty(item.getLast_intraday_accr_dt())) { transCltbAccountUpload.setLastIntradayAccrDt( JMRDateUtil.getDateFromString(item.getLast_intraday_accr_dt(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transCltbAccountUpload.setGiroModeDr(item.getGiro_mode_dr());
		transCltbAccountUpload.setGiroServiceDr(item.getGiro_service_dr());
		transCltbAccountUpload.setGiroNumberDr(item.getGiro_number_dr());
		transCltbAccountUpload.setPayerAccNoDr(item.getPayer_acc_no_dr());
		transCltbAccountUpload.setPayerBankCodeDr(item.getPayer_bank_code_dr());
		transCltbAccountUpload.setPayerBranchDr(item.getPayer_branch_dr());
		transCltbAccountUpload.setPayerAddress1Dr(item.getPayer_address1_dr());
		transCltbAccountUpload.setPayerAddress2Dr(item.getPayer_address2_dr());
		transCltbAccountUpload.setPayerAddress3Dr(item.getPayer_address3_dr());
		transCltbAccountUpload.setPayerAddress4Dr(item.getPayer_address4_dr());
		transCltbAccountUpload.setGiroModeCr(item.getGiro_mode_cr());
		transCltbAccountUpload.setGiroServiceCr(item.getGiro_service_cr());
		transCltbAccountUpload.setGiroNumberCr(item.getGiro_number_cr());
		transCltbAccountUpload.setPayerAccNoCr(item.getPayer_acc_no_cr());
		transCltbAccountUpload.setPayerBankCodeCr(item.getPayer_bank_code_cr());
		transCltbAccountUpload.setPayerBranchCr(item.getPayer_branch_cr());
		transCltbAccountUpload.setPayerAddress1Cr(item.getPayer_address1_cr());
		transCltbAccountUpload.setPayerAddress2Cr(item.getPayer_address2_cr());
		transCltbAccountUpload.setPayerAddress3Cr(item.getPayer_address3_cr());
		transCltbAccountUpload.setPayerAddress4Cr(item.getPayer_address4_cr());
		if (!JMRUtil.isNullOrEmpty(item.getDue_dates_on())) { transCltbAccountUpload.setDueDatesOn(new BigDecimal(item.getDue_dates_on())); }
		transCltbAccountUpload.setUserRefNo(item.getUser_ref_no());
		transCltbAccountUpload.setBillRefNo(item.getBill_ref_no());
		transCltbAccountUpload.setRolloverAllowed(item.getRollover_allowed());
		if (!JMRUtil.isNullOrEmpty(item.getAmt_available())) { transCltbAccountUpload.setAmtAvailable(new BigDecimal(item.getAmt_available())); }
		transCltbAccountUpload.setCommitmentType(item.getCommitment_type());
		transCltbAccountUpload.setLoanType(item.getLoan_type());
		transCltbAccountUpload.setModuleCode(item.getModule_code());
		transCltbAccountUpload.setUploadStatus(item.getUpload_status());
		transCltbAccountUpload.setErrorCode(item.getError_code());
		if (!JMRUtil.isNullOrEmpty(item.getJob_id())) { transCltbAccountUpload.setJobId(new BigDecimal(item.getJob_id())); }
		transCltbAccountUpload.setProcessCode(item.getProcess_code());
		if (!JMRUtil.isNullOrEmpty(item.getSequence_no())) { transCltbAccountUpload.setSequenceNo(new BigDecimal(item.getSequence_no())); }
		transCltbAccountUpload.setPackingCredit(item.getPacking_credit());
		if (!JMRUtil.isNullOrEmpty(item.getEmi_freq())) { transCltbAccountUpload.setEmiFreq(new BigDecimal(item.getEmi_freq())); }
		if (!JMRUtil.isNullOrEmpty(item.getMin_emi())) { transCltbAccountUpload.setMinEmi(new BigDecimal(item.getMin_emi())); }
		if (!JMRUtil.isNullOrEmpty(item.getMax_emi())) { transCltbAccountUpload.setMaxEmi(new BigDecimal(item.getMax_emi())); }
		transCltbAccountUpload.setEmiFreqUnit(item.getEmi_freq_unit());
		if (!JMRUtil.isNullOrEmpty(item.getEnd_date())) { transCltbAccountUpload.setEndDate( JMRDateUtil.getDateFromString(item.getEnd_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getAmount_utilized())) { transCltbAccountUpload.setAmountUtilized(new BigDecimal(item.getAmount_utilized())); }
		transCltbAccountUpload.setMinAmtDueRule(item.getMin_amt_due_rule());
		if (!JMRUtil.isNullOrEmpty(item.getFirst_pay_by_date())) { transCltbAccountUpload.setFirstPayByDate( JMRDateUtil.getDateFromString(item.getFirst_pay_by_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getCreditdays())) { transCltbAccountUpload.setCreditdays(new BigDecimal(item.getCreditdays())); }
		transCltbAccountUpload.setOpenLineLoan(item.getOpen_line_loan());
		transCltbAccountUpload.setRevolvingType(item.getRevolving_type());
		transCltbAccountUpload.setUseGuarantor(item.getUse_guarantor());
		transCltbAccountUpload.setPropHandover(item.getProp_handover());
		if (!JMRUtil.isNullOrEmpty(item.getHandover_date())) { transCltbAccountUpload.setHandoverDate( JMRDateUtil.getDateFromString(item.getHandover_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transCltbAccountUpload.setHandoverConf(item.getHandover_conf());
		if (!JMRUtil.isNullOrEmpty(item.getDays_for_cif_ac())) { transCltbAccountUpload.setDaysForCifAc(new BigDecimal(item.getDays_for_cif_ac())); }
		if (!JMRUtil.isNullOrEmpty(item.getDays_for_gua_ac())) { transCltbAccountUpload.setDaysForGuaAc(new BigDecimal(item.getDays_for_gua_ac())); }
		if (!JMRUtil.isNullOrEmpty(item.getSupp_grace_period())) { transCltbAccountUpload.setSuppGracePeriod(new BigDecimal(item.getSupp_grace_period())); }
		if (!JMRUtil.isNullOrEmpty(item.getCust_grace_period())) { transCltbAccountUpload.setCustGracePeriod(new BigDecimal(item.getCust_grace_period())); }
		if (!JMRUtil.isNullOrEmpty(item.getMigration_date())) { transCltbAccountUpload.setMigrationDate( JMRDateUtil.getDateFromString(item.getMigration_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getEnd_construct_dt())) { transCltbAccountUpload.setEndConstructDt( JMRDateUtil.getDateFromString(item.getEnd_construct_dt(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getRetries_advice_days())) { transCltbAccountUpload.setRetriesAdviceDays(new BigDecimal(item.getRetries_advice_days())); }
		transCltbAccountUpload.setLoanStlmntNoticeflg(item.getLoan_stlmnt_noticeflg());
		if (!JMRUtil.isNullOrEmpty(item.getNotice_date())) { transCltbAccountUpload.setNoticeDate( JMRDateUtil.getDateFromString(item.getNotice_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getExpected_closure_date())) { transCltbAccountUpload.setExpectedClosureDate( JMRDateUtil.getDateFromString(item.getExpected_closure_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getArrahnu_extension())) { transCltbAccountUpload.setArrahnuExtension(new BigDecimal(item.getArrahnu_extension())); }
		transCltbAccountUpload.setAutoCloseCollateral(item.getAuto_close_collateral());
		transCltbAccountUpload.setStatusChangeMode(item.getStatus_change_mode());
		if (!JMRUtil.isNullOrEmpty(item.getDownpayment_percen())) { transCltbAccountUpload.setDownpaymentPercen(new BigDecimal(item.getDownpayment_percen())); }
		transCltbAccountUpload.setTakenOver(item.getTaken_over());
		transCltbAccountUpload.setLeaseType(item.getLease_type());
		transCltbAccountUpload.setAssetType(item.getAsset_type());
		transCltbAccountUpload.setMurContStatus(item.getMur_cont_status());
		transCltbAccountUpload.setRateChgAction(item.getRate_chg_action());
		transCltbAccountUpload.setMfiLoanType(item.getMfi_loan_type());
		transCltbAccountUpload.setSanctioningOfficer(item.getSanctioning_officer());
		transCltbAccountUpload.setLoanDisbursementCategory(item.getLoan_disbursement_category());
		transCltbAccountUpload.setAmountBlockFlag(item.getAmount_block_flag());
		transCltbAccountUpload.setLeadId(item.getLead_id());
		if (!JMRUtil.isNullOrEmpty(item.getNo_of_topup())) { transCltbAccountUpload.setNoOfTopup(new BigDecimal(item.getNo_of_topup())); }
		transCltbAccountUpload.setLcRefNo(item.getLc_ref_no());
		transCltbAccountUpload.setPurchaseOrdRefNo(item.getPurchase_ord_ref_no());
		if (!JMRUtil.isNullOrEmpty(item.getSettlement_seq_num())) { transCltbAccountUpload.setSettlementSeqNum(new BigDecimal(item.getSettlement_seq_num())); }
		transCltbAccountUpload.setFundId(item.getFund_id());
		transCltbAccountUpload.setLoanAgainstSal(item.getLoan_against_sal());
		transCltbAccountUpload.setProvisioningMode(item.getProvisioning_mode());
		transCltbAccountUpload.setReschAllow(item.getResch_allow());
		if (!JMRUtil.isNullOrEmpty(item.getEffective_date())) { transCltbAccountUpload.setEffectiveDate( JMRDateUtil.getDateFromString(item.getEffective_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transCltbAccountUpload.setAllowBulkPaymnet(item.getAllow_bulk_paymnet());
		transCltbAccountUpload.setAllowMultiParty(item.getAllow_multi_party());
		transCltbAccountUpload.setAllowMultipleDp(item.getAllow_multiple_dp());
		transCltbAccountUpload.setAmortRescheduleOnDsbr(item.getAmort_reschedule_on_dsbr());
		transCltbAccountUpload.setAmountBlockRemarks(item.getAmount_block_remarks());
		if (!JMRUtil.isNullOrEmpty(item.getAmount_blocked())) { transCltbAccountUpload.setAmountBlocked(new BigDecimal(item.getAmount_blocked())); }
		if (!JMRUtil.isNullOrEmpty(item.getApplicant_income())) { transCltbAccountUpload.setApplicantIncome(new BigDecimal(item.getApplicant_income())); }
		if (!JMRUtil.isNullOrEmpty(item.getAsset_cost())) { transCltbAccountUpload.setAssetCost(new BigDecimal(item.getAsset_cost())); }
		if (!JMRUtil.isNullOrEmpty(item.getBalloon_amount())) { transCltbAccountUpload.setBalloonAmount(new BigDecimal(item.getBalloon_amount())); }
		if (!JMRUtil.isNullOrEmpty(item.getBank_share_percent())) { transCltbAccountUpload.setBankSharePercent(new BigDecimal(item.getBank_share_percent())); }
		transCltbAccountUpload.setBookUnearnedInterest(item.getBook_unearned_interest());
		transCltbAccountUpload.setCustFrequencyUnit(item.getCust_frequency_unit());
		if (!JMRUtil.isNullOrEmpty(item.getCust_share_percent())) { transCltbAccountUpload.setCustSharePercent(new BigDecimal(item.getCust_share_percent())); }
		transCltbAccountUpload.setDealer(item.getDealer());
		transCltbAccountUpload.setFaAssetRefNo(item.getFa_asset_ref_no());
		if (!JMRUtil.isNullOrEmpty(item.getFuture_dp_receivable())) { transCltbAccountUpload.setFutureDpReceivable(new BigDecimal(item.getFuture_dp_receivable())); }
		transCltbAccountUpload.setInsuranceCompCode(item.getInsurance_comp_code());
		transCltbAccountUpload.setInsuranceFinanced(item.getInsurance_financed());
		transCltbAccountUpload.setInsuranceFlag(item.getInsurance_flag());
		transCltbAccountUpload.setInterestCalcMethod(item.getInterest_calc_method());
		transCltbAccountUpload.setInterestSubsidyAllowed(item.getInterest_subsidy_allowed());
		transCltbAccountUpload.setIntermediaryCode(item.getIntermediary_code());
		transCltbAccountUpload.setIntermediaryInitiated(item.getIntermediary_initiated());
		if (!JMRUtil.isNullOrEmpty(item.getLease_extend_by())) { transCltbAccountUpload.setLeaseExtendBy(new BigDecimal(item.getLease_extend_by())); }
		transCltbAccountUpload.setLeasePaymentMode(item.getLease_payment_mode());
		transCltbAccountUpload.setLineId(item.getLine_id());
		transCltbAccountUpload.setLiqdResidualValue(item.getLiqd_residual_value());
		transCltbAccountUpload.setLoanStmtReqd(item.getLoan_stmt_reqd());
		if (!JMRUtil.isNullOrEmpty(item.getLoan_to_value())) { transCltbAccountUpload.setLoanToValue(new BigDecimal(item.getLoan_to_value())); }
		if (!JMRUtil.isNullOrEmpty(item.getMaturity_tenor())) { transCltbAccountUpload.setMaturityTenor(new BigDecimal(item.getMaturity_tenor())); }
		transCltbAccountUpload.setMaturityUnit(item.getMaturity_unit());
		if (!JMRUtil.isNullOrEmpty(item.getMax_rnog())) { transCltbAccountUpload.setMaxRnog(new BigDecimal(item.getMax_rnog())); }
		transCltbAccountUpload.setMortgageGroup(item.getMortgage_group());
		transCltbAccountUpload.setNotaryAutoConfirmed(item.getNotary_auto_confirmed());
		if (!JMRUtil.isNullOrEmpty(item.getPost_const_uidb())) { transCltbAccountUpload.setPostConstUidb(new BigDecimal(item.getPost_const_uidb())); }
		transCltbAccountUpload.setProjectAccount(item.getProject_account());
		transCltbAccountUpload.setRecalcAnnuity(item.getRecalc_annuity());
		transCltbAccountUpload.setRecmpPrfSch(item.getRecmp_prf_sch());
		transCltbAccountUpload.setResidualAutoLiqd(item.getResidual_auto_liqd());
		transCltbAccountUpload.setResidualSubsidyAllowed(item.getResidual_subsidy_allowed());
		if (!JMRUtil.isNullOrEmpty(item.getResidual_subsidy_value())) { transCltbAccountUpload.setResidualSubsidyValue(new BigDecimal(item.getResidual_subsidy_value())); }
		if (!JMRUtil.isNullOrEmpty(item.getResidual_value())) { transCltbAccountUpload.setResidualValue(new BigDecimal(item.getResidual_value())); }
		transCltbAccountUpload.setResidualValueBasis(item.getResidual_value_basis());
		if (!JMRUtil.isNullOrEmpty(item.getRnog_no())) { transCltbAccountUpload.setRnogNo(new BigDecimal(item.getRnog_no())); }
		transCltbAccountUpload.setSecrStatus(item.getSecr_status());
		if (!JMRUtil.isNullOrEmpty(item.getStaff_finance())) { transCltbAccountUpload.setStaffFinance(new BigDecimal(item.getStaff_finance())); }
		transCltbAccountUpload.setStopDsbr(item.getStop_dsbr());
		transCltbAccountUpload.setSubsidyCustomerId(item.getSubsidy_customer_id());
		transCltbAccountUpload.setSuppFrequencyUnit(item.getSupp_frequency_unit());
		transCltbAccountUpload.setSupplierId(item.getSupplier_id());
		if (!JMRUtil.isNullOrEmpty(item.getTotal_amount())) { transCltbAccountUpload.setTotalAmount(new BigDecimal(item.getTotal_amount())); }
		transCltbAccountUpload.setUidbCalcReqd(item.getUidb_calc_reqd());
		if (!JMRUtil.isNullOrEmpty(item.getUidb_nominal_amt())) { transCltbAccountUpload.setUidbNominalAmt(new BigDecimal(item.getUidb_nominal_amt())); }
		if (!JMRUtil.isNullOrEmpty(item.getUpfront_profit_booked())) { transCltbAccountUpload.setUpfrontProfitBooked(new BigDecimal(item.getUpfront_profit_booked())); }
		transCltbAccountUpload.setWakalaAccNo(item.getWakala_acc_no());
		if (!JMRUtil.isNullOrEmpty(item.getWindow_period_unit())) { transCltbAccountUpload.setWindowPeriodUnit(new BigDecimal(item.getWindow_period_unit())); }
		transCltbAccountUpload.setWindowPeriodFreq(item.getWindow_period_freq());
		if (!JMRUtil.isNullOrEmpty(item.getBalloon_percent())) { transCltbAccountUpload.setBalloonPercent(new BigDecimal(item.getBalloon_percent())); }
		if (!JMRUtil.isNullOrEmpty(item.getBalloon_rollover_installment())) { transCltbAccountUpload.setBalloonRolloverInstallment(new BigDecimal(item.getBalloon_rollover_installment())); }
		transCltbAccountUpload.setBalloonRolloverUnit(item.getBalloon_rollover_unit());
		transCltbAccountUpload.setExcludeInstlmntFromBalloon(item.getExclude_instlmnt_from_balloon());
		transCltbAccountUpload.setBalloonRolloverReqd(item.getBalloon_rollover_reqd());
		transCltbAccountUpload.setIbanAcNo(item.getIban_ac_no());
		transCltbAccountUpload.setIbanRequired(item.getIban_required());
		transCltbAccountUpload.setPaymentDetails1(item.getPayment_details_1());
		transCltbAccountUpload.setPaymentDetails2(item.getPayment_details_2());
		transCltbAccountUpload.setPaymentDetails3(item.getPayment_details_3());
		transCltbAccountUpload.setPaymentDetails4(item.getPayment_details_4());
		if (!JMRUtil.isNullOrEmpty(item.getTakaful_cost())) { transCltbAccountUpload.setTakafulCost(new BigDecimal(item.getTakaful_cost())); }
		if (!JMRUtil.isNullOrEmpty(item.getMaintain_cost())) { transCltbAccountUpload.setMaintainCost(new BigDecimal(item.getMaintain_cost())); }
		transCltbAccountUpload.setUiDrProdAc(item.getUi_dr_prod_ac());
		transCltbAccountUpload.setUiCrProdAc(item.getUi_cr_prod_ac());
		return transCltbAccountUpload ;
	}
}

