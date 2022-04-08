public class KellerspeicherMitArray implements Kellerspeicher {
    private Integer[] array; //storage
    private int capacity; //capacoty of array
    @Override
    public Integer top(){return array[0];}

    @Override
    public boolean isEmpty() {
        return array[0] == null;
    }
    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public Integer pop() {
        if(isEmpty()){throw new ArrayIndexOutOfBoundsException();}
        else{
            Integer ret = array[0];
            for(int i= 0; i < array.length - 1; ++i){
                array[i] = array[i + 1];
            }
            return ret;
        }
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

    public Integer[] getArray() {
        return array;
    }

    public int getCapacity() {
        return capacity;
    }

}