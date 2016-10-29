package com.luthfihariz.htmltextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.luthfihariz.htmltextview.lib.HtmlTextView;

public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        HtmlTextView mSampleTv = (HtmlTextView) findViewById(R.id.tv_sample);
        mSampleTv.setText("<strong>Unordered list</strong>\n" +
                "<ul>\n" +
                "\t<li>This is an unordered list</li>\n" +
                "\t<li>Contain three items in the list</li>\n" +
                "\t<li>..and this is the last item of the list</li>\n" +
                "</ul>\n" +
                "<strong>Ordered list</strong>\n" +
                "<ol>\n" +
                "\t<li>Number one</li>\n" +
                "\t<li>Number two</li>\n" +
                "\t<li>Number three</li>\n" +
                "\t<li>Number four</li>\n" +
                "\t<li>Number five</li>\n" +
                "</ol>\n");
    }
}
