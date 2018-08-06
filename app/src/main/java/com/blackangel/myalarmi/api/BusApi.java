package com.blackangel.myalarmi.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by kimjeonghun on 2018. 8. 6..
 */

public interface BusApi {

    // 버스도착정보 api 키
    //Dkh%2FpLmcWEyA6f7JJ7jtgbs2IFrTa22ZoUXEUEm5LSy2EicwaWtWrcrlN0nG8FBGEoW8ROcxxdeq0BJjKc1f1A%3D%3D

    @GET("/api/rest/arrive/getArrInfoByRouteAll?comMsgHeader.serviceKey=Dkh%2FpLmcWEyA6f7JJ7jtgbs2IFrTa22ZoUXEUEm5LSy2EicwaWtWrcrlN0nG8FBGEoW8ROcxxdeq0BJjKc1f1A%3D%3D")
    Call<ResponseBody> getBusInfo(@Query("busRouteId") String busRouteId);

}
