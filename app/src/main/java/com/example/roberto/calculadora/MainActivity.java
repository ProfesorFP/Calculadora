package com.example.roberto.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity{

    private EditText txtNumero;
    private String numero;

    public void onClickBtn0(View v){
        numero = txtNumero.getText().toString();
        numero = numero + "0";
        txtNumero.setText(numero);
    }
    public void onClickBtn1(View v){
        numero = txtNumero.getText().toString();
        numero = numero + "1";
        txtNumero.setText(numero);
    }
    public void onClickBtn2(View v){
        numero = txtNumero.getText().toString();
        numero = numero + "2";
        txtNumero.setText(numero);
    }
    public void onClickBtn3(View v){
        numero = txtNumero.getText().toString();
        numero = numero + "3";
        txtNumero.setText(numero);
    }
    public void onClickBtn4(View v){
        numero = txtNumero.getText().toString();
        numero = numero + "4";
        txtNumero.setText(numero);
    }
    public void onClickBtn5(View v){
        numero = txtNumero.getText().toString();
        numero = numero + "5";
        txtNumero.setText(numero);
    }
    public void onClickBtn6(View v){
        numero = txtNumero.getText().toString();
        numero = numero + "6";
        txtNumero.setText(numero);
    }
    public void onClickBtn7(View v){
        numero = txtNumero.getText().toString();
        numero = numero + "7";
        txtNumero.setText(numero);
    }
    public void onClickBtn8(View v){
        numero = txtNumero.getText().toString();
        numero = numero + "8";
        txtNumero.setText(numero);
    }
    public void onClickBtn9(View v){
        numero = txtNumero.getText().toString();
        numero = numero + "9";
        txtNumero.setText(numero);
    }
    public void onClickBtnBack(View v){

    }
    public void onClickBtnCE(View v){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero = (EditText) findViewById(R.id.txtNumero);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
