package application;

import entities.Product;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();
        Set<String> stringTreeSet = new TreeSet<>();
        Set<String> stringLinkedSet = new LinkedHashSet<>();

        stringSet.add("TV");
        stringSet.add("Tablet");
        stringSet.add("Notebook");

        stringTreeSet.add("TV");
        stringTreeSet.add("Tablet");
        stringTreeSet.add("Notebook");

        stringLinkedSet.add("TV");
        stringLinkedSet.add("Tablet");
        stringLinkedSet.add("Notebook");

        System.out.println(stringSet.contains("Notebook"));
        stringSet.remove("Tablet");

        for (String e : stringSet) {
            System.out.println(e);
        }

        System.out.println();

        System.out.println(stringTreeSet.contains("Notebook"));
        stringTreeSet.removeIf(x -> x.length() >= 3);

        for (String e : stringTreeSet) {
            System.out.println(e);
        }

        System.out.println();

        System.out.println(stringLinkedSet.contains("Notebook"));

        for (String e : stringLinkedSet) {
            System.out.println(e);
        }

        System.out.println();

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);
        System.out.println();

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);
        System.out.println();

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

        System.out.println();

        //Testanto igualdade com Set

        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(set.contains(prod));

        System.out.println();

        //Comparando objetos com TreeSet

        Set<Product> treeSet = new TreeSet<>();

        treeSet.add(new Product("TV", 900.0));
        treeSet.add(new Product("Notebook", 1200.0));
        treeSet.add(new Product("Tablet", 400.0));

        for (Product x : treeSet) {
            System.out.println(x);
        }
    }
}
