package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


public class PloshadPoverhnosti extends ListActivity {
    final String LOG_TAG = "myLogs";
    int idItem5 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class7);
        String[] classes = {"Помочь автору","Куб", "Цилиндр", "Сфера", "Прямоугольный параллелепипед", "Правильная пирамида", "Правильная усеченная пирамида", "Конус", "Усеченный конус", "Шаровой сегмент", "Шаровой сектор", "Шаровой слой", ""};//     18
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
        if(idItem5==0) {
            Intent intent = new Intent(this,HelpAuthor.class);
            startActivity(intent);
        }
        if (idItem5 == 1) {
            MainActivity.number = R.drawable.p3kub;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 2) {
            MainActivity.number = R.drawable.p3cilindr;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 3) {
            MainActivity.number = R.drawable.p3sfera;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 4) {
            MainActivity.number = R.drawable.p3pryamparallelepiped;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 5) {
            MainActivity.number = R.drawable.p3pravpiramida;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 6) {
            MainActivity.number = R.drawable.p3pravusechpiramida;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 7) {
            MainActivity.number = R.drawable.p3konus;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 8) {
            MainActivity.number = R.drawable.p3usechkonus;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 9) {
            MainActivity.number = R.drawable.p3shrovoisegment;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 10) {
            MainActivity.number = R.drawable.p3sharovoisektor;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 11) {
            MainActivity.number = R.drawable.p3sharovoisloi;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
    }
}
