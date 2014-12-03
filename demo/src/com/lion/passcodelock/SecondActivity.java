package com.lion.passcodelock;

import org.jraf.android.util.activitylifecyclecallbackscompat.app.LifecycleDispatchActivity;

import android.os.Bundle;

public class SecondActivity extends LifecycleDispatchActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}
}
