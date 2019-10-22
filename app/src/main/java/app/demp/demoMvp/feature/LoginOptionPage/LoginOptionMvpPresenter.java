package app.demp.demoMvp.feature.LoginOptionPage;

import app.demp.demoMvp.share.base.MvpPresenter;

public interface LoginOptionMvpPresenter<V extends LoginOptionMvpView>extends MvpPresenter<V> {

    void getLogin(String phone, String password);
}
