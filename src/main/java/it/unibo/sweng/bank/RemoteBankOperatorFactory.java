package it.unibo.sweng.bank;

public class RemoteBankOperatorFactory {
    private static final RemoteBankOperatorFactory INSTANCE = new RemoteBankOperatorFactory();

    private RemoteBankOperatorFactory() {
    }

    public static RemoteBankOperatorFactory getInstance() {
        return INSTANCE;
    }

    public RemoteBankOperator create() {
        if(Configuration.getConfiguration().isTesting()) {
            return new FakeRemoteBankOperator();
        } else {
            return new SETRemoteBankOperator();
        }
    }
}
