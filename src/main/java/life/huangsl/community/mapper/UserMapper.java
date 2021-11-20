package life.huangsl.community.mapper;

import life.huangsl.community.model.User;
import org.apache.ibatis.annotations.*;

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

    @Select("select * from user where id=#{id}")
    User getById(@Param("id") Integer id);

    @Select("select * from user where account_id = #{accountId}")
    User findByAccountId(@Param("accountId")String accountId);

    @Update("update user set name = #{name}, token = #{token}, gmt_modified = #{gmtModified}, avatar_url = #{avatarUrl} where id = #{id}")
    void update(User user);
}
