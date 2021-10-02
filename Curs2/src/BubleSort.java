public class BubleSort {
    public static void main(String[] args) {
        int[] vector = new int[10];
        for(int i=0; i<10 ; i++){
            vector[i]=55-i;
        }

        for(int i=0; i<10;i++){
            System.out.print(vector[i]+" ");
        }

        for(int i=0;i<10;i++){
            for(int j=0;j<10-1;j++){
                if(vector[j]>vector[j+1]){
                    int aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }
            }
        }
        System.out.println();
        System.out.println("Dupa sortare:");
        for(int i=0; i<10;i++){
            System.out.print(vector[i]+" ");
        }
    }
}
