package com.bbd;

public class SwimmingPool {

    private Boolean needsHTH;
    private String size;

    SwimmingPool(Boolean needsHTH, String size) {
        this.needsHTH = needsHTH;
        this.size = size;

    }

    public void setNeedsHTH(Boolean h){
        this.needsHTH = h;
    }

    public void setSize(String s){
        this.size = s;
    }

    public Boolean getNeedsHTH(){
        return this.needsHTH;
    }

    public String getSize(){
        return this.size;
    }  
}