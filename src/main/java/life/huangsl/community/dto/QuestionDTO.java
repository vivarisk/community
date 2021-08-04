package life.huangsl.community.dto;

import life.huangsl.community.model.User;
import lombok.Data;

/**
 * @author hsl
 * @create 2021-08-04 19:00
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
