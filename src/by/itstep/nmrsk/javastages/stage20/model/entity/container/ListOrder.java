package by.itstep.nmrsk.javastages.stage20.model.entity.container;

import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;
import by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern.Iterable;
import by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern.ListOrderIterator;
import by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern.MyIterator;


public class ListOrder implements Order, Iterable {
    private Node first;
    private int size;

    public ListOrder() {
        first = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public Meal get(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            return null;
        }
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.meal;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Meal meal) {
        if (isEmpty()) {
            first = new Node(meal);
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(meal);
        }


        size++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (isEmpty()) {
            builder.append("Order is empty.");
        } else {
            builder.append("Order:\n");
            Node temp = first;
            while (temp.next != null) {
                builder.append("\n").append(temp.meal);
                temp = temp.next;
            }
            builder.append("\n").append(temp.meal);
        }


        return builder.toString();
    }

    @Override
    public MyIterator getIterator() {
        return new ListOrderIterator(new ListOrder());
    }

    private class Node {
        public Meal meal;
        public Node next;

        public Node(Meal meal) {
            this.meal = meal;
        }
    }
}
