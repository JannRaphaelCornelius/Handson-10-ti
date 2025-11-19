package latihan3_lsp.bad;

// Implementation yang BENAR - follows parent contract
public class EmailSender extends NotificationSender {

    public EmailSender() {
        super("EMAIL");
    }

    @Override
    public boolean send(String recipient, String message) {
        // Implementasi yang proper - benar-benar mengirim
        System.out.println("✓ Notification sent via EMAIL to " + recipient);
        return true;
    }
}
