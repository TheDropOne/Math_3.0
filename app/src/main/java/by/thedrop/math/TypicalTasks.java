package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class TypicalTasks extends ListActivity {
    final String LOG_TAG = "myLogs";
    int idItem5 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typical_tasks);
        String[] classes = {"Помочь автору","Планиметрия", "Стереометрия", "Тригонометрические уравнения", "Уравнения в решении задач", "Ответы", ""};//     18
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

    private void whatActivity() {
        boolean b = true;
        switch (idItem5) {
            case 0: {
                Intent intent = new Intent(this,HelpAuthor.class);
                startActivity(intent);
            } break;
            case (1):
                MainActivity.textNumber = R.string.chapter10;
                break;
            case (2):
                MainActivity.textNumber = R.string.chapter11;
                break;
            case (3):
                MainActivity.number = R.drawable.chapter8;
                break;
            case (4):
                MainActivity.number = R.drawable.chapter12;
                break;
            case (5):
                MainActivity.number = R.drawable.answersskanavi;
                break;
            case (6):
                MainActivity.textNumber = 0;
                b = false;
                break;
        }
        if (b && idItem5!=0) {
            if (idItem5 == 3 || idItem5 == 4 || idItem5 == 5) {
                Intent intent = new Intent(this, Image.class);
                startActivity(intent);
            }
            if (idItem5 == 1 || idItem5 == 2) {
                Intent intent = new Intent(this, TextActivity.class);
                startActivity(intent);
            }
        }
    }
}