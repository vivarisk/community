package life.huangsl.community.mapper;

import life.huangsl.community.model.Comment;
import life.huangsl.community.model.CommentExample;
import life.huangsl.community.model.Question;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}