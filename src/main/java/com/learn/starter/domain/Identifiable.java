package com.learn.starter.domain;

public interface Identifiable extends org.springframework.hateoas.Identifiable<Long>{
    public void setId(Long Id);
}
