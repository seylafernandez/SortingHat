public class SelectionSort {
    public int[] sArray;

    public SelectionSort(){
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
        sArray = new int[8];
        for (int x=0;x<8;x++) {
            sArray[x] = (int)(Math.random()*9+1);
        }
    }

    public void printArray(){
        //print all elements of array in one line
        for (int y=0;y<sArray.length;y++){
            System.out.print(sArray[y] + " ");
        }
        System.out.println();
        //separated by a space
    }

    public void sortArray() {
        for (int a = 0; a < (sArray.length - 1); a++) {
            int iMin = a;

            for (int i = a + 1; i < sArray.length; i++) {
                if (sArray[i] < sArray[iMin]) {
                    iMin = i;
                }
            }
            int min = sArray[iMin];
            sArray[iMin]=sArray[a];
            sArray[a]=min;

        }
    }



    public static void main(String[] args) {
        SelectionSort select = new SelectionSort();
    }

}

