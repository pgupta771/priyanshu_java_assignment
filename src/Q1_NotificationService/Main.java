package Q1_NotificationService;

interface NotificationService{
    void send(String message);

        default void sendWithRetry(String message, int retries){
        int attempt = 0;

        while(attempt < retries){
            try{
                send(message);
                System.out.println("Message sent succesfylly");
                return;
            }catch(Exception e){
                attempt++;
                System.out.println("retry"+ attempt);
            }
        }
        System.out.println("failed after the retries");
        }

}

class GmailNotification implements NotificationService{

    @Override
    public void send(String message){

        System.out.println("Sending mail:" + message);
    }
}

public class Main {
    public static void main(String[] args){
        NotificationService service = new GmailNotification();

        service.sendWithRetry("Hello fellow sufi members ", 1);
    }
}