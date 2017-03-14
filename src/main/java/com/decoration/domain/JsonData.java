package com.decoration.domain;

import java.io.Serializable;

/**
 * Created by LiMeiyuan on 2017/3/14.
 * description:
 */
public class JsonData implements Serializable {
    private String id;
    private String url;
    private String data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
