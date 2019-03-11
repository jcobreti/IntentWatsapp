package android.edu.intentwatsapp;

import android.content.Context;
import android.view.View;
import android.widget.Button;

public class EscuchaBoton implements View.OnClickListener {

    Context actividad;

    public EscuchaBoton(Context contexto) {

        this.actividad=contexto;
    }

    @Override
    public void onClick (View v) {


        Registro act= (Registro) this.actividad;
        Button b=act.findViewById(R.id.botonClass);

        String mm=b.getText().toString();

        if (v.getId()==R.id.botonClass)
            b.setText("TEXTO DESDE LA CLASE");
        else
            b.setText("XXXXXXX");


    }
}
