package com.example.xiaoshixun.factory_a;

public class XiaoMiMiphonefactory extends phonefactory {
    @Override
    public phone createPhone() {
        return new XiaoMiMiphone();
    }
}
