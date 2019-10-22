package app.demp.demoMvp.feature.LoginOptionPage;

import javax.inject.Inject;

import app.demp.demoMvp.data.DataManager;
import app.demp.demoMvp.data.network.model.LoginResponse;
import app.demp.demoMvp.share.base.BasePresenter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginOptionPresenter<V extends LoginOptionMvpView> extends BasePresenter<V> implements LoginOptionMvpPresenter<V> {

    @Inject
    public LoginOptionPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void getLogin(String phone, String password) {
        if (phone == null || phone.isEmpty()) {
            getMvpView().onError("Please Enter phone");
            return;
        }

        if (password == null || password.isEmpty()) {
            getMvpView().onError("Please Enter Password");
            return;
        }
        getMvpView().showLoading();
        if (getMvpView().isNetworkConnected()) {
            getDataManager().doServerLoginApiCall().enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                    getMvpView().hideLoading();
                    getMvpView().successfulltgetResult(response.body());
                }

                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {
                    getMvpView().hideLoading();
                    getMvpView().onError("Some this went wrong");
                }
            });
        } else {
            getMvpView().showAlert("No internet Connection");
        }

    }
}
