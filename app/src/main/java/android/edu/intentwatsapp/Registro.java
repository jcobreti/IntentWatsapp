package android.edu.intentwatsapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    private Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Intent intent = getIntent();
        String id = intent.getStringExtra("VAR0");

        Toast toast = Toast.makeText(this, "VALOR= " + id, Toast.LENGTH_LONG);
        toast.show();

        boton = findViewById(R.id.botonClass);
        boton.setOnClickListener(new EscuchaBoton(this));

    }

    public void volver(View view)
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }


}