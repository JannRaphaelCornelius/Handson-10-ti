package latihan3_lsp.good;

// Implementation yang FOLLOWS contract
public class SmsSender extends NotificationSender {

    public SmsSender() {
        super("SMS");
    }

    @Override
    public boolean send(String recipient, String message) {
        // Validasi Precondition
        if (recipient == null || message == null) {
            return false;
        }
        System.out.println("[SmsSender] ✓ Notification sent to: " + recipient);
        return true;
    }
}