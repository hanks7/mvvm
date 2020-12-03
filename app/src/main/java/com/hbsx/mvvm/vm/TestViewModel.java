package com.hbsx.mvvm.vm;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.hbsx.mvvm.MCallback;
import com.hbsx.mvvm.bean.Account;
import com.hbsx.mvvm.databinding.ActivityMainBinding;
import com.hbsx.mvvm.model.TestModel;

public class TestViewModel extends BaseObservable {

    private ActivityMainBinding binding;
    private TestModel mvvmModel;
    private String Input;
    private String result;

    @Bindable
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(com.hbsx.mvvm.BR.result);
    }

    /**
     *  一般需要传入Application对象，方便在ViewModel中使用application
     *  比如sharedpreferences需要使用
     * @param binding
     */
    public TestViewModel( ActivityMainBinding binding) {
        this.binding=binding;
        mvvmModel = new TestModel();

    }

    public void getData(View view){

        Input = binding.etAccount.getText().toString();
        mvvmModel.getAccountData(Input, new MCallback() {
            @Override
            public void onSuccess(Account account) {
                String info = account.getName() + "|" + account.getLevel();
                setResult(info);
            }

            @Override
            public void onFailed() {
                setResult("消息获取失败");
            }
        });
    }
}