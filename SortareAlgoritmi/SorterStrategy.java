public interface SorterStrategy<T extends Comparable<? super T>> {
    void sort(T[] array);
}
