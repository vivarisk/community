package life.huangsl.community.service;

import life.huangsl.community.dto.PaginationDTO;
import life.huangsl.community.dto.QuestionDTO;
import life.huangsl.community.mapper.QuestionMapper;
import life.huangsl.community.mapper.UserMapper;
import life.huangsl.community.model.Question;
import life.huangsl.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hsl
 * @create 2021-08-04 18:58
 */
@Service
public class QuestionService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionMapper questionMapper;

    public PaginationDTO list(Integer page, Integer size) {

        Integer offset = size * (page - 1);
        List<Question> questions = questionMapper.list(offset, size);
        List<QuestionDTO> questionDTOList = new ArrayList<>();

        PaginationDTO paginationDTO = new PaginationDTO();

        for (Question question : questions) {
            User user = userMapper.getById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }

        paginationDTO.setQuestions(questionDTOList);
        Integer totalCount = questionMapper.count();
        paginationDTO.setPagination(totalCount, page, size);
        return paginationDTO;
    }

    public PaginationDTO list(Integer id, Integer page, Integer size) {
        Integer offset = size * (page - 1);
        List<Question> questions = questionMapper.listById(id, offset, size);
        List<QuestionDTO> questionDTOList = new ArrayList<>();

        PaginationDTO paginationDTO = new PaginationDTO();

        for (Question question : questions) {
            User user = userMapper.getById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }

        paginationDTO.setQuestions(questionDTOList);
        Integer totalCount = questionMapper.countById(id);
        paginationDTO.setPagination(totalCount, page, size);
        return paginationDTO;
    }
}
