package it.unibo.sweng.bank;

public class NotificatorFactory {
    private static final NotificatorFactory INSTANCE = new NotificatorFactory();

    private NotificatorFactory() {
    }

    public static NotificatorFactory getInstance() {
        return INSTANCE;
    }

    public Notificator create() {
        if(Configuration.getConfiguration().isTesting()) {
            return new FakeNotificator();
        } else {
            return new EmailNotificator();
        }
    }
}
