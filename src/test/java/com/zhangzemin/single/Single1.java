package com.zhangzemin.single;

/**
 * 单例模式:饿汉式
 * @author zhangzemin
 * @date 2020/4/2 0:18
 */

/*version 1*/
public class Single1 {
    private static Single1 instance;
    public static Single1 getInstance(){
        if(instance == null){
            instance  = new Single1();
        }
        return instance;
    }
}

/*version 1.1*/
class Single2{
    private static Single2 instance;
    private Single2(){}
    public static Single2 getInstance(){
        if(instance == null){
            instance = new Single2();
        }
        return instance;
    }
}


