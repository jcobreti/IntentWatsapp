package android.edu.intentwatsapp;

import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irRegistro(View view)
    {
        Intent intent=new Intent(this,Registro.class);
        intent.putExtra("VAR0","VALOR1");
        startActivity(intent);
    }
    public void irWS_V0 (View view)
    {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "enviar");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
    public void irWS (View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Texto a Enviar.");
        sendIntent.setType("text/plain");
        sendIntent.setPackage("com.whatsapp");
        startActivity(sendIntent);
    }
    public void irInternet(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.es"));
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

        // TODO esto solo funciona a partir de la version 16
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN)
        {this.finishAffinity(); //Me voy del todo
        }
        else
        {super.onBackPressed();
        }
    }

}

