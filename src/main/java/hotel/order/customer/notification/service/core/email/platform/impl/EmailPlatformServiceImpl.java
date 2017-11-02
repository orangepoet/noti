package hotel.order.customer.notification.service.core.email.platform.impl;

import hotel.order.customer.notification.service.core.email.platform.EmailPlatformService;
import hotel.order.customer.notification.service.core.email.platform.SendEmailRequestType;
import hotel.order.customer.notification.service.core.email.platform.SendEmailResponseType;
import org.springframework.stereotype.Component;

@Component
public class EmailPlatformServiceImpl implements EmailPlatformService {
    @Override
    public SendEmailResponseType sendEmail(SendEmailRequestType requestType) {
        return null;
    }
}
