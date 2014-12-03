android-passcode-lock-compat
============================

Android passcode lock compat ( 8+)

###This repository is based on [Android-PasscodeLock](https://github.com/wordpress-mobile/Android-PasscodeLock "wordpress-mobile/Android-PasscodeLock") and [android-activitylifecyclecallbacks-compat](https://github.com/BoD/android-activitylifecyclecallbacks-compat "BoD/android-activitylifecyclecallbacks-compat").

The Android-PasscodeLock repository is only support 14+, but my APP need to support 11+, so I merge the two repositories. And fix [one unreasonable situation](https://github.com/wordpress-mobile/Android-PasscodeLock/pull/14) in this repository.

How To Use:
-------------------------------
(SdkVersion &lt; 14):

- All your activity that needed to lock, should to extends **LifecycleDispatch\*\*\*Activity**.

- In your Application file, you should call
```
AppLockManager.getInstance().enableDefaultAppLockIfAvailable(this);
```

More Details:
-------------------------------

+  [Android-PasscodeLock](https://github.com/wordpress-mobile/Android-PasscodeLock "wordpress-mobile/Android-PasscodeLock")
+ [android-activitylifecyclecallbacks-compat](https://github.com/BoD/android-activitylifecyclecallbacks-compat "BoD/android-activitylifecyclecallbacks-compat")
+ Demo