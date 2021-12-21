package life.huangsl.community.dto;

import life.huangsl.community.model.User;
import lombok.Data;

/**
 * @author hsl
 * @create 2021-12-20 22:22
 */
@Data
public class NotificationDTO {
    private Integer id;
    private Long gmtCreate;
    private Integer status;
    private Integer notifier;
    private String notifierName;
    private String outerTitle;
    private Integer outerId;
    private String typeName;
    private Integer type;
}
