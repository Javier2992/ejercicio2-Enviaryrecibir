package javier.gonzalez.ejercicio2_enviaryrecibir;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import modelos.bici;
import modelos.coche;
import modelos.moto;

public class MainActivity extends AppCompatActivity {
    private Button btnCoches;
    private Button btnMotos;
    private Button btnBicis;
    private TextView textViewCoches;
    private TextView textViewMotos;
    private TextView textViewBicis;

    // Atributos para los launchers

    private ActivityResultLauncher<Intent> launcherCoches;
    private ActivityResultLauncher<Intent> launcherMotos;
    private ActivityResultLauncher<Intent> launcherBicis;

    // Atributos para la logica
    private ArrayList<coche> listaCoches;
    private ArrayList<moto> listaMotos;
    private ArrayList<bici> listaBicis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializar();
    }


    public void inicializar(){
        // Inicializar Vista
        textViewBicis=findViewById(R.id.textViewBicis);
        textViewCoches=findViewById(R.id.textViewCoches);
        textViewMotos=findViewById(R.id.textViewMotos);

        btnCoches= findViewById(R.id.btnCoches);
        btnMotos=findViewById(R.id.btnMotos);
        btnBicis=findViewById(R.id.btnBicis);

        //Inicializar Logica
        listaCoches=new ArrayList<>();
        listaMotos = new ArrayList<>();
        listaBicis = new ArrayList<>();
    }
}