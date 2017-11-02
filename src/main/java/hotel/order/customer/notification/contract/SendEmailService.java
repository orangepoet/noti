package hotel.order.customer.notification.contract;

public interface SendEmailService {
    SendEmailResponse sendEmail(SendEmailRequest request);
}