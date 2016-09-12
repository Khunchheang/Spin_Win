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
    int colorValue;

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
        setupButtonSettingOK();
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

    private int setupRadioButton(){
        RadioButton greenBackground=(RadioButton)getView().findViewById(R.id.radioBtn_Green);
        RadioButton redBackground=(RadioButton)getView().findViewById(R.id.radioBtn_Red);
        if(greenBackground.isChecked()){
            colorValue=Color.parseColor("#234e35");
        }else if(redBackground.isChecked()){
            colorValue=Color.parseColor("#541030");
        }
        return colorValue;
    }

    private void setupButtonSettingOK(){
        final View ButtonSettingOK=getView().findViewById(R.id.btn_settingOK);
        ButtonSettingOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorInt=setupRadioButton();
                settingListener.onSetting(colorInt);
                dismiss();
            }
        });
    }

}
