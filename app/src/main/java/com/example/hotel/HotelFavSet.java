package com.example.hotel;

public class HotelFavSet {
    private static int H_1;
    private static int H_2;
    private static int H_3;
    private static int H_4;
    private static int H_5;

    public HotelFavSet(int newH_1,int newH_2,int newH_3,int newH_4,int newH_5)
    {
        H_1 = newH_1;
        H_2 = newH_2;
        H_3 = newH_3;
        H_4 = newH_4;
        H_5 = newH_5;
    }
    public static void setH_5(int newH_5){
        H_5 = newH_5;
    }
    public static void setH_4(int newH_4){
        H_4= newH_4;
    }
    public static void setH_3(int newH_3){
        H_3 = newH_3;
    }
    public static void setH_2(int newH_2){
        H_2 = newH_2;
    }
    public static void setH_1(int newH_1){
        H_1 = newH_1;
    }
    public static int getH_1(){
        return H_1;
    }
    public static int getH_2(){
        return H_2;
    }
    public static int getH_3(){
        return H_3;
    }
    public static int getH_4(){
        return H_4;
    }
    public static int getH_5() {
        return H_5;
    }
}
