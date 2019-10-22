package app.demp.demoMvp.data.network;

import app.demp.demoMvp.data.network.model.LoginResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiHelper {

    @GET("5dae9856320000ee71d95b0d")
    Call<LoginResponse> doServerLoginApiCall();
}
