package org.aist.aide.formexpert.common.models;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

public class Mapping implements Serializable {
    private long id;
    private String label;
    private String type;
    private TreeSet<Classifier> classifiers;
    private String defaultAbstration;

    public Mapping(long id, String label, String type, TreeSet<Classifier> classifiers, String defaultAbstration) {
        this.id = id;
        this.label = label;
        this.type = type;
        this.classifiers = classifiers;
        this.defaultAbstration = defaultAbstration;
    }

    public Mapping(String label, String type) {
        this.label = label;
        this.type = type;
    }

    public String getDefaultAbstraction() {
        return defaultAbstration;
    }

    public long getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
    }

    public Set<Classifier> getClassifiers() {
        return classifiers;
    }
}
