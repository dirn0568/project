package board;

public class Board {
	int boardid;
	String boardtitle;
	String userid;
	String boarddate;
	String boardcontent;
	int boardaavailable;
	
	public int getboardid() {
		return boardid;
	}
	public void setboardid(int boardid) {
		this.boardid = boardid;
	}
	public String getboardtitle() {
		return boardtitle;
	}
	public void setboardtitle(String boardtitle) {
		this.boardtitle = boardtitle;
	}
	public String getuserid() {
		return userid;
	}
	public void setuserid(String userid) {
		this.userid = userid;
	}
	public String getboarddate() {
		return boarddate;
	}
	public void setboarddate(String boarddate) {
		this.boarddate = boarddate;
	}
	public String getboardcontent() {
		return boardcontent;
	}
	public void setboardcontent(String boardcontent) {
		this.boardcontent = boardcontent;
	}
	public int getboardaavailable() {
		return boardaavailable;
	}
	public void setboardaavailable(int boardaavailable) {
		this.boardaavailable = boardaavailable;
	}
}
