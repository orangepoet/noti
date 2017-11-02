package hotel.order.customer.notification.service.core.email.platform;

import lombok.Data;

@Data
public class SendEmailRequestType {
    private String emailCode;
    private String emailBody;
    private String sender;
    private String receiver;
    private String title;
}
