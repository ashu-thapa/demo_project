package com.rohit.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button btnPlus;
    Button btnMinus;
    Button btnMultiply;
    Button btnDivide;
    Button btnCalc;
    Button btnPeriod;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    Button btnCe;


    TextView display;
    int id,flag=0,countEq=0;
   float var1=0,var2=0;
    String textFromBtn="",optr="",plus="+",minus="-",mul="*",div="/",nil="";
    Character op;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.tvDisplay);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

public void assignVariable(View V)
{
    if (Float.valueOf((String) display.getText())==0)
    {
        display.setText("");
    }
    else{}

        textFromBtn=textFromBtn+(String) ((Button)V).getText();
        display.setText(textFromBtn);

        var1=Float.valueOf(textFromBtn).floatValue();

}
    public void resetCalc(View V){
        display.setText("0");
        flag=0;
        textFromBtn="";
        var1=0;
        var2=0;
        countEq=0;
        optr="";

    }


    public void opeAssign(View V)
    {
        if(countEq==0){
            doAssign();
        }
            display.setText("");
            optr=(String)((Button)V).getText();
            display.setText(optr);
            display.setText("0");
    }

    private void doAssign(){
        var2=var1;
        textFromBtn="";
        flag++;
    }

    private void add( ){

        var2 =  var2 + var1;
        display.setText(""+var2);

    }

    private void sub(){
            var2 = var2 - var1;
            display.setText("" + var2);

    }

    private void multi(){
        var2=var2*var1;
        display.setText(""+var2);
    }

    private void divide(){
        var2=var2/var1;
        display.setText(""+var2);
    }


    public void calculateResult(View V)
    {
        countEq++;
        display.setText("");
        textFromBtn="";
        if(optr.equals(plus))
        {
            add();

        }
        else if(optr.equals(minus)){
            sub();

        }
        else if(optr.equals(mul)){
            multi();

        }

        else if(optr.equals(div)){
            divide();

        }
        else if(optr.equals(nil)){
          display.setText("0");



        }
        else{}
        flag=0;

    }
}












