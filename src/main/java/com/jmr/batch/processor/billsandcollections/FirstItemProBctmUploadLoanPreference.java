package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctmUploadLoanPreference;
import com.jmr.batch.entity.billsandcollections.TransBctmUploadLoanPreferencePK;
import com.jmr.batch.model.billsandcollections.TransBctmUploadLoanPreferenceModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctmUploadLoanPreference
        implements ItemProcessor<TransBctmUploadLoanPreferenceModel, TransBctmUploadLoanPreference> {

    @Override
    public TransBctmUploadLoanPreference process(TransBctmUploadLoanPreferenceModel item) throws Exception {

        TransBctmUploadLoanPreference entity = new TransBctmUploadLoanPreference();

        // Build composite primary key
        TransBctmUploadLoanPreferencePK pk = new TransBctmUploadLoanPreferencePK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransBctmUploadLoanPreferencePK(pk);

        // Map other fields
        if (!JMRUtil.isNullOrEmpty(item.getTenor())) {
            entity.setTenor(Integer.valueOf(item.getTenor()));
        }
        entity.setUnits(item.getUnits());
        entity.setCreditLine(item.getCredit_line());
        entity.setRateCode(item.getRate_code());

        if (!JMRUtil.isNullOrEmpty(item.getExchange_rate())) {
            entity.setExchangeRate(Long.valueOf(item.getExchange_rate()));
        }

        entity.setRateType(item.getRate_type());
        entity.setMaturityAccount(item.getMaturity_account());
        entity.setCrystallizationType(item.getCrystallization_type());

        if (!JMRUtil.isNullOrEmpty(item.getColl_liqd_amount())) {
            entity.setCollLiquidatedAmount(Long.valueOf(item.getColl_liqd_amount()));
        }

        entity.setLiqdLcChrgComm(item.getLiqd_lc_chrg_comm());

        
        
        if (!JMRUtil.isNullOrEmpty(item.getMaturity_date())) {
            entity.setMaturityDate(JMRDateUtil.getDateFromString(item.getMaturity_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }

        if (!JMRUtil.isNullOrEmpty(item.getLoan_amount())) {
            entity.setLoanAmount(Long.valueOf(item.getLoan_amount()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getBill_outstanding())) {
            entity.setBillOutstanding(Long.valueOf(item.getBill_outstanding()));
        }

        entity.setBillCcy(item.getBill_ccy());
        entity.setRateCodePref(item.getRate_code_pref());

        if (!JMRUtil.isNullOrEmpty(item.getMaximum_rate_variance())) {
            entity.setMaximumRateVariance(Long.valueOf(item.getMaximum_rate_variance()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getNormal_rate_variance())) {
            entity.setNormalRateVariance(Long.valueOf(item.getNormal_rate_variance()));
        }

        entity.setPaymentMode(item.getPayment_mode());
        entity.setDrAccBrn(item.getDr_acc_brn());
        entity.setDrProdAc(item.getDr_prod_ac());
        entity.setCrAccBrn(item.getCr_acc_brn());
        entity.setCrProdAc(item.getCr_prod_ac());
        entity.setBridgeGl(item.getBridge_gl());
        entity.setProduct(item.getProduct());
        entity.setCurrency(item.getCurrency());

        return entity;
    }
}
