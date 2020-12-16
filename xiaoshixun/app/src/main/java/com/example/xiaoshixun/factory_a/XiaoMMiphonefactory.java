package com.example.xiaoshixun.factory_a;

public class XiaoMMiphonefactory extends phonefactory {
    @Override
    public phone createPhone() {
        return new XiaoMiPhone();
    }
}
