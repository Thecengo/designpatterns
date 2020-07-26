package org.example.behavioral.chainofresponsibility.client;

import org.example.behavioral.chainofresponsibility.handler.BranchOfficeComplaintHandler;
import org.example.behavioral.chainofresponsibility.handler.ComplaintLineHandler;
import org.example.behavioral.chainofresponsibility.handler.GeneralDirectorateHandler;
import org.example.behavioral.chainofresponsibility.handler.RegionalDirectorateHandler;

public class ComplaintLineClient {


    public static ComplaintLineHandler getHandlerChain() {
        ComplaintLineHandler branchOfficeComplaintHandler = new BranchOfficeComplaintHandler();
        ComplaintLineHandler regionalDirectorateHandler = new RegionalDirectorateHandler();
        ComplaintLineHandler generalDirectorateHandler = new GeneralDirectorateHandler();

        branchOfficeComplaintHandler.setNextComplaintLineHandler(regionalDirectorateHandler);
        regionalDirectorateHandler.setNextComplaintLineHandler(generalDirectorateHandler);
        return branchOfficeComplaintHandler;
    }
}


