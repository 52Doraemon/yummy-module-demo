package com.yummy.feign.fallback;

import com.yummy.feign.GitHubFeign;
import feign.hystrix.FallbackFactory;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GitHubFeignFallback implements FallbackFactory<GitHubFeign> {
    @Setter
    private Throwable cause;

    @Override
    public GitHubFeign create(Throwable throwable) {
        log.error("微服务接口调用失败：" + cause);
        return null;
    }
}
