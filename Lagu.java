public class Lagu implements Music {
    int i = 0;
    boolean isStatus = true;
    String[] listLagu = {"Berubah", "Sing of Absolution", "Knight of Cydonia", "Hysteria", "Psycho"};
    String judulLagu = null;

    public Lagu() {
        this.judulLagu = "Belum ada lagu yang di mulai";
    }

    public void nextLagu() {
        i++;
        judulLagu = listLagu[i];
        System.out.println("Lagu telah di mainkan");
        System.out.println(this.judulLagu);
    }

    public void prevLagu() {
        i = i - 1;
        judulLagu = listLagu[i];
        System.out.println("Lagu telah di mainkan");
        System.out.println(this.judulLagu);
    }

    public void pauseLagu() {
        isStatus = false;
        System.out.println("Lagu di pause");
        System.out.println(this.judulLagu);
    }

    public void playLagu() {
        isStatus = true;
        System.out.println("Lagu di play");
        System.out.println(this.judulLagu);
    }
}
