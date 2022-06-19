package com.day17;

import java.util.ArrayList;

public class MainClass {
public static void main(String[] args) {
	PlayList p=new PlayList();
	p.addSong(new Song("Four the people","lajavathiyai"));
	p.addSong(new Song("Mayanadhi","Mizhiyil ninnu"));
	p.addSong(new Song("Beast","Arabhi kuthu"));
	p.addSong(new Song("KGF","Mehabuba"));
  
	ArrayList<Song> list=p.getSongs();
	
	for(Song ss:list) {
		ss.play();
	}
}
}
