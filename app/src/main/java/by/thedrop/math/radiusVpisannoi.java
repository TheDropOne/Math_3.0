package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


public class radiusVpisannoi extends ListActivity {

    final String LOG_TAG = "myLogs";
    int idItem5 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class10);
        String[] classes = {"Помочь автору","Треугольник", "Прямоугольный треугольник", "Равносторонний треугольник", "Равнобедренный треугольник", "Квадрат", "Правильный многоугольник", "Ромб", "Трапеция", "Шестиугольник", ""};//     18
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
            MainActivity.number = R.drawable.p5triangle;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 2) {
            MainActivity.number = R.drawable.p5pryamtriangle;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 3) {
            MainActivity.number = R.drawable.p5ravnostortriangle;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 4) {
            MainActivity.number = R.drawable.p5ravnobedrtriangle;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 5) {
            MainActivity.number = R.drawable.p5kvadrat;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 6) {
            MainActivity.number = R.drawable.p5pravmnogougolnik;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 7) {
            MainActivity.number = R.drawable.p5romb;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 8) {
            MainActivity.number = R.drawable.p5trapecia;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 9) {
            MainActivity.number = R.drawable.p5shestiugolnik;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
    }
}
