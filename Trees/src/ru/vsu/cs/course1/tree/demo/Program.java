package ru.vsu.cs.course1.tree.demo;

import ru.vsu.cs.course1.tree.bst.Ref1;

import ru.vsu.cs.course1.tree.bst.SimpleBSTree;

import java.util.Locale;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        SimpleBSTree<Integer> simpleBSTree = new SimpleBSTree<>();

        int minValue, maxValue, maxHeight;

        System.out.print("Введите минимальное число, которое будет в бинарном дереве: ");

        minValue = scanner.nextInt();

        System.out.println();

        System.out.print("Введите максимальное число, которое будет в бинарном дереве: ");

        maxValue = scanner.nextInt();

        System.out.println();

        System.out.print("Введите максимальную глубину, которая будет в бинарном дереве: ");

        maxHeight = scanner.nextInt();

        System.out.println();

        fillTree(simpleBSTree, minValue, maxValue, maxHeight);

        System.out.print("Бинарное дерево в скобочном виде: ");

        System.out.println(simpleBSTree.toBracketStr());

    }

    static void fillTree(SimpleBSTree<Integer> simpleBSTree, int minValue, int maxValue, int maxHeight) {

        int counter = 0;

        Integer s = 0;

        Ref1 ref = new Ref1(s);

        do {

            ref.set(0);

            int random = (int) ((Math.random() * ((maxValue - minValue) + 1)) + minValue);

            simpleBSTree.put(random, ref);

            if (ref.get() > maxHeight) {

                simpleBSTree.remove(random);

            }

            counter++;

        }

        while (counter <= maxValue * 100);

    }
}