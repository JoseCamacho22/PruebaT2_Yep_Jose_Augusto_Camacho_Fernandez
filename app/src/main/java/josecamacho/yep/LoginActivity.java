package josecamacho.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Jose on 7/3/16.
 */
public class LoginActivity  extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        //getSupportActionBar().hide();

        TextView myTitle = (TextView)findViewById(R.id.title);
        Typeface myFont = Typeface.createFromAsset(getAssets(),"font/AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);

        TextView myTitle2 = (TextView)findViewById(R.id.subtitle);
        Typeface myFont1 = Typeface.createFromAsset(getAssets(),"font/AmaticSC-Regular.ttf");
        myTitle2.setTypeface(myFont1);


    }
    public void onclickLogin(View view) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }






}
