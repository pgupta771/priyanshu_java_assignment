package Q7_SealedPayment;

sealed interface Payments permits Payments.CardPayment, Payments.UpiPayment {
    final class CardPayment implements Payments{
    }
    final class UpiPayment implements Payments{
    }

}



public class Main {
    static void process(Payments p){
        if(p instanceof Payments.CardPayment cp){
            System.out.println("CardPayment is in process");
        } else if (p instanceof Payments.UpiPayment up) {
            System.out.println("UpiPayment is in process");

        }
    }

    public  static void main(String[] args){
        process(new Payments.CardPayment());
        process(new Payments.UpiPayment());
    }
}
