public interface ATMState {
    public void insertCard();
    public void rejectCard();
    public void insertPin(int pinCode);
    public void requestCash(int cash);
}
