package com.lyapi.lyapisdk.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Liu
 * @Date: 2023/09/15 08:41:51
 * @Version: 1.0
 * @Description: ly api客户端
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LyApiClient {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 密钥
     */
    private String secretKey;

}
