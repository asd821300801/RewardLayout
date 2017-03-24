package com.zhangyf.reward;

import android.support.annotation.NonNull;

/**
 * Created by zhangyf on 2017/3/20.
 */

public class BaseGiftBean implements Comparable<BaseGiftBean>{

    /**
     * 礼物唯一id
     */
    private int giftId;
    private String giftName;
    private int giftImg;
    /**
     * 礼物计数
     */
    private int giftCount;
    /**
     * 礼物持续时间
     */
    private String giftExistTime;
    /**
     * 礼物刷新时间
     */
    private long latestRefreshTime;
    /**
     * 当前index
     */
    private int currentIndex;

    public int getGiftId() {
        return giftId;
    }

    public void setGiftId(int giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public int getGiftImg() {
        return giftImg;
    }

    public void setGiftImg(int giftImg) {
        this.giftImg = giftImg;
    }

    public int getGiftCount() {
        return giftCount;
    }

    public void setGiftCount(int giftCount) {
        this.giftCount = giftCount;
    }

    public String getGiftExistTime() {
        return giftExistTime;
    }

    public void setGiftExistTime(String giftExistTime) {
        this.giftExistTime = giftExistTime;
    }

    public long getLatestRefreshTime() {
        return latestRefreshTime;
    }

    public void setLatestRefreshTime(long latestRefreshTime) {
        this.latestRefreshTime = latestRefreshTime;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public BaseGiftBean setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
        return this;
    }

    @Override
    public int compareTo(@NonNull BaseGiftBean o) {
        return (int) (this.getLatestRefreshTime()-o.getLatestRefreshTime());
    }
}
