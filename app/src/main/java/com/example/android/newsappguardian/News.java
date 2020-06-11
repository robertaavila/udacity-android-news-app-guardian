package com.example.android.newsappguardian;

public class News {

    private String mTitulo;
    private String mUrl;
    private String mCategoria;
    private String mData;
    private String mAutor;

    public News(String mTitulo, String mCategoria, String mData, String mUrl, String mAutor) {
        this.mTitulo = mTitulo;
        this.mCategoria = mCategoria;
        this.mData = mData;
        this.mUrl = mUrl;
        this.mAutor = mAutor;
    }

    public String getmTitulo() {
        return mTitulo;
    }

    public String getmCategoria() {
        return mCategoria;
    }

    public String getmData() {
        return mData;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmAutor() {
        return mAutor;
    }
}

