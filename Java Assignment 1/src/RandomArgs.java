/*Write a program that prints its arguments  in random order. 
Do not make  a copy of the argument array. 
Demonstrate  how to print out the elements using both streams
and the traditional enhanced for statement.
*/
import java.util.*;
public class RandomArgs {

	public static void main(String[] args) {
		// Read the arguments and randomize
        List<String> argList = Arrays.asList(args);
        Collections.shuffle(argList);
        
        System.out.println("Using for-each");
       
        for (String arg: argList) {
            System.out.format("%s ", arg);
        }
        System.out.println();
        
        // Using Streams shuffling the arguments again
        Collections.shuffle(argList);
        System.out.println("Using stream");
        
        argList.stream().forEach(e->System.out.format("%s ",e));

	}

}
