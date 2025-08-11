
package com.jmr.batch.processor.casabalance;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.casabalance.TransDetbUploadMasterCasabal;
import com.jmr.batch.entity.casabalance.TransDetbUploadMasterCasabalPK;
import com.jmr.batch.model.casabalance.TransDetbUploadMasterCasabalModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProDetbUploadMasterCasabal
		implements ItemProcessor<TransDetbUploadMasterCasabalModel, TransDetbUploadMasterCasabal> {

	@Override
	public TransDetbUploadMasterCasabal process(TransDetbUploadMasterCasabalModel item) throws Exception {
		TransDetbUploadMasterCasabal transDetbUploadMasterCasabal = new TransDetbUploadMasterCasabal();
		transDetbUploadMasterCasabal.setTxnCode(item.getTxn_code());
		transDetbUploadMasterCasabal.setUploadFileName(item.getUpload_file_name());
		transDetbUploadMasterCasabal.setOffsetGl(item.getOffset_gl());
		transDetbUploadMasterCasabal.setSourceCode(item.getSource_code());
		transDetbUploadMasterCasabal.setUserId(item.getUser_id());
		transDetbUploadMasterCasabal.setMakerId(item.getMaker_id());
		transDetbUploadMasterCasabal.setCheckerId(item.getChecker_id());
		transDetbUploadMasterCasabal.setBatchDesc(item.getBatch_desc());
		transDetbUploadMasterCasabal.setAuthStat(item.getAuth_stat());
		transDetbUploadMasterCasabal.setRecordStat(item.getRecord_stat());
		transDetbUploadMasterCasabal.setOnceAuth(item.getOnce_auth());
		transDetbUploadMasterCasabal.setIgnoreOverrides(item.getIgnore_overrides());
		transDetbUploadMasterCasabal.setBalancing(item.getBalancing());
		transDetbUploadMasterCasabal.setMisRequired(item.getMis_required());
		transDetbUploadMasterCasabal.setAutoAuth(item.getAuto_auth());
		transDetbUploadMasterCasabal.setGlOffsetEntryReqd(item.getGl_offset_entry_reqd());
		transDetbUploadMasterCasabal.setUdfUploadReqd(item.getUdf_upload_reqd());
		transDetbUploadMasterCasabal.setUploadStat(item.getUpload_stat());
		transDetbUploadMasterCasabal.setSystemBatch(item.getSystem_batch());
		transDetbUploadMasterCasabal.setPositionReqd(item.getPosition_reqd());
		if (!JMRUtil.isNullOrEmpty(item.getTotal_entries())) {
			transDetbUploadMasterCasabal.setTotalEntries(Double.valueOf(item.getTotal_entries()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getUploaded_entries())) {
			transDetbUploadMasterCasabal.setUploadedEntries(Double.valueOf(item.getUploaded_entries()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getMod_no())) {
			transDetbUploadMasterCasabal.setModNo(Double.valueOf(item.getMod_no()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getDr_ent_total())) {
			transDetbUploadMasterCasabal.setDrEntTotal(Double.valueOf(item.getDr_ent_total()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getCr_ent_total())) {
			transDetbUploadMasterCasabal.setCrEntTotal(Double.valueOf(item.getCr_ent_total()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getJobno())) {
			transDetbUploadMasterCasabal.setJobno(Double.valueOf(item.getJobno()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getMaker_dt_stamp())) {
			transDetbUploadMasterCasabal.setMakerDtStamp(
					JMRDateUtil.getDateFromString(item.getMaker_dt_stamp(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		if (!JMRUtil.isNullOrEmpty(item.getChecker_dt_stamp())) {
			transDetbUploadMasterCasabal.setCheckerDtStamp(
					JMRDateUtil.getDateFromString(item.getChecker_dt_stamp(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		if (!JMRUtil.isNullOrEmpty(item.getUpload_date())) {
			transDetbUploadMasterCasabal.setUploadDate(
					JMRDateUtil.getDateFromString(item.getUpload_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		TransDetbUploadMasterCasabalPK transDetbUploadMasterCasabalPK = new TransDetbUploadMasterCasabalPK();
		transDetbUploadMasterCasabalPK.setBranchCode(item.getBranch_code());

		transDetbUploadMasterCasabalPK.setBatchNo(item.getBatch_no());

		transDetbUploadMasterCasabal.setId(transDetbUploadMasterCasabalPK);

		return transDetbUploadMasterCasabal;
	}
}