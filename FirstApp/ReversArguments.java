package FirstApp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 19.12.2017.
 */
public class ReversArguments {

    public static void main(String[] args) {
     for(int i = args.length-1; i>=0; i--){
         System.out.println("Argument->: " + args[i]);
     }

    }
    }