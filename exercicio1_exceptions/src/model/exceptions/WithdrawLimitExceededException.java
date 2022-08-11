package model.exceptions;

public class WithdrawLimitExceededException extends Exception {
    public WithdrawLimitExceededException(String msg) {
        super(msg);
    }
}
