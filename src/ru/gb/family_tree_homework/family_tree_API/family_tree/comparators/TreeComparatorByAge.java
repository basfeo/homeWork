package ru.gb.family_tree_homework.family_tree_API.family_tree.comparators;

import ru.gb.family_tree_homework.family_tree_API.family_tree.TreeNode;

import java.util.Comparator;

public class TreeComparatorByAge<E extends TreeNode<E>> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}