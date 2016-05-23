package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


public class Trigonometriya extends ListActivity {

    final String LOG_TAG = "myLogs";
    int idItem5 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class11);
        String[] classes = {"Помочь автору", "Значения популярных углов", "Сумма тригонометрических функций", "Разность тригонометрических функций", "Произведение тригонометрических функций", "Формулы суммы углов", "Формулы разности углов", "Формулы половинного угла", "Формулы тройного угла", "Формулы приведения", "Функция в квадрате", "Функция в кубе", ""};//     18
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
        if (idItem5 == 0) {
            Intent intent = new Intent(this,HelpAuthor.class);
            startActivity(intent);
        }
        if (idItem5 == 1) {
            MainActivity.number = R.drawable.p8znachpopuglov;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 2) {
            MainActivity.number = R.drawable.p8summtrigfun;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 3) {
            MainActivity.number = R.drawable.p8raznosttrigonomfunkcii;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 4) {
            MainActivity.number = R.drawable.p8proizvtrigonomfunkcii;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 5) {
            MainActivity.number = R.drawable.p8formsummiuglov;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 6) {
            MainActivity.number = R.drawable.p8formraznostiuglov;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 7) {
            MainActivity.number = R.drawable.p8formpolovinugla;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 8) {
            MainActivity.number = R.drawable.p8formtroinogougla;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 9) {
            MainActivity.number = R.drawable.p8formuliprivedenia;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 10) {
            MainActivity.number = R.drawable.p8funcvkvadrate;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 11) {
            MainActivity.number = R.drawable.p8funkciavkube;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
    }
}