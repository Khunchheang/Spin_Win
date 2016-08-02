package com.khunchheang.spin_win;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SelectedNumberSwitch extends Activity implements OnClickListener{
    int selectedNumberLitener;
    Button btn_Num0, btn_Num1, btn_Num2, btn_Num3, btn_Num4;
    Button btn_Num5, btn_Num6, btn_Num7, btn_Num8, btn_Num9;
//    Button btn_Num10;private Button btn_Num11;private Button btn_Num12;private Button btn_Num13;private Button btn_Num14;
//    Button btn_Num15;private Button btn_Num16;private Button btn_Num17;private Button btn_Num18;private Button btn_Num19;
//    Button btn_Num20;private Button btn_Num21;private Button btn_Num22;private Button btn_Num23;private Button btn_Num24;
//    Button btn_Num25;private Button btn_Num26;private Button btn_Num27;private Button btn_Num28; private Button btn_Num29;
//    Button btn_Num30;private Button btn_Num31;private Button btn_Num32;private Button btn_Num33;private Button btn_Num34;
//    Button btn_Num35;private Button btn_Num36;
    String selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Num0 = (Button)findViewById(R.id.num0);
        btn_Num1 = (Button)findViewById(R.id.num1);
        btn_Num2 = (Button)findViewById(R.id.num2);

        btn_Num0.setOnClickListener(this);
        btn_Num1.setOnClickListener(this);
        btn_Num2.setOnClickListener(this);

        //tvCounter = (TextView)findViewById(R.id.counterTextView);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.num0:{
               selected=String.valueOf(0);
            }
            break;

            case R.id.num1:{
                selected=String.valueOf(1);
            }
            break;

            case R.id.num2:{
                selected=String.valueOf(2);
            }
            break;

            default:
                break;
        }

    }


}