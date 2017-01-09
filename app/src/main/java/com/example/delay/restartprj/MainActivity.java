package com.example.delay.restartprj;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import android.content.Intent;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);



      /** EditText editId = (EditText) findViewById(R.id.edit_id);
        EditText editPassword = (EditText) findViewById(R.id.edit_password);
        Button btnLogin = (Button) findViewById(R.id.btn_login);

        editId.setText(">.<");
        editId.setTextColor(0xFFFF0000);
        editId.setTextSize(TypedValue.COMPLEX_UNIT_SP, 70);*/

    }

    public void onClick(View view)
    {
        // user input id ,,, and get it....
        EditText editId = (EditText) findViewById(R.id.edit_id);
        String id = editId.getText().toString();


        Intent intent = new Intent(MainActivity.this, SubActivity.class);
        intent.putExtra("입력한 id", id);
        startActivityForResult(intent, 0);
        //intent.putExtra("신상", new Person("Ji Yoen", "Female", "DelaySoft"));

//        startActivity(intent);
    }

    private String pjy = "";

    private void test()
    {
        pjy = "a;sdf";
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode != RESULT_OK)
        {
            return;
        }

        switch (requestCode)
        {
            case 0:
                test();
                 Toast.makeText(this, data.getStringExtra("결과"), Toast.LENGTH_LONG).show();

                break;
        }
    }
}
