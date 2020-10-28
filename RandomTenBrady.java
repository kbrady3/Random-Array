//Kabrina Brady

public class RandomTenBrady {
    public static void main(String[] args) {
        int max = 10;
        int randMax = 20;
        int increment = 1;
        int[] randomArray = new int[max];
        int rand = 0;
        int lengthArray = randomArray.length;
        int highest = 0;
        int lowest = randMax+1;

        //Must terminate when i < max, not <=. If <=, goes up to index 10, which doesn't exist.
        for (int i = 0; i < max; i++){
            //Generates random number between 1 and 20
            rand = (int) (Math.random() * randMax) + increment;
            //Assigns random number to randomArray[i]
            randomArray[i] = rand;
        }

        System.out.println("Every element in the array: ");
        for (int item: randomArray){
            System.out.printf(String.valueOf(item) + " ");
        }

        System.out.println();
        System.out.println("Every item at an even index: ");
        for (int i = 0; i < lengthArray; i++){
            if (i % 2 == 0){
                System.out.printf(randomArray[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Every even element: ");
        for (int i = 0; i < lengthArray; i++){
            if (randomArray[i] % 2 == 0){
                System.out.printf(randomArray[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Backwards array: ");
        for (int i = max-1; i >= 0; i--){
            System.out.printf(randomArray[i] + " ");
        }

        System.out.println();
        System.out.println("First element: ");
        System.out.printf(randomArray[0] + " ");

        System.out.println();
        System.out.println("Last element: ");
        System.out.printf(randomArray[max-1] + " ");

        System.out.println();
        System.out.println("Highest element: ");
        for (int item: randomArray){
            if (item > highest){
                highest = item;
            }
        }
        System.out.printf(String.valueOf(highest));

        System.out.println();
        System.out.println("Lowest element: ");
        for (int item: randomArray){
            if (item < lowest){
                lowest = item;
            }
        }
        System.out.printf(String.valueOf(lowest));
    }
}