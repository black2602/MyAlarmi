package com.blackangel.myalarmi.bus;

import com.blackangel.baframework.core.mvvm.viewmodel.BaseViewModelFromRemote;
import com.blackangel.baframework.network.okhttp.OkHttpClientBuilder;
import com.blackangel.baframework.network.retrofit.BaseRetrofitRunner;
import com.blackangel.myalarmi.BuildConfig;
import com.blackangel.myalarmi.api.BusApi;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 * Created by kimjeonghun on 2018. 8. 6..
 */

public class BusViewModel extends BaseViewModelFromRemote {


    private final OkHttpClient mOkHttpClient;

    public BusViewModel() {
        mOkHttpClient = new OkHttpClientBuilder()
                .setLogging(BuildConfig.DEBUG)
                .build();
    }

    @Override
    protected Call createLoadApiCall() {
        Retrofit retrofit = BaseRetrofitRunner.newRetrofit("http://ws.bus.go.kr", mOkHttpClient);
        BusApi busApi = retrofit.create(BusApi.class);

        Call<ResponseBody> apiCall = busApi.getBusInfo("35");
        return apiCall;
    }
}
