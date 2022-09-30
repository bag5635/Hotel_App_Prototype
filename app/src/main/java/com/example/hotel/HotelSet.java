package com.example.hotel;

public class HotelSet {
    private static int H1;
    private static int H2;
    private static int H3;
    private static int H4;
    private static int H5;
    public HotelSet(int newH1,int newH2,int newH3,int newH4,int newH5)
    {
        H1 = newH1;
        H2 = newH2;
        H3 = newH3;
        H4 = newH4;
        H5 = newH5;
    }
    public static void setH5(int newH5){
        H5 = newH5;
    }
    public static void setH4(int newH4){
        H4= newH4;
    }
    public static void setH3(int newH3){
        H3 = newH3;
    }
    public static void setH2(int newH2){
        H2 = newH2;
    }
    public static void setH1(int newH1){
        H1 = newH1;
    }
    public static int getH1(){
        return H1;
    }
    public static int getH2(){
        return H2;
    }
    public static int getH3(){
        return H3;
    }
    public static int getH4(){
        return H4;
    }
    public static int getH5() {
        return H5;
    }

}
