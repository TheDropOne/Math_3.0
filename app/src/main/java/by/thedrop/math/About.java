package by.thedrop.math;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;


public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ImageView imgView = (ImageView) findViewById(R.id.imageView2);
        imgView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.about));
    }
}
