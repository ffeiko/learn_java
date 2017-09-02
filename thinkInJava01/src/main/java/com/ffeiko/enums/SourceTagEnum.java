package com.ffeiko.enums;

/**
 * Created by Administrator on 2017/9/2.
 */
public enum SourceTagEnum {

    OWNER_CREATE("用户自建",1),
    RECEIVED("扫描获得" ,2);

    private String sourceName;
    private int index;
    private SourceTagEnum(String sourceName) {
        this.sourceName = sourceName;
    }


    SourceTagEnum(String s, int i) {

    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
