package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


public class PartB extends ListActivity {
    final String LOG_TAG = "myLogs";
    int idItem5 = -1;
    public static int number = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_b);
        String[] classes = {"Помочь автору","B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10", "B11", "B12", ""};//     12
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
        int count = 13;
        if(EGE.number==2013){
            switch (idItem5){
                case 0:
                    Intent intent = new Intent(this,HelpAuthor.class);
                    startActivity(intent);
                    break;
                case 1: MainActivity.number = R.drawable.ct2013b1;              break;
                case 2: MainActivity.number = R.drawable.ct2013b2;              break;
                case 3: MainActivity.number = R.drawable.ct2013b3;              break;
                case 4: MainActivity.number = R.drawable.ct2013b4;              break;
                case 5: MainActivity.number = R.drawable.ct2013b5;              break;
                case 6: MainActivity.number = R.drawable.ct2013b6;              break;
                case 7: MainActivity.number = R.drawable.ct2013b7;              break;
                case 8: MainActivity.number = R.drawable.ct2013b8;              break;
                case 9: MainActivity.number = R.drawable.ct2013b9;              break;
                case 10: MainActivity.number = R.drawable.ct2013b10;             break;
                case 11: MainActivity.number = R.drawable.ct2013b11;            break;
                case 12: MainActivity.number = R.drawable.ct2013b12;            break;
            }
        }
        if(EGE.number==2014){
            switch (idItem5){
                case 0: {
                    Intent intent2 = new Intent(this, HelpAuthor.class);
                    startActivity(intent2);
                } break;
                case 1: MainActivity.number = R.drawable.ct2014b1;              break;
                case 2: MainActivity.number = R.drawable.ct2014b2;              break;
                case 3: MainActivity.number = R.drawable.ct2014b3;              break;
                case 4: MainActivity.number = R.drawable.ct2014b4;              break;
                case 5: MainActivity.number = R.drawable.ct2014b5;              break;
                case 6: MainActivity.number = R.drawable.ct2014b6;              break;
                case 7: MainActivity.number = R.drawable.ct2014b7;              break;
                case 8: MainActivity.number = R.drawable.ct2014b8;              break;
                case 9: MainActivity.number = R.drawable.ct2014b9;              break;
                case 10: MainActivity.number = R.drawable.ct2014b10;             break;
                case 11: MainActivity.number = R.drawable.ct2014b11;            break;
                case 12: MainActivity.number = R.drawable.ct2014b12;            break;
            }
        }
        if(EGE.number==2015){
            switch (idItem5){
                case 0: {
                    Intent intent2 = new Intent(this, HelpAuthor.class);
                    startActivity(intent2);
                } break;
                case 1: MainActivity.number = R.drawable.ct2015b1;              break;
                case 2: MainActivity.number = R.drawable.ct2015b2;              break;
                case 3: MainActivity.number = R.drawable.ct2015b3;              break;
                case 4: MainActivity.number = R.drawable.ct2015b4;              break;
                case 5: MainActivity.number = R.drawable.ct2015b5;              break;
                case 6: MainActivity.number = R.drawable.ct2015b6;              break;
                case 7: MainActivity.number = R.drawable.ct2015b7;              break;
                case 8: MainActivity.number = R.drawable.ct2015b8;              break;
                case 9: MainActivity.number = R.drawable.ct2015b9;              break;
                case 10: MainActivity.number = R.drawable.ct2015b10;             break;
                case 11: MainActivity.number = R.drawable.ct2015b11;            break;
                case 12: MainActivity.number = R.drawable.ct2015b12;            break;
            }
        }
        if(idItem5!=-1 && idItem5!=count && idItem5!=0){
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
    }
}

