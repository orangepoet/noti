package hotel.order.customer.notification.contract;

import lombok.Data;

@Data
public class SendEmailRequest {
    private Long orderId;
}
