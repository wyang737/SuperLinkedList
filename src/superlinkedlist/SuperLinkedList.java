package superlinkedlist;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class SuperLinkedList {

    public static void makeList(List<Integer> lst) {
        for (int x = 0; x < 100; x++) {
            int random = (int) (Math.random() * 23 + 1);
            lst.add(random);
        }
        System.out.println(lst);
    }

    public static void makeList2(List<Integer> lst) {
        lst.add(1);
        lst.add(2);
        lst.add(3);
    }

    public static void deleteList(List<Integer> lst) {
        Scanner read = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a number to delete: ");
        String input = read.next();
        int delete = Integer.parseInt(input);
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) == delete) {
                lst.remove(i);
            }
        }
        System.out.print(lst);
    }

    public static void findList(List<Integer> lst) {
        Scanner read = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a number to search for: ");
        String input = read.next();
        int find = Integer.parseInt(input);
        int occurences = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) == find) {
                occurences = occurences + 1;
            }
        }
        System.out.println("Number of " + input + "'s :" + occurences);
    }

    public static void reverseList(List<Integer> lst) {
        System.out.println("Reversed list: ");
        int hold;
        for (int i = lst.size() - 2; i >= 0; i--) {
            hold = lst.get(i);
            lst.remove(i);
            lst.add(hold);
        }
        System.out.println(lst);
    }

    public static void reverseListBuggy(List<Integer> lst) {
        System.out.println("Reversed list: ");
        int hold;
        for (int i = lst.size() - 1; i != -1; i--) {
            hold = lst.get(i);
            lst.remove(i);
            lst.add(hold);
        }
        System.out.println(lst);
    }

    public static void printFrequency(List<Integer> lst) {
        System.out.println("Frequency: ");
        int hold = 0;
        int counter = 0;
        do {
            hold = hold + 1;
            for (int x = 0; x < lst.size(); x++) {
                if (lst.get(x) == hold) {
                    counter = counter + 1;
                }
            }
            System.out.println(hold + ": " + counter + "%");
            counter = 0;
        } while (hold < 23);
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        makeList(list1);
        //makeList2(list1);
        deleteList(list1);
        findList(list1);
        reverseList(list1);
        //reverseListBuggy(list1);
        printFrequency(list1);
    }
}