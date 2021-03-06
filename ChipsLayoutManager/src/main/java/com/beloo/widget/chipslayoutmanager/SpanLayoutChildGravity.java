package com.beloo.widget.chipslayoutmanager;

import android.support.annotation.IntDef;
import android.view.Gravity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({android.view.Gravity.TOP, android.view.Gravity.BOTTOM, Gravity.CENTER, Gravity.CENTER_VERTICAL})
@Retention(RetentionPolicy.SOURCE)
public @interface SpanLayoutChildGravity {}
