package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText editAlcool;
private EditText editGasolina;
private TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcool= findViewById(R.id.editAlcool);
        editGasolina= findViewById(R.id.editGasolina);
        resultado = findViewById(R.id.resultado);
    }

    public void calcular(View view){
        double precoGasolina=0;
        double precoAlcool=0;
       if(editGasolina.getText().toString() != "" && editAlcool.getText().toString() != "") {
            precoGasolina = Double.parseDouble(editGasolina.getText().toString());
            precoAlcool = Double.parseDouble(editAlcool.getText().toString());

       }
       else{

           resultado.setText("por favor digite um valor maior que zero em todos os campos");

       }

        if(precoAlcool > 0 && precoGasolina > 0 ) {

            if (precoGasolina > precoAlcool) {
                resultado.setText("Neste instante opte por usar Alcool");
            } else if (precoGasolina == precoAlcool) {
                resultado.setText("qualquer alternativa será suficiente");
            } else {
                resultado.setText("opte por usar gasolina será mais viavel");

            }
        }
    }

    public EditText getEditAlcool() {
        return editAlcool;
    }

    public void setEditAlcool(EditText editAlcool) {
        this.editAlcool = editAlcool;
    }

    public EditText getEditGasolina() {
        return editGasolina;
    }

    public void setEditGasolina(EditText editGasolina) {
        this.editGasolina = editGasolina;
    }

    public TextView getResultado() {
        return resultado;
    }

    public void setResultado(TextView resultado) {
        this.resultado = resultado;
    }
}