public class TestaSomatoria {
    public static void main(String[] args) {
        // vamos fazer uma somatoria usando while
        int contador = 0;
        int total = 0;
        while(contador <= 10) {
            total += contador;
            System.out.println(total);
            contador +=1;
        }
    }
}
