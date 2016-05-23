package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


public class Teoremy extends ListActivity {

    final String LOG_TAG = "myLogs";
    int idItem5 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teoremy);
        String[] classes = {"Помочь автору","Теорема Пифагора", "Теорема косинусов", "Теорема синусов", ""};//     18
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
            MainActivity.number = R.drawable.p7teoremapifagora;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 2) {
            MainActivity.number = R.drawable.p7teoremakosinusov;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
        if (idItem5 == 3) {
            MainActivity.number = R.drawable.p7teoremasinusov;
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
    }
}