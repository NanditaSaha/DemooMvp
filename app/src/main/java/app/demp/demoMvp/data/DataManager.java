package app.demp.demoMvp.data;

import app.demp.demoMvp.data.network.ApiHelper;
import app.demp.demoMvp.data.pref.PreferencesHelper;

public interface DataManager extends ApiHelper, PreferencesHelper {

    void logout();
}
