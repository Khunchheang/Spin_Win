package com.khunchheang.spin_win;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends Activity {

    private Button btn_Start;private Button btn_Setting;private Button btn_1st12;private Button btn_2nd12;private Button btn_3rd12;
    private Button btn_2to1st; private Button btn_2to1nd; private Button btn_2to1rd;
    private Button btn_Num0;private Button btn_Num1;private Button btn_Num2;private Button btn_Num3;private Button btn_Num4;
    private Button btn_Num5;private Button btn_Num6;private Button btn_Num7;private Button btn_Num8;private Button btn_Num9;
    private Button btn_Num10;private Button btn_Num11;private Button btn_Num12;private Button btn_Num13;private Button btn_Num14;
    private Button btn_Num15;private Button btn_Num16;private Button btn_Num17;private Button btn_Num18;private Button btn_Num19;
    private Button btn_Num20;private Button btn_Num21;private Button btn_Num22;private Button btn_Num23;private Button btn_Num24;
    private Button btn_Num25;private Button btn_Num26;private Button btn_Num27;private Button btn_Num28; private Button btn_Num29;
    private Button btn_Num30;private Button btn_Num31;private Button btn_Num32;private Button btn_Num33;private Button btn_Num34;
    private Button btn_Num35;private Button btn_Num36;private Button btn_Red;private Button btn_Black;private Button btn_1to18;
    private Button btn_19to36;private Button btn_Even;private Button btn_Odd;private String selected;private String answer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_start();btn_setting();btn_Num0();btn_Num1();btn_Num2();btn_Num3();btn_Num4();btn_Num5();btn_Num6();btn_Num7();btn_Num8();
        btn_Num9();btn_Num10();btn_Num11();btn_Num12();btn_Num13();btn_Num14();btn_Num15();btn_Num16();btn_Num17();btn_Num18();
        btn_Num19();btn_Num20();btn_Num21();btn_Num22();btn_Num23();btn_Num24();btn_Num25();btn_Num26();btn_Num27();btn_Num28();
        btn_Num29();btn_Num30();btn_Num31();btn_Num32();btn_Num33();btn_Num34();btn_Num35();btn_Num36();btn_1st12();
        setupPlusIconTextView();btn_2to1st();btn_2to1nd();btn_2to1rd();btn_red();btn_black();btn_2nd12();btn_3rd12();btn_1to18();
        btn_19to36();btn_Even();btn_Odd();

        if (Build.VERSION.SDK_INT > 15) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

   }

//    private void randomNumber(){
//        RandomClass randomClass=new RandomClass();
//        String number=randomClass.randomNumber();
//        answer=String.valueOf(number);
//
////        if(selected==answer){
////            TextView textview=(TextView)findViewById(R.id.txttotalamount);
////            textview.setText("56789");
////
////        }
//
//    }

