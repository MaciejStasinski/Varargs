package com.company;

public class Main {

    public static void main(String[] args) {
	Add ob =new Add();
	ob.add(1,2,3,4,5);
    }
}
class Add{
    void add(int... number){
        int sum=0;
        for (int i = 0; i < number.length; i++) {
            if(i<number.length-1) {
                System.out.print(number[i] + "+");
                sum += number[i];
            } else {
                System.out.print(number[i]);
                sum += number[i];
            }
        }
        System.out.println("="+sum);
    }
}