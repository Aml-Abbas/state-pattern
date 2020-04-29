public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine){
        this.atmMachine=atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("don't have money");
    }

    @Override
    public void rejectCard() {
        System.out.println("don't have money");
    }

    @Override
    public void insertPin(int pinCode) {
        System.out.println("don't have money");
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("don't have money");

    }
}
