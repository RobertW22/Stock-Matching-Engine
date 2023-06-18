import java.util.ArrayList;

public class minHeap {
    // SELL ORDERS // 

    int size = 0;
    ArrayList<Integer> items = new ArrayList<Integer>();

    // Get min
    public int getMin(){
        if(size == 0) throw new IllegalStateException();
        int min = items.get(0);
        for(int i = 0; i < size; i++){
            if(items.get(i) < min){
                min = items.get(i);
            }
        }

        return min;
    }

    // Remove Min
    public void removeMin(){
        if(size == 0) throw new IllegalStateException();
        int min = items.get(0);
        int minIndex = 0;
        for(int i = 0; i < size; i++){
            if(items.get(i) < min){
                min = items.get(i);
                minIndex = i;
            }
        }

        items.remove(minIndex);
        size--;
    }

    public void insert(int item){
        items.add(item);
        size++;
    }

    // Remove 
    public boolean removeItem(int item){
        if(size == 0) throw new IllegalStateException();
        if(items.contains(item) == false) return false;
        int index = 0;
        for(int i = 0; i < size; i++){
            if(items.get(i) == item){
                index = i;
            }
        }

        items.remove(index);
        size--;

        return true;
    }

}
