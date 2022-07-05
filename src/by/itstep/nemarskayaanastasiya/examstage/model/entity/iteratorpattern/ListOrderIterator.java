//package by.itstep.nmrsk.javastages.stage20.model.entity.iteratorpattern;
//
//import by.itstep.nmrsk.javastages.stage20.model.entity.abstracts.Meal;
//
//public class ListOrderIterator implements MyIterator {
//    private ListOrder order;
//    private int current;
//
//    public ListOrderIterator(ListOrder order) {
//        this.order = order;
//    }
//
//    @Override
//    public Meal next() {
//        return order.get(current++);
//    }
//
//    @Override
//    public boolean hasNext() {
//        return current < order.size();
//    }
//
//    @Override
//    public void reset() {
//        current = 0;
//    }
//}
