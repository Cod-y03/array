public class ArrayPractice {
    public static void main(String[] args) {
        System.out.println("Hip, hip, h-array");

        //declared an array, but its empty
        int[] numbers = new int[8];

        numbers[0] = 1;
        numbers[0] =+ 2;
        int y = numbers[0] - 1;
        // System.out.println(numbers[0]);

        //iteration - the structure of the while loop makes it an iteration
        // int i = 0;
        // while (i < numbers.length) {
        //     System.out.println(numbers[i]);
        //     i++;
        // }

        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

// ____________________________________

        int[] nums = {3, 4, 8, 9, 10};
        int nines = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == 9) {
                nines++;
            }
        }
        // System.out.println(nines);

//____________________________________________
    //a for each loop makes a few assumptions
        int[] numbs = {5, 8, 4, 1, 8, 7, 9, 10};
        
        // System.out.println("swapends: ");
        // swapEnds(numbs);

        // System.out.println("has seven: ");
        // System.out.println(hasSeven(numbs));
        
        // System.out.println("mean: ");
        // System.out.println(mean(numbs));
        
        // System.out.println("reverse: ");
        // reverse(numbs);

        // System.out.println("haystack: ");
        // System.out.println(hayStack(numbs, 7));

        organizer(numbs);
        

    }        


    private static void readArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }


    private static void swapEnds(int[] data) {
        int first = data[0];
        int end = data.length - 1;
        int last = data[end];
    
        data[0] = last;
        data[end] = first;
        readArray(data);
    }
    
    private static boolean hasSeven(int[] data) {
        for (int index = 0; index < data.length; index++) {
            if (data[index] == 7) {
                return true;
            }
        }
        return false;
    }

    private static double mean(int[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum / data.length;
    }
    //the swap ends changes how it looks
    private static void reverse(int[] data) {
        int[] saver = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            saver[i] = data[i];
        }
        readArray(saver);
        int index = 0;
        while (index < data.length) {
            data[index] = saver[saver.length - 1 - index];
            index += 1;
        }
        readArray(data);
    }

    private static int hayStack(int[] data, int needle) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == needle) {
                return i;
            }
        }
        return -1;
    }

    private static void organizer(int[] data) {
        int[] saver = new int[data.length];
        int i = 0;
        int index = 0;
        int lowest = 0;
        int lowestIndex = 0;
        while (i < saver.length) {

            while(index < data.length) {
                lowest = 99999;
                if (data[index] < lowest && data[index] != -999) {
                    lowest = data[index];
                    lowestIndex = index;
                }
                index += 1;
            }
            
            saver[i] = lowest;
            data[lowestIndex] = -999;
            i += 1;
            index = 0;
        }
        for (int ind = 0; ind < data.length; ind++) {
            data[ind] = saver[ind];
        }
        readArray(data);
    }
        //search in haystack, reorder numaricly
}