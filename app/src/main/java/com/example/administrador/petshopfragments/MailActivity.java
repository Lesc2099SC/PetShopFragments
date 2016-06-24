package com.example.administrador.petshopfragments;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MailActivity extends AppCompatActivity {

    public String strUserFrom;
    public String strPass;
    public String strEmailTo;
    public String strBody;
    public String strSubject;
    TextView txtSubject;
    TextView txtEmailAddressTo;
    TextView txtBody;
    TextView txtFrom;
    TextView txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);

        txtFrom = (TextView) findViewById(R.id.txtViewFrom);
        txtPass = (TextView) findViewById(R.id.txtViewPass);
        txtEmailAddressTo = (TextView) findViewById(R.id.txtViewEmailAddress);
        txtSubject = (TextView)findViewById(R.id.txtViewSubject);
        txtBody = (TextView)findViewById(R.id.txtViewBody);

        strUserFrom = txtFrom.getText().toString();
        strPass = txtPass.getText().toString();
        strEmailTo = txtEmailAddressTo.getText().toString();
        strSubject = txtSubject.getText().toString();
        strBody = txtBody.getText().toString();
    }

    public void sendEmail(){
        /*
        EmailSender emailSender=new EmailSender();
        emailSender.execute(strUserFrom, strPass, strEmailTo,strSubject,strBody);
        */
        if (!strUserFrom.equals("") && !strPass.equals("") && !strEmailTo.equals("") && !strSubject.equals("") && !strBody.equals("")){
            Toast.makeText(MailActivity.this, "Your mail has been sent", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MailActivity.this, MainActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(MailActivity.this, "One or more Fields are empty, check please !", Toast.LENGTH_SHORT).show();
        }


        /*
        Intent i  = new Intent(Intent.ACTION_SEND), chooser = null;
        i.setData(Uri.parse("mailto:"));
        String strSendTo = "lsantossr@gmail.com";
        i.putExtra(Intent.EXTRA_EMAIL,strSendTo);
        i.putExtra(Intent.EXTRA_SUBJECT, txtSubject.getText().toString());
        i.putExtra(Intent.EXTRA_TEXT, txtBody.getText().toString());
        i.setType("message/rfc822");
        chooser = Intent.createChooser(i,"Send Email");
        startActivity(chooser);*/


    }
}
