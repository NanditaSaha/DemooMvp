package app.demp.demoMvp.di.modules;


import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import app.demp.demoMvp.data.AppDataManager;
import app.demp.demoMvp.data.DataManager;
import app.demp.demoMvp.data.pref.AppPreferencesHelper;
import app.demp.demoMvp.data.pref.PreferencesHelper;
import app.demp.demoMvp.di.ApplicationContext;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext()
    {
        return mApplication;
    }

    @Provides
    Application provideApplication()
    {
        return mApplication;
    }


    @Singleton
    @Provides
    PreferencesHelper providePrefHelper(AppPreferencesHelper mAppPreferencesHelper){
        return mAppPreferencesHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager)
    {return  appDataManager;}
}
