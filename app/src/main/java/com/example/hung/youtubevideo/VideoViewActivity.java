package com.example.hung.youtubevideo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.VideoView;

public class VideoViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String testLink1 = "https://r3---sn-42u-i5oz.googlevideo.com/videoplayback?requiressl=yes&id=e89656f444c02b26&itag=18&source=webdrive&ttl=transient&app=texmex&ip=58.187.46.44&ipbits=0&expire=1473008862&sparams=expire,id,ip,ipbits,itag,mm,mn,ms,mv,pl,requiressl,source,ttl&signature=67C0F5BC497CC95F9595255EE80C4673B268DF5D.503E723065069493C82BABD99AE9862ECFF0D6BB&key=cms1&pl=24&sc=yes&cms_redirect=yes&mm=31&mn=sn-42u-i5oz&ms=au&mt=1472999805&mv=m";
        String testLink2 = "https://r7---sn-42u-i5oel.googlevideo.com/videoplayback?requiressl=yes&id=4437cae6e34c4811&itag=18&source=webdrive&ttl=transient&app=texmex&ip=58.187.46.44&ipbits=0&expire=1473013524&sparams=expire,id,ip,ipbits,itag,mm,mn,ms,mv,pl,requiressl,source,ttl&signature=15012028C249483BD7339D5806BFF7C509D7E86A.7DF469C347F387FD6850DDA353371983F0F071CB&key=cms1&pl=24&sc=yes&cms_redirect=yes&mm=31&mn=sn-42u-i5oel&ms=au&mt=1473002430&mv=m";

        RelativeLayout container = (RelativeLayout)findViewById(R.id.container);
        VideoView videoView = new VideoView(this);
        RelativeLayout.LayoutParams  videoParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        videoView.setLayoutParams(videoParams);
//        videoView.setVideoPath(testLink1);
        videoView.setVideoPath(testLink2);
        videoView.start();
        container.addView(videoView);
    }
}