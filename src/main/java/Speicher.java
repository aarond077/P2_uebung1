public interface Speicher {
    public boolean isEmpty();
    public int size();
    public int capacity();
    public void push(Integer val);
    public Integer pop();
}
