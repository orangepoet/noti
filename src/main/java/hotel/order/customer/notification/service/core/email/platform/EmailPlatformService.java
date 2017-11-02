package hotel.order.customer.notification.service.core.email.platform;

public interface EmailPlatformService {
    SendEmailResponseType sendEmail(SendEmailRequestType requestType);
}
