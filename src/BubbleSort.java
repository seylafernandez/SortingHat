public class BubbleSort {

    public int[] array;

    public BubbleSort(){
        //contruct random array
        makeArray();
        // print unsorted array
        printArray();
        //sort array
        sortArray();
        //print sorted array to make sure it worked
        printArray();
    }

    public void makeArray() {
        //construct array
        array = new int[8];
        for (int x=0;x<8;x++) {
            array[x] = (int)(Math.random()*9+1);
        }
    }

    public void printArray(){
        //print all elements of array in one line
        for (int y=0;y<array.length;y++){
            System.out.print(array[y] + " ");
        }
        System.out.println();
        //separated by a space
    }

    public void sortArray(){
        boolean madeSwap = false;
        for(int c =1; c < array.length; c++){
            madeSwap = false;
            for (int i = 1; i < array.length-(c-1); i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    madeSwap = true;
                }

            }
            if(madeSwap == false){
                break;
            }
        }

        }



    public static void main(String[] args) {
       BubbleSort bubbles = new BubbleSort();
    }
}
