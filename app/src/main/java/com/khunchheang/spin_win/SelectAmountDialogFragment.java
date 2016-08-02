package com.khunchheang.spin_win;

import android.app.DialogFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Touch on 7/9/2016.
 */
public class SelectAmountDialogFragment extends DialogFragment {
    SelectAmountListener selectAmountListener;
    int increaseInterval = 100;
    int decreaseInterval = -100;
    int totalAmountDialog=50000;
    private EditText amountEditText;
    private TextView  textViewtotalamountDialog;

    public void setSelectAmountListener(SelectAmountListener selectAmountListener) {
        this.selectAmountListener = selectAmountListener;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.select_amount, container, false);
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getDialog().setCanceledOnTouchOutside(false);
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int currentAmountDialog=getTotalAmountDialog();
        int newAmountDialog=currentAmountDialog+totalAmountDialog;
        textViewtotalamountDialog.setText(newAmountDialog + "");

        setupPlusButton();
        setupMinusButton();
        setupOKButton();
        setupCancelButton();
    }

    private void setupPlusButton() {
        View plusButton = getView().findViewById(R.id.plus);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentAmount = getCurrentAmount();
                int currentAmountDialog=getTotalAmountDialog();
                if(currentAmountDialog!=0) {
                    int newAmountDialog = currentAmountDialog - increaseInterval;
                    textViewtotalamountDialog.setText(newAmountDialog + "");

                    int newAmount = currentAmount + increaseInterval;
                    amountEditText.setText(newAmount + "");
                }
                else  textViewtotalamountDialog.setText(String.valueOf(0));
            }
        });
    }

    private void setupMinusButton(){
        View minusButton=getView().findViewById(R.id.minus);
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentAmount = getCurrentAmount();
                if (currentAmount != 0){
                    int newAmount = currentAmount + decreaseInterval;
                    amountEditText.setText(newAmount + "");

                    int currentAmountDialog=getTotalAmountDialog();
                    int newAmountDialog=currentAmountDialog + increaseInterval;
                    textViewtotalamountDialog.setText(newAmountDialog + "");
                }
                else
                    amountEditText.setText(String.valueOf(0));
            }
        });
    }

    private void setupOKButton() {
        View okButton = getView().findViewById(R.id.ok);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amountInt = getCurrentAmount();

                if (selectAmountListener != null ){
                    selectAmountListener.onAmountSelected(amountInt);
                }
                dismiss();
            }
        });
    }

    private void setupCancelButton(){
        View cancelButton=getView().findViewById(R.id.cancel);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                int amountInt=getCurrentAmount();
//                selectAmountListener.onAmountSelected(amountInt);
                dismiss();
            }
        });
    }

    private int getCurrentAmount() {
        amountEditText = (EditText) getView().findViewById(R.id.amountEditText);
        String amount = amountEditText.getText().toString();
        return new Integer(amount);
    }

    private int getTotalAmountDialog(){
        textViewtotalamountDialog=(TextView)getView().findViewById(R.id.textViewtotalamountDialog);
        String totalamoDialog=textViewtotalamountDialog.getText().toString();
        return new Integer(totalamoDialog);
    }
}
