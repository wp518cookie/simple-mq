package com.simple.mq.api.model;

import java.io.Serializable;

/**
 * @author wuping
 * @date 2019/1/11
 */

public class SendResult implements Serializable {
    private static final long serialVersionUID = -1L;
    public static final SendResult OK = new SendResult(true, Ack.COMMIT);

    private boolean sendResult;
    private Ack ack;

    public SendResult() {

    }

    public SendResult(boolean sendResult, Ack ack) {
        this.sendResult = sendResult;
        this.ack = ack;
    }

    public boolean isSendResult() {
        return sendResult;
    }

    public void setSendResult(boolean sendResult) {
        this.sendResult = sendResult;
    }

    public Ack getAck() {
        return ack;
    }

    public void setAck(Ack ack) {
        this.ack = ack;
    }
}
