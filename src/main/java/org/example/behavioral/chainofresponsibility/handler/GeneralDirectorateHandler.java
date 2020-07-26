package org.example.behavioral.chainofresponsibility.handler;

import org.example.behavioral.chainofresponsibility.Complaint;
import org.example.behavioral.chainofresponsibility.EnumPriority;

public class GeneralDirectorateHandler extends ComplaintLineHandler {
    @Override
    public void handleComplaint(Complaint complaint) {
        if (complaint.getPriority().equals(EnumPriority.LEVEL3)) {
            System.out.println("Şikayetiniz genel müdürlük taradından ele alınmıştır.");
        }
    }
}
