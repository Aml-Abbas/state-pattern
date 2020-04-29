public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine){
        this.atmMachine=atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("u can't enter more than one card");
    }

    @Override
    public void rejectCard() {
        System.out.println("Card rejected");
        atmMachine.setATMState(atmMachine.getNoCardState());

    }

    @Override
    public void insertPin(int pinCode) {
        if (pinCode==1234){
            System.out.println("correct pin");
            atmMachine.correctPinEntered=true;
            atmMachine.setATMState(atmMachine.getHasPin());

        }else {
            System.out.println("Wrong Pin");
            System.out.println("card rejected");
            atmMachine.setATMState(atmMachine.getNoCardState());

        }
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("enter pin code first");

    }
}
