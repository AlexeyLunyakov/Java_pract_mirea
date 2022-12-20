package ru.mirea.newpr.pr26_done;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.abs;

public class HT {
    private record Node(String key, String value) {
    }
    int size;
    ArrayList<LinkedList<Node>> hashTable;

    public int HTHash(String key){
        return abs(key.hashCode() % size);
    }
    public void HTInit(int size){
        this.size = size;
        hashTable = new ArrayList<>(size);
    }
    public void HTAdd(String key, String value){
        int index = HTHash(key);
        Node element = new Node(key, value);
        LinkedList<Node> tmp;
        try{
            tmp = hashTable.remove(index);
            tmp.add(element);
        }
        catch (IndexOutOfBoundsException ingnored){
            tmp = new LinkedList<>();
            tmp.add(element);
        }
        hashTable.add(index, tmp);
    }

    public String HTLookup(String key){
        int index = HTHash(key);
        try{
            LinkedList<Node> tmp = hashTable.get(index);
            for (Node el: tmp)
                if (Objects.equals(el.key, key))
                    return el.value;
            return "This element does not exist";
        }
        catch (IndexOutOfBoundsException ignored){
            return "This element does not exist";
        }
    }

    public void HTDelete(String key){
        int index = HTHash(key);
        LinkedList<Node> tmp = hashTable.remove(index);
        String ans = "This element does not exist";
        for (Node el: tmp)
            if (Objects.equals(el.key, key)){
                ans = el.value;
                tmp.remove(el);
                break;
            }
        hashTable.add(index, tmp);
    }
    public static void main(String[] args) {
        HT tab = new HT();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of entries: ");
        int count = scan.nextInt();
        tab.HTInit(count);
        scan.nextLine();
        for (int i = 0; i < count; ++i){
            System.out.print("Enter key and value split with space ");
            String[] line = scan.nextLine().split(" ");
            tab.HTAdd(line[0], line[1]);
        }
        System.out.print("Enter the key you want to search for: ");
        String key = scan.next();
        String value = tab.HTLookup(key);
        System.out.println("Key value - " + value);
        System.out.print("Enter the key you want to delete: ");
        key = scan.next();
        value = tab.HTLookup(key);
        tab.HTDelete(key);
        value = tab.HTLookup(key);
        System.out.println("Key value - " + value);
    }
}
