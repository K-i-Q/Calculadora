package up.edu.br.calculadora1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Double valorUm = 0.0;
    Double valorDois = 0.0;
    String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicar(View v) {
        EditText txtResultado = findViewById(R.id.txtResultado);
        if (v.getId() == R.id.btnSete) {
            txtResultado.setText(txtResultado.getText() + "7");
        }
        if (v.getId() == R.id.btnPonto) {
            if (!txtResultado.getText().toString().contains(".")){
                txtResultado.setText(txtResultado.getText() + ".");
            }
        }
        if (v.getId() == R.id.btnOito) {
            txtResultado.setText(txtResultado.getText() + "8");
        }
        if (v.getId() == R.id.btnQuatro) {
            txtResultado.setText(txtResultado.getText()+ "4");
        }
        if (v.getId() == R.id.btnCinco) {
            txtResultado.setText(txtResultado.getText() + "5");
        }
        if (v.getId() == R.id.btnSeis) {
            txtResultado.setText(txtResultado.getText() + "6");
        }
        if (v.getId() == R.id.btnUm) {
            txtResultado.setText(txtResultado.getText()+ "1");
        }
        if (v.getId() == R.id.btnDois) {
            txtResultado.setText(txtResultado.getText() + "2");
        }
        if (v.getId() == R.id.btnTres) {
            txtResultado.setText(txtResultado.getText() + "3");
        }
        if (v.getId() == R.id.btnNove) {
            txtResultado.setText(txtResultado.getText()+ "9");
        }
        if (v.getId() == R.id.btnZero) {
            txtResultado.setText(txtResultado.getText()+ "0");
        }

        if (v.getId() == R.id.btnApagar) {
            txtResultado.setText("");
        }


        if (v.getId() == R.id.btnMais) {
            valorUm = Double.parseDouble(txtResultado.
                    getText().toString());
            txtResultado.setText("");
            operacao = "+";
        }
        if (v.getId() == R.id.btnMenos) {
            valorUm = Double.parseDouble(txtResultado.
                    getText().toString());
            txtResultado.setText("");
            operacao = "-";
        }
        if (v.getId() == R.id.btnPotencia) {
            valorUm = Double.parseDouble(txtResultado.
                    getText().toString());
            txtResultado.setText("");
            operacao = "^";
        }
        if (v.getId() == R.id.btnRaiz) {
            valorUm = Double.parseDouble(txtResultado.
                    getText().toString());
            //txtResultado.setText("");
            operacao = "~";
        }


        if (v.getId() == R.id.btnIgual) {
            valorDois = Double.parseDouble(txtResultado.
                    getText().toString());
            if (operacao == "+") {
                Double resultado = valorUm + valorDois;
                txtResultado.setText(resultado.toString());
            }
            if (operacao == "-") {
                Double resultado = valorUm - valorDois;
                txtResultado.setText(resultado.toString());
            }
            if (operacao == "^") {

                Double resultado = Math.pow(valorUm,valorDois);
                txtResultado.setText(resultado.toString());
            }
            if (operacao == "~") {
                Double resultado = Math.pow(valorUm,0.5);
                txtResultado.setText(resultado.toString());
            }
        }


        Toast.makeText(this,
                "Oieeee",
                Toast.LENGTH_LONG).show();

    }
}
