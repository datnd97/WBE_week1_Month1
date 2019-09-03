/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seeson2_week2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DATVN
 */
public class TH_ArrayException_nd {
    
    public static void main(String[] args) {
        
        Scanner  scanner = new Scanner(System.in);
        Integer[] arr = creatRandom();
        System.out.println("Nhập chỉ số của 1 phần tử trong mảng (0-99): ");
 
        int index = scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so "+index +" la: "+arr[index]);
        } catch (Exception e) {
            System.out.println("Chi so vuot qua gioi han cua mang.");
        }
    }
    public static Integer[] creatRandom()
    {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] =  rd.nextInt(100);
            System.out.println(arr[i]   +" ");
        }
        return arr;
    }
    
}
