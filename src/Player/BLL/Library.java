package Player.BLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    public static List<Song> songList;
    private int songIndex;

    public Library() {
        songList = new ArrayList<Song>();
        songIndex = 0; 
    }

    public int getSongIndex(Song songInList) {
        return songList.indexOf(songInList);
    }

    public void addSong(Song songAdded) {
        songList.add(songAdded);
    }

    public int songCount() {
        return songList.size();
    }

    public void removeSong(Song songRemoved) {
        songList.remove(songRemoved);
    }

    public void containsSong(Song songInList) {
        songList.contains(songInList);
    }

    public List getAllSongs() {
        return Collections.unmodifiableList(songList);
    }

    public void sortLibraryBySongTitle() {
        Collections.sort(songList, Song.SongTitleComparator);
    }

    public void sortLibraryByArtist() {
        Collections.sort(songList, Song.SongArtistComparator);
    }
}
