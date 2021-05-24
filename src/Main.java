import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if(list.size() >1 && str.charAt(i) <= list.getLast() && list.contains(str.charAt(i))){
                list.clear();
            }
            list.add(str.charAt(i));
            if(list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }
}

/* 1 vong lap co 3 cau lenh ben trong = 3
1 vong lap co 1 cau lenh = 1
t(n) = O(n)
 */