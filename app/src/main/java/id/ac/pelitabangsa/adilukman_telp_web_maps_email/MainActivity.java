package id.ac.pelitabangsa.adilukman_telp_web_maps_email;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);

        ActionBar actionBar = getSupportActionBar();
        TextView mDetailTv = (TextView) findViewById(R.id.textView);
        TextView mDetailTv1 = (TextView) findViewById(R.id.textView1);

        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();

        String mContent = intent.getStringExtra("contentTv");
        String mContent1 = intent.getStringExtra("contentTv1");

        //set actionbar title
        //set text in textview
        mDetailTv.setText(mContent);
        mDetailTv1.setText(mContent1);

    //      // open kontak di bawah
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:08989538457"));
                startActivity(intent);

            }
        });
        // Open kontak di atas

        // go WEB di bawah
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent, chooser;
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://ecampus.pelitabangsa.ac.id/pb/ecampus.jsp"));
                chooser = Intent.createChooser(intent, "WEB");
                startActivity(chooser);
            }
        });
        // go WEB di atas

        // send email di bawah
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("message/rtc822");
                String[] to = {"adilukmannh@gmail.com"};
                emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
                startActivity(emailIntent);
                //send jamak dibawah
//              String[] to={"adilukmannh@gmail.com"};
//                ***send jamak atas****
//              intent.putExtra(Intent.EXTRA_SUBJECT, "hi. this was sent from my app");
//              intent.putExtra(Intent.EXTRA_TEXT, "hey whats up, how you doing? this is my first email message");

            }
        });
        //send email di atas

        // go maps di bawah
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent, chooser;
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://goo.gl/maps/QZfFHgeGhSCm7XYN6"));
                chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);
            }
        });
    }
}

// go maps di atas

//    public void button1(View view) {
//        Toast.makeText(Cari_kontak_1_ADI.this, "Selalu dukung kami dan nantikan update terbaru aplikasi saya", Toast.LENGTH_LONG).show();
//    }
//
//    public void button2(View view) {
//        Toast.makeText(Cari_kontak_1_ADI.this, "Selalu dukung kami dan nantikan update terbaru aplikasi saya", Toast.LENGTH_LONG).show();
//    }
//
//    public void button3(View view) {
//        Toast.makeText(Cari_kontak_1_ADI.this, "Selalu dukung kami dan nantikan update terbaru aplikasi saya", Toast.LENGTH_LONG).show();
//    }
//
//    public void button4(View view) {
//        Toast.makeText(Cari_kontak_1_ADI.this, "Selalu dukung kami dan nantikan update terbaru aplikasi saya", Toast.LENGTH_LONG).show();
//    }
//}