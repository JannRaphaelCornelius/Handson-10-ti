package latihan3_lsp.bad;

// Parent class untuk semua notification sender
// Masalah: Kontrak tidak jelas, memungkinkan subclass melanggar LSP
public abstract class NotificationSender {
    protected String senderName;

    public NotificationSender(String senderName) {
        this.senderName = senderName;
    }

    // Method yang HARUS diimplementasikan oleh subclass
    // Tapi tidak ada guarantee bahwa subclass akan follow kontrak
    public abstract boolean send(String recipient, String message);

    public String getType() {
        return senderName;
    }
}
