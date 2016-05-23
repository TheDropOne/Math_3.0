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


public class MainActivity extends ListActivity {

    final String LOG_TAG = "myLogs";
    int idItem = -1;
    public static int number = 0;
    public static int textNumber = 0;

    //-------------Ads xujnya
    private InterstitialAd mInterstitialAd;
    public static InterstitialAd imageAd;
    public boolean isAdNotLooked = false;
    public static int adIn = 1;
    public static int adInText = 0;
    public static int adDencity = 7;
    //------------/Ads xujnya


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] classes = {"Помочь автору","Хитрости и советы","Решения и ответы ЕГЭ и ЦТ","Типовые задачи","Решение типовых задач",
                "Периметр фигур", "Площадь плоских фигур", "Площадь поверхности", "Объем тел","Треугольник", "Радиус вписанной окружности",
                "Радиус описанной окружности", "Тригонометрия", "Формулы сокращенного умножения", "Алгебра", "Производные, Интегралы", "Шпаргалки", "Полезные ресурсы и книги",  "О приложении", ""};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), R.layout.my_list_item, classes);
        getListView().setAdapter(adapter);


        //Appodeal.confirm(Appodeal.SKIPPABLE_VIDEO);
        String appKey = "17c9e8a1529a23fce9c8afe2e137217d370f709fb50a291f";
        Appodeal.disableLocationPermissionCheck();
        Appodeal.initialize(this, appKey, Appodeal.INTERSTITIAL | Appodeal.BANNER);

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Log.d(LOG_TAG, "itemClick: position = " + position + ", id = "
                        + id);
                idItem = (int) id;
                whatActivity();
            }
        });

        AnalyticsApplication application = (AnalyticsApplication) getApplication();
        Tracker mTracker = application.getDefaultTracker();
    }



    public void whatActivity(){
        isAdNotLooked = true;
        Intent intent = null;
        switch (idItem) {
            case 0: {
                Intent intent2 = new Intent(this,HelpAuthor.class);
                startActivity(intent2);
            }
            break;
            case 1: intent = new Intent(this, Advice.class);                    break;
            case 2: intent = new Intent(this, EGE.class);                       break;
            case 3: intent = new Intent(this, TypicalTasks.class);              break;
            case 4: intent = new Intent(this, SolutionTasks.class);             break;
            case 5: intent = new Intent(this, Perimetr.class );                 break;
            case 6: intent = new Intent(this, PloshadPloskihFigur.class);       break;
            case 7: intent = new Intent(this, PloshadPoverhnosti.class);        break;
            case 8: intent = new Intent(this, ObuomTel.class);                  break;
            case 9: intent = new Intent(this, Triange.class);                   break;
            case 10: intent = new Intent(this, radiusVpisannoi.class);          break;
            case 11: intent = new Intent(this, RadiusOpisannoi.class);          break;
            case 12: intent = new Intent(this, Trigonometriya.class);           break;
            case 13: intent = new Intent(this, EasyMult.class);                 break;
            case 14: intent = new Intent(this, Logarifm.class);                 break;
            case 15: intent = new Intent(this, Integrals.class);                break;
            case 16: intent = new Intent(this, Shpores.class);                  break;
            case 17: intent = new Intent(this, UsefulResourses.class);          break;
            case 18: intent = new Intent(this, About.class);                    break;
        }
        if (idItem!=-1 && idItem!=19 && idItem!=0){
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
