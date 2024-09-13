/*
 * INSTRUCTION:
 *     This is a Java staring code for hw3_1.
 *     When you finish the development, download this file and and submit to Canvas
 *     according to the submission instructions.

 *     Please DO NOT change the name of the main class "Main"
 */

// Finish the head comment with Abstract, Name, and Date.
/*
 * Abstract: Describe the main ideas of the program.
 * Name: Write your name
 * Date: MM/DD/YYYY
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static List<String> sort(List<String> values) {
        for (int i = 0; i < values.size()-1; i++) {
            for (int k = i+1; k < values.size(); k++) {
                if (i != k) {
                    int value1 = Integer.parseInt(values.get(i));
                    int value2 = Integer.parseInt(values.get(k));
                    if (value1 > value2) {
                        values.set(i, values.get(k));
                        values.set(k, Integer.toString(value1));
                    }
                }
            }
        }
        return values;
    }

    public static void main(String[] args) {

        // Develop your program here.
        // The following is just a sample statement and and you need to replace it with your code
        List<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s1 = scanner.nextLine();
            if(!values.contains(s1)) {
                values.add(s1);
            }
        }
        scanner.close();

        values = sort(values);

        // Range handling here

        String output = values.get(0);
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i).equals(values.get(i+1) + 1)) {
                output += "-";
            } else {
                output += values.get(i) + ", ";
            }
        }


        System.out.println(values);
        System.out.println(output);
    }
}

