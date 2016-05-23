package by.thedrop.math;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


public class Perimetr extends ListActivity {
    final String LOG_TAG = "myLogs";
    int idItem5 = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class5);
        String[] classes = {"Помочь автору","Треугольник", "Квадрат", "Прямоугольник", "Параллелограмм", "Ромб", "Длина окружности", "Трапеция", "Длина дуги", ""};//     8
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
        int count = 9;//количество пунктов в списке
        switch (idItem5){
            case 0: {
                Intent intent = new Intent(this,HelpAuthor.class);
                startActivity(intent);
            } break;
            case 1: MainActivity.number = R.drawable.p1triangle;            break;
            case 2: MainActivity.number = R.drawable.p1kvadrat;             break;
            case 3: MainActivity.number = R.drawable.p1pryamougolnik;       break;
            case 4: MainActivity.number = R.drawable.p1parallelogram;       break;
            case 5: MainActivity.number = R.drawable.p1romb;                break;
            case 6: MainActivity.number = R.drawable.p1dlina_okruzhnosti;   break;
            case 7: MainActivity.number = R.drawable.p1trapecia;            break;
            case 8: MainActivity.number = R.drawable.p1dlina_dugi;          break;
        }
        if(idItem5!=-1 && idItem5!=count && idItem5!=0){
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_class5, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
