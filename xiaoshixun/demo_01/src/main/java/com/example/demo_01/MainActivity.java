package com.example.demo_01;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.yc.video.player.VideoPlayer;
import com.yc.video.ui.view.BasisVideoController;


public class MainActivity extends AppCompatActivity {


    private VideoPlayer video_player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        /*video_player = (VideoPlayer) findViewById(R.id.video_player);
        //设置播放类型
// IjkPlayer or MediaPlayer
        video_player.setPlayerType(VideoPlayer.TYPE_AN);
//网络视频地址
//设置视频地址和请求头部
        video_player.setUp("http://www.w3school.com.cn/example/html5/mov_bbb.mp4", null);
//创建视频控制器
        VideoPlayerController controller = new VideoPlayerController(this);
        controller.setTitle("自定义视频播放器可以播放视频拉");
//设置视频控制器
        video_player.setController(controller);*/
        video_player = (VideoPlayer) findViewById(R.id.video_player);
        //创建基础视频播放器，一般播放器的功能
        BasisVideoController controller = new BasisVideoController(this);
//设置控制器
        video_player.setController(controller);
//设置视频播放链接地址
        video_player.setUrl("https://www.w3schools.com/html/movie.mp4");
//开始播放
        video_player.start();
      /*  video_player.postDelayed(new Runnable() {
            @Override
            public void run() {
                video_player.start();
            }




        },300);*/

    }
}
