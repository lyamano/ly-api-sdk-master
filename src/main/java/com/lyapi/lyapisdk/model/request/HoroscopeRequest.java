package com.lyapi.lyapisdk.model.request;

import com.lyapi.lyapisdk.model.params.HoroscopeParams;
import com.lyapi.lyapisdk.model.enums.RequestMethodEnum;
import com.lyapi.lyapisdk.model.response.NameResponse;
import com.lyapi.lyapisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: Liu
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description: 随机情话
 */
@Accessors(chain = true)
public class HoroscopeRequest extends BaseRequest<HoroscopeParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/horoscope";
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
