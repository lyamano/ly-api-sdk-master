package com.lyapi.lyapisdk.service;

import cn.hutool.http.HttpResponse;
import com.lyapi.lyapisdk.client.LyApiClient;
import com.lyapi.lyapisdk.exception.ApiException;
import com.lyapi.lyapisdk.model.request.*;
import com.lyapi.lyapisdk.model.response.LoveResponse;
import com.lyapi.lyapisdk.model.response.PoisonousChickenSoupResponse;
import com.lyapi.lyapisdk.model.response.RandomWallpaperResponse;
import com.lyapi.lyapisdk.model.response.ResultResponse;

/**
 * @Author: Liu
 * @Date: 2023年09月17日 08:34
 * @Version: 1.0
 * @Description:
 */
public interface ApiService {
    /**
     * 通用请求
     *
     * @param request 要求
     * @return {@link HttpResponse}
     * @throws ApiException 业务异常
     */

    <O, T extends ResultResponse> T request(BaseRequest<O, T> request) throws ApiException;

    /**
     * 通用请求
     *
     * @param lyApiClient ly api客户端
     * @param request     要求
     * @return {@link T}
     * @throws ApiException 业务异常
     */
    <O, T extends ResultResponse> T request(LyApiClient lyApiClient, BaseRequest<O, T> request) throws ApiException;


    /**
     * 随机毒鸡汤
     *
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException;

    /**
     * 喝毒鸡汤
     *
     * @param lyApiClient ly api客户端
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup(LyApiClient lyApiClient) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param request 要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param lyApiClient ly api客户端
     * @param request     要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(LyApiClient lyApiClient, RandomWallpaperRequest request) throws ApiException;

    /**
     * 随意情话
     *
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk() throws ApiException;

    /**
     * 随意情话
     *
     * @param lyApiClient ly api客户端
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk(LyApiClient lyApiClient) throws ApiException;

    /**
     * 星座运势
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(HoroscopeRequest request) throws ApiException;

    /**
     * 星座运势
     *
     * @param lyApiClient ly api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(LyApiClient lyApiClient, HoroscopeRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param lyApiClient ly api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(LyApiClient lyApiClient, IpInfoRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(IpInfoRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param lyApiClient ly api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(LyApiClient lyApiClient, WeatherRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException;
}
