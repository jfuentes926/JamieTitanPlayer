package Player.BLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import Player.BLL.Song; 


public class Library {
    
    public static List<Song> songList;
    private int songIndex; 
        
    public Library() {
        songList = new ArrayList<Song>();
        songIndex = 0;
    }

    public int getSongIndex(Song songAdded) {
        return songIndex;
    }
    
    public void addSong(Song songAdded) {
        songList.add(songAdded);
        songIndex++;
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

    public void sortLibraryByArtist(List songList) {
        Collections.sort(songList, Song.SongTitleComparator);
    }  
       
}
