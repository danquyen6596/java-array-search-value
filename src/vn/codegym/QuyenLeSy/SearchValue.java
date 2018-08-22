package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class SearchValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;
        int[] array = {5, 6, 3, 1, 2, 9, 12, 34, 52};

        do {
            System.out.print("Nhập vào vị trí: ");
            index = scanner.nextInt();
            printValue(array, index);
        }
        while (index < 0 || index > (array.length-1));


    }

    public static void printValue(int[] array, int index){
        if(index < 0 || index > (array.length-1)){
            System.out.println("Vị trí nhập nằm ngoài độ dài của mảng!");
        }
        else
        {
            System.out.print("Giá trị tại vị trí "+ index+" là: "+array[index-1]);
        }
    }
}
