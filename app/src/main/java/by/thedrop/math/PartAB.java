package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


public class PartAB extends ListActivity {
    final String LOG_TAG = "myLogs";
    int idItem5 = -1;
    public static int number = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_ab);
        String[] classes = {"Помочь автору","A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12", "A13", "A14", "A15", "A16", "A17", "A18", "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10", "B11", "B12", ""};//     12
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
        int count = 31;
        if(EGE.number==2011){
            switch (idItem5){
                case 0:
                    Intent intent = new Intent(this,HelpAuthor.class);
                    startActivity(intent);
                    break;
                case 1: MainActivity.number = R.drawable.ct2011a1;              break;
                case 2: MainActivity.number = R.drawable.ct2011a2;              break;
                case 3: MainActivity.number = R.drawable.ct2011a3;              break;
                case 4: MainActivity.number = R.drawable.ct2011a4;              break;
                case 5: MainActivity.number = R.drawable.ct2011a5;              break;
                case 6: MainActivity.number = R.drawable.ct2011a6;              break;
                case 7: MainActivity.number = R.drawable.ct2011a7;              break;
                case 8: MainActivity.number = R.drawable.ct2011a8;              break;
                case 9: MainActivity.number = R.drawable.ct2011a9;              break;
                case 10: MainActivity.number = R.drawable.ct2011a10;             break;
                case 11: MainActivity.number = R.drawable.ct2011a11;            break;
                case 12: MainActivity.number = R.drawable.ct2011a12;            break;
                case 13: MainActivity.number = R.drawable.ct2011a13;              break;
                case 14: MainActivity.number = R.drawable.ct2011a14;              break;
                case 15: MainActivity.number = R.drawable.ct2011a15;              break;
                case 16: MainActivity.number = R.drawable.ct2011a16;              break;
                case 17: MainActivity.number = R.drawable.ct2011a17;              break;
                case 18: MainActivity.number = R.drawable.ct2011a18;              break;


                case 19: MainActivity.number = R.drawable.ct2011b1;              break;
                case 20: MainActivity.number = R.drawable.ct2011b2;              break;
                case 21: MainActivity.number = R.drawable.ct2011b3;              break;
                case 22: MainActivity.number = R.drawable.ct2011b4;              break;
                case 23: MainActivity.number = R.drawable.ct2011b5;              break;
                case 24: MainActivity.number = R.drawable.ct2011b6;              break;
                case 25: MainActivity.number = R.drawable.ct2011b7;              break;
                case 26: MainActivity.number = R.drawable.ct2011b8;              break;
                case 27: MainActivity.number = R.drawable.ct2011b9;              break;
                case 28: MainActivity.number = R.drawable.ct2011b10;             break;
                case 29: MainActivity.number = R.drawable.ct2011b11;            break;
                case 30: MainActivity.number = R.drawable.ct2011b12;            break;
            }
        }
        if(EGE.number==2012){
            switch (idItem5){
                case 0: {
                    Intent intent2 = new Intent(this, HelpAuthor.class);
                    startActivity(intent2);
                } break;
                case 1: MainActivity.number = R.drawable.ct2012a1;              break;
                case 2: MainActivity.number = R.drawable.ct2012a2;              break;
                case 3: MainActivity.number = R.drawable.ct2012a3;              break;
                case 4: MainActivity.number = R.drawable.ct2012a4;              break;
                case 5: MainActivity.number = R.drawable.ct2012a5;              break;
                case 6: MainActivity.number = R.drawable.ct2012a6;              break;
                case 7: MainActivity.number = R.drawable.ct2012a7;              break;
                case 8: MainActivity.number = R.drawable.ct2012a8;              break;
                case 9: MainActivity.number = R.drawable.ct2012a9;              break;
                case 10: MainActivity.number = R.drawable.ct2012a10;             break;
                case 11: MainActivity.number = R.drawable.ct2012a11;            break;
                case 12: MainActivity.number = R.drawable.ct2012a12;            break;
                case 13: MainActivity.number = R.drawable.ct2012a1;              break;
                case 14: MainActivity.number = R.drawable.ct2012a2;              break;
                case 15: MainActivity.number = R.drawable.ct2012a3;              break;
                case 16: MainActivity.number = R.drawable.ct2012a4;              break;
                case 17: MainActivity.number = R.drawable.ct2012a5;              break;
                case 18: MainActivity.number = R.drawable.ct2012a6;              break;


                case 19: MainActivity.number = R.drawable.ct2012b1;              break;
                case 20: MainActivity.number = R.drawable.ct2012b2;              break;
                case 21: MainActivity.number = R.drawable.ct2012b3;              break;
                case 22: MainActivity.number = R.drawable.ct2012b4;              break;
                case 23: MainActivity.number = R.drawable.ct2012b5;              break;
                case 24: MainActivity.number = R.drawable.ct2012b6;              break;
                case 25: MainActivity.number = R.drawable.ct2012b7;              break;
                case 26: MainActivity.number = R.drawable.ct2012b8;              break;
                case 27: MainActivity.number = R.drawable.ct2012b9;              break;
                case 28: MainActivity.number = R.drawable.ct2012b10;             break;
                case 29: MainActivity.number = R.drawable.ct2012b11;            break;
                case 30: MainActivity.number = R.drawable.ct2012b12;            break;
            }
        }
        if(idItem5!=-1 && idItem5!=count && idItem5!=0){
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
    }
}

