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

public class SolutionTasks extends ListActivity {
    final String LOG_TAG = "myLogs";
    int idItem5 = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution_tasks);
        String[] classes = {"Помочь автору",

                "8.001","8.002","8.003","8.004","8.005","8.006","8.007","8.008","8.009","8.010",
                "8.011","8.012","8.013","8.014","8.015","8.016","8.017","8.018","8.019","8.020","8.021",
                "8.022","8.023","8.024","8.025","8.026","8.027","8.028","8.029","8.030",

                "10.001","10.002","10.003","10.004","10.005","10.006","10.007","10.008","10.009","10.010",
                "10.011","10.012","10.013","10.014","10.015","10.016","10.017","10.018","10.019","10.020",
                "10.021","10.022","10.023","10.024","10.025",

                "11.001","11.002","11.003","11.004","11.005","11.006","11.007","11.008","11.009","11.010",
                "11.011","11.012","11.013","11.014","11.015","11.016","11.017","11.018","11.019","11.020",

                "12.001","12.002","12.003","12.004","12.005","12.006","12.007","12.008","12.009","12.010",
                "12.011","12.012","12.013","12.014","12.015","12.016","12.017","12.018","12.019","12.020",
                "12.021","12.022","12.023","12.024","12.025",
                ""};//     90
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
        int count = 101;//количество пунктов в списке
        switch (idItem5){
            case 0: {
                Intent intent = new Intent(this,HelpAuthor.class);
                startActivity(intent);
            } break;
            case 1: MainActivity.number = R.drawable.sol8001;               break;
            case 2: MainActivity.number = R.drawable.sol8002;               break;
            case 3: MainActivity.number = R.drawable.sol8003;               break;
            case 4: MainActivity.number = R.drawable.sol8004;               break;
            case 5: MainActivity.number = R.drawable.sol8005;               break;
            case 6: MainActivity.number = R.drawable.sol8006;               break;
            case 7: MainActivity.number = R.drawable.sol8007;               break;
            case 8: MainActivity.number = R.drawable.sol8008;               break;
            case 9: MainActivity.number = R.drawable.sol8009;               break;
            case 10: MainActivity.number = R.drawable.sol80010;             break;
            case 11: MainActivity.number = R.drawable.sol80011;             break;
            case 12: MainActivity.number = R.drawable.sol80012;             break;
            case 13: MainActivity.number = R.drawable.sol80013;             break;
            case 14: MainActivity.number = R.drawable.sol80014;             break;
            case 15: MainActivity.number = R.drawable.sol80015;             break;
            case 16: MainActivity.number = R.drawable.sol80016;             break;
            case 17: MainActivity.number = R.drawable.sol80017;             break;
            case 18: MainActivity.number = R.drawable.sol80018;             break;
            case 19: MainActivity.number = R.drawable.sol80019;             break;
            case 20: MainActivity.number = R.drawable.sol80020;             break;
            case 21: MainActivity.number = R.drawable.sol80021;             break;
            case 22: MainActivity.number = R.drawable.sol80022;             break;
            case 23: MainActivity.number = R.drawable.sol80023;             break;
            case 24: MainActivity.number = R.drawable.sol80024;             break;
            case 25: MainActivity.number = R.drawable.sol80025;             break;
            case 26: MainActivity.number = R.drawable.sol80026;             break;
            case 27: MainActivity.number = R.drawable.sol80027;             break;
            case 28: MainActivity.number = R.drawable.sol80028;             break;
            case 29: MainActivity.number = R.drawable.sol80029;             break;
            case 30: MainActivity.number = R.drawable.sol80030;             break;

            case 31: MainActivity.number = R.drawable.sol10001;             break;
            case 32: MainActivity.number = R.drawable.sol10002;             break;
            case 33: MainActivity.number = R.drawable.sol10003;             break;
            case 34: MainActivity.number = R.drawable.sol10004;             break;
            case 35: MainActivity.number = R.drawable.sol10005;             break;
            case 36: MainActivity.number = R.drawable.sol10006;             break;
            case 37: MainActivity.number = R.drawable.sol10007;             break;
            case 38: MainActivity.number = R.drawable.sol10008;             break;
            case 39: MainActivity.number = R.drawable.sol10009;             break;
            case 40: MainActivity.number = R.drawable.sol10010;             break;
            case 41: MainActivity.number = R.drawable.sol10011;             break;
            case 42: MainActivity.number = R.drawable.sol10012;             break;
            case 43: MainActivity.number = R.drawable.sol10013;             break;
            case 44: MainActivity.number = R.drawable.sol10014;             break;
            case 45: MainActivity.number = R.drawable.sol10015;             break;
            case 46: MainActivity.number = R.drawable.sol10016;             break;
            case 47: MainActivity.number = R.drawable.sol10017;             break;
            case 48: MainActivity.number = R.drawable.sol10018;             break;
            case 49: MainActivity.number = R.drawable.sol10019;             break;
            case 50: MainActivity.number = R.drawable.sol10020;             break;
            case 51: MainActivity.number = R.drawable.sol10021;             break;
            case 52: MainActivity.number = R.drawable.sol10022;             break;
            case 53: MainActivity.number = R.drawable.sol10023;             break;
            case 54: MainActivity.number = R.drawable.sol10024;             break;
            case 55: MainActivity.number = R.drawable.sol10025;             break;

            case 56: MainActivity.number = R.drawable.sol11001;             break;
            case 57: MainActivity.number = R.drawable.sol11002;             break;
            case 58: MainActivity.number = R.drawable.sol11003;             break;
            case 59: MainActivity.number = R.drawable.sol11004;             break;
            case 60: MainActivity.number = R.drawable.sol11005;             break;
            case 61: MainActivity.number = R.drawable.sol11006;             break;
            case 62: MainActivity.number = R.drawable.sol11007;             break;
            case 63: MainActivity.number = R.drawable.sol11008;             break;
            case 64: MainActivity.number = R.drawable.sol11009;             break;
            case 65: MainActivity.number = R.drawable.sol11010;             break;
            case 66: MainActivity.number = R.drawable.sol11011;             break;
            case 67: MainActivity.number = R.drawable.sol11012;             break;
            case 68: MainActivity.number = R.drawable.sol11013;             break;
            case 69: MainActivity.number = R.drawable.sol11014;             break;
            case 70: MainActivity.number = R.drawable.sol11015;             break;
            case 71: MainActivity.number = R.drawable.sol11016;             break;
            case 72: MainActivity.number = R.drawable.sol11017;             break;
            case 73: MainActivity.number = R.drawable.sol11018;             break;
            case 74: MainActivity.number = R.drawable.sol11019;             break;
            case 75: MainActivity.number = R.drawable.sol11020;             break;

            case 76: MainActivity.number = R.drawable.sol12001;             break;
            case 77: MainActivity.number = R.drawable.sol12002;             break;
            case 78: MainActivity.number = R.drawable.sol12003;             break;
            case 79: MainActivity.number = R.drawable.sol12004;             break;
            case 80: MainActivity.number = R.drawable.sol12005;             break;
            case 81: MainActivity.number = R.drawable.sol12006;             break;
            case 82: MainActivity.number = R.drawable.sol12007;             break;
            case 83: MainActivity.number = R.drawable.sol12008;             break;
            case 84: MainActivity.number = R.drawable.sol12009;             break;
            case 85: MainActivity.number = R.drawable.sol12010;             break;
            case 86: MainActivity.number = R.drawable.sol12011;             break;
            case 87: MainActivity.number = R.drawable.sol12012;             break;
            case 88: MainActivity.number = R.drawable.sol12013;             break;
            case 89: MainActivity.number = R.drawable.sol12014;             break;
            case 90: MainActivity.number = R.drawable.sol12015;             break;
            case 91: MainActivity.number = R.drawable.sol12016;             break;
            case 92: MainActivity.number = R.drawable.sol12017;             break;
            case 93: MainActivity.number = R.drawable.sol12018;             break;
            case 94: MainActivity.number = R.drawable.sol12019;             break;
            case 95: MainActivity.number = R.drawable.sol12020;             break;
            case 96: MainActivity.number = R.drawable.sol12021;             break;
            case 97: MainActivity.number = R.drawable.sol12022;             break;
            case 98: MainActivity.number = R.drawable.sol12023;             break;
            case 99: MainActivity.number = R.drawable.sol12024;             break;
            case 100: MainActivity.number = R.drawable.sol12025;            break;
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