
package javaexample39arraycopy;



public class JavaExample39ArrayCopy {

    
    public static void main(String[] args) {
        
        int[] v1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[]{11, 22, 33, 44};
        int[] v3 = new int[]{0, 0};
        int[] v4 = new int[]{100, 100, 100, 100, 100, 100};
        int[] v5 = null;

        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        CopyArrayItemsWithIndex(v2, 1, v1, 3, 3);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        CopyArrayItemsWithIndex(v3, 6, v1, 2, 1);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        CopyArrayItemsWithIndex(v4, 2, v1, 15, 2);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        CopyArrayItemsWithIndex(v4, 2, v1, 1, 700);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        CopyArrayItemsWithIndex(v1, 1, v5, 3, 2);
        System.out.print("Array v5: ");
        PrintArray(v5);
        System.out.println("---");

        CopyArrayItemsWithIndex(v3, 300, v1, 400, 33);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        CopyArrayItemsWithIndex(v5, 300, v1, 400, 33);
        System.out.print("Array v1: ");
        PrintArray(v1);
        System.out.println("---");

        CopyArrayItemsWithIndex(v3, 300, v5, 400, 33);
        System.out.print("Array v1: ");
        PrintArray(v5);
        System.out.println("---");

    }

    private static void CopyArrayItemsWithIndex(int[] source, int beginIndex1, int[] destination, int beginIndex2, int NumOfItems) {
        try {

            int[] movingItems = MovingItemsFromArray(source, beginIndex1, NumOfItems);
            MovingItemsToArray(destination, beginIndex2, movingItems);

        }// end try
        catch (Exception e) {
            System.out.println(e.toString());
            return;
        }
    }// end CopyArrayItemsWithIndex()

    private static int[] MovingItemsFromArray(int[] array, int beginIndex, int numOfItems) {
        int[] res = null;
        try {
            res = new int[numOfItems];
            int j = beginIndex;
            for (int i = 0; i < res.length; i++) {
                res[i] = array[j];
                j++;
            }// end for
            return res;
        } catch (Exception e) {
            System.out.println(e.toString());
            return res;
        }
    } // end MovingItemsFromArray()

    private static void MovingItemsToArray(int[] array, int beginIndex, int[] movingItems) {
        int k = beginIndex;
        try {
            for (int i = 0; i < movingItems.length; i++) {
                array[k] = movingItems[i];
                k++;
            }// end for
        } catch (Exception e) {
            System.out.println(e.toString());
            return;
        }
    }// end MovingItemsToArray()

    private static void PrintArray(int[] a) {
        try {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }// end try
        catch (Exception e) {
            System.out.println(e.toString());
            return;
        }
    }

}
