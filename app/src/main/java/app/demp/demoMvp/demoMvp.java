package app.demp.demoMvp;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import app.demp.demoMvp.data.DataManager;
import app.demp.demoMvp.di.components.ApplicationComponent;
import app.demp.demoMvp.di.components.DaggerApplicationComponent;
import app.demp.demoMvp.di.modules.ApplicationModule;
import app.demp.demoMvp.di.modules.NetworkModule;
import app.demp.demoMvp.utils.AppData;

public class demoMvp extends Application {

    ApplicationComponent applicationComponent;

    @Inject
    DataManager mDataManager;


    @Override
    public void onCreate() {
        super.onCreate();
       // Fabric.with(this, new Crashlytics());




        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .networkModule(new NetworkModule(AppData.BASE_URL)).build();

        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        /*MultiDex.install(this);*/
    }
}
