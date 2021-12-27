package life.huangsl.community.dto;

import lombok.Data;

/**
 * @author hsl
 * @create 2021-12-27 15:38
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
