package app.demp.demoMvp.di.components;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import app.demp.demoMvp.data.DataManager;
import app.demp.demoMvp.di.ApplicationContext;
import app.demp.demoMvp.di.modules.ApplicationModule;
import app.demp.demoMvp.di.modules.NetworkModule;
import app.demp.demoMvp.demoMvp;

@Singleton
@Component(modules={ApplicationModule.class, NetworkModule.class})
public interface ApplicationComponent {


    void inject(demoMvp app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();

}
