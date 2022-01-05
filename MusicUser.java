public class MusicUser {
    private Music music;

    public MusicUser(Music music) {
        this.music = music;
    }

    void nextMusic(){
        this.music.nextLagu();
    }

    void prevMusic(){
        this.music.prevLagu();
    }

    void pauseMusic(){
        this.music.pauseLagu();
    }

    void playMusic(){
        this.music.playLagu();
    }
}
