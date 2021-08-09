package life.huangsl.community.mapper;

import life.huangsl.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author hsl
 * @create 2021-08-03 16:01
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title, description, gmt_create, gmt_modified, creator, tag) values (#{title}, #{description}, #{gmtCreate}, #{gmtModified}, #{creator}, #{tag})")
    public void create(Question question);

    @Select("select * from question limit #{size} offset #{offset}")
    public List<Question> list(@Param(value = "offset") Integer offset, @Param(value = "size")Integer size);

    @Select("select count(1) from question")
    public Integer count();

    @Select("select * from question where creator = #{id} limit #{size} offset #{offset}")
    List<Question> listById(@Param(value = "id") Integer id, @Param(value = "offset") Integer offset, @Param(value = "size") Integer size);

    @Select("select count(1) from question where creator = #{id}")
    Integer countById(@Param(value = "id") Integer id);
}
