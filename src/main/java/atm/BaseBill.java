package atm;

public abstract class BaseBill implements Bill{
    private int value;
    private Bill nextBill;

    public BaseBill(int billAmount){
        value = billAmount;
    }
    public void setNext(Bill bill) {
        nextBill = bill;
    }

    public void process(int amount) {
        // add exception that would be raised here, if some amount couldn`t be handled;
        int numOfValue = amount / value;
        if (nextBill!=null) {
            nextBill.process(amount - numOfValue * value);
        }
        else{
            if (amount - numOfValue * value != 0){
                System.out.println(amount - numOfValue * value + " left!");
                throw new IllegalArgumentException();
            }
        }
        System.out.println("Number of " + value + "`s: " + numOfValue);

    }
}
