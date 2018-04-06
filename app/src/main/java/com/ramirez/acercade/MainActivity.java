package com.ramirez.acercade;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     private Button compartir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compartir = findViewById(R.id.buttonShare);

        compartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent ();
                sendIntent.setAction (Intent.ACTION_SEND);
                sendIntent.putExtra (Intent.EXTRA_STREAM,
                        Uri.parse("android.resource://com.ramirez.acercade/drawable/" + Integer.toString(R.drawable.sii)));
                sendIntent.setType ("image/*");
                startActivity (sendIntent);
            }
        });
    }
}
