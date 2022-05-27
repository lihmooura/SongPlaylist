package SongPlylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private static final ArrayList<Song> Playlist = null;
	private ArrayList<Song> songs;
	
	public Album(String name, String artist, ArrayList<Song> songs) {
		super();
		this.songs = new ArrayList<Song>();
	}
	
	public Album() {
		
	}
	
//	Generate to find song on the playlist
	public Song findSong(String title) {
		for(Song checkedSong : songs) {
			if(checkedSong.getTitle().equals(title)) return checkedSong;	
		}
		return null;
	}
	
//	Generate to add song to the playlist
	public boolean addSong(String title, double duration) {
		if(findSong(title) == null) {
			songs.add(new Song(title,duration));
			System.out.println(title + "sucessfully add to the list");
			return true;
		}
//	Generate to demonstrate if song is already on the playlist
		else {
			System.out.println("Song with name: " + title + "already exist in list");
			return false;
		}
	}
	

//	Generate to add song on the playlist with tracknumber
	public boolean addToPlaylist(int trackNumber, LinkedList<Song> PlayList) {
		int index = trackNumber -1;
		if(index > 0 && index <= this.songs.size() ) {
			Playlist.add(this.songs.get(index));
			return true;
		}
		System.out.println("This album does not have song with tracknumber" + trackNumber);
		return false;
	}

//	Generate to check if song exists on the playlist
	public boolean addToPlaylist(String title, LinkedList<Song> PlayList) {
		for(Song checkedSong : this.songs) {
			if(checkedSong.getTitle().equals(title)) {
				PlayList.add(checkedSong);
				return true;
			}
		}
		
		System.out.println(title + "there is no such song in album");
		return false;
	}
	
}
