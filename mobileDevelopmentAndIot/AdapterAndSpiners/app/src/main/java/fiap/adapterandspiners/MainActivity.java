package fiap.adapterandspiners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //criar todos os objetos
    Spinner spnPaises;
    //criar array de paises
    String[]paises={"Angola", "Bulgaria", "China", "Dinamarca", "Estonia", "França"};

    AutoCompleteTextView actEstadosBrasil;
    String[]estados = {"Amapa", "Bahia", "Ceará", "Distrito Federal", "Espirito Santo", "Goias"};

    DatePicker dtpDataNasc;

    TimePicker tmpHoraNasc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializa as variaveis

        //inicializa
        spnPaises = findViewById(R.id.spnPaises);
        //adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        this,
        android.R.layout.simple_list_item_1,
        paises
        );
        //setando o spiner com  adapter criado
        spnPaises.setAdapter(adapter);


        //inicializa
        actEstadosBrasil = findViewById(R.id.actEstadosBrasil);
        //criar o array
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(
        this,
        android.R.layout.simple_list_item_1,
        estados
        );
        //setar o autocomplete com o adapter criado
        actEstadosBrasil.setAdapter(adapter1);

        //inicializa
        dtpDataNasc = findViewById(R.id.dtpDataNasc);

        //inicializa
        tmpHoraNasc = findViewById(R.id.tmpHoraNasc);
    }

    public void salvar(View view) {

        int dia = dtpDataNasc.getDayOfMonth();
        int mes = dtpDataNasc.getMonth()+1; //porque vai até 11
        int ano = dtpDataNasc.getYear();

        int hora = tmpHoraNasc.getCurrentHour();
        int minuto = tmpHoraNasc.getCurrentMinute();

        //concatenar e formatar
        String msg = String.format("Vc selecionou: %d/%d/%d - %d:%d", dia, mes, ano, hora, minuto);

        //exibir msg em balaozinho
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
