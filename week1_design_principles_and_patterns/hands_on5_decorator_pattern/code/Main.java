public class Main {
    public static void main(String[] args) {
        
        Notifier email = new EmailNotifier();

        Notifier smsEmail = new SMSNotifierDecorator(email);

       
        Notifier fullNotifier = new SlackNotifierDecorator(smsEmail);

        fullNotifier.send("Your server is down!");
    }
}
