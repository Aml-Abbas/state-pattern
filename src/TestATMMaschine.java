public class TestATMMaschine {
    public static void main(String[] args){
        ATMMachine atmMachine= new ATMMachine();
        atmMachine.insertCard();
        atmMachine.rejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
    }
}
