import java.util.ArrayList;

public class maxHeap {
        // BUY ORDERS //
    int size = 0;
    ArrayList<Integer> items = new ArrayList<Integer>();


    // Get max
    public int getMax(){
        if(size == 0) throw new IllegalStateException();
        int max = items.get(0);
        for(int i = 0; i < size; i++){
            if(items.get(i) > max){
                max = items.get(i);
            }
        }

        return max;
    }

    // Remove Max
    public void removeMax(){
        if(size == 0) throw new IllegalStateException();
        int max = items.get(0);
        int maxIndex = 0;
        for(int i = 0; i < size; i++){
            if(items.get(i) > max){
                max = items.get(i);
                maxIndex = i;
            }
        }

        items.remove(maxIndex);
        size--;
    }

    // Insert
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
