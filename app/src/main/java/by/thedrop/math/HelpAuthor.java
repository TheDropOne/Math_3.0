package by.thedrop.math;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.appodeal.ads.Appodeal;

public class HelpAuthor extends AppCompatActivity {
    final String LOG_TAG = "myLogs";
    int idItem5 = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_author);

        String[] classes = {"Посмотреть рекламу","Написать хороший отзыв:)","Вступить в нашу группу вк","Рассказать друзьям!", ""};//     18
        ListView list = (ListView) findViewById(R.id.listHelp);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(list.getContext(), R.layout.my_list_item, classes);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
        switch(idItem5){
            case 0: {
                if (Appodeal.isLoaded(Appodeal.INTERSTITIAL)) {
                    Appodeal.show(this, Appodeal.INTERSTITIAL);
                }
            } break;
            case 1:
                Uri appInMarket = Uri.parse("market://details?id=" + getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW,appInMarket);
                try{
                    startActivity(goToMarket);
                }catch (Exception ex){
                    ex.printStackTrace();
                    Toast.makeText(this,"Что-то пошло не так", Toast.LENGTH_SHORT).show();
                }
                break;
            case 2:
                Uri groupInVk = Uri.parse("http://vk.com/club114807844");
                Intent goToGroup = new Intent(Intent.ACTION_VIEW,groupInVk);
                try{
                    startActivity(goToGroup);
                }catch (Exception ex){
                    ex.printStackTrace();
                    Toast.makeText(this,"Что-то пошло не так", Toast.LENGTH_SHORT).show();
                }
                break;
            case 3:
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String textToSend = "Готовься к экзаменам по математике с приложением \"Все формулы. Математика\". Ответы и решения ЦТ и ЕГЭ, формулы, задачи и много всего еще! \n play.google.com/store/apps/details?id=by.thedrop.math";
                shareIntent.putExtra(Intent.EXTRA_TEXT, textToSend);
                startActivity(Intent.createChooser(shareIntent,"Поделиться!"));
                break;
        }
    }
}
