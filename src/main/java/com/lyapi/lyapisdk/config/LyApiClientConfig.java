package com.lyapi.lyapisdk.config;

import com.lyapi.lyapisdk.client.LyApiClient;
import com.lyapi.lyapisdk.service.impi.ApiServiceImpl;
import com.lyapi.lyapisdk.service.ApiService;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Liu
 * @Date: 2023年08月17日 21:09
 * @Version: 1.0
 * @Description:
 */
@Data
@Configuration
@ConfigurationProperties("ly.api.client")
@ComponentScan
public class LyApiClientConfig {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 秘密密钥
     */
    private String secretKey;

    /**
     * 网关
     */
    private String host;

    @Bean
    public LyApiClient qiApiClient() {
        return new LyApiClient(accessKey, secretKey);
    }

    @Bean
    public ApiService apiService() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        apiService.setLyApiClient(new LyApiClient(accessKey, secretKey));
        if (StringUtils.isNotBlank(host)) {
            apiService.setGatewayHost(host);
        }
        return apiService;
    }
}
