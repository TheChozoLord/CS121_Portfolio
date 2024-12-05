package lab13;

public class LBSearch {

    //Linear Search Method
    public int LinearSearchMethod(int key, int [] array){
        int counter = 0;
        for(int i =0; i< array.length; i++){
            System.out.println("Comparison:"+ ++counter);
            if(key == array[i]){
                return i;
            }
        }
        return -1;
    }

    //BinarySearchMethod
    public int BinarySearchMethod(int key, int [] array) {
        int counter = 0;
        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) / 2;
        while (low <= high && array[mid] != key) {
            if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
            System.out.println("Comparison:" + ++counter);
        }
        if (low > high) {
            mid = -1;
        }
        return mid;
    }
}
