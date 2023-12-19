package com.lyapi.lyapisdk.model.request;

import com.lyapi.lyapisdk.model.enums.RequestMethodEnum;
import com.lyapi.lyapisdk.model.params.NameParams;
import com.lyapi.lyapisdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @Author: Liu
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description:
 */
@Accessors(chain = true)
public class NameRequest extends BaseRequest<NameParams, NameResponse> {

    @Override
    public String getPath() {
        return "/name";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<NameResponse> getResponseClass() {
        return NameResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
