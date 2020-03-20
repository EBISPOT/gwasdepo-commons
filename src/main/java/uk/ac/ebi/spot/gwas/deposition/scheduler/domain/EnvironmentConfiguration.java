package uk.ac.ebi.spot.gwas.deposition.scheduler.domain;

import java.io.Serializable;

public class EnvironmentConfiguration implements Serializable {

    private static final long serialVersionUID = 7633875404020424348L;

    private String name;

    private String config;

    private boolean dev;

    private boolean gcp;

    public EnvironmentConfiguration(String name, String config, boolean dev, boolean gcp) {
        this.name = name;
        this.config = config;
        this.dev = dev;
        this.gcp = gcp;
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

    public boolean isGcp() {
        return gcp;
    }

    @Override
    public String toString() {
        return name + " [" + config + " | " + dev + " | " + gcp + "]";
    }
}
