package com.insufficientlight.synth_billy;

import android.content.Context;
import android.media.MediaPlayer;

public class MediaThreads implements Runnable
{

    MediaPlayer mp;
    Context context;
    int id;
    int delay;

    public MediaThreads(Context context)
    {
        this.context = context;
    }

    public void playNote(int id, int delay)
    {
        this.id = id;
        this.delay = delay;
        this.run();
    }
    @Override
    public void run()
    {
        mp = MediaPlayer.create(context, id);
        mp.start();
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        mp.release();
    }
}