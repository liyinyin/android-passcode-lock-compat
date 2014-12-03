package com.lion.passcodelock;

import org.wordpress.passcodelock.AppLockManager;

import android.app.Application;

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		
		AppLockManager.getInstance().enableDefaultAppLockIfAvailable(this);
	}

}
