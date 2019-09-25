package com.company;

import com.sun.source.tree.CatchTree;

public class Main {

    public static void main(String[] args) {
        int []array=null;
        int negativeSize=-1;
        int randomNumber;
        for(int i=0;i<3;i++){
            try{
                switch (i) {
                    case 0:
                    randomNumber = array[0];
                    break;
                    case 1:
                    array=new int[negativeSize];
                    break;
                    case 2:
                        array=new int[4];
                        array[5]=87;
                        break;
                }

            }
            catch(NullPointerException e) {                                  // Catch the NullPointerException:
                System.out.println("\nNullPointerException Exception caught");

            } catch(NegativeArraySizeException e) {                            // Catch the NegativeArraySizeException:
                System.out.println("\nNegativeArraySizeException Exception caught");

            } catch(ArrayIndexOutOfBoundsException e) {                        // Catch the ArrayIndexOutOfBoundsException:
                System.out.println("\nArrayIndexOutOfBoundsException Exception caught");

            }
        }
	// write your code here
    }
}
