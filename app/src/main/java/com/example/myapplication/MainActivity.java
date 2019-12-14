package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;
//import static java.lang.String[];
import static java.lang.Math.sin;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtNumber;
    private TextView tvResult;

    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;
    private Button btnNumber0;

    private Button btnAdd;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;

    private Button btnPoint;
    private Button btnResult;
    private Button btnClear;
    private Button btnNClearAll;

    private Button btnSin;
    private Button btnCos;
    private Button btnTan;
    private Button btnEXP;

    private Button btnXfactorial;
    private Button btnLN;
    private Button btnLOG;
    private Button btnCanBac2;

    private final String TAG = getClass().getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickView();

    }
    public void initWidget(){
        edtNumber = findViewById(R.id.edt_input);
        tvResult = findViewById((R.id.tv_result));
        btnNumber1 = findViewById(R.id.btnNumber1);
        btnNumber2 = findViewById(R.id.btnNumber2);
        btnNumber3 = findViewById(R.id.btnNumber3);
        btnNumber4 =findViewById(R.id.btnNumber4);
        btnNumber5 = findViewById(R.id.btnNumber5);
        btnNumber6 = findViewById(R.id.btnNumber6);
        btnNumber7 = findViewById(R.id.btnNumber7);
        btnNumber8 = findViewById(R.id.btnNumber8);
        btnNumber9 = findViewById(R.id.btnNumber9);
        btnNumber0 = findViewById(R.id.btnNumber0);

        btnAdd= findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        btnPoint = findViewById(R.id.btnPoint);
        btnClear = findViewById(R.id.btnClear);
        btnNClearAll =findViewById(R.id.btnClearAll);
        btnResult=findViewById(R.id.btnResult);
        btnSin=findViewById(R.id.btnSin);
        btnCos=findViewById(R.id.btnCos);
        btnTan=findViewById(R.id.btnTan);
        btnEXP=findViewById(R.id.btnEXP);

        btnXfactorial=findViewById(R.id.btnXfactorial);
        btnLN=findViewById(R.id.btnLN);
        btnLOG=findViewById(R.id.btnLOG);
        btnCanBac2=findViewById(R.id.btnCanBac2);

    }
    public void setEventClickView(){
        btnNumber1.setOnClickListener(this);
        btnNumber2.setOnClickListener(this);
        btnNumber3.setOnClickListener(this);
        btnNumber4.setOnClickListener(this);
        btnNumber5.setOnClickListener(this);
        btnNumber6.setOnClickListener(this);
        btnNumber7.setOnClickListener(this);
        btnNumber8.setOnClickListener(this);
        btnNumber9.setOnClickListener(this);
        btnNumber0.setOnClickListener(this);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

        btnPoint.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnNClearAll.setOnClickListener(this);
        btnResult.setOnClickListener(this);

        btnSin.setOnClickListener(this);
        btnCos.setOnClickListener(this);
        btnTan.setOnClickListener(this);
        btnEXP.setOnClickListener(this);

        btnXfactorial.setOnClickListener(this);
        btnLN.setOnClickListener(this);
        btnLOG.setOnClickListener(this);
        btnCanBac2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        double result = 0;
        switch (v.getId()){
            case R.id.btnNumber1:
                edtNumber.append("1");
                break;
            case R.id.btnNumber2:
                edtNumber.append("2");
                break;
            case R.id.btnNumber3:
                edtNumber.append("3");
                break;
            case R.id.btnNumber4:
                edtNumber.append("4");
                break;
            case R.id.btnNumber5:
                edtNumber.append("5");
                break;
            case R.id.btnNumber6:
                edtNumber.append("6");
                break;
            case R.id.btnNumber7:
                edtNumber.append("7");
                break;
            case R.id.btnNumber8:
                edtNumber.append("8");
                break;
            case R.id.btnNumber9:
                edtNumber.append("9");
                break;
            case R.id.btnNumber0:
                edtNumber.append("0");
                break;

            case R.id.btnAdd:
                edtNumber.append("+");
                break;
            case R.id.btnSub:
                edtNumber.append("-");
                break;
            case R.id.btnMul:
                edtNumber.append("*");
                break;
            case R.id.btnDiv:
                edtNumber.append("/");
                break;

            case R.id.btnPoint:
                edtNumber.append(".");
                break;
            case R.id.btnSin:
                edtNumber.append("S");
                break;
            case R.id.btnCos:
                edtNumber.append("C");
                break;
            case R.id.btnTan:
                edtNumber.append("T");
                break;
            case R.id.btnEXP:
                edtNumber.append("E");
                break;

            case R.id.btnCanBac2:
                edtNumber.append("√");
                break;
            case R.id.btnXfactorial:
                edtNumber.append("!");
                addOperation(edtNumber.getText().toString());
                addNumber(edtNumber.getText().toString());
                double factorial = 1;
                for(int k = 2; k <= arrNumber.get(0); k++){
                    factorial = factorial * k;
                }
                result = factorial;
                tvResult.setText(result + "");
                break;
            case R.id.btnLN:
                edtNumber.append("Ln");
                addOperation(edtNumber.getText().toString());
                addNumber(edtNumber.getText().toString());
                result = Math.log10(arrNumber.get(0))/Math.log10(Math.E);
                tvResult.setText(result + "");
                break;
            case R.id.btnLOG:
                edtNumber.append("Log");
                addOperation(edtNumber.getText().toString());
                addNumber(edtNumber.getText().toString());
                result = Math.log10(arrNumber.get(0));
                tvResult.setText(result + "");
                break;
            case R.id.btnClear:
                BaseInputConnection textFieldInputConnection = new BaseInputConnection(edtNumber, true);
                textFieldInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
                break;
            case R.id.btnClearAll:
                edtNumber.setText("");
                tvResult.setText("");
                break;
            case R.id.btnResult:
                addOperation(edtNumber.getText().toString());
                addNumber(edtNumber.getText().toString());

                if(arrOperation.size()> arrNumber.size()){
                    tvResult.setText("lỗi định dạng ");
                    break;
                }else {
                    if(arrNumber.size() <= 1){
                        if(arrOperation.size()<1){
                            result = arrNumber.get(0);
                        }else{
                            double radian = Math.PI * arrNumber.get(0) / 180;
                            switch (arrOperation.get(0)){
                                case "S":
                                    result = Math.sin(radian);
                                    break;
                                case "C":
                                    result = Math.cos(radian);
                                    break;
                                case "T":
                                    result = Math.tan(radian);
                                    break;
                                case "√":
                                    result = Math.sqrt(arrNumber.get(0));
                                    break;
                                default:
                                    result = arrNumber.get(0);
                                    break;
                            }
                        }
                    }
                    else{
                        for (int i = 0; i < (arrNumber.size() - 1); i++) {


                            switch (arrOperation.get(i)) {
                                case "+":
                                    if (i == 0) {
                                        result = arrNumber.get(i) + arrNumber.get(i + 1);
                                    } else {
                                        result = result + arrNumber.get(i + 1);
                                    }
                                    break;
                                case "-":
                                    if (i == 0) {
                                        result = arrNumber.get(i) - arrNumber.get(i + 1);
                                    } else {
                                        result = result - arrNumber.get(i + 1);
                                    }
                                    break;
                                case "*":
                                    if (i == 0) {
                                        result = arrNumber.get(i) * arrNumber.get(i + 1);
                                    } else {
                                        result = result * arrNumber.get(i + 1);
                                    }
                                    break;
                                case "/":
                                    if (i == 0) {
                                        result = arrNumber.get(i) / arrNumber.get(i + 1);
                                    } else {
                                        result = result / arrNumber.get(i + 1);
                                    }
                                    break;
                                case "E":
                                    if(i == 0){
                                        result = arrNumber.get(i) * Math.pow(10,arrNumber.get(i + 1));
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    }

                    tvResult.setText(result+ "");
                }
        }
    }

    public ArrayList<String> arrOperation;
    public ArrayList<Double> arrNumber;
    public int addOperation(String input)
    {
        arrOperation =  new ArrayList<>();
        arrNumber = new ArrayList<>();
        char[] cArray = input.toCharArray();
        for(int i = 0 ; i < cArray.length; i++)
        {
            switch (cArray[i]){
                case '+':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '-':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '*':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '/':
                    arrOperation.add(cArray[i] + "");
                    break;
                case 'E':
                    arrOperation.add(cArray[i] + "");
                    break;
                case 'S':
                    arrOperation.add(cArray[i] + "");
                    break;
                case 'C':
                    arrOperation.add(cArray[i] + "");
                    break;
                case 'T':
                    arrOperation.add(cArray[i] + "");
                    break;
                case '√':
                    arrOperation.add(cArray[i] + "");
                    break;
                default:
                    break;

            }
        }
        return 0;

    }
    public void addNumber(String stringinput){
        arrNumber = new ArrayList<>();
        Pattern regex = Pattern.compile("(\\d+(?:\\.\\d+)?)");
        Matcher matcher = regex.matcher(stringinput);
        while(matcher.find()){
            arrNumber.add(Double.valueOf(matcher.group(1)));
        }

    }
}