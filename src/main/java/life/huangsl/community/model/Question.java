package life.huangsl.community.model;

import lombok.Data;

/**
 * @author hsl
 * @create 2021-08-03 16:08
 */
@Data
public class Question {
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
}
