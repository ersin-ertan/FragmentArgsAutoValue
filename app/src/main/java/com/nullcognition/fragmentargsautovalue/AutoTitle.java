package com.nullcognition.fragmentargsautovalue;

import android.os.Parcelable;
import com.google.auto.value.AutoValue;

/**
 * Created by mms on 2/10/17.
 */

@AutoValue public abstract class AutoTitle implements Parcelable {

  public static AutoTitle create(String title) {
    return new AutoValue_AutoTitle(title);
  }

  public abstract String title();
}


