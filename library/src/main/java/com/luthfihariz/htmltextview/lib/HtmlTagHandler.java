package com.luthfihariz.htmltextview.lib;

import android.content.Context;
import android.text.Editable;
import android.text.Html;
import android.util.Log;

import org.xml.sax.XMLReader;

/**
 * Created by luthfihariz on 10/29/16.
 */

class HtmlTagHandler implements Html.TagHandler {

    private static final String UNORDERED_LIST_TAG = "ul";
    private static final String ORDERED_LIST_TAG = "ol";
    private static final String LIST_TAG = "li";

    private String mParent;
    private int mIndex;
    private String mTab;

    HtmlTagHandler(Context context) {
        mParent = "";
        mIndex = 1;
        mTab = context.getString(R.string.tab);
    }

    @Override
    public void handleTag(boolean opening, String tag, Editable output, XMLReader xmlReader) {
        Log.d("HtmlTv", "handleTag: " + tag + " opening : " + opening);
        switch (tag) {
            case UNORDERED_LIST_TAG:
            case ORDERED_LIST_TAG:
                if (opening) {
                    mParent = tag;
                } else {
                    output.append("\n");
                }
                break;
            case LIST_TAG:
                if (mParent.equals(UNORDERED_LIST_TAG)) {
                    if (opening) {
                        output.append("\n").append(mTab).append("•").append(mTab);
                    }
                } else {
                    if (opening) {
                        output.append("\n").append(mTab).append(String.valueOf(mIndex))
                                .append(".").append(mTab);
                        mIndex++;
                    }
                }
                break;
            default:
                break;
        }
    }
}
