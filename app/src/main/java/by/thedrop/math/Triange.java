package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class Triange extends ListActivity {

    final String LOG_TAG = "myLogs";
    int idItem5 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triange);
        String[] classes = {"Помочь автору","Сторона произвольного треугольника", "Стороны равнобедренного треугольника", "Стороны прямоугольного треугольника", "Высота произвольного треугольника", "Высота прямоугольного треугольника", "Высота, медиана, биссектриса равнобедренного треугольника", "Высота=медиана=биссектриса равностороннего треугольника", "Биссектриса произвольного треугольника", "Биссектриса прямоугольного треугольника", "Медиана произвольного треугольника", "Медиана прямоугольного треугольника", ""};//     18
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
            } break;
            case 1:
                MainActivity.number = R.drawable.p12storonaproizvol;
                break;
            case 2:
                MainActivity.number = R.drawable.p12storonaravnobedr;
                break;
            case 3:
                MainActivity.number = R.drawable.p12pryamougolnii;
                break;
            case 4:
                MainActivity.number = R.drawable.p12visotaproizvol;
                break;
            case 5:
                MainActivity.number = R.drawable.p12visotapryam;
                break;
            case 6:
                MainActivity.number = R.drawable.p12visotabissmedravnobedr;
                break;
            case 7:
                MainActivity.number = R.drawable.p12medianastoronabissravnostor;
                break;
            case 8:
                MainActivity.number = R.drawable.p12bissproizvol;
                break;
            case 9:
                MainActivity.number = R.drawable.p12biispryam;
                break;
            case 10:
                MainActivity.number = R.drawable.p12mediana;
                break;
            case 11:
                MainActivity.number = R.drawable.p12medianapryam;
                break;
            case 12:
                b = false;
                break;
        }
        if (b && idItem5!=0) {
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
    }
}