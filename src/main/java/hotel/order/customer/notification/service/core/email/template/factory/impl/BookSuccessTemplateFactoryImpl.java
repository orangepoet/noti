package hotel.order.customer.notification.service.core.email.template.factory.impl;

import com.google.common.base.Preconditions;
import hotel.order.customer.notification.repository.EmailRepository;
import hotel.order.customer.notification.service.core.email.template.BookSuccessTemplate;
import hotel.order.customer.notification.service.core.email.template.factory.BookSuccessTemplateFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookSuccessTemplateFactoryImpl implements BookSuccessTemplateFactory {

    @Autowired
    private EmailRepository emailRepository;

    @Override
    public BookSuccessTemplate create(Context ctx) {
        Preconditions.checkNotNull(ctx);

        //emailRepository.query(ctx);
        return BookSuccessTemplate.builder()
                .userName("chengz")
                .build();
    }
}
