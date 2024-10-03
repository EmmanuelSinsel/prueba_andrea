package SOLID;

public class DependencyInversionPrinciple {

    public void run_wrong(){
        EmailSendingService emailSendingService = new EmailSendingService();
        NotificationSending notificationSending = new NotificationSending(emailSendingService);
        notificationSending.send("This is an email notification");
    }

    public void run_correct(){
        // Usando EmailService para enviar notificaciones por correo
        NotificationService emailService = new EmailService();
        Notification notificationEmail = new Notification(emailService);
        notificationEmail.sendNotification("This is an email notification");

        // Usando SMSService para enviar notificaciones por SMS
        NotificationService smsService = new SMSService();
        Notification notificationSMS = new Notification(smsService);
        notificationSMS.sendNotification("This is an SMS notification");
    }

}

// Ejemplo de que NO hacer

class EmailSendingService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

class NotificationSending {
    private EmailSendingService emailService;

    public NotificationSending(EmailSendingService emailService) {
        this.emailService = emailService;
    }

    public void send(String message) {
        emailService.sendEmail(message);  // Dependencia directa
    }
}

// Ejemplo de que SI hacer


interface NotificationService {
    void send(String message);
}

class EmailService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}


class Notification {
    private NotificationService notificationService;

    // Se inyecta la dependencia a través del constructor
    public Notification(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message) {
        notificationService.send(message);
    }
}
