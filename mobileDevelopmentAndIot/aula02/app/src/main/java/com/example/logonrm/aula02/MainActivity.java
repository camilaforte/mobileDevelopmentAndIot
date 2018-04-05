package com.example.logonrm.aula02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //criei a variável
    RadioGroup rdgProdutos;
    EditText edtMedida;
    CheckBox chkFrete;
    TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializar
        rdgProdutos = findViewById(R.id.rdgProdutos);
        edtMedida = findViewById(R.id.edtMedida);
        chkFrete = findViewById(R.id.chkFrete);
        txtResultado = findViewById(R.id.txtResultado);


    }

    public void calcular(View view) {

        //este é extra não precisava
        if (edtMedida.getText().toString().isEmpty()){
            Toast.makeText(this, "Informe a medida corretamente", Toast.LENGTH_LONG);
            return;
        }
        double resultado = 0;

        int selecionado = rdgProdutos.getCheckedRadioButtonId();

        switch (selecionado){
            case R.id.rgbPisoBranco:
                resultado = 24.9;
                break;
            case  R.id.rdbPisoAlabnia:
                resultado = 11.9;
                break;
            case R.id.rdbPorcelanato:
                resultado = 39.9;
                break;
            case R.id.rdbRevestimento:
                resultado = 16.9;
                break;
        }

        double medida = Double.parseDouble(edtMedida.getText().toString());

        resultado = resultado * medida;

        if (chkFrete.isChecked()){
            resultado *= 1.3;
        }

        //txtResultado.setText(String.valueOf(resultado));
        txtResultado.setText(String.format("RS %.2f", resultado));
    }
}
