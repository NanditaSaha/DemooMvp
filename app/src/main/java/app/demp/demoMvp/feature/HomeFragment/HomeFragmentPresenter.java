package app.demp.demoMvp.feature.HomeFragment;

import javax.inject.Inject;

import app.demp.demoMvp.data.DataManager;
import app.demp.demoMvp.share.baseFragment.BaseFragmentPresenter;

public class HomeFragmentPresenter<V extends HomeFragmentMvpView>extends BaseFragmentPresenter<V> implements HomeFragmentMvpPresenter<V> {

    @Inject
    public HomeFragmentPresenter(DataManager dataManager) {
        super(dataManager);
    }
}
