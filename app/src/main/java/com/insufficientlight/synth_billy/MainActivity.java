package com.insufficientlight.synth_billy;
import com.insufficientlight.synth_billy.MediaThreads;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;


public class MainActivity extends AppCompatActivity
{
    private Button challenge1Button;
    private Button challenge3Button;
    private Button challenge5Button;
    private Button challenge7Button;
    private Button challenge8Button;
    private Button challenge9Button;
    private NumberPicker notePicker;
    private MediaThreads mpt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        //Get the widgets reference from XML layout
        NumberPicker np = (NumberPicker) findViewById(R.id.np);

        //Populate NumberPicker values from minimum and maximum value range
        //Set the minimum value of NumberPicker
        np.setMinValue(0);
        //Specify the maximum value/number of NumberPicker
        np.setMaxValue(10);

        //Gets whether the selector wheel wraps when reaching the min/max value.
        np.setWrapSelectorWheel(true);


        challenge1Button = (Button)findViewById(R.id.challenge1Button);
        challenge3Button = (Button)findViewById(R.id.challenge3Button);
        challenge5Button = (Button)findViewById(R.id.challenge5Button);
        challenge7Button = (Button)findViewById(R.id.challenge7Button);
        challenge8Button = (Button)findViewById(R.id.challenge8Button);
        challenge9Button = (Button)findViewById(R.id.challenge9Button);
        final int[] noteArray = {R.raw.scalea, R.raw.scaleb,R.raw.scalebb,R.raw.scalec,R.raw.scalecs,R.raw.scaled,
            R.raw.scaleds,R.raw.scalee,R.raw.scalef,R.raw.scalefs,R.raw.scaleg,R.raw.scalegs, R.raw.scalehighe,
            R.raw.scalehighf,R.raw.scalehighfs,R.raw.scalehighg};
        final int[] eScale = {R.raw.scalee, R.raw.scalefs,R.raw.scaleg,R.raw.scalea,R.raw.scaleb,R.raw.scalecs, R.raw.scaled,R.raw.scalehighe};
            mpt = new MediaThreads(MainActivity.this);
        final int[] twinkleTwinkle =
            {
                    R.raw.scalea,
                    R.raw.scalea,
                    R.raw.scalehighe,
                    R.raw.scalehighe,
                    R.raw.scalehighfs,
                    R.raw.scalehighfs,
                    R.raw.scalehighe,
                    R.raw.scaled,
                    R.raw.scaled,
                    R.raw.scalecs,
                    R.raw.scalecs,
                    R.raw.scaleb,
                    R.raw.scaleb,
                    R.raw.scalea
            };
        final int[] twinkleTwinkle2 =
                {
                        R.raw.scalehighe,
                        R.raw.scalehighe,
                        R.raw.scaled,
                        R.raw.scaled,
                        R.raw.scalecs,
                        R.raw.scalecs,
                        R.raw.scaleb
                };
        final int[] twinkleDelay =
                {
                        500,
                        500,
                        500,
                        500,
                        500,
                        500,
                        1000,
                        500,
                        500,
                        500,
                        500,
                        500,
                        500,
                        1000
                };
        mpt = new MediaThreads(MainActivity.this);
        //Completes Challenge 1
        challenge1Button.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            mpt.playNote(R.raw.scalee, 500);
            mpt.playNote(R.raw.scalefs, 500);
            mpt.playNote(R.raw.scaleg, 500);
            mpt.playNote(R.raw.scalea, 500);
            mpt.playNote(R.raw.scaleb, 500);
            mpt.playNote(R.raw.scalecs, 500);
            mpt.playNote(R.raw.scaled, 500);
            mpt.playNote(R.raw.scalehighe, 500);
        }

    });
        //Completes Challenge 3
        challenge3Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               int i = 0;
               while(i < eScale.length -1)
               {
                   mpt.playNote(eScale[i], 500);
                   i++;
               }

            }

        });
        //Completes Challenge 5 and 6
        challenge5Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mpt.playNote(R.raw.scalea, 500);
                mpt.playNote(R.raw.scalea, 500);
                mpt.playNote(R.raw.scalehighe, 500);
                mpt.playNote(R.raw.scalehighe, 500);
                mpt.playNote(R.raw.scalehighfs, 500);
                mpt.playNote(R.raw.scalehighfs, 500);
                mpt.playNote(R.raw.scalehighe, 500);
                mpt.playNote(R.raw.scaled, 500);
                mpt.playNote(R.raw.scaled, 500);
                mpt.playNote(R.raw.scalecs, 500);
                mpt.playNote(R.raw.scalecs, 500);
                mpt.playNote(R.raw.scaleb, 500);
                mpt.playNote(R.raw.scaleb, 500);
                mpt.playNote(R.raw.scalea, 500);
            }

        });
        //Completes Challenge 7
        challenge7Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int i = 0;
                while (i < twinkleTwinkle.length - 1)
                {
                    mpt.playNote(twinkleTwinkle[i], 500);
                    i++;
                }
            }
        });
        //Completes Challenge 8
        challenge8Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int i = 0;
                while (i < twinkleTwinkle.length - 1)
                {
                    mpt.playNote(twinkleTwinkle[i], twinkleDelay[i]);
                    i++;
                }
            }
        }); //Compltes Challenge 9
        challenge9Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int i = 0;
                while (i < twinkleTwinkle.length - 1)
                {
                    mpt.playNote(twinkleTwinkle[i], twinkleDelay[i]);
                    i++;
                }

                i = 0;
                while (i < twinkleTwinkle2.length - 1)
                {
                    mpt.playNote(twinkleTwinkle2[i], twinkleDelay[i]);
                    i++;
                }
                i = 0;
                while (i < twinkleTwinkle.length - 1)
                {
                    mpt.playNote(twinkleTwinkle[i], twinkleDelay[i]);
                    i++;
                }
            }
        });
    }
}