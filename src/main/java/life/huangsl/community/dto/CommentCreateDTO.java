package life.huangsl.community.dto;

import lombok.Data;

/**
 * @author hsl
 * @create 2021-11-27 21:09
 */
@Data
public class CommentCreateDTO {
    private Integer parentId;
    private String content;
    private Integer type;
}
