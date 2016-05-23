package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;


public class Advice extends ListActivity {
    final String LOG_TAG = "myLogs";
    int idItem5 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);
        String[] classes = {"Помочь автору", "Угадываем правильный ответ", "До экзамена неделя, я ничего не знаю", "Как лучше готовиться?", "Настроиться на 100", "Использование времени", "За день до", "Во время теста","Как учить тригонометрию?","Что самое главное?","Как не упустить ответ?" ,"Ты сдашь!",""};// 6
        // Как выучить тригонометрию? Что самое главное? Как не упустить ответ? Разные подходы.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), R.layout.my_list_item, classes);
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Log.d(LOG_TAG, "itemClick: position = " + position + ", id = "
                        + id);
                idItem5 = (int) id;
                whatActivity();
            }
        });
    }


    public void whatActivity() {
        boolean b = true;
        switch (idItem5) {
            case 0: {
                Intent intent = new Intent(this,HelpAuthor.class);
                startActivity(intent);
                /*if (Appodeal.isLoaded(Appodeal.NON_SKIPPABLE_VIDEO)) {
                    Appodeal.show(this, Appodeal.NON_SKIPPABLE_VIDEO);
                }
                if (Appodeal.isLoaded(Appodeal.SKIPPABLE_VIDEO)) {
                    Appodeal.show(this, Appodeal.SKIPPABLE_VIDEO);
                }
                else if (Appodeal.isLoaded(Appodeal.INTERSTITIAL)) {
                    Appodeal.show(this, Appodeal.INTERSTITIAL);
                }*/
            } break;
            case (1):
                MainActivity.textNumber = R.string.ugadivaem;
                break;
            case (2):
                MainActivity.textNumber = R.string.oneWeek;
                break;
            case (3):
                MainActivity.textNumber = R.string.podgotovka;
                break;
            case (4):
                MainActivity.textNumber = R.string.nastroi;
                break;
            case (5):
                MainActivity.textNumber = R.string.timeUse;
                break;
            case (6):
                MainActivity.textNumber = R.string.oneDay;
                break;
            case (7):
                MainActivity.textNumber = R.string.inTest;
                break;
            case (8):
                MainActivity.textNumber = R.string.trigonom;
                break;
            case (9):
                MainActivity.textNumber = R.string.everyday;
                break;
            case (10):
                MainActivity.textNumber = R.string.missanswer;
                break;

            case (11):
                Toast toast = Toast.makeText(this,"Я столько сил вбахал в это приложение, чтобы вбить тебе в голову знаний, так что ты просто обязан сдавать! Я в тебя верю! =)",Toast.LENGTH_LONG);
                ViewGroup group = (ViewGroup) toast.getView();
                TextView messageTextView = (TextView) group.getChildAt(0);
                messageTextView.setTextSize(16);
                toast.show();
                break;
            case (12):
                MainActivity.textNumber = 0;
                b = false;
                break;
        }
        if (b && idItem5 != 0 && idItem5!=11) {
            Intent intent = new Intent(this, TextActivity.class);
            startActivity(intent);
        }
        /*__________________________________To be Continued__________________________________

        */
    }
}
