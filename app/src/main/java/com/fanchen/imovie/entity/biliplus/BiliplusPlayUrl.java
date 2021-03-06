package com.fanchen.imovie.entity.biliplus;

import com.fanchen.imovie.entity.face.IPlayUrls;
import com.fanchen.imovie.entity.face.IVideoEpisode;

import java.util.Map;

/**
 * Created by fanchen on 2017/10/12.
 */
public class BiliplusPlayUrl implements IPlayUrls{

    private boolean success;
    private String message;
    private String cid;
    private Map<String, String> urls;

    @Override
    public Map<String, String> getUrls() {
        return urls;
    }

    @Override
    public int getPlayType() {
        return IVideoEpisode.PLAY_TYPE_VIDEO;
    }

    @Override
    public int getUrlType() {
        return URL_FILE;
    }

    @Override
    public String getReferer() {
        return null;
    }

    @Override
    public boolean isSuccess() {
        return success;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUrls(Map<String, String> urls) {
        this.urls = urls;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}
