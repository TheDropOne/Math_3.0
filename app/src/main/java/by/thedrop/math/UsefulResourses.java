package by.thedrop.math;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

public class UsefulResourses extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useful_resourses);
        TextView t2 = (TextView) findViewById(R.id.textView3);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
        TextView t3 = (TextView) findViewById(R.id.textView6);
        t3.setText(R.string.Skanavi);
        Linkify.addLinks(t3, Linkify.ALL);
        t3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t4 = (TextView) findViewById(R.id.textView7);
        Linkify.addLinks(t4, Linkify.ALL);
        t4.setText(R.string.Veremenuk);
        t4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t5 = (TextView) findViewById(R.id.textView8);
        Linkify.addLinks(t5, Linkify.ALL);
        t5.setText(R.string.linkRT);
        t5.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
