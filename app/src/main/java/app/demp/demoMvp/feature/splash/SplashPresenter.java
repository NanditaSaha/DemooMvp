package app.demp.demoMvp.feature.splash;

import android.os.Handler;

import javax.inject.Inject;

import app.demp.demoMvp.data.DataManager;
import app.demp.demoMvp.share.base.BasePresenter;
import app.demp.demoMvp.share.base.MvpView;

public class SplashPresenter<V extends SplashMvpView & MvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {
    @Inject
    public SplashPresenter(DataManager mdataManager) {
        super(mdataManager);
    }

    @Override
    public void decideNavigation() {
     Navigate();
    }

    private void Navigate()
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getMvpView().navigateToHOme();
            }
        }, 2000);
    }
}
