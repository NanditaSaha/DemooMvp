package app.demp.demoMvp.feature.splash;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import app.demp.demoMvp.R;
import app.demp.demoMvp.feature.LoginOptionPage.LoginOptionActivity;
import app.demp.demoMvp.share.base.BaseActivity;

public class SplashActivity extends BaseActivity implements SplashMvpView{


    @BindView(R.id.progressbar)
    ProgressBar progressbar;

    @Inject
    SplashPresenter <SplashMvpView> presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setUnBinder(ButterKnife.bind(this));
        getActivityComponent().inject(this);
        setUp();
        initUi();

    }

    private void initUi()
    {
        presenter.decideNavigation();
    }

    protected void setUp()
    {
        presenter.onAttached(this);

    }
    @Override
    public void navigateToHOme() {

        progressbar.setVisibility(View.GONE);
        gotoNext(LoginOptionActivity.class,null);
    }


    @Override
    protected void onDestroy() {
        presenter.onDettached();
        super.onDestroy();
    }
}
