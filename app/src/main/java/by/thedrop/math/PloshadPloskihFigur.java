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


public class PloshadPloskihFigur extends ListActivity {
    final String LOG_TAG = "myLogs";
    int idItem5 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class6);
        String[] classes = {"Помочь автору","Квадрат", "Круг", "Прямоугольник", "Прямоугольный треугольник", "Равноберенный треугольник", "Равносторонний треугольник", "Треугольник", "Треугольник(2 стороны и угол)", "Треугольник(сторона и 2 угла)", "Треугольник(Формула Герона)", "Ромб", "Параллелограмм", "Трапеция", "Правильный многоугольник", "Кольцо", "Эллипс", "Сектор кольца", "Сектор круга", ""};//     18
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


    public void whatActivity(){
        if(idItem5==0) {
            Intent intent = new Intent(this,HelpAuthor.class);
            startActivity(intent);
        }
        if(idItem5 == 1){
            MainActivity.number = R.drawable.p2kvadrat;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 2){
            MainActivity.number = R.drawable.p2krug;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 3){
            MainActivity.number = R.drawable.p2pryamougolnik;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 4){
            MainActivity.number = R.drawable.p2pryamtriangle;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 5){
            MainActivity.number = R.drawable.p2ravnobedrtriangle;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 6){
            MainActivity.number = R.drawable.p2ravnostortriangle;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 7){
            MainActivity.number = R.drawable.p2triangle;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 8){
            MainActivity.number = R.drawable.p2triangle2storiugol;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 9){
            MainActivity.number = R.drawable.p2trianglestoronai2ugla;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 10){
            MainActivity.number = R.drawable.p2trianglegeron;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 11){
            MainActivity.number = R.drawable.p2romb;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 12){
            MainActivity.number = R.drawable.p2parallelogam;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 13){
            MainActivity.number = R.drawable.p2trapecia;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 14){
            MainActivity.number = R.drawable.p2pravmnogougolnik;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 15){
            MainActivity.number = R.drawable.p2kolco;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 16){
            MainActivity.number = R.drawable.p2ellipce;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 17){
            MainActivity.number = R.drawable.p2sectorkolca;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
        if(idItem5 == 18){
            MainActivity.number = R.drawable.p2sectorkruga;
            Intent intent = new Intent(this,Image.class);
            startActivity(intent);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_class6, menu);
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
