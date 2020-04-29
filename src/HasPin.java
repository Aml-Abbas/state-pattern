public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine){
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
       System.out.println("Has already a correct pin code");
    }

    @Override
    public void requestCash(int cash) {
        if (cash> atmMachine.cashInMachine){
            System.out.println("don't have the money");
            System.out.println("card rejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }else {
            System.out.println("cash "+cash+"is provided");
            atmMachine.setCahInMachine(atmMachine.cashInMachine-cash);
            System.out.println("card rejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        if (atmMachine.cashInMachine<=0){
            atmMachine.setATMState(atmMachine.getNoCash());
        }
        }
    }
}
