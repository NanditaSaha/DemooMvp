package app.demp.demoMvp.feature.splash;

import app.demp.demoMvp.di.PerActivity;
import app.demp.demoMvp.share.base.MvpPresenter;
import app.demp.demoMvp.share.base.MvpView;


@PerActivity
public interface SplashMvpPresenter<V extends SplashMvpView & MvpView> extends MvpPresenter<V> {

    void decideNavigation();
}
