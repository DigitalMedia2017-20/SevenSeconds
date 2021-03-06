package com.goldfish.sevenseconds.item;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by zzz87 on 2017/3/27.
 */
public class Myedittext extends EditText {
    public Myedittext(Context context) {
        super(context);
    }
    public Myedittext(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public void insertDrawable(Drawable db) {
        final SpannableString ss = new SpannableString("easy");
        //得到drawable对象，即所有插入的图片
        Drawable d = db;
        d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
        //用这个drawable对象代替字符串easy
        ImageSpan span = new ImageSpan(d, ImageSpan.ALIGN_BASELINE);
        //包括0但是不包括"easy".length()即：4。[0,4)
        ss.setSpan(span, 0, "easy".length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        append(ss);
    }
}
