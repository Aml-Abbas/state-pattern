public class ATMMachine {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine=2000;
    boolean correctPinEntered=false;

    public ATMMachine(){

         hasCard= new HasCard(this);
         noCard= new NoCard(this);
         hasCorrectPin= new HasPin(this);
         atmOutOfMoney= new NoCash(this);

         atmState= noCard;

         if (cashInMachine<0){
             atmState= atmOutOfMoney;
         }

    }
    public void setATMState(ATMState newAtmState){
        atmState= newAtmState;
    }
    public void setCahInMachine(int newCashInMachine){
        cashInMachine=newCashInMachine;
    }
    public void insertCard(){
        atmState.insertCard();
    }
    public void rejectCard(){
        atmState.rejectCard();
    }
    public void requestCash(int cash){
        atmState.requestCash(cash);
    }
    public void insertPin(int pinCode){
        atmState.insertPin(pinCode);
    }

    public ATMState getYesCardState(){
        return hasCard;
    }
    public ATMState getNoCardState(){
        return noCard;
    }
    public ATMState getHasPin(){
        return hasCorrectPin;
    }
    public ATMState getNoCash(){
        return atmOutOfMoney;
    }
}
