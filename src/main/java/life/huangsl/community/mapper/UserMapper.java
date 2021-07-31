package life.huangsl.community.mapper;

import life.huangsl.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
@author hsl
@create 2021-07-29 21:47
*/
@Mapper
public interface UserMapper {
    @Insert("insert into user (name, account_id, token, gmt_create, gmt_modified) values (#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified})")
    public void insert(User user);

    @Select("select user where id = #{id}")
    public User getById(int id);
}
