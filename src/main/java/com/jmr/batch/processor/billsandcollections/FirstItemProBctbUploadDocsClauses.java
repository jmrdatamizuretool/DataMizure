package com.jmr.batch.processor.billsandcollections;



import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadDocsClauses;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadDocsClausesPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadDocsClausesModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadDocsClauses
        implements ItemProcessor<TransBctbUploadDocsClausesModel, TransBctbUploadDocsClauses> {

    @Override
    public TransBctbUploadDocsClauses process(TransBctbUploadDocsClausesModel item) throws Exception {

        TransBctbUploadDocsClauses entity = new TransBctbUploadDocsClauses();

        // Create and set PK
        TransBctbUploadDocsClausesPK pk = new TransBctbUploadDocsClausesPK();
        pk.setSourceCode(item.getSource_code());
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        pk.setDocCode(item.getDoc_code());
        pk.setClauseCode(item.getClause_code());

        entity.setTransBctbUploadDocsClausesPK(pk);

        // Map normal fields
        if (!JMRUtil.isNullOrEmpty(item.getClause_sl_no())) {
            entity.setClauseSlNo(Long.valueOf(item.getClause_sl_no()));
        }

        entity.setClauseDescr(item.getClause_descr());

        return entity;
    }
}
