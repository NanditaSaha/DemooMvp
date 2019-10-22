package app.demp.demoMvp.di.modules;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;
import app.demp.demoMvp.di.ActivityContext;
import app.demp.demoMvp.di.PerActivity;
import app.demp.demoMvp.feature.Dashboard.DashboardMvpPresenter;
import app.demp.demoMvp.feature.Dashboard.DashboardMvpView;
import app.demp.demoMvp.feature.Dashboard.DashboardPresenter;
import app.demp.demoMvp.feature.HomeFragment.HomeFragment;
import app.demp.demoMvp.feature.LoginOptionPage.LoginOptionMvpPresenter;
import app.demp.demoMvp.feature.LoginOptionPage.LoginOptionMvpView;
import app.demp.demoMvp.feature.LoginOptionPage.LoginOptionPresenter;
import app.demp.demoMvp.feature.splash.SplashMvpPresenter;
import app.demp.demoMvp.feature.splash.SplashMvpView;
import app.demp.demoMvp.feature.splash.SplashPresenter;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }


    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }


    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    DashboardMvpPresenter<DashboardMvpView> provideDashboardPresenter(DashboardPresenter<DashboardMvpView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    LoginOptionMvpPresenter<LoginOptionMvpView> provideLoginOptionPresenter(LoginOptionPresenter<LoginOptionMvpView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    HomeFragment providesHomeFragment()
    {
        return new HomeFragment();
    }
}
