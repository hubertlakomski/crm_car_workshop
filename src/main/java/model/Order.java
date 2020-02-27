package model;

import java.sql.Date;

public class Order {

    private int id;
    private Date acceptanceForRepair;
    private Date plannedStartOfRepair;
    private Date startingRepair;
    private Employee assignedForRepair;
    private String problemDescription;
    private String repairDescription;
    private Status actualStatus;
    private Vehicle repairedVehicle;
    private double customerRepairCost;
    private double costOfUsedParts;
    private double manHour;
    private double numberOfManHour;

    public Order(Date acceptanceForRepair, Date plannedStartOfRepair,
                 Date startingRepair, Employee assignedForRepair,
                 String problemDescription, String repairDescription,
                 Status actualStatus, Vehicle repairedVehicle,
                 double customerRepairCost, double costOfUsedParts,
                 double numberOfManHour) {
        this.acceptanceForRepair = acceptanceForRepair;
        this.plannedStartOfRepair = plannedStartOfRepair;
        this.startingRepair = startingRepair;
        this.assignedForRepair = assignedForRepair;
        this.problemDescription = problemDescription;
        this.repairDescription = repairDescription;
        this.actualStatus = actualStatus;
        this.repairedVehicle = repairedVehicle;
        this.customerRepairCost = customerRepairCost;
        this.costOfUsedParts = costOfUsedParts;
        this.manHour = this.assignedForRepair.getPerHour();
        this.numberOfManHour = numberOfManHour;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAcceptanceForRepair() {
        return acceptanceForRepair;
    }

    public void setAcceptanceForRepair(Date acceptanceForRepair) {
        this.acceptanceForRepair = acceptanceForRepair;
    }

    public Date getPlannedStartOfRepair() {
        return plannedStartOfRepair;
    }

    public void setPlannedStartOfRepair(Date plannedStartOfRepair) {
        this.plannedStartOfRepair = plannedStartOfRepair;
    }

    public Date getStartingRepair() {
        return startingRepair;
    }

    public void setStartingRepair(Date startingRepair) {
        this.startingRepair = startingRepair;
    }

    public Employee getAssignedForRepair() {
        return assignedForRepair;
    }

    public void setAssignedForRepair(Employee assignedForRepair) {
        this.assignedForRepair = assignedForRepair;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getRepairDescription() {
        return repairDescription;
    }

    public void setRepairDescription(String repairDescription) {
        this.repairDescription = repairDescription;
    }

    public Status getActualStatus() {
        return actualStatus;
    }

    public void setActualStatus(Status actualStatus) {
        this.actualStatus = actualStatus;
    }

    public Vehicle getRepairedVehicle() {
        return repairedVehicle;
    }

    public void setRepairedVehicle(Vehicle repairedVehicle) {
        this.repairedVehicle = repairedVehicle;
    }

    public double getCustomerRepairCost() {
        return customerRepairCost;
    }

    public void setCustomerRepairCost(double customerRepairCost) {
        this.customerRepairCost = customerRepairCost;
    }

    public double getCostOfUsedParts() {
        return costOfUsedParts;
    }

    public void setCostOfUsedParts(double costOfUsedParts) {
        this.costOfUsedParts = costOfUsedParts;
    }

    public double getManHour() {
        return manHour;
    }

    public void setManHour(double manHour) {
        this.manHour = manHour;
    }

    public double getNumberOfManHour() {
        return numberOfManHour;
    }

    public void setNumberOfManHour(double numberOfManHour) {
        this.numberOfManHour = numberOfManHour;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", acceptanceForRepair=" + acceptanceForRepair +
                ", plannedStartOfRepair=" + plannedStartOfRepair +
                ", startingRepair=" + startingRepair +
                ", assignedForRepair=" + assignedForRepair +
                ", problemDescription='" + problemDescription + '\'' +
                ", repairDescription='" + repairDescription + '\'' +
                ", actualStatus=" + actualStatus +
                ", repairedVehicle=" + repairedVehicle +
                ", customerRepairCost=" + customerRepairCost +
                ", costOfUsedParts=" + costOfUsedParts +
                ", manHour=" + manHour +
                ", numberOfManHour=" + numberOfManHour +
                '}';
    }
}