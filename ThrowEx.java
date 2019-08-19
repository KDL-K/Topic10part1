package com.shevlik.Topic10;

public class ThrowEx {
    int a;

    public ThrowEx(int a){
        this.a=a;
    }

    public void methEx() throws MyEx1,MyEx2,MyEx3,MyEx4{
        if(a<10) throw new MyEx1();
        if(a<20) throw new MyEx2();
        if(a>1000) throw new MyEx4();
        if(a>100) throw new MyEx3();
    }
}
