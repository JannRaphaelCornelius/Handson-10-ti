package latihan2_ocp.good;

// Interface untuk abstraksi notification sender
// Dengan interface, kita bisa extend dengan implementation baru
// tanpa modify existing code
public interface NotificationSender {

    void send(String recipient, String message);
    String getType();
}