package com.luthfihariz.htmltextview.lib;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Html;

/**
 * Created by luthfihariz on 10/29/16.
 */

public class UrlImageParser implements Html.ImageGetter {

    @Override
    public Drawable getDrawable(String source) {
        // return empty drawable until get the permanent solution
        return new BitmapDrawable();
    }
}
