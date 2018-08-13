import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        String[] array1 = new String[5];
        String[] array2 = new String[6];
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap gia tri cua mang 1:");
        for (int i = 0; i < array1.length; i++){
            System.out.print("Gia tri " + (i+1) +" la: ");
            array1[i] = sc.nextLine();
        }

        System.out.println("Nhap gia tri cua mang 2:");
        for (int i = 0; i < array2.length; i++){
            System.out.print("Gia tri " + (i + 1) +" la: ");
            array2[i] = sc.nextLine();
        }

        int index=0;
        String[] array3 = new String[11];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            index = i;
        }
        for (int i = (index + 1), j = 0; i < array3.length; i++, j++) {
            array3[i] = array2[j];
        }
        System.out.println("Mang gop cua 2 mang da cho la:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}
