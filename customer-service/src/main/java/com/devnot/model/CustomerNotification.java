package com.devnot.model;

public class CustomerNotification {

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String customerId;
    private String description;

    @Override
    public String toString() {
        return "TicketNotification{" +
                "customerId='" + customerId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
