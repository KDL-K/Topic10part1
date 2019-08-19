package com.shevlik.Topic10;

public class TestEx {
    static void methProcess(int n){
        ThrowEx thEx=new ThrowEx(n);
        try{
            thEx.methEx();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        methProcess(8);
    }
}
