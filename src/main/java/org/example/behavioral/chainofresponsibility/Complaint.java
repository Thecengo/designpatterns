package org.example.behavioral.chainofresponsibility;

public class Complaint {
    private String name;
    private EnumPriority priority;

    public Complaint(EnumPriority priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumPriority getPriority() {
        return priority;
    }
}
