package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


public class EasyMult extends ListActivity {

    final String LOG_TAG = "myLogs";
    int idItem5 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_mult);
        String[] classes = {"Помочь автору","Квадрат суммы", "Квадрат разности", "Разность квадратов", "Куб разности", "Куб суммы", "Сумма кубов", "Разность кубов", "Разность n-степеней", ""};//     18
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
            case 0:
                Intent intent = new Intent(this,HelpAuthor.class);
                startActivity(intent); break;
            case 1:
                MainActivity.number = R.drawable.p9kvadratsummi;
                break;
            case 2:
                MainActivity.number = R.drawable.p9kvadratraznosti;
                break;
            case 3:
                MainActivity.number = R.drawable.p9raznostkvadratov;
                break;
            case 4:
                MainActivity.number = R.drawable.p9kubraznosti;
                break;
            case 5:
                MainActivity.number = R.drawable.p9kubsummi;
                break;
            case 6:
                MainActivity.number = R.drawable.p9summakubov;
                break;
            case 7:
                MainActivity.number = R.drawable.p9raznostkubov;
                break;
            case 8:
                MainActivity.number = R.drawable.p9raznostnstepenei;
                break;
            case 9:
                b = false;
                break;
        }
        if (b && idItem5!=0) {
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
    }
}