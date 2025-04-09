public class question4 {
    
    private static void printNumbers(String msg, int... numbers) {
        System.out.print(msg + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers("Set 1", 1, 2, 3);
        printNumbers("Set 2", 10, 20);
        printNumbers("Set 3"); // No numbers
    }   
}

// Output : 
// Set 1: 1 2 3 
// Set 2: 10 20 
// Set 3: 
