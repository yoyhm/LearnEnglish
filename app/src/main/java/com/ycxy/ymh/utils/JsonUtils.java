package com.ycxy.ymh.utils;

import com.alibaba.fastjson.JSON;
import com.ycxy.ymh.bean.MusicList;
import com.ycxy.ymh.bean2.MusicInfo;
import com.ycxy.ymh.bean3.Lyric;
import com.ycxy.ymh.bean5.MVList;
import com.ycxy.ymh.bean6.MVInfo;

/**
 * Created by Y&MH on 2018-1-13.
 */

public class JsonUtils {
    public static MusicList parseMusicList(String response){
        return JSON.parseObject(response, MusicList.class);
    }

    public static MusicInfo parseMusic(String response){
        return JSON.parseObject(response, MusicInfo.class);
    }

    public static Lyric parseLyric(String response){
        return JSON.parseObject(response, Lyric.class);
    }

    public static MVList parseMvlist(String response){
        return JSON.parseObject(response, MVList.class);
    }

    public static MVInfo parseMvInfo(String response) {
        return JSON.parseObject(response, MVInfo.class);
    }
}
