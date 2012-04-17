package Player.BLL;

import java.util.Comparator;

public class Song implements Comparable<Song>, java.io.Serializable {

    private final String songArtist;

    public String getSongArtist() {
        return songArtist;
    }
    private final String songTitle;

    public String getSongTitle() {
        return songTitle;
    }

    public Song(String songTitle, String songArtist) {
        super(); 
        this.songTitle = songTitle;
        this.songArtist = songArtist;
    }

    @Override
    public int compareTo(Song o) {
        //TODO compateTo not implemented
        return 0; 
    }
    
    public static Comparator<Song> SongTitleComparator = new Comparator<Song>() {

        @Override
        public int compare(Song song1, Song song2) {
            String songTitle1 = song1.getSongTitle();
            String songTitle2 = song2.getSongTitle();

            // ascending order
            return songTitle1.compareToIgnoreCase(songTitle2);

            //descending order
            //return songTitle2.compareToIgnoreCase(songTitle1);
        }
    };
}
