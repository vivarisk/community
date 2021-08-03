package life.huangsl.community.controller;

import life.huangsl.community.dto.AccessTokenDTO;
import life.huangsl.community.dto.GiteeUser;
import life.huangsl.community.mapper.UserMapper;
import life.huangsl.community.model.User;
import life.huangsl.community.provider.GiteeProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @author hsl
 * @create 2021-07-28 21:30
 */
@Controller
public class AuthorizeController {

    @Autowired
    private GiteeProvider giteeProvider;

    @Autowired
    private UserMapper userMapper;

    @Value("${gitee.client.id}")
    private String clientID;
    @Value("${gitee.client.secret}")
    private String clientSecret;
    @Value("${gitee.redirect.uri}")
    private String redirectUri;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           HttpServletResponse response){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setGrant_type("authorization_code");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setClient_id(clientID);
        accessTokenDTO.setRedirect_uri(redirectUri);
        accessTokenDTO.setClient_secret(clientSecret);
        String accessToken = giteeProvider.getAccessToken(accessTokenDTO);
        GiteeUser user = giteeProvider.getUser(accessToken);
        System.out.println(user);
        if(user != null){
            User user2 = new User();
            String token = UUID.randomUUID().toString();
            user2.setToken(token);
            user2.setName(user.getName());
            user2.setAccountId(String.valueOf(user.getId()));
            user2.setGmtCreate(System.currentTimeMillis());
            user2.setGmtModified(user2.getGmtCreate());
            user2.setAvatarUrl(user.getAvatar_url());
            user2.setBio(user.getBio());
            System.out.println(user2);
            userMapper.insert(user2);
            response.addCookie(new Cookie("token", token));
            return "redirect:/";
        }else{
            return "redirect:/";
        }
    }
}
