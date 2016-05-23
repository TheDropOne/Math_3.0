package by.thedrop.math;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;

public class Shpores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shpores);

        TextView title = (TextView)findViewById(R.id.labelShpores);
        ImageButton button = (ImageButton)findViewById(R.id.imageButtonShpori);

        assert title != null;
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri groupInVk = Uri.parse("http://vk.com/wowshpori");
                Intent goToGroup = new Intent(Intent.ACTION_VIEW,groupInVk);
                try{
                    startActivity(goToGroup);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });


        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri groupInVk = Uri.parse("http://vk.com/wowshpori");
                Intent goToGroup = new Intent(Intent.ACTION_VIEW,groupInVk);
                try{
                    startActivity(goToGroup);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
    }
}
