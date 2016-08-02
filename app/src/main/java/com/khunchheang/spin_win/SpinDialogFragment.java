package com.khunchheang.spin_win;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


/**
 * Created by Touch on 7/10/2016.
 */
public class SpinDialogFragment extends DialogFragment {
    SpinAnimationListener spinAnimationListener;
    ImageView imageRotate;

    public void setSpinAnimationListener(SpinAnimationListener spinAnimationListener){
        this.spinAnimationListener=spinAnimationListener;

        Handler handler = null;
        handler = new Handler();
        handler.postDelayed(new Runnable(){
            public void run(){
                getDialog().cancel();
                getDialog().dismiss();
            }
        }, 5000);
}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.spin_animation, container, false);
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getDialog().setCanceledOnTouchOutside(false);
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageRotate = (ImageView) getView().findViewById(R.id.rotateImage);
        Animation startRotateAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.rotate_animation);
        imageRotate.startAnimation(startRotateAnimation);
        //startRotatingImage();
    }

//    public void startRotatingImage(){
//        imageRotate=(ImageView)getView().findViewById(R.id.rotateImage);
//        Animation startRotateAnimation= AnimationUtils.loadAnimation(this , R.anim.rotate_animation);
//        imageRotate.startAnimation(startRotateAnimation);
//    }
}
