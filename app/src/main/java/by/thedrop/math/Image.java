package by.thedrop.math;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.appodeal.ads.Appodeal;
import com.google.android.gms.ads.InterstitialAd;

import uk.co.senab.photoview.PhotoViewAttacher;


public class Image extends ActionBarActivity {

    PhotoViewAttacher mAttacher;
    Bitmap bitmap;
    public static InterstitialAd ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_image);


            MainActivity.adIn++;

            ImageView imgView = (ImageView) findViewById(R.id.imageView);

            bitmap = BitmapFactory.decodeResource(this.getResources(), MainActivity.number);
            imgView.setImageBitmap(bitmap);

            mAttacher = new PhotoViewAttacher(imgView);
            mAttacher.update();

            Button shareButton = (Button) findViewById(R.id.shareButton);
            assert shareButton != null;

            shareButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String textToSend = "Готовься к экзаменам по математике с приложением \"Все формулы. Математика\". Ответы и решения ЦТ и ЕГЭ, формулы, задачи и много всего еще! \n play.google.com/store/apps/details?id=by.thedrop.math";

                    Intent shareIntent = new Intent();
                    shareIntent.setAction(Intent.ACTION_SEND);

                    shareIntent.putExtra(Intent.EXTRA_TEXT, textToSend);
                    String url = MediaStore.Images.Media.insertImage(Image.this.getContentResolver(), bitmap, "title", "description");
                    shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse(url));
                    shareIntent.setType("image/*");
                    startActivity(Intent.createChooser(shareIntent, "Поделиться!"));
                }
            });


            //ca-app-pub-4167275856253568/1409923336
            Appodeal.show(this, Appodeal.BANNER_BOTTOM);
        } catch (Exception ex) {
            ex.printStackTrace();
            Toast.makeText(this, "Упс, что-то пошло не так", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bitmap.recycle();
        bitmap = null;
    }

    @Override
    public void onResume() {
        super.onResume();
        Appodeal.onResume(this, Appodeal.BANNER);
    }

}
