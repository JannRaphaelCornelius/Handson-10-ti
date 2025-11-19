package latihan2_ocp.bad;

// Class ini MELANGGAR OCP karena setiap channel baru harus modify code ini
public class NotificationService {

    public void sendNotification(String message, String type, String recipient) {
        // Masalah: If-else chain yang terus bertambah setiap ada channel baru
        if (type.equals("EMAIL")) {
            System.out.println("Sending EMAIL to: " + recipient);
            System.out.println("Content: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS to: " + recipient);
            System.out.println("Content: " + message);
        }
        // ... (Harus tambah else if untuk WhatsApp)
    }
}