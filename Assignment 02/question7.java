public class question7 {
    public static void main(String[] args) {
        // simple for loop
        for (int i = 0; i < 3; i++) {
            System.out.println("For Loop " + i);
        }

        // while loop when we don;t know about how many time loop is running
        int j = 0;
        while (j < 3) {
            System.out.println("While Loop " + j);
            j++;
        }

        // do while loop, an extension of while loop, atleast executes one time
        int k = 0;
        do {
            System.out.println("Do-While Loop " + k);
            k++;
        } while (k < 3);
    }
}

// Output : 
// For Loop 0
// For Loop 1
// For Loop 2
// While Loop 0
// While Loop 1
// While Loop 2
// Do-While Loop 0
// Do-While Loop 1
// Do-While Loop 2