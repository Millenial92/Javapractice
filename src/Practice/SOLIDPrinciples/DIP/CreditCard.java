package Practice.SOLIDPrinciples.DIP;

public class CreditCard implements BankCard {

    public void doTransaction( long amount )
    {

        System.out.println("Payment using Credit Card.");

    }

}
