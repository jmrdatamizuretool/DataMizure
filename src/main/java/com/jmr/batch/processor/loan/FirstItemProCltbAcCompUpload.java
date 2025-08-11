package com.jmr.batch.processor.loan;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.loan.TransCltbAcCompUpload;
import com.jmr.batch.entity.loan.TransCltbAcCompUploadPK;
import com.jmr.batch.model.loan.TransCltbAcCompUploadModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProCltbAcCompUpload implements ItemProcessor<TransCltbAcCompUploadModel, TransCltbAcCompUpload> {

	@Override
	public TransCltbAcCompUpload process(TransCltbAcCompUploadModel item) throws Exception {
		TransCltbAcCompUpload transCltbAcCompUpload = new TransCltbAcCompUpload();
		transCltbAcCompUpload.setSourceCode(item.getSource_code());
		transCltbAcCompUpload.setSectorCodeCr(item.getSector_code_cr());
		transCltbAcCompUpload.setSectorCodeDr(item.getSector_code_dr());
		transCltbAcCompUpload.setPcCatCr(item.getPc_cat_cr());
		transCltbAcCompUpload.setPcCatDr(item.getPc_cat_dr());
		transCltbAcCompUpload.setClgBankCodeCr(item.getClg_prod_code_cr());
		transCltbAcCompUpload.setClgProdCodeDr(item.getClg_prod_code_dr());
		transCltbAcCompUpload.setPayerBankCodeDr(item.getPayer_bank_code_dr());
		transCltbAcCompUpload.setPayerBankCodeCr(item.getPayer_bank_code_cr());
		transCltbAcCompUpload.setExtAccNameCr(item.getExt_acc_name_cr());
		transCltbAcCompUpload.setClgBrnCodeCr(item.getClg_brn_code_cr());
		transCltbAcCompUpload.setExtAccNameDr(item.getExt_acc_name_dr());
		transCltbAcCompUpload.setClgBrnCodeDr(item.getClg_brn_code_dr());
		transCltbAcCompUpload.setPayerBranchDr(item.getPayer_branch_dr());
		transCltbAcCompUpload.setPayerAddress1Dr(item.getPayer_address1_dr());
		transCltbAcCompUpload.setPayerAddress2Dr(item.getPayer_address2_dr());
		transCltbAcCompUpload.setPayerAddress3Dr(item.getPayer_address3_dr());
		transCltbAcCompUpload.setPayerAddress4Dr(item.getPayer_address4_dr());
		transCltbAcCompUpload.setPayerBranchDr(item.getPayer_branch_cr());
		transCltbAcCompUpload.setPayerAddress1Cr(item.getPayer_address1_cr());
		transCltbAcCompUpload.setPayerAddress2Cr(item.getPayer_address2_cr());
		transCltbAcCompUpload.setPayerAddress3Cr(item.getPayer_address3_cr());
		transCltbAcCompUpload.setPayerAddress4Cr(item.getPayer_address4_cr());
		transCltbAcCompUpload.setUiDrProdAc(item.getUi_dr_prod_ac());
		transCltbAcCompUpload.setUiCrProdAc(item.getUi_cr_prod_ac());
		transCltbAcCompUpload.setCardNo(item.getCard_no());
		transCltbAcCompUpload.setRoutingNoCr(item.getRouting_no_cr());
		transCltbAcCompUpload.setRoutingNoDr(item.getRouting_no_dr());
		transCltbAcCompUpload.setNegotiationRefNo(item.getNegotiation_ref_no());
		transCltbAcCompUpload.setNegotiationRefNoDr(item.getNegotiation_ref_no_dr());
		transCltbAcCompUpload.setSettlementCcy(item.getSettlement_ccy());
		transCltbAcCompUpload.setDrAccBrn(item.getDr_acc_brn());
		transCltbAcCompUpload.setCrAccBrn(item.getCr_acc_brn());
		transCltbAcCompUpload.setSvcAccBrn(item.getSvc_acc_brn());
		transCltbAcCompUpload.setComponentCcy(item.getComponent_ccy());
		transCltbAcCompUpload.setPenalBasisComp(item.getPenal_basis_comp());
		transCltbAcCompUpload.setDrPaymentMode(item.getDr_payment_mode());
		transCltbAcCompUpload.setCrPaymentMode(item.getCr_payment_mode());
		transCltbAcCompUpload.setDrProdAc(item.getDr_prod_ac());
		transCltbAcCompUpload.setCrProdAc(item.getCr_prod_ac());
		transCltbAcCompUpload.setSvcAccAc(item.getSvc_acc_ac());
		transCltbAcCompUpload.setExtAccNoCr(item.getExt_acc_no_cr());
		transCltbAcCompUpload.setClgBankCodeCr(item.getClg_bank_code_cr());
		transCltbAcCompUpload.setExtAccNoDr(item.getExt_acc_no_dr());
		transCltbAcCompUpload.setClgBankCodeDr(item.getClg_bank_code_dr());
		transCltbAcCompUpload.setGiroNumberDr(item.getGiro_number_dr());
		transCltbAcCompUpload.setPayerAccNoDr(item.getPayer_acc_no_dr());
		transCltbAcCompUpload.setGiroNumberCr(item.getGiro_number_cr());
		transCltbAcCompUpload.setPayerAccNoCr(item.getPayer_acc_no_cr());
		transCltbAcCompUpload.setInstrumentNoCr(item.getInstrument_no_cr());
		transCltbAcCompUpload.setInstrumentNoDr(item.getInstrument_no_dr());
		transCltbAcCompUpload.setUploadSourceDr(item.getUpload_source_dr());
		transCltbAcCompUpload.setUploadSourceCr(item.getUpload_source_cr());
		transCltbAcCompUpload.setPaymentDetails1(item.getPayment_details_1());
		transCltbAcCompUpload.setPaymentDetails2(item.getPayment_details_2());
		transCltbAcCompUpload.setPaymentDetails3(item.getPayment_details_3());
		transCltbAcCompUpload.setPaymentDetails4(item.getPayment_details_4());
		transCltbAcCompUpload.setEndPointCr(item.getEnd_point_cr());
		transCltbAcCompUpload.setEndPointDr(item.getEnd_point_dr());
		transCltbAcCompUpload.setComponentType(item.getComponent_type());
		transCltbAcCompUpload.setMainComponent(item.getMain_component());
		transCltbAcCompUpload.setSplInterest(item.getSpl_interest());
		transCltbAcCompUpload.setCapitalized(item.getCapitalized());
		transCltbAcCompUpload.setWaive(item.getWaive());
		transCltbAcCompUpload.setFundDuringInit(item.getFund_during_init());
		transCltbAcCompUpload.setFundDuringRoll(item.getFund_during_roll());
		transCltbAcCompUpload.setVerifyFunds(item.getVerify_funds());
		transCltbAcCompUpload.setGiroModeDr(item.getGiro_mode_dr());
		transCltbAcCompUpload.setGiroServiceDr(item.getGiro_service_dr());
		transCltbAcCompUpload.setGiroModeCr(item.getGiro_mode_cr());
		transCltbAcCompUpload.setGiroServiceCr(item.getGiro_service_cr());
		transCltbAcCompUpload.setLiquidationMode(item.getLiquidation_mode());
		transCltbAcCompUpload.setDeferredCharge(item.getDeferred_charge());
		transCltbAcCompUpload.setIrrApplicable(item.getIrr_applicable());
		transCltbAcCompUpload.setExponentialFlag(item.getExponential_flag());

		if (!JMRUtil.isNullOrEmpty(item.getDays_mth())) {
			transCltbAcCompUpload.setDaysMth(Double.valueOf(item.getDays_mth()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getDays_year())) {
			transCltbAcCompUpload.setDaysYear(Double.valueOf(item.getDays_year()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getSettlement_seq_num())) {
			transCltbAcCompUpload.setSettlementSeqNum(Double.valueOf(item.getSettlement_seq_num()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getExchange_rate())) {
			transCltbAcCompUpload.setExchangeRate(Double.valueOf(item.getExchange_rate()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getNegotiated_rate())) {
			transCltbAcCompUpload.setNegotiatedRate(Double.valueOf(item.getNegotiated_rate()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getOrg_exch_rate())) {
			transCltbAcCompUpload.setOrgExchRate(Double.valueOf(item.getOrg_exch_rate()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getExchange_rate_dr())) {
			transCltbAcCompUpload.setExchangeRateDr(Double.valueOf(item.getExchange_rate_dr()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getNegotiated_rate_dr())) {
			transCltbAcCompUpload.setNegotiatedRateDr(Double.valueOf(item.getNegotiated_rate_dr()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getOrg_exch_rate_dr())) {
			transCltbAcCompUpload.setOrgExchRateDr(Double.valueOf(item.getOrg_exch_rate_dr()));
		}
		TransCltbAcCompUploadPK transCltbAcCompUploadPK = new TransCltbAcCompUploadPK();

		if (!JMRUtil.isNullOrEmpty(item.getSequence_no())) {
			transCltbAcCompUploadPK.setSequenceNo(Long.valueOf(item.getSequence_no()));
		}
		transCltbAcCompUploadPK.setExtRefNo(item.getExt_ref_no());
		transCltbAcCompUploadPK.setBranchCode(item.getBranch_code());
		transCltbAcCompUploadPK.setComponentName(item.getComponent_name());

		transCltbAcCompUploadPK.setProcessCode(item.getProcess_code());
		transCltbAcCompUpload.setTransCltbAcCompUploadPK(transCltbAcCompUploadPK);
		return transCltbAcCompUpload;
	}

}
