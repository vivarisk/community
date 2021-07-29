package life.huangsl.community.controller;

import life.huangsl.community.dto.AccessTokenDTO;
import life.huangsl.community.dto.GithubUser;
import life.huangsl.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hsl
 * @create 2021-07-28 21:30
 */
@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setGrant_type("authorization_code");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setClient_id("23b2a37d17bb111cade9bfee453f75c842e724591b62c7c0046d046e8ef8f54b");
        accessTokenDTO.setRedirect_uri("http://localhost:8887/callback");
        accessTokenDTO.setClient_secret("d63a7ebd2e782f9f7af5b34ac39cea1da5278e4f84af43535afbad7219379643");
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser user = githubProvider.getUser(accessToken);
        System.out.println(user);
        return "index";
    }
}
