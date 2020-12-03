package com.hbsx.mvvm;


import com.hbsx.mvvm.bean.Account;

/**
 * @author 侯建军 QQ:474664736
 * @time 2020/1/6 10:50
 * @class describe
 */
public interface MCallback {
    void onSuccess(Account account);

    void onFailed();
}
