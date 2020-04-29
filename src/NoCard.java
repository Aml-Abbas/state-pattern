public class NoCard implements ATMState{

    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine){
        this.atmMachine=atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("plz enter a pin code");
        atmMachine.setATMState(atmMachine.getYesCardState());
    }

    @Override
    public void rejectCard() {
        System.out.println("enter a card first");
    }

    @Override
    public void insertPin(int pinCode) {
        System.out.println("enter a card first");
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("enter a card first");
    }
}
