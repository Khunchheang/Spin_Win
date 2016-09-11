package com.khunchheang.spin_win;

import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.provider.CalendarContract;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Touch on 7/10/2016.
 */
public class AnswerDialogFragment extends DialogFragment {
    AnswerListener answerListener;

    public void setAnswerListener(AnswerListener answerListener){
        this.answerListener=answerListener;

        Handler handler = null;
        handler = new Handler();
        handler.postDelayed(new Runnable(){
            public void run(){
                getDialog().cancel();
                getDialog().dismiss();
            }
        }, 7500);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.answer, container, false);
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getDialog().setCanceledOnTouchOutside(false);
        return v;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupRandom();
    }

    public void setupRandom (){
        RandomClass randomClass=new RandomClass();
        String answer=randomClass.randomNumber();
        TextView textView=(TextView)getView().findViewById(R.id.answertextview);

        if (answer==String.valueOf(2)||answer==String.valueOf(4)||answer==String.valueOf(6)||answer==String.valueOf(8)||
                answer==String.valueOf(10)||answer==String.valueOf(11)||answer==String.valueOf(13)||answer==String.valueOf(15)||
                answer==String.valueOf(17)||answer==String.valueOf(20)||answer==String.valueOf(22)||answer==String.valueOf(24)||
                answer==String.valueOf(26)||answer==String.valueOf(28)||answer==String.valueOf(29)||answer==String.valueOf(31)||
                answer==String.valueOf(33)||answer==String.valueOf(35)){
            textView.setBackgroundColor(Color.BLACK);
        }

        else if (answer==String.valueOf(0)){
            textView.setBackgroundColor(Color.parseColor("#2d7b31"));
        }

        else textView.setBackgroundColor(Color.RED);

        textView.setText(answer);
    }

}
