package life.huangsl.community.model;

import lombok.Data;

/**
 * @author hsl
 * @create 2021-07-29 21:53
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String bio;
    private String avatarUrl;
}
