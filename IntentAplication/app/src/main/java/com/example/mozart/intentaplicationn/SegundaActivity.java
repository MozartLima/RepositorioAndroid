package com.example.mozart.intentaplicationn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        TextView exibirTextView = (TextView) findViewById(R.id.exibirTextView);
        exibirTextView.setText(bundle.getString("nome")) ;

    }
}
