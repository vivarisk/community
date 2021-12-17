package life.huangsl.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @author hsl
 * @create 2021-12-17 14:51
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
