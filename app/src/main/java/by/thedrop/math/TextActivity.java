package by.thedrop.math;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.Window;
import android.widget.TextView;

import com.appodeal.ads.Appodeal;
import com.google.android.gms.ads.InterstitialAd;

public class TextActivity extends ActionBarActivity {
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        TextView text = (TextView)findViewById(R.id.textView4);
        text.setText(MainActivity.textNumber);
        text.setMovementMethod(new ScrollingMovementMethod());

        text.setMovementMethod(LinkMovementMethod.getInstance());
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();

        Appodeal.show(this, Appodeal.BANNER_BOTTOM);
    }

    @Override
    public void onResume() {
        super.onResume();
        Appodeal.onResume(this, Appodeal.BANNER_BOTTOM);
    }
}
