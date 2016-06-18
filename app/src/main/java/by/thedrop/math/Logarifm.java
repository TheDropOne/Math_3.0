package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class Logarifm extends ListActivity {

    final String LOG_TAG = "myLogs";
    int idItem5 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logarifm);
        String[] classes = {"Помочь автору", "Теорема Виета", "Арифметическая прогрессия", "Геометрическая прогрессия", "Уравнение касательной", "","","Свойства логарифма", "Координаты вершины параболы", "Показательные неравенства", ""};//     18
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
        //8
        Intent intent = null;
        switch (idItem5) {
            case 0:
                intent = new Intent(this, HelpAuthor.class);
                break;
            case 1:
                MainActivity.number = R.drawable.p10vieta;
                break;
            case 2:
                MainActivity.number = R.drawable.p10ariphmprog;
                break;
            case 3:
                MainActivity.number = R.drawable.p10geomprogr;
                break;
            case 4:
                MainActivity.number = R.drawable.p10tangental;
                break;
            case 5:
                MainActivity.number = R.drawable.p10_degree;
                break;
            case 6:
                MainActivity.number =R.drawable.p10korni;
            case 7 :
                MainActivity.number = R.drawable.p10logarifm;
                break;
            case 8:
                MainActivity.number = R.drawable.p10coordinates;
                break;
            case 9:
                MainActivity.number = R.drawable.p10pokazatelnie;
                break;
        }
        if (intent == null && idItem5 != 0 && idItem5!=10) {
            intent = new Intent(this, Image.class);
            startActivity(intent);
        }
    }
}