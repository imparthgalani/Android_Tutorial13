package com.rku.tutorial13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtNumber, edtTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumber = findViewById(R.id.edtNumber);
        edtTextMessage = findViewById(R.id.edtTextMessage);
    }

    public void call_action(View view) {
        String phoneNumber = edtNumber.getText().toString();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel" + phoneNumber));
        startActivity(intent);
    }

    public void sms_action(View view) {
        String phoneNumber = edtNumber.getText().toString();
        String smsText = edtTextMessage.getText().toString();
    }
}