package life.huangsl.community.mapper;

import life.huangsl.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
@author hsl
@create 2021-07-29 21:47
*/
@Mapper
public interface UserMapper {
    @Insert("insert into user (name, account_id, token, gmt_create, gmt_modified, bio, avatar_url) values (#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified}, #{bio}, #{avatarUrl})")
    public void insert(User user);

    @Select("select * from user where token=#{token}")
    User getByToken(@Param("token") String token);
}
