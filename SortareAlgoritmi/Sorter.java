public class Sorter<T extends Comparable<? super T>> {
    private final SorterStrategy<T> sorterStrategy;

    public Sorter(SorterStrategy<T> sorterStrategy) {
        this.sorterStrategy = sorterStrategy;
    }

    public void sort(T[] array){
        sorterStrategy.sort(array);
    }
}
