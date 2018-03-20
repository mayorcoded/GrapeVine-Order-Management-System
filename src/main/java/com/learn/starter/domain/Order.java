package com.learn.starter.domain;

public class Order implements Identifiable{

    private Long id;
    private String description;
    private long costInCents;
    private boolean isCompleted;



    public String getDesciption() {
        return description;
    }

    public void setDesciption(String desciption) {
        this.description = desciption;
    }

    public long getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(long costInCents) {
        this.costInCents = costInCents;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long Id) {
        this.id = id;
    }

}
