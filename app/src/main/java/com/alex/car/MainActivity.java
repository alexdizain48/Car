package com.alex.car;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    MaterialEditText editVin;
    Button sendVin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editVin = (MaterialEditText)findViewById(R.id.vinEdit);

        sendVin = (Button)findViewById(R.id.vinSend);
        sendVin.setBackgroundResource(R.color.colorGreenDisable);
        sendVin.setTextColor(0x6EBEBEBE);
        sendVin.setEnabled(false);

        editVin.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String valid = editVin.getText().toString().trim();

               if (valid.length() == 17) {
                   sendVin.setBackgroundResource(R.color.colorGreen);
                   sendVin.setTextColor(0xFFFFFFFF);
                   sendVin.setEnabled(true);

               } else {
                   if (valid.length() < 17 || valid.length() > 17) {
                       sendVin.setBackgroundResource(R.color.colorGreenDisable);
                       sendVin.setTextColor(0x6EBEBEBE);
                       sendVin.setEnabled(false);
                   }
               }


                //Pattern ps = Pattern.compile("(([0-3[7-9]]){0,}([\\\\.]){0,})+");
               /* Pattern ps = Pattern.compile("(([0-9]){0,}([A-H[J-N]]){0,}([P[R-Z]]){0,})+");
                Matcher ms = ps.matcher(valid);
                boolean bs = ms.matches();
                if (!bs) {
                    Toast.makeText(MainActivity.this, "Некорректный символ " + valid.charAt(valid.length() - 1), Toast.LENGTH_SHORT).show();*/

                   /* Spannable spans = new SpannableString(valid);
                    spans.setSpan(new ForegroundColorSpan(Color.GREEN), 0, 4, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
                    editVin.setText(spans);*/
                //}
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editVin.getText().length() > 17) {
                    Toast.makeText(MainActivity.this, "Превышен размер VIN кода", Toast.LENGTH_SHORT).show();
                    //editVin.setText(editVin.getText().subSequence(editVin.getText().length(), editVin.getText().length()-1));
                }
            }
        });

        sendVin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InfoCar.class);
                startActivity(intent);

            }
        });
    }

}

