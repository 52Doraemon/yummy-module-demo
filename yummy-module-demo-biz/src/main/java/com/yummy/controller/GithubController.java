package com.yummy.controller;

import com.yummy.common.enums.ExampleEnum;
import com.yummy.feign.GitHubFeign;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/github", produces = MediaType.APPLICATION_JSON_VALUE)
public class GithubController {
    @Resource
    private GitHubFeign gitHubFeign;

    /**
     * 查找github标准库信息
     **/
    @GetMapping(value = "/searchRepositories")
    String searchRepositories(@RequestParam(value = "q", required = false) String q) {
        // TODO 枚举类判断
        ExampleEnum exampleEnum = ExampleEnum.valueOf("Enum_Example1".toUpperCase());
        switch (exampleEnum) {
            case ENUM_EXAMPLE1:
            case ENUM_EXAMPLE2:
                break;
            default:
                throw new IllegalStateException("您没有查看权限");
        }
        return gitHubFeign.searchRepositories(q);
    }
}
