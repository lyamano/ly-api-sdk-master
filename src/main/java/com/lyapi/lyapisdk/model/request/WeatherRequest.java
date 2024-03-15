package com.lyapi.lyapisdk.model.request;

import com.lyapi.lyapisdk.model.params.WeatherParams;
import com.lyapi.lyapisdk.model.enums.RequestMethodEnum;
import com.lyapi.lyapisdk.model.response.NameResponse;
import com.lyapi.lyapisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: Liu
 * @Date: 2023/09/22 10:11:43
 * @Version: 1.0
 * @Description: 获取天气请求
 */
@Accessors(chain = true)
public class WeatherRequest extends BaseRequest<WeatherParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/weather";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
