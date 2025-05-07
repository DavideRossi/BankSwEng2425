package it.unibo.sweng.bank;

public interface RemoteBankOperator {

    //perform a transaction with a remote back using the SET protocol
    boolean transfer(String destinationAccountCode, double amount);

}