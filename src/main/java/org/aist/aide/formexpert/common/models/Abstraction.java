package org.aist.aide.formexpert.common.models;

public class Abstraction {
    private final String service;
    private String abstraction;

    public Abstraction(String service, String abstraction) {
        this.service = service;
        this.abstraction = abstraction;
    }

    public String getAbstraction() {
        return abstraction;
    }

    public String getService() {
        return service;
    }

    public void setAbstraction(String abstraction) {
        this.abstraction = abstraction;
    }
}
