//1978�� ������ ������ ABBA�� �θ� Dancing Queen

public class Song {

	int year = 0;
	String country = null;
	String singer = null;
	String song = null;
	
	Song(int year, String country, String singer, String song){
		this.year = year;
		this.country = country;
		this.singer = singer;
		this.song = song;
	}
	
	void show() {
		System.out.println(year+"�� "+country+"������ "+singer+"�� �θ� "+song);
	}
	
}
