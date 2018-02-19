package test.net.atshq.mvpproject.MVP.model;

import android.text.TextUtils;

import test.net.atshq.mvpproject.MVP.presenter.LogInPresenter;
import test.net.atshq.mvpproject.MVP.view.LogInView;

/**
 * Created by User on 2/18/2018.
 */

public class LogInModel implements LogInPresenter {
    private LogInView logInView;

    public LogInModel(LogInView logInView) {
        this.logInView = logInView;
    }

    @Override
    public void logIn(String user, String password) {
        if(TextUtils.isEmpty(user)||TextUtils.isEmpty(password)){
            logInView.onValidationError();
        }else {
            if(user.equals("joy")&&password.equals("joy")){
                logInView.onLoginSuccess();
            }else {
                logInView.onLoginError();
            }
        }
    }
}
