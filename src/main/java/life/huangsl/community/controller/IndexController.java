package life.huangsl.community.controller;

import life.huangsl.community.dto.PaginationDTO;
import life.huangsl.community.dto.QuestionDTO;
import life.huangsl.community.mapper.QuestionMapper;
import life.huangsl.community.mapper.UserMapper;
import life.huangsl.community.model.Question;
import life.huangsl.community.model.User;
import life.huangsl.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author hsl
 * @create 2021-07-27 21:37
 */
@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "5") Integer size) {
        User user = (User) request.getSession().getAttribute("user");
//        if(user == null){
//            return "redirect:/";
//        }

        PaginationDTO pagination = questionService.list(page, size);
        model.addAttribute("pagination", pagination);
        return "index";
    }
}
