package org.example.behavioral.chainofresponsibility.handler;

import org.example.behavioral.chainofresponsibility.Complaint;
import org.example.behavioral.chainofresponsibility.EnumPriority;

public class RegionalDirectorateHandler extends ComplaintLineHandler {

    @Override
    public void handleComplaint(Complaint complaint) {
        if (complaint.getPriority().equals(EnumPriority.LEVEL2)) {
            System.out.println("Şikayetiniz bölge müdürlüğü tarafından ele alınmıştır.");
        }
        else if (nextComplaintLineHandler != null) {
            System.out.println("Şiyatiniz genel müdürlüğe sevk edilmiştir.");
            nextComplaintLineHandler.handleComplaint(complaint);
        }
    }
}
