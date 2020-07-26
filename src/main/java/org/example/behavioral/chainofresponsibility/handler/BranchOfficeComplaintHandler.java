package org.example.behavioral.chainofresponsibility.handler;

import org.example.behavioral.chainofresponsibility.Complaint;
import org.example.behavioral.chainofresponsibility.EnumPriority;

public class BranchOfficeComplaintHandler extends ComplaintLineHandler {

    @Override
    public void handleComplaint(Complaint complaint) {
        if (complaint.getPriority().equals(EnumPriority.LEVEL1)) {
            System.out.println("Şikayetiniz şube tarafından çözüm için ele alınmıştır.");
        }
        else if (nextComplaintLineHandler != null){
            System.out.println("Şikayetiniz bölge müdürlüğüne sevk edilmiştir.");
            nextComplaintLineHandler.handleComplaint(complaint);
        }
    }
}
