import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // membuat objek HP
        Phone redmiNote8 = new Xiaomi();

        // membuat objek user
        PhoneUser dian = new PhoneUser(redmiNote8);

        // kita coba nyalakan HP-nya
        dian.turnOnThePhone();

        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[5] Buka Music");
            System.out.println("[6] Buka GoPlay");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                dian.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                dian.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                dian.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                dian.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("5")){
                String action;
                Music music = new Lagu();
                MusicUser hp = new MusicUser(music);
                hp.playMusic();
                while (true) {
                    System.out.println("=== MUSIC INTERFACE ===");
                    System.out.println("[1] Next Lagu");
                    System.out.println("[2] Prev Lagu");
                    System.out.println("[3] Pause Lagu");
                    System.out.println("[4] Play Lagu");
                    System.out.println("[0] Keluar");
                    System.out.println("--------------------------");
                    System.out.print("Pilih aksi> ");
                    action = input.nextLine();

                    if (action.equalsIgnoreCase("1")) {
                        hp.nextMusic();
                    } else if (action.equalsIgnoreCase("2")) {
                        hp.prevMusic();
                    } else if (action.equalsIgnoreCase("3")) {
                        hp.pauseMusic();
                    } else if (action.equalsIgnoreCase("4")) {
                        hp.playMusic();
                    } else if (action.equalsIgnoreCase("0")) {
                        System.exit(0);
                    } else {
                        System.out.println("Kamu memilih aksi yang salah!");
                    }
                }
            } else if (aksi.equalsIgnoreCase("6")){
                String action_film;
                while (true) {
                    System.out.println("=== GOPLAY INTERFACE ===");
                    System.out.println("[1] Spider Man");
                    System.out.println("[2] Wolverine");
                    System.out.println("[3] Iron Man");
                    System.out.println("[4] The Matrix");
                    System.out.println("[5] Resident Evil");
                    System.out.println("[0] Keluar");
                    System.out.println("--------------------------");
                    System.out.print("Pilih aksi> ");
                    action_film = input.nextLine();

                    if (action_film.equalsIgnoreCase("1")) {
                        Film spiderman = new FilmSpiderman();
                        System.out.println("Harga film Spider Man : " + spiderman.getHarga());
                    } else if (aksi.equalsIgnoreCase("2")) {
                        Film wolverine = new FilmWolverine();
                        System.out.println("Harga film Wolverine : " + wolverine.getHarga());
                    } else if (aksi.equalsIgnoreCase("3")) {
                        Film ironman = new FilmIronman();
                        System.out.println("Harga film Iron Man : " + ironman.getHarga());
                    } else if (aksi.equalsIgnoreCase("4")) {
                        Film thematrix = new FilmTheMatrix();
                        System.out.println("Harga film The Matrix : " + thematrix.getHarga());
                    } else if (aksi.equalsIgnoreCase("5")) {
                        Film residentevil = new FilmResidentEvil();
                        System.out.println("Harga film Resident Evil : " + residentevil.getHarga());
                    } else if (aksi.equalsIgnoreCase("0")) {
                        System.exit(0);
                    } else {
                        System.out.println("Kamu memilih aksi yang salah!");
                    }
                }
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }
}
