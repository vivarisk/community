package life.huangsl.community.dto;

import lombok.Data;

/**
 * @author hsl
 * @create 2021-07-28 22:26
 */
@Data
public class GiteeUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
