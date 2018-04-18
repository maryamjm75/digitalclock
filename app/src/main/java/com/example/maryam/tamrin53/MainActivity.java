package com.example.maryam.tamrin53;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Typeface d = Typeface.createFromAsset(getAssets(),"font/digital7.otf");
        TextView txt1 = (TextView)findViewById(R.id.txt1);
        //TextView txt2 = (TextView)findViewById(R.id.txt2);
        txt1.setTypeface(d);
        //txt2.setTypeface(d);


        /*MediaPlayer z;
        ArrayList<MediaPlayer> addad = new ArrayList<MediaPlayer>(){
            add(R.raw.saat);
        };*/

        //Media  addad [] = new MediaPlayer[23];
        //addad[0]=R.raw.saat;
        //addad [] =  {R.raw.charda, R.raw.panjah};
        //int [] s = {R.raw.saat , R.raw.daghighe};
        //final int [] o = {R.raw.sizda_o , R.raw.charda_o};
        Button b1 = (Button) findViewById(R.id.btn1);
        final EditText e1 = (EditText)findViewById(R.id.edt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date d = new Date();
                int h = d.getHours();
                int m = d.getMinutes();
                int s = d.getSeconds();
                e1.setText(h + ":" + m + ":" + s);
                MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.hour);
                //mp.setOnCompletionListener();
                mp.start();
                while( h != 0 ) {
                   if (0 < h && h < 20) {
                         int i = h;
                        if (m != 0 || s != 0) {
                            //z = o[i];
                            mp = MediaPlayer.create(MainActivity.this, R.raw.hour);
                            mp.start();
                        }
                         else if (m == 0 && s == 0) {
                            //mp = MediaPlayer.create(MainActivity.this , R.raw.addad[h]);
                            mp.start();
                        }
                    }
                }//end of while
            }
        });
    }
}

                  /*  else if (h>20){
                        if ((h%10)==0){
                            if (m!=0 || s!=0){
                                i = o[h];
                                mp = MediaPlayer.create(MainActivity.this, R.raw.i);
                                mp.start();
                            }
                            else if (m==0 && s==0){
                                mp = MediaPlayer.create(MainActivity.this , R.raw.adad[h]);
                                mp.start();
                            }

                        }
                        else {
                            h1=h%10;
                            h2=h-h1;
                            mp = MediaPlayer.create(MainActivity.this, R.raw.o[h]);
                            mp.start();
                            mp = MediaPlayer.create(MainActivity.this , R.raw.adad[h]);
                            mp.start();
                            }
                }

            }*/


