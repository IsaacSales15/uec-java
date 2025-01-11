public class Principal {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[6];

        l[0] = new Lutador("Crash Bandicoot", "Naughty Dog", 31, 11, 2,1,1.75f,68.9f);
        l[1] = new Lutador("Pai do Neymar", "Brasil", 29, 14, 2,3,1.68f,57.8f);
        l[2] = new Lutador("Leonardo Da Vinci", "EUA", 25, 13, 1,0,1.93f,81.4f);
        l[3] = new Lutador("Mario Bros", "Itália", 45, 20, 0,5,1.50f,90.4f);
        l[4] = new Lutador("Jair Bolsonaro", "Brasil", 50, 22, 2,0,1.84f,78.4f);
        l[5] = new Lutador("Freddie Mercury", "EUA", 20, 21, 1,4,1.75f,72.4f);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
    }
}
