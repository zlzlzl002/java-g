package test.dto;

public class MemberDto {
	private int empno;
	private String ename;
	private String dname;
	private String loc;
	
	public MemberDto() {}
	
	// sorce field ´©¸£¸éµÊ
	public MemberDto(int empno, String ename, String dname, String loc) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.dname = dname;
		this.loc = loc;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmptno(int emptno) {
		this.empno = emptno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDanme() {
		return dname;
	}

	public void setDanme(String danme) {
		this.dname = danme;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	
}
