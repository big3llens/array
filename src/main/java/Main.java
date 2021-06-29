import java.util.concurrent.TimeUnit;

public class Main {

    private static final int ARRAY_CAPACITY = 10_000;
    private static final int MAX_VALUE = 10_000;

    public static void main(String[] args) {

        Array<Integer> arr1 = initArray();

        testSort(arr1, "select");
        testSort(arr1, "insert");
        testSort(arr1, "bubble");
    }

    public static void testSort (Array array, String sortingType){
        long start;
        long end;
        if(sortingType.equals("select")){
            start = System.nanoTime();
            array.sortSelect();
            end = System.nanoTime();
            long duration = end - start;
            System.out.printf("Сортировка типа %S выполняется за %d милисекунд \n", sortingType, TimeUnit.NANOSECONDS.toMicros(duration));
        }
        if(sortingType.equals("insert")){
            start = System.nanoTime();
            array.sortInsert();
            end = System.nanoTime();
            long duration = end - start;
            System.out.printf("Сортировка типа %S выполняется за %d милисекунд \n", sortingType, TimeUnit.NANOSECONDS.toMicros(duration));
        }
        if(sortingType.equals("bubble")){
            start = System.nanoTime();
            array.sortBubble();
            end = System.nanoTime();
            long duration = end - start;
            System.out.printf("Сортировка типа %S выполняется за %d милисекунд \n", sortingType, TimeUnit.NANOSECONDS.toMicros(duration));
        }
    }

    public static Array <Integer> initArray (){
        Array<Integer> array = new ArrayImp<>(ARRAY_CAPACITY);
        for (int i = 0; i < ARRAY_CAPACITY; i ++) {
            array.add((int)(Math.random()*MAX_VALUE));
        }
        return array;
    }
}
