public class question8 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for(int ele: numbers) {
            System.out.print(ele + " : ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " : ");    
        }        
    }
}

// Output: 
// 10 : 20 : 30 : 40 : 50 
// 10 : 20 : 30 : 40 : 50 