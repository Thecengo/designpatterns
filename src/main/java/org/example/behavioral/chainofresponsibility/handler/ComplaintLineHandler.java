package org.example.behavioral.chainofresponsibility.handler;

import org.example.behavioral.chainofresponsibility.Complaint;

/**
 * Abstract Handler sınıfı
 */
public abstract class ComplaintLineHandler {

    public ComplaintLineHandler nextComplaintLineHandler;

    public abstract void handleComplaint(Complaint complaint);

    public ComplaintLineHandler getNextComplaintLineHandler() {
        return nextComplaintLineHandler;
    }

    public void setNextComplaintLineHandler(ComplaintLineHandler nextComplaintLineHandler) {
        this.nextComplaintLineHandler = nextComplaintLineHandler;
    }
}
