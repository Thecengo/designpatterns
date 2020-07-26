package org.example.behavioral.chainofresponsibility.client;

import org.example.behavioral.chainofresponsibility.Complaint;
import org.example.behavioral.chainofresponsibility.EnumPriority;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplaintLineClientTest {

    @Test
    @Order(1)
    public void birinciLevelŞikayetleriŞubeTarafındanEleAlınmalı() {
        ComplaintLineClient.getHandlerChain().handleComplaint(new Complaint(EnumPriority.LEVEL1));
    }

    @Test
    @Order(2)
    public void ikinciLevelŞikayetlerBölgeMüdürlüğüTarafındanEleAlınmalı() {
        ComplaintLineClient.getHandlerChain().handleComplaint(new Complaint(EnumPriority.LEVEL2));
    }

    @Test
    @Order(3)
    public void ucuncuLevelŞikayetlerGenelMüdürlükTarafındanEleAlınmalı() {
        ComplaintLineClient.getHandlerChain().handleComplaint(new Complaint(EnumPriority.LEVEL3));
    }
}