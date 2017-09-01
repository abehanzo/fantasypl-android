package com.abraham.fantasypremierleague;

/**
 * Created by Abraham on 01-Sep-17.
 */

public class Players {

    private String name;
    private String position;
    private int image;
    private String currentValue;
    private String netTransfer;



    public Players(String name, String position, int image, String currentValue, String netTransfer) {
        this.name = name;
        this.position = position;
        this.image = image;
        this.currentValue = currentValue;
        this.netTransfer = netTransfer;
    }
    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getCurrentValue() {
        return currentValue;
    }
    public String getPosition() {
        return position;
    }

    public String getNetTransfer() {
        return netTransfer;
    }

}
