public class BubbleSortStrategy<T extends Comparable<? super T>> implements SorterStrategy<T> {

    @Override
    public void sort(T[] array) {
        for (int i = array.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swapElements(j, array);
                }
            }
        }
    }

    private void swapElements(int index, T[] arr) {
        T temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
    }

}
