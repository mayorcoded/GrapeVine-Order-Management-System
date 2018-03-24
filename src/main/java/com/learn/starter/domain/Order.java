package com.learn.starter.domain;

public class Order implements Identifiable{

    private Long id;
    private String description;
    private long costInCents;
    private boolean isCompleted;



    public String getDescription() {
        return description;
    }

    public void setDescription(String desciption) {
        this.description = desciption;
    }

    public long getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(long costInCents) {
        this.costInCents = costInCents;
    }

    public boolean isComplete() {
        return isCompleted;
    }

    public void setComplete(boolean completed) {
        this.isCompleted = completed;
    }

    public void markComplete(){
        setComplete(true);
    }

    public void markIncomplete(){
        setComplete(false);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

}
