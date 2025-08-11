
package com.jmr.batch.processor.glbalance;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.glbalance.TransDetbUploadMasterGlbal;
import com.jmr.batch.entity.glbalance.TransDetbUploadMasterGlbalPK;
import com.jmr.batch.model.glbalance.TransDetbUploadMasterGlbalModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProDetbUploadMasterGlbal
		implements ItemProcessor<TransDetbUploadMasterGlbalModel, TransDetbUploadMasterGlbal> {

	@Override
	public TransDetbUploadMasterGlbal process(TransDetbUploadMasterGlbalModel item) throws Exception {
		TransDetbUploadMasterGlbal TransDetbUploadMasterGlbal = new TransDetbUploadMasterGlbal();
		TransDetbUploadMasterGlbal.setTxnCode(item.getTxn_code());
		TransDetbUploadMasterGlbal.setUploadFileName(item.getUpload_file_name());
		TransDetbUploadMasterGlbal.setOffsetGl(item.getOffset_gl());
		TransDetbUploadMasterGlbal.setSourceCode(item.getSource_code());
		TransDetbUploadMasterGlbal.setUserId(item.getUser_id());
		TransDetbUploadMasterGlbal.setMakerId(item.getMaker_id());
		TransDetbUploadMasterGlbal.setCheckerId(item.getChecker_id());
		TransDetbUploadMasterGlbal.setBatchDesc(item.getBatch_desc());
		TransDetbUploadMasterGlbal.setAuthStat(item.getAuth_stat());
		TransDetbUploadMasterGlbal.setRecordStat(item.getRecord_stat());
		TransDetbUploadMasterGlbal.setOnceAuth(item.getOnce_auth());
		TransDetbUploadMasterGlbal.setIgnoreOverrides(item.getIgnore_overrides());
		TransDetbUploadMasterGlbal.setBalancing(item.getBalancing());
		TransDetbUploadMasterGlbal.setMisRequired(item.getMis_required());
		TransDetbUploadMasterGlbal.setAutoAuth(item.getAuto_auth());
		TransDetbUploadMasterGlbal.setGlOffsetEntryReqd(item.getGl_offset_entry_reqd());
		TransDetbUploadMasterGlbal.setUdfUploadReqd(item.getUdf_upload_reqd());
		TransDetbUploadMasterGlbal.setUploadStat(item.getUpload_stat());
		TransDetbUploadMasterGlbal.setSystemBatch(item.getSystem_batch());
		TransDetbUploadMasterGlbal.setPositionReqd(item.getPosition_reqd());
		if (!JMRUtil.isNullOrEmpty(item.getTotal_entries())) {
			TransDetbUploadMasterGlbal.setTotalEntries(Double.valueOf(item.getTotal_entries()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getUploaded_entries())) {
			TransDetbUploadMasterGlbal.setUploadedEntries(Double.valueOf(item.getUploaded_entries()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getMod_no())) {
			TransDetbUploadMasterGlbal.setModNo(Double.valueOf(item.getMod_no()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getDr_ent_total())) {
			TransDetbUploadMasterGlbal.setDrEntTotal(Double.valueOf(item.getDr_ent_total()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getCr_ent_total())) {
			TransDetbUploadMasterGlbal.setCrEntTotal(Double.valueOf(item.getCr_ent_total()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getJobno())) {
			TransDetbUploadMasterGlbal.setJobno(Double.valueOf(item.getJobno()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getMaker_dt_stamp())) {
			TransDetbUploadMasterGlbal.setMakerDtStamp(
					JMRDateUtil.getDateFromString(item.getMaker_dt_stamp(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		if (!JMRUtil.isNullOrEmpty(item.getChecker_dt_stamp())) {
			TransDetbUploadMasterGlbal.setCheckerDtStamp(
					JMRDateUtil.getDateFromString(item.getChecker_dt_stamp(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		if (!JMRUtil.isNullOrEmpty(item.getUpload_date())) {
			TransDetbUploadMasterGlbal.setUploadDate(
					JMRDateUtil.getDateFromString(item.getUpload_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		TransDetbUploadMasterGlbalPK TransDetbUploadMasterGlbalPK = new TransDetbUploadMasterGlbalPK();
		TransDetbUploadMasterGlbalPK.setBranchCode(item.getBranch_code());

		TransDetbUploadMasterGlbalPK.setBatchNo(item.getBatch_no());

		TransDetbUploadMasterGlbal.setId(TransDetbUploadMasterGlbalPK);

		return TransDetbUploadMasterGlbal;
	}
}