package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


public class ObuomTel extends ListActivity {
    final String LOG_TAG = "myLogs";
    int idItem5 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class8);
        String[] classes = {"Помочь автору","Куб", "Параллелепипед", "Тетраэдр", "Пирамида", "Правильная пирамида",
                "Правильная треугольная пирамида", "Правильная четырехугольная пирамида", "Конус", "Усеченная пирамида", "Усеченный конус", ""};//     18
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
        switch(idItem5){
            case 0:
                Intent intent = new Intent(this,HelpAuthor.class);
                startActivity(intent);
                break;
            case 1 :MainActivity.number = R.drawable.p4kub;                 break;
            case 2: MainActivity.number = R.drawable.p4parallelepiped;      break;
            case 3: MainActivity.number = R.drawable.p4tetraedr;            break;
            case 4: MainActivity.number = R.drawable.p4pyramid;             break;
            case 5: MainActivity.number = R.drawable.p4pravilnpiramida;     break;
            case 6: MainActivity.number = R.drawable.p4pravilntreugpiramyd; break;
            case 7: MainActivity.number = R.drawable.p4pravilnchetpiramida; break;
            case 8: MainActivity.number = R.drawable.p4konus;               break;
            case 9: MainActivity.number = R.drawable.p4usechennayapiramida; break;
            case 10: MainActivity.number = R.drawable.p4usechenniikonus;     break;
            case 11: b = false;                                             break;
        }
        if(b && idItem5!=0){
            Intent intent = new Intent(this, Image.class);
            startActivity(intent);
        }
    }

}
