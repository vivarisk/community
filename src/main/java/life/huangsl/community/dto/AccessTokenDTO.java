package life.huangsl.community.dto;

import lombok.Data;

/**
 * @author hsl
 * @create 2021-07-28 21:47
 */
@Data
public class AccessTokenDTO {
    private String grant_type;
    private String code;
    private String client_id;
    private String redirect_uri;
    private String client_secret;
}
