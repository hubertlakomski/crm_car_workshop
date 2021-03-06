package model;

public class Status {

    private Order order;
    private boolean accepted;
    private boolean approvedRepairCosts;
    private boolean inRepair;
    private boolean readyForPickup;
    private boolean resignation;

    public Status(Order order, boolean accepted, boolean approvedRepairCosts, boolean inRepair, boolean readyForPickup, boolean resignation) {
        this.order = order;
        this.accepted = accepted;
        this.approvedRepairCosts = approvedRepairCosts;
        this.inRepair = inRepair;
        this.readyForPickup = readyForPickup;
        this.resignation = resignation;
    }

    public Status() {

    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public boolean isApprovedRepairCosts() {
        return approvedRepairCosts;
    }

    public void setApprovedRepairCosts(boolean approvedRepairCosts) {
        this.approvedRepairCosts = approvedRepairCosts;
    }

    public boolean isInRepair() {
        return inRepair;
    }

    public void setInRepair(boolean inRepair) {
        this.inRepair = inRepair;
    }

    public boolean isReadyForPickup() {
        return readyForPickup;
    }

    public void setReadyForPickup(boolean readyForPickup) {
        this.readyForPickup = readyForPickup;
    }

    public boolean isResignation() {
        return resignation;
    }

    public void setResignation(boolean resignation) {
        this.resignation = resignation;
    }

    @Override
    public String toString() {
        return "Status{" +
                "order=" + order +
                ", accepted=" + accepted +
                ", approvedRepairCosts=" + approvedRepairCosts +
                ", inRepair=" + inRepair +
                ", readyForPickup=" + readyForPickup +
                ", resignation=" + resignation +
                '}';
    }
}
