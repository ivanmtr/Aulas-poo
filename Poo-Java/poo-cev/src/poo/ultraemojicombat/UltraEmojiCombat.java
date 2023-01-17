package poo.ultraemojicombat;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Mbappe", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Neymar", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("CR7", "Portugal", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Messi", "Argentina", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Arrascaeta", "Brasil", 37, 1.70f, 119.3f, 12, 2, 4);
        l[5] = new Lutador("Carlos Alberto", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

       Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
        
    }
}
