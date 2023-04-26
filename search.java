
class search {
    public static void main ( String[] args) {
        // java program to implement binary search algo for finding a target value in sorted array
        int[] arr= {1,2,3,4,5,6,7,8,9};
        int targetValue= 6;
        int flag=0;
        int startingIndex=0;
        int endingIndex=arr.length-1;

        while (startingIndex <= endingIndex ) {
            int mid= (startingIndex + endingIndex)/2;

            if( arr[mid]== targetValue) {
                flag=1;
                break;
            }
            else if ( arr[mid] > targetValue) {
                endingIndex= mid-1;
            }
            else {
                startingIndex= mid +1;
            }

        }
        if (flag==1) {
            System.out.println(" Target element found in array: "+ targetValue);
        }
        else {
            System.out.println(" !!! Target element not found !!!");

        }


    }
}