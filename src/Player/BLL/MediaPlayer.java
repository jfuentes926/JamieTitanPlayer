package Player.BLL;


public class MediaPlayer {
    
    Playlist currentPlaylist;
    private Song currentSong;
    private int songIndex; 
    
    public MediaPlayer(Playlist currentPlaylist) {
        setCurrentPlaylist(currentPlaylist); 
        songIndex = 0;
    }

    public Playlist getCurrentPlaylist() {
        return currentPlaylist;
    }

    public void setCurrentPlaylist(Playlist currentPlaylist) {
        this.currentPlaylist = currentPlaylist;
    }

    public Song getCurrentSong() {
        currentSong = currentPlaylist.getPlaylistSongList().get(songIndex);        
        return currentSong;
    }

    public void setCurrentSong(Song currentSong) {
        this.currentSong = currentSong;
    }

    public int getSongIndex() {
        return songIndex;
    }

    
    
    public Song getCurrentSong(Playlist currentPlaylist) {
        // TODO add MediaPlayer getCurrentSong method
        
        
        return currentSong; 
    }
    
    public Song getNextSong(Playlist currentPlaylist) {
        // TODO add MediaPlayer skipCurrentSong method
        songIndex ++;
        return currentSong; 
    }

    
}
