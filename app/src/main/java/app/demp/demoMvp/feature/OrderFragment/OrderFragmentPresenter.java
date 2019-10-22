package app.demp.demoMvp.feature.OrderFragment;

import javax.inject.Inject;

import app.demp.demoMvp.data.DataManager;
import app.demp.demoMvp.share.baseFragment.BaseFragmentPresenter;

public class OrderFragmentPresenter<V extends OrderFragmentMvpView> extends BaseFragmentPresenter<V>implements OrderFragmentMvpPresenter<V>{
    @Inject
    public OrderFragmentPresenter(DataManager dataManager) {
        super(dataManager);
    }
}
