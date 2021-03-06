package example.codeclan.com.myfoodtracker.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import example.codeclan.com.myfoodtracker.R;

public class LauncherActivity extends AppCompatActivity {

    private EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        //STOP THE KEYBOARD FROM POPPING UP WHEN THE PAGE LOADS
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        userName = (EditText) findViewById(R.id.user_name);


    }

    public void onEnterButtonClicked(View view){
        Log.d(getClass().toString(), "onEnterButtonClicked");

        String nameUserEntered = userName.getText().toString();
        Log.d(getClass().toString(), nameUserEntered);


        Intent intent = new Intent(this, NavigationActivity.class);
        intent.putExtra("nameUserEntered", nameUserEntered);
        startActivity(intent);
    }



}
