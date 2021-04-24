import java.util.Arrays;

/*
  3 colegi,Alin Marius si Dan, sunt supraincarcati cu munca, prin urmare au apelat la voi pentru a-i ajuta cu un task.
Alin are nevoie de a sorta un array folosind bubble sort.
Marius are nevoie de a sorta un array folosind merge sort.
Dan are nevoie de a sorta un array folosind selection sort.
Creati un program Sorter, in care sa va folositi de Strategy Design Pattern pentru a putea sorta o lista primita ca parametru
in cele 3 modalitati diferite, astfel incat cei 3 colegi sa aiba la dispozitie fiecare modalitatea lui dorita de sortare.
Solutia trebuie livrata de asemenea, in 2 ore
 */
public class Test {

    public static void main(String[] args) {
        var alin = new Sorter<>(new BubbleSortStrategy<Integer>());
        var alinArray = new Integer[]{5, 4, 23, 5453, 293};
        alin.sort(alinArray);
        System.out.println("Alin sorted the array like so: " + Arrays.toString(alinArray));

        var marius = new Sorter<>(new MergeSortStrategy<Double>());
        var mariusArray = new Double[]{3.2, 32.5, 9.2, 6.4, 1.2};
        marius.sort(mariusArray);
        System.out.println("Marius sorted the array like so: " + Arrays.toString(mariusArray));

        var dan = new Sorter<>(new SelectionSortStrategy<Character>());
        var danArray = new Character[]{'a', 'g', 's', 'd', 'p'};
        dan.sort(danArray);
        System.out.println("Dan sorted the array like so: " + Arrays.toString(danArray));
    }
}
