package com.hakanerdogmus.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//context 2 çeşit var.
    //Activity Context ve App Context
        //activity de this kullanıyoruz bu bize yazıldığı yerin üstündeki methodu alıyor referans olarak.
    //App Context app i ilgilendiren context için genelde b kullanılabilir.

    public void kaydet (View view){
        AlertDialog.Builder kaydet = new AlertDialog.Builder(this);

        kaydet.setTitle("Kaydet");
        kaydet.setMessage("Emin misin?");
        kaydet.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //kaydet
                Toast.makeText(MainActivity.this, "Kaydedildi", Toast.LENGTH_LONG).show();

            }
        });

        kaydet.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this, "Kaydedilmedi", Toast.LENGTH_LONG).show();
            }
        });
        kaydet.show();
    }

}