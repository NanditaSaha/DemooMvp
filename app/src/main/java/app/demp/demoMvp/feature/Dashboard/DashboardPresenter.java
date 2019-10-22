package app.demp.demoMvp.feature.Dashboard;

import javax.inject.Inject;

import app.demp.demoMvp.data.DataManager;
import app.demp.demoMvp.share.base.BasePresenter;

public class DashboardPresenter<V extends DashboardMvpView>extends BasePresenter<V>implements DashboardMvpPresenter<V> {

    @Inject
    public DashboardPresenter(DataManager mdataManager) {
        super(mdataManager);
    }

}
