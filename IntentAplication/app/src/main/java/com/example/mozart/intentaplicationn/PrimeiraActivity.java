package com.example.mozart.intentaplicationn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class PrimeiraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;
        setContentView(R.layout.activity_primeira) ;
    }

    public void clicando (View view) {

        EditText nome = (EditText) findViewById(R.id.nomeEditText);
        String info = nome.getText().toString();

        Log.i("Logcat", info);
        Toast t = Toast.makeText (this, info, Toast.LENGTH_SHORT );
        t.show();



        Bundle bundle = new Bundle();
        bundle.putString("nome",nome.getText().toString());

        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtras(bundle);

        startActivity(intent);


    }




}
