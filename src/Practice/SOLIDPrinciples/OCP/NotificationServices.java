package Practice.SOLIDPrinciples.OCP;



// 2. We needed to add Whatsapp Notification Service method.
// Therefore, we made a new interface to be implemented by different other classes, and thereby fulfilling OCP.


public interface NotificationServices {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

 }
