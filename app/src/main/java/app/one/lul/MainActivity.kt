package app.one.lul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.view.View

class MainActivity : AppCompatActivity() {
    var mPlayer:MediaPlayer?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun play(view: View){
        if (mPlayer==null){
            mPlayer=MediaPlayer.create(this,R.raw.padoru_padoru)
            mPlayer!!.isLooping=true
            mPlayer!!.start()
        }else if(mPlayer!=null && mPlayer!!.isPlaying) mPlayer!!.pause()
    }

    override fun onStop() {
        super.onStop()
        if (mPlayer != null) {
            mPlayer!!.release()
            mPlayer = null
        }
    }

}