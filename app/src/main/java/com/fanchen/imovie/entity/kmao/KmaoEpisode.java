package com.fanchen.imovie.entity.kmao;

import android.os.Parcel;
import android.os.Parcelable;

import com.fanchen.imovie.entity.face.IVideoEpisode;
import com.fanchen.imovie.entity.face.IViewType;
import com.fanchen.imovie.retrofit.service.KmaoService;

/**
 * Created by fanchen on 2017/9/25.
 */
public class KmaoEpisode implements IVideoEpisode,Parcelable {
    private String title;
    private String url;
    private String id;
    private int state;

    public KmaoEpisode() {
    }


    protected KmaoEpisode(Parcel in) {
        title = in.readString();
        url = in.readString();
        id = in.readString();
        state = in.readInt();
    }

    public static final Creator<KmaoEpisode> CREATOR = new Creator<KmaoEpisode>() {
        @Override
        public KmaoEpisode createFromParcel(Parcel in) {
            return new KmaoEpisode(in);
        }

        @Override
        public KmaoEpisode[] newArray(int size) {
            return new KmaoEpisode[size];
        }
    };

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getSource() {
        return 0;
    }

    @Override
    public int getPlayerType() {
        return PLAY_TYPE_URL;
    }

    @Override
    public String getExtend() {
        return null;
    }

    @Override
    public String getServiceClassName() {
        return KmaoService.class.getName();
    }

    @Override
    public int getDownloadState() {
        return state;
    }

    @Override
    public void setDownloadState(int state) {
        this.state = state;
    }

    @Override
    public void setFilePath(String path) {
        this.url = path;
    }

    @Override
    public int getViewType() {
        return IViewType.TYPE_NORMAL;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(url);
        dest.writeString(id);
        dest.writeInt(state);
    }
}
