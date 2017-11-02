package hotel.order.customer.notification.service.core.email.system;

import com.google.common.base.Preconditions;
import hotel.order.customer.notification.service.core.email.model.Email;
import hotel.order.customer.notification.service.core.email.model.EmailSendResult;
import hotel.order.customer.notification.service.core.email.model.EmailType;
import hotel.order.customer.notification.service.core.email.model.SendEmailContext;
import hotel.order.customer.notification.service.core.email.platform.EmailPlatformService;
import hotel.order.customer.notification.service.core.email.platform.SendEmailRequestType;
import hotel.order.customer.notification.service.core.email.platform.SendEmailResponseType;
import hotel.order.customer.notification.service.core.email.template.BookSuccessTemplate;
import hotel.order.customer.notification.service.core.email.template.factory.BookSuccessTemplateFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookSuccessEmail {
    private static final String EMAIL_CODE = "100001973";
    @Autowired
    private EmailPlatformService platformService;
    @Autowired
    private BookSuccessTemplateFactory factory;

    @Email(EmailType.BOOK_SUCCESS)
    public EmailSendResult sendEmail(SendEmailContext ctx) {
        Preconditions.checkNotNull(ctx);
        EmailSendResult result = new EmailSendResult();

        SendEmailRequestType requestType = new SendEmailRequestType();
        requestType.setEmailCode(EMAIL_CODE);

        BookSuccessTemplate template = getBookSuccessTemplate(ctx);
        requestType.setEmailBody(template.toString());
        requestType.setSender("xx@ctrip.com");
        requestType.setReceiver("user@qq.com");
        requestType.setTitle(String.format("your order[%s] book success", ctx.getOrderId()));
        SendEmailResponseType responseType = platformService.sendEmail(requestType);
        if (responseType != null) {
            //todo: set result
        }
        return result;
    }

    private BookSuccessTemplate getBookSuccessTemplate(SendEmailContext ctx) {
        BookSuccessTemplateFactory.Context context = new BookSuccessTemplateFactory.Context();
        context.setOrderId(ctx.getOrderId());
        return factory.create(context);
    }
}
