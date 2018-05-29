package org.aist.aide.formexpert.common.models;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

public class Mapping implements Serializable {
    protected String label;
    protected String type;
    protected TreeSet<Classifier> classifiers;
    protected String defaultAbstraction;

    public Mapping(String id, String label, String type, TreeSet<Classifier> classifiers, String defaultAbstraction) {
        this.label = label;
        this.type = type;
        this.classifiers = classifiers;
        this.defaultAbstraction = defaultAbstraction;
    }

    public Mapping(String label, String type) {
        this.label = label;
        this.type = type;
        classifiers = new TreeSet<>();
    }

    public Mapping() {
        classifiers = new TreeSet<>();
    }

    public String getDefaultAbstraction() {
        return defaultAbstraction;
    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
    }

    public TreeSet<Classifier> getClassifiers() {
        return classifiers;
    }
}
