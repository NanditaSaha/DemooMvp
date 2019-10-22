package app.demp.demoMvp.di.components;


import dagger.Component;
import app.demp.demoMvp.di.PerActivity;
import app.demp.demoMvp.di.modules.ActivityModule;
import app.demp.demoMvp.feature.Dashboard.DashboardActivity;
import app.demp.demoMvp.feature.HomeFragment.HomeFragment;
import app.demp.demoMvp.feature.LoginOptionPage.LoginOptionActivity;
import app.demp.demoMvp.feature.splash.SplashActivity;

@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(SplashActivity activity);
    void inject(DashboardActivity activity);
    void inject(HomeFragment fragment);
    void inject(LoginOptionActivity activity);
}
