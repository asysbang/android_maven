package com.asysbang.mylib;

import android.content.Context;
import android.util.AttributeSet;

public class MyTextView extends android.support.v7.widget.AppCompatTextView {


    public MyTextView(Context context) {
        super(context);
        setTextSize(100);
        setText(R.string.text);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTextSize(100);
        setText(R.string.text);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTextSize(100);
        setText(R.string.text);
    }
}