//    private  void showToast(){
//       CharSequence text=answer;
//        Toast toast=new Toast(getApplicationContext());
//        toast.makeText(getApplicationContext(),answer ,Toast.LENGTH_LONG).show();;
//        toast.setGravity(Gravity.CENTER,30,30);
//        LayoutInflater inflater = getLayoutInflater();
//        toast.setDuration(Toast.LENGTH_LONG);
//        View layout = inflater.inflate(R.layout.toast_view ,null);
//        toast.setView(layout);
//
//    }

    private void btn_start(){
        btn_Start=(Button) this.findViewById(R.id.btnStart);
        btn_Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Start.setBackgroundColor(Color.parseColor("#2d7b31"));
                showAnswer();
                showSpinAnimation();
//                randomNumber();
//                showToast();
            }
        });
        btn_Start.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Start.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_setting(){
        btn_Setting=(Button) this.findViewById(R.id.btnSetting);
        btn_Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Setting.setBackgroundColor(Color.parseColor("#2d7b31"));
               showSetting();
            }
        });
        btn_Setting.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Setting.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num0(){
        btn_Num0=(Button) this.findViewById(R.id.num0);
        btn_Num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num0.setBackgroundColor(Color.parseColor("#2d7b31"));
                selected=String.valueOf(0);
                showSelectAmount();
            }
        });
        btn_Num0.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num0.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num1(){
        btn_Num1=(Button) this.findViewById(R.id.num1);
        btn_Num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num1.setBackgroundColor(Color.RED);
                selected=String.valueOf(1);
                showSelectAmount();
            }
        });
        btn_Num1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num1.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num3(){
        btn_Num3=(Button) this.findViewById(R.id.num3);
        btn_Num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num3.setBackgroundColor(Color.RED);
                selected=String.valueOf(3);
                showSelectAmount();
            }
        });
        btn_Num3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num3.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num5(){
        btn_Num5=(Button) this.findViewById(R.id.num5);
        btn_Num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num5.setBackgroundColor(Color.RED);
                selected=String.valueOf(5);
                showSelectAmount();
            }
        });
        btn_Num5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num5.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num7(){
        btn_Num7=(Button) this.findViewById(R.id.num7);
        btn_Num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num7.setBackgroundColor(Color.RED);
                selected=String.valueOf(7);
                showSelectAmount();
            }
        });
        btn_Num7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num7.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num9(){
        btn_Num9=(Button) this.findViewById(R.id.num9);
        btn_Num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num9.setBackgroundColor(Color.RED);
                selected=String.valueOf(9);
                showSelectAmount();
            }
        });
        btn_Num9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num9.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num12(){
        btn_Num12=(Button) this.findViewById(R.id.num12);
        btn_Num12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num12.setBackgroundColor(Color.RED);
                selected=String.valueOf(12);
                showSelectAmount();
            }
        });
        btn_Num12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num12.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num14(){
        btn_Num14=(Button) this.findViewById(R.id.num14);
        btn_Num14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num14.setBackgroundColor(Color.RED);
                selected=String.valueOf(14);
                showSelectAmount();
            }
        });
        btn_Num14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num14.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num16(){
        btn_Num16=(Button) this.findViewById(R.id.num16);
        btn_Num16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num16.setBackgroundColor(Color.RED);
                selected=String.valueOf(16);
                showSelectAmount();
            }
        });
        btn_Num16.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num16.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num18(){
        btn_Num18=(Button) this.findViewById(R.id.num18);
        btn_Num18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num18.setBackgroundColor(Color.RED);
                selected=String.valueOf(18);
                showSelectAmount();
            }
        });
        btn_Num18.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num18.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num19(){
        btn_Num19=(Button) this.findViewById(R.id.num19);
        btn_Num19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num19.setBackgroundColor(Color.RED);
                selected=String.valueOf(19);
                showSelectAmount();
            }
        });
        btn_Num19.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num19.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num21(){
        btn_Num21=(Button) this.findViewById(R.id.num21);
        btn_Num21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num21.setBackgroundColor(Color.RED);
                selected=String.valueOf(21);
                showSelectAmount();
            }
        });
        btn_Num21.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num21.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num23(){
        btn_Num23=(Button) this.findViewById(R.id.num23);
        btn_Num23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num23.setBackgroundColor(Color.RED);
                selected=String.valueOf(23);
                showSelectAmount();
            }
        });
        btn_Num23.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num23.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num25(){
        btn_Num25=(Button) this.findViewById(R.id.num25);
        btn_Num25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num25.setBackgroundColor(Color.RED);
                selected=String.valueOf(25);
                showSelectAmount();
            }
        });
        btn_Num25.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num25.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num27(){
        btn_Num27=(Button) this.findViewById(R.id.num27);
        btn_Num27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num27.setBackgroundColor(Color.RED);
                selected=String.valueOf(27);
                showSelectAmount();
            }
        });
        btn_Num27.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num27.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num30(){
        btn_Num30=(Button) this.findViewById(R.id.num30);
        btn_Num30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num30.setBackgroundColor(Color.RED);
                selected=String.valueOf(30);
                showSelectAmount();
            }
        });
        btn_Num30.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num30.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num32(){
        btn_Num32=(Button) this.findViewById(R.id.num32);
        btn_Num32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num32.setBackgroundColor(Color.RED);
                selected=String.valueOf(32);
                showSelectAmount();
            }
        });
        btn_Num32.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num32.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num34(){
        btn_Num34=(Button) this.findViewById(R.id.num34);
        btn_Num34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num34.setBackgroundColor(Color.RED);
                selected=String.valueOf(34);
                showSelectAmount();
            }
        });
        btn_Num34.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num34.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num36(){
        btn_Num36=(Button) this.findViewById(R.id.num36);
        btn_Num36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num36.setBackgroundColor(Color.RED);
                selected=String.valueOf(36);
                showSelectAmount();
            }
        });
        btn_Num36.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num36.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_red(){
        btn_Red=(Button) findViewById(R.id.red);
        btn_Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Red.setBackgroundColor(Color.RED);
                btn_Num1.setBackgroundColor(Color.RED);
                btn_Num3.setBackgroundColor(Color.RED);
                btn_Num5.setBackgroundColor(Color.RED);
                btn_Num7.setBackgroundColor(Color.RED);
                btn_Num9.setBackgroundColor(Color.RED);
                btn_Num12.setBackgroundColor(Color.RED);
                btn_Num14.setBackgroundColor(Color.RED);
                btn_Num16.setBackgroundColor(Color.RED);
                btn_Num18.setBackgroundColor(Color.RED);
                btn_Num21.setBackgroundColor(Color.RED);
                btn_Num19.setBackgroundColor(Color.RED);
                btn_Num23.setBackgroundColor(Color.RED);
                btn_Num25.setBackgroundColor(Color.RED);
                btn_Num27.setBackgroundColor(Color.RED);
                btn_Num30.setBackgroundColor(Color.RED);
                btn_Num32.setBackgroundColor(Color.RED);
                btn_Num34.setBackgroundColor(Color.RED);
                btn_Num36.setBackgroundColor(Color.RED);
                showSelectAmount();
            }
        });
        btn_Red.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Red.setBackgroundColor(Color.GRAY);
                btn_Num1.setBackgroundColor(Color.GRAY);
                btn_Num3.setBackgroundColor(Color.GRAY);
                btn_Num5.setBackgroundColor(Color.GRAY);
                btn_Num7.setBackgroundColor(Color.GRAY);
                btn_Num9.setBackgroundColor(Color.GRAY);
                btn_Num12.setBackgroundColor(Color.GRAY);
                btn_Num14.setBackgroundColor(Color.GRAY);
                btn_Num16.setBackgroundColor(Color.GRAY);
                btn_Num18.setBackgroundColor(Color.GRAY);
                btn_Num21.setBackgroundColor(Color.GRAY);
                btn_Num19.setBackgroundColor(Color.GRAY);
                btn_Num23.setBackgroundColor(Color.GRAY);
                btn_Num25.setBackgroundColor(Color.GRAY);
                btn_Num27.setBackgroundColor(Color.GRAY);
                btn_Num30.setBackgroundColor(Color.GRAY);
                btn_Num32.setBackgroundColor(Color.GRAY);
                btn_Num34.setBackgroundColor(Color.GRAY);
                btn_Num36.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_black(){
        btn_Black=(Button) findViewById(R.id.black);
        btn_Black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Black.setBackgroundColor(Color.BLACK);
                btn_Num2.setBackgroundColor(Color.BLACK);
                btn_Num4.setBackgroundColor(Color.BLACK);
                btn_Num6.setBackgroundColor(Color.BLACK);
                btn_Num8.setBackgroundColor(Color.BLACK);
                btn_Num10.setBackgroundColor(Color.BLACK);
                btn_Num11.setBackgroundColor(Color.BLACK);
                btn_Num13.setBackgroundColor(Color.BLACK);
                btn_Num15.setBackgroundColor(Color.BLACK);
                btn_Num17.setBackgroundColor(Color.BLACK);
                btn_Num20.setBackgroundColor(Color.BLACK);
                btn_Num22.setBackgroundColor(Color.BLACK);
                btn_Num24.setBackgroundColor(Color.BLACK);
                btn_Num26.setBackgroundColor(Color.BLACK);
                btn_Num28.setBackgroundColor(Color.BLACK);
                btn_Num29.setBackgroundColor(Color.BLACK);
                btn_Num31.setBackgroundColor(Color.BLACK);
                btn_Num33.setBackgroundColor(Color.BLACK);
                btn_Num35.setBackgroundColor(Color.BLACK);
                showSelectAmount();
            }
        });
        btn_Black.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Black.setBackgroundColor(Color.GRAY);
                btn_Num2.setBackgroundColor(Color.GRAY);
                btn_Num4.setBackgroundColor(Color.GRAY);
                btn_Num6.setBackgroundColor(Color.GRAY);
                btn_Num8.setBackgroundColor(Color.GRAY);
                btn_Num10.setBackgroundColor(Color.GRAY);
                btn_Num11.setBackgroundColor(Color.GRAY);
                btn_Num13.setBackgroundColor(Color.GRAY);
                btn_Num15.setBackgroundColor(Color.GRAY);
                btn_Num17.setBackgroundColor(Color.GRAY);
                btn_Num20.setBackgroundColor(Color.GRAY);
                btn_Num22.setBackgroundColor(Color.GRAY);
                btn_Num24.setBackgroundColor(Color.GRAY);
                btn_Num26.setBackgroundColor(Color.GRAY);
                btn_Num28.setBackgroundColor(Color.GRAY);
                btn_Num29.setBackgroundColor(Color.GRAY);
                btn_Num31.setBackgroundColor(Color.GRAY);
                btn_Num33.setBackgroundColor(Color.GRAY);
                btn_Num35.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num2(){
        btn_Num2=(Button) findViewById(R.id.num2);
        btn_Num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num2.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(2);
                showSelectAmount();
            }
        });
        btn_Num2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num2.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_1to18(){
        btn_1to18=(Button) this.findViewById(R.id.oneto18);
        btn_1to18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_1to18.setBackgroundColor(Color.parseColor("#2d7b31"));
                btn_Num1.setBackgroundColor(Color.RED);
                btn_Num2.setBackgroundColor(Color.BLACK);
                btn_Num3.setBackgroundColor(Color.RED);
                btn_Num4.setBackgroundColor(Color.BLACK);
                btn_Num5.setBackgroundColor(Color.RED);
                btn_Num6.setBackgroundColor(Color.BLACK);
                btn_Num7.setBackgroundColor(Color.RED);
                btn_Num8.setBackgroundColor(Color.BLACK);
                btn_Num9.setBackgroundColor(Color.RED);
                btn_Num10.setBackgroundColor(Color.BLACK);
                btn_Num11.setBackgroundColor(Color.BLACK);
                btn_Num12.setBackgroundColor(Color.RED);
                btn_Num14.setBackgroundColor(Color.RED);
                btn_Num13.setBackgroundColor(Color.BLACK);
                btn_Num16.setBackgroundColor(Color.RED);
                btn_Num15.setBackgroundColor(Color.BLACK);
                btn_Num18.setBackgroundColor(Color.RED);
                btn_Num17.setBackgroundColor(Color.BLACK);
                showSelectAmount();
            }
        });
        btn_1to18.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num1.setBackgroundColor(Color.GRAY);
                btn_Num2.setBackgroundColor(Color.GRAY);
                btn_Num3.setBackgroundColor(Color.GRAY);
                btn_Num4.setBackgroundColor(Color.GRAY);
                btn_Num5.setBackgroundColor(Color.GRAY);
                btn_Num6.setBackgroundColor(Color.GRAY);
                btn_Num7.setBackgroundColor(Color.GRAY);
                btn_Num8.setBackgroundColor(Color.GRAY);
                btn_Num9.setBackgroundColor(Color.GRAY);
                btn_Num10.setBackgroundColor(Color.GRAY);
                btn_Num11.setBackgroundColor(Color.GRAY);
                btn_Num12.setBackgroundColor(Color.GRAY);
                btn_Num13.setBackgroundColor(Color.GRAY);
                btn_Num14.setBackgroundColor(Color.GRAY);
                btn_Num15.setBackgroundColor(Color.GRAY);
                btn_Num16.setBackgroundColor(Color.GRAY);
                btn_Num17.setBackgroundColor(Color.GRAY);
                btn_Num18.setBackgroundColor(Color.GRAY);
                btn_1to18.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_19to36(){
        btn_19to36=(Button) this.findViewById(R.id.nineteento36);
        btn_19to36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_19to36.setBackgroundColor(Color.parseColor("#2d7b31"));
                btn_Num19.setBackgroundColor(Color.RED);
                btn_Num20.setBackgroundColor(Color.BLACK);
                btn_Num21.setBackgroundColor(Color.RED);
                btn_Num22.setBackgroundColor(Color.BLACK);
                btn_Num24.setBackgroundColor(Color.BLACK);
                btn_Num23.setBackgroundColor(Color.RED);
                btn_Num25.setBackgroundColor(Color.RED);
                btn_Num26.setBackgroundColor(Color.BLACK);
                btn_Num27.setBackgroundColor(Color.RED);
                btn_Num28.setBackgroundColor(Color.BLACK);
                btn_Num30.setBackgroundColor(Color.RED);
                btn_Num29.setBackgroundColor(Color.BLACK);
                btn_Num32.setBackgroundColor(Color.RED);
                btn_Num31.setBackgroundColor(Color.BLACK);
                btn_Num34.setBackgroundColor(Color.RED);
                btn_Num33.setBackgroundColor(Color.BLACK);
                btn_Num35.setBackgroundColor(Color.BLACK);
                btn_Num36.setBackgroundColor(Color.RED);
                showSelectAmount();
            }
        });
        btn_19to36.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num19.setBackgroundColor(Color.GRAY);
                btn_Num20.setBackgroundColor(Color.GRAY);
                btn_Num21.setBackgroundColor(Color.GRAY);
                btn_Num22.setBackgroundColor(Color.GRAY);
                btn_Num23.setBackgroundColor(Color.GRAY);
                btn_Num24.setBackgroundColor(Color.GRAY);
                btn_Num25.setBackgroundColor(Color.GRAY);
                btn_Num26.setBackgroundColor(Color.GRAY);
                btn_Num27.setBackgroundColor(Color.GRAY);
                btn_Num28.setBackgroundColor(Color.GRAY);
                btn_Num29.setBackgroundColor(Color.GRAY);
                btn_Num30.setBackgroundColor(Color.GRAY);
                btn_Num31.setBackgroundColor(Color.GRAY);
                btn_Num32.setBackgroundColor(Color.GRAY);
                btn_Num33.setBackgroundColor(Color.GRAY);
                btn_Num34.setBackgroundColor(Color.GRAY);
                btn_Num35.setBackgroundColor(Color.GRAY);
                btn_Num36.setBackgroundColor(Color.GRAY);
                btn_19to36.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Even(){
        btn_Even=(Button) this.findViewById(R.id.even);
        btn_Even.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Even.setBackgroundColor(Color.parseColor("#2d7b31"));
                btn_Num2.setBackgroundColor(Color.BLACK);
                btn_Num4.setBackgroundColor(Color.BLACK);
                btn_Num6.setBackgroundColor(Color.BLACK);
                btn_Num8.setBackgroundColor(Color.BLACK);
                btn_Num10.setBackgroundColor(Color.BLACK);
                btn_Num12.setBackgroundColor(Color.RED);
                btn_Num14.setBackgroundColor(Color.RED);
                btn_Num16.setBackgroundColor(Color.RED);
                btn_Num18.setBackgroundColor(Color.RED);
                btn_Num20.setBackgroundColor(Color.BLACK);
                btn_Num12.setBackgroundColor(Color.RED);
                btn_Num24.setBackgroundColor(Color.BLACK);
                btn_Num26.setBackgroundColor(Color.BLACK);
                btn_Num28.setBackgroundColor(Color.BLACK);
                btn_Num22.setBackgroundColor(Color.BLACK);
                btn_Num30.setBackgroundColor(Color.RED);
                btn_Num32.setBackgroundColor(Color.RED);
                btn_Num34.setBackgroundColor(Color.RED);
                btn_Num36.setBackgroundColor(Color.RED);
                showSelectAmount();
            }
        });
        btn_Even.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num2.setBackgroundColor(Color.GRAY);
                btn_Num4.setBackgroundColor(Color.GRAY);
                btn_Num6.setBackgroundColor(Color.GRAY);
                btn_Num8.setBackgroundColor(Color.GRAY);
                btn_Num10.setBackgroundColor(Color.GRAY);
                btn_Num12.setBackgroundColor(Color.GRAY);
                btn_Num14.setBackgroundColor(Color.GRAY);
                btn_Num16.setBackgroundColor(Color.GRAY);
                btn_Num18.setBackgroundColor(Color.GRAY);
                btn_Num20.setBackgroundColor(Color.GRAY);
                btn_Num22.setBackgroundColor(Color.GRAY);
                btn_Num24.setBackgroundColor(Color.GRAY);
                btn_Num26.setBackgroundColor(Color.GRAY);
                btn_Num28.setBackgroundColor(Color.GRAY);
                btn_Num30.setBackgroundColor(Color.GRAY);
                btn_Num32.setBackgroundColor(Color.GRAY);
                btn_Num34.setBackgroundColor(Color.GRAY);
                btn_Num36.setBackgroundColor(Color.GRAY);
                btn_Even.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Odd(){
        btn_Odd=(Button) this.findViewById(R.id.odd);
        btn_Odd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Odd.setBackgroundColor(Color.parseColor("#2d7b31"));
                btn_Num11.setBackgroundColor(Color.BLACK);
                btn_Num13.setBackgroundColor(Color.BLACK);
                btn_Num15.setBackgroundColor(Color.BLACK);
                btn_Num17.setBackgroundColor(Color.BLACK);
                btn_Num1.setBackgroundColor(Color.RED);
                btn_Num3.setBackgroundColor(Color.RED);
                btn_Num5.setBackgroundColor(Color.RED);
                btn_Num7.setBackgroundColor(Color.RED);
                btn_Num9.setBackgroundColor(Color.RED);
                btn_Num29.setBackgroundColor(Color.BLACK);
                btn_Num31.setBackgroundColor(Color.BLACK);
                btn_Num33.setBackgroundColor(Color.BLACK);
                btn_Num35.setBackgroundColor(Color.BLACK);
                btn_Num19.setBackgroundColor(Color.RED);
                btn_Num21.setBackgroundColor(Color.RED);
                btn_Num23.setBackgroundColor(Color.RED);
                btn_Num25.setBackgroundColor(Color.RED);
                btn_Num27.setBackgroundColor(Color.RED);
                showSelectAmount();
            }
        });
        btn_Odd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num1.setBackgroundColor(Color.GRAY);
                btn_Num3.setBackgroundColor(Color.GRAY);
                btn_Num5.setBackgroundColor(Color.GRAY);
                btn_Num7.setBackgroundColor(Color.GRAY);
                btn_Num9.setBackgroundColor(Color.GRAY);
                btn_Num11.setBackgroundColor(Color.GRAY);
                btn_Num13.setBackgroundColor(Color.GRAY);
                btn_Num15.setBackgroundColor(Color.GRAY);
                btn_Num17.setBackgroundColor(Color.GRAY);
                btn_Num19.setBackgroundColor(Color.GRAY);
                btn_Num21.setBackgroundColor(Color.GRAY);
                btn_Num23.setBackgroundColor(Color.GRAY);
                btn_Num25.setBackgroundColor(Color.GRAY);
                btn_Num27.setBackgroundColor(Color.GRAY);
                btn_Num29.setBackgroundColor(Color.GRAY);
                btn_Num31.setBackgroundColor(Color.GRAY);
                btn_Num33.setBackgroundColor(Color.GRAY);
                btn_Num35.setBackgroundColor(Color.GRAY);
                btn_Odd.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }


    private void btn_1st12(){
        btn_1st12=(Button) this.findViewById(R.id.firsto12);
        btn_1st12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_1st12.setBackgroundColor(Color.parseColor("#2d7b31"));
                btn_Num1.setBackgroundColor(Color.RED);
                btn_Num2.setBackgroundColor(Color.BLACK);
                btn_Num3.setBackgroundColor(Color.RED);
                btn_Num4.setBackgroundColor(Color.BLACK);
                btn_Num5.setBackgroundColor(Color.RED);
                btn_Num6.setBackgroundColor(Color.BLACK);
                btn_Num7.setBackgroundColor(Color.RED);
                btn_Num8.setBackgroundColor(Color.BLACK);
                btn_Num9.setBackgroundColor(Color.RED);
                btn_Num10.setBackgroundColor(Color.BLACK);
                btn_Num11.setBackgroundColor(Color.BLACK);
                btn_Num12.setBackgroundColor(Color.RED);
                showSelectAmount();
            }
        });
        btn_1st12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num1.setBackgroundColor(Color.GRAY);
                btn_Num2.setBackgroundColor(Color.GRAY);
                btn_Num3.setBackgroundColor(Color.GRAY);
                btn_Num4.setBackgroundColor(Color.GRAY);
                btn_Num5.setBackgroundColor(Color.GRAY);
                btn_Num6.setBackgroundColor(Color.GRAY);
                btn_Num7.setBackgroundColor(Color.GRAY);
                btn_Num8.setBackgroundColor(Color.GRAY);
                btn_Num9.setBackgroundColor(Color.GRAY);
                btn_Num10.setBackgroundColor(Color.GRAY);
                btn_Num11.setBackgroundColor(Color.GRAY);
                btn_Num12.setBackgroundColor(Color.GRAY);
                btn_1st12.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_2nd12(){
        btn_2nd12=(Button) this.findViewById(R.id.secondto12);
        btn_2nd12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_2nd12.setBackgroundColor(Color.parseColor("#2d7b31"));
                btn_Num14.setBackgroundColor(Color.RED);
                btn_Num13.setBackgroundColor(Color.BLACK);
                btn_Num16.setBackgroundColor(Color.RED);
                btn_Num15.setBackgroundColor(Color.BLACK);
                btn_Num18.setBackgroundColor(Color.RED);
                btn_Num17.setBackgroundColor(Color.BLACK);
                btn_Num19.setBackgroundColor(Color.RED);
                btn_Num20.setBackgroundColor(Color.BLACK);
                btn_Num21.setBackgroundColor(Color.RED);
                btn_Num22.setBackgroundColor(Color.BLACK);
                btn_Num24.setBackgroundColor(Color.BLACK);
                btn_Num23.setBackgroundColor(Color.RED);
                showSelectAmount();
            }
        });
        btn_2nd12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num13.setBackgroundColor(Color.GRAY);
                btn_Num14.setBackgroundColor(Color.GRAY);
                btn_Num15.setBackgroundColor(Color.GRAY);
                btn_Num16.setBackgroundColor(Color.GRAY);
                btn_Num17.setBackgroundColor(Color.GRAY);
                btn_Num18.setBackgroundColor(Color.GRAY);
                btn_Num19.setBackgroundColor(Color.GRAY);
                btn_Num20.setBackgroundColor(Color.GRAY);
                btn_Num21.setBackgroundColor(Color.GRAY);
                btn_Num22.setBackgroundColor(Color.GRAY);
                btn_Num23.setBackgroundColor(Color.GRAY);
                btn_Num24.setBackgroundColor(Color.GRAY);
                btn_2nd12.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_3rd12(){
        btn_3rd12=(Button) this.findViewById(R.id.thirdto12);
        btn_3rd12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_3rd12.setBackgroundColor(Color.parseColor("#2d7b31"));
                btn_Num25.setBackgroundColor(Color.RED);
                btn_Num26.setBackgroundColor(Color.BLACK);
                btn_Num27.setBackgroundColor(Color.RED);
                btn_Num28.setBackgroundColor(Color.BLACK);
                btn_Num30.setBackgroundColor(Color.RED);
                btn_Num29.setBackgroundColor(Color.BLACK);
                btn_Num32.setBackgroundColor(Color.RED);
                btn_Num31.setBackgroundColor(Color.BLACK);
                btn_Num34.setBackgroundColor(Color.RED);
                btn_Num33.setBackgroundColor(Color.BLACK);
                btn_Num35.setBackgroundColor(Color.BLACK);
                btn_Num36.setBackgroundColor(Color.RED);
                showSelectAmount();
            }
        });
        btn_3rd12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num25.setBackgroundColor(Color.GRAY);
                btn_Num26.setBackgroundColor(Color.GRAY);
                btn_Num27.setBackgroundColor(Color.GRAY);
                btn_Num28.setBackgroundColor(Color.GRAY);
                btn_Num29.setBackgroundColor(Color.GRAY);
                btn_Num30.setBackgroundColor(Color.GRAY);
                btn_Num31.setBackgroundColor(Color.GRAY);
                btn_Num32.setBackgroundColor(Color.GRAY);
                btn_Num33.setBackgroundColor(Color.GRAY);
                btn_Num34.setBackgroundColor(Color.GRAY);
                btn_Num35.setBackgroundColor(Color.GRAY);
                btn_Num36.setBackgroundColor(Color.GRAY);
                btn_3rd12.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_2to1st(){
        btn_2to1st=(Button) this.findViewById(R.id.towto1st);
        btn_2to1st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_2to1st.setBackgroundColor(Color.parseColor("#2d7b31"));
                btn_Num3.setBackgroundColor(Color.RED);
                btn_Num6.setBackgroundColor(Color.BLACK);
                btn_Num9.setBackgroundColor(Color.RED);
                btn_Num12.setBackgroundColor(Color.RED);
                btn_Num15.setBackgroundColor(Color.BLACK);
                btn_Num18.setBackgroundColor(Color.RED);
                btn_Num21.setBackgroundColor(Color.RED);
                btn_Num24.setBackgroundColor(Color.BLACK);
                btn_Num27.setBackgroundColor(Color.RED);
                btn_Num30.setBackgroundColor(Color.RED);
                btn_Num33.setBackgroundColor(Color.BLACK);
                btn_Num36.setBackgroundColor(Color.RED);
                showSelectAmount();
            }
        });
        btn_2to1st.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num3.setBackgroundColor(Color.GRAY);
                btn_Num6.setBackgroundColor(Color.GRAY);
                btn_Num9.setBackgroundColor(Color.GRAY);
                btn_Num12.setBackgroundColor(Color.GRAY);
                btn_Num15.setBackgroundColor(Color.GRAY);
                btn_Num18.setBackgroundColor(Color.GRAY);
                btn_Num21.setBackgroundColor(Color.GRAY);
                btn_Num24.setBackgroundColor(Color.GRAY);
                btn_Num27.setBackgroundColor(Color.GRAY);
                btn_Num30.setBackgroundColor(Color.GRAY);
                btn_Num33.setBackgroundColor(Color.GRAY);
                btn_Num36.setBackgroundColor(Color.GRAY);
                btn_2to1st.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_2to1nd(){
        btn_2to1nd=(Button) this.findViewById(R.id.towto1nd);
        btn_2to1nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_2to1nd.setBackgroundColor(Color.parseColor("#2d7b31"));
                btn_Num2.setBackgroundColor(Color.BLACK);
                btn_Num5.setBackgroundColor(Color.RED);
                btn_Num8.setBackgroundColor(Color.BLACK);
                btn_Num11.setBackgroundColor(Color.BLACK);
                btn_Num14.setBackgroundColor(Color.RED);
                btn_Num17.setBackgroundColor(Color.BLACK);
                btn_Num20.setBackgroundColor(Color.BLACK);
                btn_Num23.setBackgroundColor(Color.RED);
                btn_Num26.setBackgroundColor(Color.BLACK);
                btn_Num29.setBackgroundColor(Color.BLACK);
                btn_Num32.setBackgroundColor(Color.RED);
                btn_Num35.setBackgroundColor(Color.BLACK);
                showSelectAmount();
            }
        });
        btn_2to1nd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num2.setBackgroundColor(Color.GRAY);
                btn_Num5.setBackgroundColor(Color.GRAY);
                btn_Num8.setBackgroundColor(Color.GRAY);
                btn_Num11.setBackgroundColor(Color.GRAY);
                btn_Num14.setBackgroundColor(Color.GRAY);
                btn_Num17.setBackgroundColor(Color.GRAY);
                btn_Num20.setBackgroundColor(Color.GRAY);
                btn_Num23.setBackgroundColor(Color.GRAY);
                btn_Num26.setBackgroundColor(Color.GRAY);
                btn_Num29.setBackgroundColor(Color.GRAY);
                btn_Num32.setBackgroundColor(Color.GRAY);
                btn_Num35.setBackgroundColor(Color.GRAY);
                btn_2to1nd.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_2to1rd(){
        btn_2to1rd=(Button) this.findViewById(R.id.towto1rd);
        btn_2to1rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_2to1rd.setBackgroundColor(Color.parseColor("#2d7b31"));
                btn_Num1.setBackgroundColor(Color.RED);
                btn_Num4.setBackgroundColor(Color.BLACK);
                btn_Num7.setBackgroundColor(Color.RED);
                btn_Num10.setBackgroundColor(Color.BLACK);
                btn_Num13.setBackgroundColor(Color.BLACK);
                btn_Num16.setBackgroundColor(Color.RED);
                btn_Num19.setBackgroundColor(Color.RED);
                btn_Num22.setBackgroundColor(Color.BLACK);
                btn_Num25.setBackgroundColor(Color.RED);
                btn_Num28.setBackgroundColor(Color.BLACK);
                btn_Num31.setBackgroundColor(Color.BLACK);
                btn_Num34.setBackgroundColor(Color.RED);
                showSelectAmount();
            }
        });
        btn_2to1rd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num1.setBackgroundColor(Color.GRAY);
                btn_Num4.setBackgroundColor(Color.GRAY);
                btn_Num7.setBackgroundColor(Color.GRAY);
                btn_Num10.setBackgroundColor(Color.GRAY);
                btn_Num13.setBackgroundColor(Color.GRAY);
                btn_Num16.setBackgroundColor(Color.GRAY);
                btn_Num19.setBackgroundColor(Color.GRAY);
                btn_Num22.setBackgroundColor(Color.GRAY);
                btn_Num25.setBackgroundColor(Color.GRAY);
                btn_Num28.setBackgroundColor(Color.GRAY);
                btn_Num31.setBackgroundColor(Color.GRAY);
                btn_Num34.setBackgroundColor(Color.GRAY);
                btn_2to1rd.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num4(){
        btn_Num4=(Button) findViewById(R.id.num4);
        btn_Num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num4.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(4);
                showSelectAmount();
            }
        });
        btn_Num4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num4.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num6(){
        btn_Num6=(Button) findViewById(R.id.num6);
        btn_Num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num6.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(6);
                showSelectAmount();
            }
        });
        btn_Num6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num6.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num8(){
        btn_Num8=(Button) findViewById(R.id.num8);
        btn_Num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num8.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(8);
                showSelectAmount();
            }
        });
        btn_Num8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num8.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num10(){
        btn_Num10=(Button) findViewById(R.id.num10);
        btn_Num10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num10.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(10);
                showSelectAmount();
            }
        });
        btn_Num10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num10.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num11(){
        btn_Num11=(Button) findViewById(R.id.num11);
        btn_Num11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num11.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(11);
                showSelectAmount();
            }
        });
        btn_Num11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num11.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num13(){
        btn_Num13=(Button) findViewById(R.id.num13);
        btn_Num13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num13.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(13);
                showSelectAmount();
            }
        });
        btn_Num13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num13.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num15(){
        btn_Num15=(Button) findViewById(R.id.num15);
        btn_Num15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num15.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(15);
                showSelectAmount();
            }
        });
        btn_Num15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num15.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num17(){
        btn_Num17=(Button) findViewById(R.id.num17);
        btn_Num17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num17.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(17);
                showSelectAmount();
            }
        });
        btn_Num17.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num17.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num20(){
        btn_Num20=(Button) findViewById(R.id.num20);
        btn_Num20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num20.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(20);
                showSelectAmount();
            }
        });
        btn_Num20.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num20.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num24(){
        btn_Num24=(Button) findViewById(R.id.num24);
        btn_Num24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num24.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(24);
                showSelectAmount();
            }
        });
        btn_Num24.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num24.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num22(){
        btn_Num22=(Button) findViewById(R.id.num22);
        btn_Num22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num22.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(22);
                showSelectAmount();
            }
        });
        btn_Num22.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num22.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num26(){
        btn_Num26=(Button) findViewById(R.id.num26);
        btn_Num26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num26.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(26);
                showSelectAmount();
            }
        });
        btn_Num26.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num26.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num29(){
        btn_Num29=(Button) findViewById(R.id.num29);
        btn_Num29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num29.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(29);
                showSelectAmount();
            }
        });
        btn_Num29.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num29.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num28(){
        btn_Num28=(Button) findViewById(R.id.num28);
        btn_Num28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num28.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(28);
                showSelectAmount();
            }
        });
        btn_Num28.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num28.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num31(){
        btn_Num31=(Button) findViewById(R.id.num31);
        btn_Num31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num31.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(31);
                showSelectAmount();
            }
        });
        btn_Num31.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num31.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num33(){
        btn_Num33=(Button) findViewById(R.id.num33);
        btn_Num33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num33.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(33);
                showSelectAmount();
            }
        });
        btn_Num33.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num33.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void btn_Num35(){
        btn_Num35=(Button) findViewById(R.id.num35);
        btn_Num35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_Num35.setBackgroundColor(Color.BLACK);
                selected=String.valueOf(35);
                showSelectAmount();
            }
        });
        btn_Num35.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btn_Num35.setBackgroundColor(Color.GRAY);
                return false;
            }
        });
    }

    private void setupPlusIconTextView() {
        TextView textView = (TextView) findViewById(R.id.plusIconTextView);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "icomoon.ttf");
        textView.setTypeface(typeface);
        textView.setText("\uEA0A");
    }

    private void showSelectAmount() {
        SelectAmountDialogFragment fragment = new SelectAmountDialogFragment();
        fragment.show(getFragmentManager(), "dialog");

        fragment.setSelectAmountListener(new SelectAmountListener() {
            @Override
            public void onAmountSelected(int amount) {
                TextView textViewWlamount = (TextView) findViewById(R.id.txtwlamount);
                textViewWlamount.setText("" + amount);

            }
        });
    }

    private void showSpinAnimation() {
        SpinDialogFragment fragment = new SpinDialogFragment();
        fragment.show(getFragmentManager(), "dialog");

        fragment.setSpinAnimationListener(new SpinAnimationListener() {
            @Override
            public void onSpinAnimation() {

            }
        });
    }

    private void showAnswer(){
        AnswerDialogFragment fragment =new AnswerDialogFragment();
        fragment.show(getFragmentManager(),"dialog");

        fragment.setAnswerListener(new AnswerListener() {
            @Override
            public void onAnswer() {

            }
        });
    }

    private void showSetting(){
        SettingDialogFragment fragment=new SettingDialogFragment();
        fragment.show(getFragmentManager(),"dialog");

        fragment.setSettingListener(new SettingListener() {
            @Override
            public void onSetting(int color) {
                RelativeLayout mainActivity=(RelativeLayout)findViewById(R.id.mainView);
                mainActivity.setBackgroundColor(color);
            }
        });

    }

}
