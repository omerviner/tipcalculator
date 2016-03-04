package com.example.viner.tipcalculator;
import android.content.Intent;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get view by id button, txtbox(get text), checkbox(..)
        // click listener, function to happen when clicked

    }

    /**
     * Calculate tip and updates mount.
     * Called when the user clicks CALCULATE button.
     */
    public void calcTip(View view){

        Button btn = (Button)findViewById(R.id.btnCalculate);
        CheckBox chkRound = (CheckBox)findViewById(R.id.chkRound);
        TextView txtTipResult = (TextView)findViewById(R.id.txtTipResult);
        EditText edtBillAmount = (EditText)findViewById(R.id.edtBillAmount);
        String mountStr = edtBillAmount.getText().toString();
        int mount = 0;

        try {
            mount = Integer.parseInt(mountStr);
        } catch(NumberFormatException ex){
            // do nothing if mount is not a number
        }

        double tip = mount*0.12;

        if (chkRound.isChecked()){
            tip = Math.round(tip);
        }
        txtTipResult.setText(String.valueOf(tip)+"$");
    }
}
