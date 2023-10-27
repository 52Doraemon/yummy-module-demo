package com.yummy.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * GitHub客户端GitHubFeign，访问GitHub开发平台API，开放平台API地址：https://www.apifox.cn/apihub/
 */
@FeignClient(name = "github-client", url = "https://api.github.com")
public interface GitHubFeign {

    /**
     * 查找github标准库信息
     * <p>
     * https://api.github.com/search/repositories
     **/
    @GetMapping(value = "/search/repositories", produces = MediaType.APPLICATION_JSON_VALUE)
    String searchRepositories(@RequestParam("q") String q);
}
