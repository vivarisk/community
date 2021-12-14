package life.huangsl.community.dto;

import life.huangsl.community.model.User;
import lombok.Data;

/**
 * @author hsl
 * @create 2021-12-09 11:54
 */
@Data
public class CommentDTO{
    private Integer id;
    private Integer parentId;
    private Integer type;
    private Integer commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
