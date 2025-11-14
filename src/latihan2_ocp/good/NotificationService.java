package latihan2_ocp.good;

import java.util.List;

// Service yang MENGIKUTI OCP
// Class ini TIDAK PERLU DIMODIFIKASI ketika ada channel baru
public class NotificationService {

    private List<NotificationSender> senders;

    public NotificationService(List<NotificationSender> senders) {
        this.senders = senders;
    }

    public void sendNotification(String message, String recipient) {
        // Loop through semua registered senders
        // Logika ini stabil dan tidak perlu diubah meski ada sender baru
        for (NotificationSender sender : senders) {
            sender.send(recipient, message);
        }
    }
}