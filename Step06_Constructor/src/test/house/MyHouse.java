package test.house;

public class MyHouse {
	public Aircon air=null;
	public Television tv=null;
	public MicroWave mw=null;
	
	//����Ʈ ������ 
	public MyHouse() {
		
	}
	//���ڷ� Aircon, Television, Microwave ��ü�� ���� �޴� ������
	public MyHouse(Aircon air, Television tv, MicroWave mw) {
		this.air=air;
		this.tv=tv;
		this.mw=mw;
	}
}









