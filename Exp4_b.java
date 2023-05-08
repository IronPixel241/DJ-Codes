import java.util.*; 

public class Exp4_b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Vector<String> vec = new Vector<String>(args.length);
        int i = 0;
        while (i < args.length) {
            String s = args[i];
            vec.add(s);
            i++;
        }
        System.out.println("Names of the students are : " + vec);
        System.out.print("Enter a string : ");
        String str = sc.next();
        i = 0;

        boolean found = false;          // added a flag called found
        while (i < args.length) {
            if (str.equals(args[i])) {  // if string in in array, 
                vec.remove(i);          //  remove the string
                found = true;           //  and set the flag
            }

            i++;
        }

        if (!found) {       //  if the string was not found,
            vec.add(str);   //  add it.
        }

        System.out.println("New arraylist is : " + vec);
    }
}
