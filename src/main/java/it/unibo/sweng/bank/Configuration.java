package it.unibo.sweng.bank;

public class Configuration {
    private static final Configuration INSTANCE = new Configuration();
    private boolean testing = false;

    public static Configuration getConfiguration() {
        return INSTANCE;
    }

    public void setTesting(boolean testing) {
        this.testing = testing;
    }

    public boolean isTesting() {
        return testing;
    }
}
