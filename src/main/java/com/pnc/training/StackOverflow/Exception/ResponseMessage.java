package com.pnc.training.StackOverflow.Exception;

public class ResponseMessage {
    private String statuscode;
    private String message;

    public ResponseMessage(String statuscode, String message) {
        this.statuscode = statuscode;
        this.message = message;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
