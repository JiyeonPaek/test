package com.example.delay.restartprj;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by delay on 2016. 12. 21..
 */


import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

public class SubActivity extends Activity {
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        String id = intent.getStringExtra("입력한 id");

//       Person person = (Person) intent.getSerializableExtra("신상");
//
//        if (person == null)
//        {
//            Toast.makeText(this, "신상정보가 없습니다", Toast.LENGTH_SHORT).show();
//        }
//        else
//        {
//            Toast.makeText(this, person.getString(), Toast.LENGTH_SHORT).show();
//        }

        if(id.equals(""))
            Toast.makeText(this, "입력한 아이디가 없습니다", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "입력한 아이디는 "+ id + "입니다", Toast.LENGTH_SHORT).show();

        Button quic_button = (Button)findViewById(R.id.quic_button);

        quic_button.setOnClickListener(pjyListener);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private View.OnClickListener pjyListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent data = new Intent();
            data.putExtra("결과", "꺼져 박진영");

            test();

            setResult(RESULT_OK, data);

            finish();
        }
    };

    private String pjy = "";

    private void test()
    {
        Toast.makeText(this, "바보", Toast.LENGTH_LONG).show();
    }


}
