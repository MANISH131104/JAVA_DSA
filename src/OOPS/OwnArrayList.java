package OOPS;

class ArrayList{        // user defined data structure
    int[] arr;
    int idx = 0;
    int size = 0;
    ArrayList(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(idx == arr.length){      // array is full
          capacityIncrease();
        }
        arr[idx++] = ele;
        size++;

    }
    void capacityIncrease() {
        int[] arr2 = new int[arr.length*2];
        for(int i=0;i<arr.length;i++){      // copy paste
            arr2[i] = arr[i];
        }
        arr = arr2;
    }
    int capacity(){
        return arr.length;
    }
    int get(int index){
        return arr[index];
    }
    void set(int index, int val){
        arr[index] = val;
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(3);
        System.out.println(arr.capacity());

        arr.add(10); arr.add(20);arr.add(30);
        System.out.println(arr.size);

        arr.display();

        System.out.println(arr.get(1));
        arr.add(40); arr.add(50); arr.add(60); arr.add(70);
        arr.display();


    }
}
