package com.crystal.drools;

/**
 * Created by hp on 2017-05-23.
 */
public class Message {
    public static final int HELLO = 0;
    public static final int GOODBYE = 1;

    private String note;

    private int status;

    public String getNote(){
        return this.note;
    }

    public void setNote(String note){
        this.note = note;
    }
    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
