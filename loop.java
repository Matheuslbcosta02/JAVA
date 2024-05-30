public class loop{
    public static void main(String[] args){

        int[] array ={1,2,3,4,5,6,7,8};

        // descobrir tamanho do array

        int tamanho = array.length;
        System.out.println(tamanho);

        //criar loop para imprimir array

        for(int i =0; i<tamanho;i++){
            System.out.println(array[i]);
        }
    }
}