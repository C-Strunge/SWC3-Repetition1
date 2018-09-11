import java.util.Arrays;

public class MySet <T> implements MySetInterface {
    private T[] setAs = (T[]) new Object[5];
    private int size = 0;

    public MySet(){}

    //TEST:
    /*public static void main(String[] args){
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(100);
        numbers.add(1000);
        numbers.add(50);
        numbers.add(10);

        System.out.println("TreeSet containing numbers: " + numbers);
    }*/

    @Override
    public boolean contains(Object cont) {
        for (T object : setAs) {
            if (cont == object) {
                System.out.println("Exists");
                return true;
            }
        }
        System.out.println("Dosen't exist");
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Object element) {
        if (setAs.length - size < 1){
            setAs = Arrays.copyOf(setAs, setAs.length + 10);
        }
         for (T object : setAs) {
            if (element == object) {
                System.out.println("Exists");
                return false;
            }
        }
            setAs[size++] = (T) element;
            System.out.println("Added");
            return true;
    }

        @Override
        public void remove(Object element) {
            if (setAs.length - size >= 12){
                setAs = Arrays.copyOf(setAs, setAs.length - 12);
            }
            int i = 0;
            for (T object : setAs) {
                if (object == element) {
                    setAs[i] = null;
                    System.out.println("Element on target ( " + object.toString() + " ) has been removed");
                    while (i < size) {
                        setAs[i] = setAs[i + 1];
                        i++;
                    }
                }
                i++;
            }
            size--;
        }

    @Override
    public String toString() {
        return "MySet{" +
                "setAs=" + Arrays.toString(setAs) +
                ", size=" + size +
                '}';
    }
}