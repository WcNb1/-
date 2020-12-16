package com.example.xiaoshixun.factory;

public  class phoneFacotry {
    public static phone createpahone(String type){
        if (type.equals("iphone")){
            return new iphone();
        }else if (type.equals("miphone")){
            return new Miphone();
        }
        return null;
    }
}
