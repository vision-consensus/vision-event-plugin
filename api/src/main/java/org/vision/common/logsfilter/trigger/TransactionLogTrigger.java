package org.vision.common.logsfilter.trigger;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class TransactionLogTrigger extends Trigger {

  @Override
  public void setTimeStamp(long ts) {
    super.timeStamp = ts;
  }

  @Getter
  @Setter
  private String transactionId;

  @Getter
  @Setter
  private String blockHash;

  @Getter
  @Setter
  private long blockNumber = -1;

  @Getter
  @Setter
  private long entropyUsage;

  @Getter
  @Setter
  private long entropyFee;

  @Getter
  @Setter
  private long originEntropyUsage;

  @Getter
  @Setter
  private long entropyUsageTotal;

  @Getter
  @Setter
  private long photonUsage;

  @Getter
  @Setter
  private long photonFee;

  //contract
  @Getter
  @Setter
  private String result;

  @Getter
  @Setter
  private String contractAddress;

  @Getter
  @Setter
  private String contractType;

  @Getter
  @Setter
  private long feeLimit;

  @Getter
  @Setter
  private long contractCallValue;

  @Getter
  @Setter
  private String contractResult;

  // transfer contract
  @Getter
  @Setter
  private String fromAddress;

  @Getter
  @Setter
  private String toAddress;

  @Getter
  @Setter
  private String assetName;

  @Getter
  @Setter
  private long assetAmount;

  //internal transaction
  @Getter
  @Setter
  private List<InternalTransactionPojo> internalTrananctionList;

  public TransactionLogTrigger() {
    setTriggerName(Trigger.TRANSACTION_TRIGGER_NAME);
  }
}
