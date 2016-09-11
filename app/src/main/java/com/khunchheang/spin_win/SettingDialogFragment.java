package com.khunchheang.spin_win;

import android.app.DialogFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

/**
 * Created by Touch on 7/19/2016.
 */
public class SettingDialogFragment extends DialogFragment {
    SettingListener settingListener;

    public void setSettingListener(SettingListener settingListener) {
        this.settingListener = settingListener;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.setting_view, container, false);
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getDialog().setCanceledOnTouchOutside(false);
        getDialog().setCancelable(false);
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupButtonClose();
//        setupRedRadioButton();
    }

    private void setupButtonClose(){
        View ButtonClose=getView().findViewById(R.id.btn_close);
        ButtonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

    }
    private void setupRedRadioButton(){
        final RelativeLayout changeBackground=(RelativeLayout)getView().findViewById(R.id.mainView);
        final RadioButton redBackground=(RadioButton)getView().findViewById(R.id.red_Background);
        redBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeBackground.setBackgroundColor(Color.RED);
            }
        });
    }
//    private void setupGreenRadioButton(){
//        RadioButton greenBackground=(RadioButton)getView().findViewById(R.id.green_Background);
//        greenBackground.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                changeBackground.setBackgroundColor(Color.GREEN);
//            }
//        });
//    }
}
