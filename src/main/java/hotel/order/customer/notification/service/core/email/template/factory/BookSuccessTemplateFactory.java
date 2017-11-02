package hotel.order.customer.notification.service.core.email.template.factory;

import hotel.order.customer.notification.service.core.email.template.BookSuccessTemplate;
import lombok.Data;

public interface BookSuccessTemplateFactory {
    BookSuccessTemplate create(BookSuccessTemplateFactory.Context ctx);

    @Data
    class Context {
        private Long orderId;
    }
}
