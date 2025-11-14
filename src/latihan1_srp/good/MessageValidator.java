package latihan1_srp.good;

// TANGGUNG JAWAB 1: Validasi message
public class MessageValidator {

    public void validate(String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }
        System.out.println("[Validator] Message validated successfully");
    }
}