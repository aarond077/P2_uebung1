public class WarteschlangeMitArray implements Warteschlange {
    Integer[] array;
    int capacity;

    WarteschlangeMitArray(int maxgroesse){
        capacity = maxgroesse;
        array = new Integer[capacity];
    }

    @Override
    public void push(Integer val) {
        if(array.length == capacity()){return;}
        for (int i = 0; i < array.length; ++i) {
            if(array[i] == null){
                array[i] = val;
            }
        }
    }

    @Override
    public Integer pop() {
        Integer ret = array[0];
        for(int i = 0; i < array.length - 1; ++i){
            array[i] = array[i + 1];
        }
        return ret;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return array[0] == null;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public Integer front() {
        if(!isEmpty())return array[0];
        else throw new ArrayIndexOutOfBoundsException() ;
    }

    public Integer[] getArray() {
        return array;
    }

    public int getCapacity() {
        return capacity;
    }
}
