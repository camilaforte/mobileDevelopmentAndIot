package br.com.fiap.aula01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recupero o objeto do xml
        edtNome = findViewById(R.id.edtNome);
    }

    public void salvar(View view) {
        String nome = edtNome.getText().toString();
        //balaozinho
        Toast.makeText(this,
                getString(R.string.seu_nome_eh) + nome,
                Toast.LENGTH_LONG).show();
    }
}