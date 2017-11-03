package zerolifex00.jacketspeak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playHi (View view) {
        playSoundClip(R.raw.hi);
    }

    public void playHello (View view) {
        playSoundClip(R.raw.hello);
    }

    public void playGoodbye (View view) {
        playSoundClip(R.raw.goodbye);
    }

    public void playAcknowledged (View view) {
        playSoundClip(R.raw.acknowledged);
    }

    public void playThanksinadvance (View view) {
        playSoundClip(R.raw.thanksinadvance);
    }

    public void playThankyouverymuch (View view) {
        playSoundClip(R.raw.thankyouverymuch);
    }

    public void playYoucanthankmelater (View view) {
        playSoundClip(R.raw.youcanthankmelater);
    }

    public void playHurryup (View view) {
        playSoundClip(R.raw.hurryup);
    }

    public void playIminahurry (View view) {
        playSoundClip(R.raw.iminahurry);
    }

    public void playLetsgo (View view) {
        playSoundClip(R.raw.letsgo);
    }

    public void playMakeyourwayinside (View view) {
        playSoundClip(R.raw.makeyourwayinside);
    }

    public void playPleaseproceed (View view) {
        playSoundClip(R.raw.pleaseproceed);
    }

    public void playWeshouldgo (View view) {
        playSoundClip(R.raw.weshouldgo);
    }

    public void playArmsoutstretched (View view) {
        playSoundClip(R.raw.armsoutstretched);
    }

    public void playKneelingposition (View view) {
        playSoundClip(R.raw.kneelingposition);
    }

    public void playPleaseacceptthisgift (View view) {
        playSoundClip(R.raw.pleaseacceptthisgift);
    }

    public void playPleaseapplyhandcuffsthankyou (View view) {
        playSoundClip(R.raw.pleaseapplyhandcuffsthankyou);
    }

    public void playPleasecalltechnicalsupport (View view) {
        playSoundClip(R.raw.pleasecalltechnicalsupport);
    }

    public void playPleasedontdothatagain (View view) {
        playSoundClip(R.raw.pleasedontdothatagain);
    }

    public void playPleasepayattention (View view) {
        playSoundClip(R.raw.pleasepayattention);
    }

    public void playStaycalmanddontpanic (View view) {
        playSoundClip(R.raw.staycalmanddontpanic);
    }

    public void playWakeup (View view) {
        playSoundClip(R.raw.wakeup);
    }

    public void playAvoidfatalinjury (View view) {
        playSoundClip(R.raw.avoidfatalinjury);
    }

    public void playDoyouknowwhattimeitis (View view) {
        playSoundClip(R.raw.doyouknowwhattimeitis);
    }

    public void playIbelievehooraysareinorder (View view) {
        playSoundClip(R.raw.ibelievehooraysareinorder);
    }

    public void playIdontfeeltoowell (View view) {
        playSoundClip(R.raw.idontfeeltoowell);
    }

    public void playIhadagreattime (View view) {
        playSoundClip(R.raw.ihadagreattime);
    }

    public void playImadeamistake (View view) {
        playSoundClip(R.raw.imadeamistake);
    }

    public void playIwillgladlyhelp (View view) {
        playSoundClip(R.raw.iwillgladlyhelp);
    }

    public void playWhatalovelydayright (View view) {
        playSoundClip(R.raw.whatalovelydayright);
    }

    private void playSoundClip(int handle){
        Context appContext = getApplicationContext();
        MediaPlayer mp = MediaPlayer.create(appContext , handle);
        mp.start();
    }
}
