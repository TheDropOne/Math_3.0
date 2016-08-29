package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.appodeal.ads.Appodeal;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.firebase.analytics.FirebaseAnalytics;


public class MainActivity extends ListActivity {

    final String LOG_TAG = "myLogs";
    int idItem = -1;
    public static int number = 0;
    public static int textNumber = 0;
    FirebaseAnalytics mFirebaseAnalytics;

    //-------------Ads xujnya

    public InterstitialAd imageAd;
    public boolean isAdNotLooked;
    public static int adIn = 1;
    public static int adInText = 0;
    public static int adDencity = 7;
    //------------/Ads xujnya


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] classes = {"Помочь автору", "Хитрости и советы", "Решения и ответы ЕГЭ и ЦТ", "Типовые задачи", "Решение типовых задач",
                "Периметр фигур", "Площадь плоских фигур", "Площадь поверхности", "Объем тел", "Треугольник", "Радиус вписанной окружности",
                "Радиус описанной окружности", "Тригонометрия", "Формулы сокращенного умножения", "Алгебра", "Производные, Интегралы", "Полезные ресурсы и книги", "О приложении", ""};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), R.layout.my_list_item, classes);
        getListView().setAdapter(adapter);

/*      MobileAds.initialize(getApplicationContext(), "ca-app-pub-3940256099942544~3347511713");

        imageAd = new InterstitialAd(this);
        imageAd.setAdUnitId("ca-app-pub-4167275856253568/7682131337");
        imageAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });
        requestNewInterstitial();
*/

        String appKey = "227d5c597055a6e7131ba80ae760625a923790074e72ec8e";
        Appodeal.disableLocationPermissionCheck();
        Appodeal.confirm(Appodeal.SKIPPABLE_VIDEO);
        Appodeal.initialize(this, appKey, Appodeal.INTERSTITIAL | Appodeal.SKIPPABLE_VIDEO | Appodeal.BANNER);

        isAdNotLooked = true;
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Log.d(LOG_TAG, "itemClick: position = " + position + ", id = "
                        + id);
                idItem = (int) id;
                if (isAdNotLooked && MainActivity.number > 3) {
                    if (Appodeal.isLoaded(Appodeal.SKIPPABLE_VIDEO)) {
                        Appodeal.show(MainActivity.this, Appodeal.SKIPPABLE_VIDEO);
                        isAdNotLooked = false;
                    }
                    if (Appodeal.isLoaded(Appodeal.INTERSTITIAL) && isAdNotLooked) {
                        Appodeal.show(MainActivity.this, Appodeal.INTERSTITIAL);
                        isAdNotLooked = false;
                    }
                }
                whatActivity();
            }
        });

        AnalyticsApplication application = (AnalyticsApplication) getApplication();
        Tracker mTracker = application.getDefaultTracker();
    }

    /*
        private void requestNewInterstitial() {
            AdRequest adRequest = new AdRequest.Builder().build();
            imageAd.loadAd(adRequest);
        }
    */
    public void whatActivity() {
        Intent intent = null;
        switch (idItem) {
            case 0: {
                Intent intent2 = new Intent(this, HelpAuthor.class);
                startActivity(intent2);
            }
            break;
            case 1:
                intent = new Intent(this, Advice.class);
                break;
            case 2:
                intent = new Intent(this, EGE.class);
                break;
            case 3:
                intent = new Intent(this, TypicalTasks.class);
                break;
            case 4:
                intent = new Intent(this, SolutionTasks.class);
                break;
            case 5:
                intent = new Intent(this, Perimetr.class);
                break;
            case 6:
                intent = new Intent(this, PloshadPloskihFigur.class);
                break;
            case 7:
                intent = new Intent(this, PloshadPoverhnosti.class);
                break;
            case 8:
                intent = new Intent(this, ObuomTel.class);
                break;
            case 9:
                intent = new Intent(this, Triange.class);
                break;
            case 10:
                intent = new Intent(this, radiusVpisannoi.class);
                break;
            case 11:
                intent = new Intent(this, RadiusOpisannoi.class);
                break;
            case 12:
                intent = new Intent(this, Trigonometriya.class);
                break;
            case 13:
                intent = new Intent(this, EasyMult.class);
                break;
            case 14:
                intent = new Intent(this, Logarifm.class);
                break;
            case 15:
                intent = new Intent(this, Integrals.class);
                break;
            /*
            Убрать комментарии когда мне заплатят.
            case 16:
                intent = new Intent(this, Shpores.class);
                break;
            */
            case 16:
                intent = new Intent(this, UsefulResourses.class);
                break;
            case 17:
                intent = new Intent(this, About.class);
                break;
        }
        if (idItem != -1 && idItem != 18 && idItem != 0) {
            startActivity(intent);
        }
    }
    /*if (idItem == 12) {
            Intent intent = new Intent(this, EGE.class);
            startActivity(intent);
        }*/


    @Override
    public void onStart() {
        super.onStart();
        GoogleAnalytics.getInstance(this).reportActivityStart(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        GoogleAnalytics.getInstance(this).reportActivityStop(this);
    }

}
