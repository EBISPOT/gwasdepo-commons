package uk.ac.ebi.spot.gwas.deposition.scheduler.domain;

import java.io.Serializable;

public class EnvironmentConfiguration implements Serializable {

    private static final long serialVersionUID = 7633875404020424348L;

    private String name;

    private String config;

    private boolean dev;

    public EnvironmentConfiguration(String name, String config, boolean dev) {
        this.name = name;
        this.config = config;
        this.dev = dev;
    }

    public String getName() {
        return name;
    }

    public String getConfig() {
        return config;
    }

    public boolean isDev() {
        return dev;
    }

    @Override
    public String toString() {
        return name + " [" + config + " | " + dev + "]";
    }
}
