package com.owenblog.pojo;

import javax.xml.crypto.Data;

public class TBhello {
    private Integer id;
    private String title;
    private String comtent;
    private String auth;
    private String ishot;
    private String surface_url;
    private Data create_time;
    private Integer readtimes;

    @Override
    public String toString() {
        return "hello{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", comtent='" + comtent + '\'' +
                ", auth='" + auth + '\'' +
                ", ishot='" + ishot + '\'' +
                ", surface_url='" + surface_url + '\'' +
                ", create_time=" + create_time +
                ", readtimes=" + readtimes +
                ", admiretimes=" + admiretimes +
                ", commenttimes=" + commenttimes +
                '}';
    }

    private Integer admiretimes;
    private Integer commenttimes;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComtent() {
        return comtent;
    }

    public void setComtent(String comtent) {
        this.comtent = comtent;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getIshot() {
        return ishot;
    }

    public void setIshot(String ishot) {
        this.ishot = ishot;
    }

    public String getSurface_url() {
        return surface_url;
    }

    public void setSurface_url(String surface_url) {
        this.surface_url = surface_url;
    }

    public Data getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Data create_time) {
        this.create_time = create_time;
    }

    public Integer getReadtimes() {
        return readtimes;
    }

    public void setReadtimes(Integer readtimes) {
        this.readtimes = readtimes;
    }

    public Integer getAdmiretimes() {
        return admiretimes;
    }

    public void setAdmiretimes(Integer admiretimes) {
        this.admiretimes = admiretimes;
    }

    public Integer getCommenttimes() {
        return commenttimes;
    }

    public void setCommenttimes(Integer commenttimes) {
        this.commenttimes = commenttimes;
    }
}
