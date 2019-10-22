package app.demp.demoMvp.feature.LoginOptionPage;

import app.demp.demoMvp.data.network.model.LoginResponse;
import app.demp.demoMvp.share.base.MvpView;

public interface LoginOptionMvpView extends MvpView {

    void successfulltgetResult(LoginResponse loginResponse);
}
