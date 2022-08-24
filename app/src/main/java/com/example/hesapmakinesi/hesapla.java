package com.example.hesapmakinesi;

public class hesapla {
    private int gelensayi1, dgelensayi2;

    public hesapla(int gelensayi1, int dgelensayi2) {
        this.gelensayi1 = gelensayi1;
        this.dgelensayi2 = dgelensayi2;
    }
    public int topla(){
        return gelensayi1+dgelensayi2;
    }
    public int cikar(){
        return gelensayi1-dgelensayi2;
    }
    public int carp(){
        return gelensayi1*dgelensayi2;
    }
    public int bol(){
        return gelensayi1/dgelensayi2;
    }



}
