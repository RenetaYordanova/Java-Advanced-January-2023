package StacksandQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Deque<Integer>bits=new ArrayDeque<>();

        int num=Integer.parseInt(scanner.nextLine());

        if(num<0){
            System.out.println("Cannot handle negative integers");
            return;
        }else if(num==0){
            System.out.println(0);
            return;
        }
        while(num>0){
            int bit=num%2;
            bits.push(bit);

            num=num/2;

        }
        while(!bits.isEmpty()) {
            System.out.print(bits.pop());
        }
    }
}
