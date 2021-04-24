public class SelectionSortStrategy<T extends Comparable<? super T>> implements SorterStrategy<T> {
    @Override
    public void sort(T[] array) {
        for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++) {
            int minIndex = currentIndex;
            for (int i = currentIndex + 1; i < array.length; i++) {
                if (array[i].compareTo(array[minIndex]) < 0) {
                    minIndex = i;
                }
            }
            if (minIndex != currentIndex) {
                T temp = array[currentIndex];
                array[currentIndex] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
