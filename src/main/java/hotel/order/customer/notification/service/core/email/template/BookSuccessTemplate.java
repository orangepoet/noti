package hotel.order.customer.notification.service.core.email.template;

import lombok.Builder;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@Builder
@XmlRootElement
public class BookSuccessTemplate {
    @XmlElement(name = "UserName")
    private String userName;

    @Override
    public String toString() {
        //todo: serialize
        return "BookSuccessTemplate{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
