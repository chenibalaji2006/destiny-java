import java.util.Scanner;
public class Maths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Class intervals Do you want to enter :");
        int size = sc.nextInt();
        int[][] array = new int[size][2];
        int[] xi = new int[array.length];
        int height = 0;
        sc.nextLine();
        System.out.println("Tell me if you have 'A-B' type intervals/'A' only single digit :");
        System.out.println("if you type 1 then press 'A' or for type 2 press 'B' :");
        String type = sc.nextLine().toUpperCase();
        if(type.equals("A")){
            for(int i = 0;i<array.length;i++){
                int sum = 0;
                for(int j = 0;j<array[i].length;j++){
                    System.out.printf("Enter your [%d][%d] C.I : ",i,j);
                    array[i][j] = sc.nextInt();
                    sum = (sum+array[i][j])/2;
                    xi[i] = sum;
                    height -= array[i][j];
                    sc.nextLine();
            }
            System.out.println(" ");
        }
        }
        else if(type.equals("B")){
            int[] classIntervals = new int[size];
            int[] xi2 = new int[classIntervals.length];
            int sum = 0;
            for(int q = 0;q<classIntervals.length;q++){
            classIntervals[q] = sc.nextInt();
            sum = classIntervals[q]/2;
            xi2[q] = sum;
            }
        }
        else{
            System.out.println("Error type invalid......");
        }
        double finding = size/2;
        int a = 0;
        int middle = 0;
        if(size %2 == 0){
            a = xi[size/2];
        }
        else{
            middle = (int)Math.round(finding);
            a = xi[middle];
        }
        System.out.println("Enter Frequency(fi) : ");
        int[] frequency = new int[array.length];
        int fsum = 0;
        for(int f = 0;f<array.length;f++){
            frequency[f] = sc.nextInt();
            fsum += frequency[f];
        }
        int[] ui = new int[size];
        for(int u = 0; u<size;u++){
            ui[u] = (xi[u]-a)/height;
        }
        int[] fiui = new int[array.length];
        int fusum = 0;
        for(int fu = 0;fu<array.length;fu++){
            fiui[fu] = frequency[fu]*ui[fu];
            fusum += fiui[fu];
        }
        double mean = a+(fusum/fsum)*height;
        System.out.println("The mean is : " +mean);
    }
}
