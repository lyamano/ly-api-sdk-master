package com.lyapi.lyapisdk.service.impi;

import com.lyapi.lyapisdk.client.LyApiClient;
import com.lyapi.lyapisdk.exception.ApiException;
import com.lyapi.lyapisdk.model.request.*;
import com.lyapi.lyapisdk.model.response.LoveResponse;
import com.lyapi.lyapisdk.model.response.PoisonousChickenSoupResponse;
import com.lyapi.lyapisdk.model.response.RandomWallpaperResponse;
import com.lyapi.lyapisdk.model.response.ResultResponse;
import com.lyapi.lyapisdk.service.ApiService;
import com.lyapi.lyapisdk.service.BaseService;
import lombok.extern.slf4j.Slf4j;


/**
 * @Author: Liu
 * @Date: 2023年09月17日 08:42
 * @Version: 1.0
 * @Description:
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(request);
    }

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup(LyApiClient lyApiClient) throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(lyApiClient, request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(LyApiClient lyApiClient, RandomWallpaperRequest request) throws ApiException {
        return request(lyApiClient, request);
    }

    @Override
    public LoveResponse randomLoveTalk() throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(request);
    }

    @Override
    public LoveResponse randomLoveTalk(LyApiClient lyApiClient) throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(lyApiClient, request);
    }

    @Override
    public ResultResponse horoscope(HoroscopeRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse horoscope(LyApiClient lyApiClient, HoroscopeRequest request) throws ApiException {
        return request(lyApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(LyApiClient lyApiClient, IpInfoRequest request) throws ApiException {
        return request(lyApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getWeatherInfo(LyApiClient lyApiClient, WeatherRequest request) throws ApiException {
        return request(lyApiClient, request);
    }

    @Override
    public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
        return request(request);
    }
}
