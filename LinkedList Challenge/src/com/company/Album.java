package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album
{
    private String name;
    private String artist;
    private ArrayList<Song> songArrayList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songArrayList = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }

    public boolean addToAlbum(String name,double duration){
        for(int i =0;i<songArrayList.size();i++){
            ArrayList<Song> song = new ArrayList<>()
            if(findSong(name).equals(name)){
                System.out.println("Song already in album");
                return false;
            }
            else{
                if(findSong(name)==null) {
                    this.songArrayList.add(new Song(name, duration));
                    return true;
                }
            }
        }
        return false;
    }

    public Song findSong(String name){
        for(int i =0;i<songArrayList.size();i++){
            Song checkedSong = this.songArrayList.get(i);
            if(checkedSong.getTitle().equals(name)){
                return checkedSong;
            }
        }
        return null;
    }


//    public int findSongIndex(String name){
//        for(int i =0;i<songArrayList.size();i++){
//            Song checkedSong = this.songArrayList.get(i);
//            if(checkedSong.getTitle().equals(name)){
//                return i;
//            }
//        }
//        return -1;
//    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index=trackNumber-1;

        if((index>=0)&&(index<=this.songArrayList.size())){
            playlist.add(this.songArrayList.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlaylist(String name,LinkedList<Song> playlist){
        Song checkedSong=findSong(name);

        if(checkedSong!=null){
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }
}
