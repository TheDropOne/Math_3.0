package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class EGE extends ListActivity {
    final String LOG_TAG = "myLogs";
    int idItem5 = -1;
    public static int number = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ege);
        //"Егэ 2015,36 вариантов,(11мб)"
        String[] classes = {"Помочь автору","Ответы ЕГЭ 2015 демо-вариант","Ответы ГИА 2015","Ответы РТ 2 2016 вариант 1", "Ответы РТ 3 2016 вариант 1", "Решение ЦТ 2011 вариант 1", "Решение ЦТ 2012 вариант 3", "Решение ЦТ 2013 вариант 1", "Решение ЦТ 2014 вариант 1", "Решение ЦТ 2015 вариант 1", ""};//     8
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), R.layout.my_list_item, classes);
        getListView().setAdapter(adapter);


        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Log.d(LOG_TAG, "itemClick: position = " + position + ", id = "
                        + id);
                idItem5 = (int) id;
                /*if (MainActivity.adIn % 5 == 0) {
                    MainActivity.adIn++;
                }*/
                whatActivity();
            }
        });
    }


    public void whatActivity() {
        int count = 10;
        Intent intent = null;
        switch (idItem5) {
            case 0:
                Intent intent2 = new Intent(this, HelpAuthor.class);
                startActivity(intent2);
                break;
            case 1:
                MainActivity.number = R.drawable.answege2015;
                intent = new Intent(this, Image.class);
                break;
            case 2:
                MainActivity.number = R.drawable.gia2015;
                intent = new Intent(this,Image.class);
                break;
            case 3:
                MainActivity.textNumber = R.string.Rt2_2016;
                intent = new Intent(this, TextActivity.class);
                break;
            case 4:
                MainActivity.textNumber = R.string.Rt3_2016;
                intent = new Intent(this, TextActivity.class);
                break;
            case 5:
                intent = new Intent(this, PartAB.class);
                this.number = 2011;
                break;
            case 6:
                intent = new Intent(this, PartAB.class);
                this.number = 2012;
                break;
            case 7:
                intent = new Intent(this, PartB.class);
                this.number = 2013;
                break;
            case 8:
                intent = new Intent(this, PartB.class);
                this.number = 2014;
                break;
            case 9:
                intent = new Intent(this, PartB.class);
                this.number = 2015;
                break;
        }
        if (idItem5 != -1 && idItem5 != count && idItem5 != 0) {
            startActivity(intent);
        }
    }
}
