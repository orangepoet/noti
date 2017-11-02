package hotel.order.customer.notification.service.facade;

import hotel.order.customer.notification.contract.SendEmailRequest;
import hotel.order.customer.notification.contract.SendEmailResponse;
import hotel.order.customer.notification.contract.SendEmailService;
import org.springframework.stereotype.Component;

@Component
public class SendEmailServiceImpl implements SendEmailService {
    public SendEmailResponse sendEmail(SendEmailRequest request) {

        return null;
    }
}
