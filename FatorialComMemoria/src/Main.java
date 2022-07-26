public class Main {
    public static void main(String [] args) {

        String input = args[0];
        int i,fatorial=1;
        int numero=Integer.parseInt(input);

        for(i=1;i<=numero;i++){
            fatorial=fatorial*i;
        }

        System.out.println(fatorial);
    }
}