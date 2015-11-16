package com.xg.luang.helloword;

/**
 * Created by liangxg on 2015/9/22.
 */
public class HelloJni {
    private native   void    log() ;

    public void helloJniLog(){

        log();
    };
}
