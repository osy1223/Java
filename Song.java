//1978년 스웨덴 국적의 ABBA가 부른 Dancing Queen

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
		System.out.println(year+"년 "+country+"국적의 "+singer+"가 부른 "+song);
	}
	
}
