package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class Integrals  extends ListActivity {
    final String LOG_TAG = "myLogs";
    int idItem5 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integrals);
        String[] classes = {"Помочь автору","Производная", "Первообразная", "Интегралы", "Эквивалентности", "Неопределенный Интеграл", ""};//     18
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), R.layout.my_list_item, classes);
        getListView().setAdapter(adapter);



        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Log.d(LOG_TAG, "itemClick: position = " + position + ", id = "
                        + id);
                idItem5 = (int) id;
                /*if (MainActivity.imageAd.isLoaded() && MainActivity.adIn % MainActivity.adDencity==0) {
                    MainActivity.imageAd.show();
                    MainActivity.adIn++;
                }*/
                whatActivity();
            }
        });
    }

    private void whatActivity() {
        boolean b = true;
        switch(idItem5){
            case 0:
                Intent intent = new Intent(this,HelpAuthor.class);
                startActivity(intent); break;
            case 1: MainActivity.number = R.drawable.p11proizvodnzya;               break;
            case 2: MainActivity.number = R.drawable.p11pervoobraznaya;             break;
            case 3: MainActivity.number = R.drawable.p11integrali;                  break;
            case 4: MainActivity.number = R.drawable.p11equals;                     break;
            case 5: MainActivity.number = R.drawable.p11undefinedintegralsolution;  break;
            case 6: b = false;                                                      break;
        }
        if(b && idItem5!=0){
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
    }
}