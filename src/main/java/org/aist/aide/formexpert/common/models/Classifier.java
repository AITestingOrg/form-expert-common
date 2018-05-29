package org.aist.aide.formexpert.common.models;

public class Classifier implements Comparable<Classifier> {
    private String service;
    private double score;

    public Classifier(String service, double score) {
        this.service = service;
        this.score = score;
    }

    public String getService() {
        return service;
    }

    public double getScore() {
        return score;
    }


    @Override
    public int compareTo(Classifier o) {
        var result = score - o.getScore();
        if (result < 0) {
            return (int) Math.floor(result);
        } else {
            return (int) Math.ceil(result);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Classifier)) {
            return false;
        }
        var other = (Classifier) obj;

        return (other.getService() == service);
    }
}
