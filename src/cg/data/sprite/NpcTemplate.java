package cg.data.sprite;

public interface NpcTemplate {
	
	String TYPE_Windowhealer = "Windowhealer"; // ҽ�ƴ���
	
	String TYPE_Injurydoctor = "Injurydoctor"; // ����ҽ��
	
	String TYPE_Event = "Event"; // �¼�
	
	String TYPE_Skillmaster = "Skillmaster"; // ���ܽ�ѧ
	
	String TYPE_StandEnemy = "StandEnemy"; // վ������
	
	String TYPE_TownPeople = "TownPeople"; // �������
	
	String TYPE_Jobsmaster = "Jobsmaster"; // ��ְ��ѧ
	
	String TYPE_Billboard = "Billboard"; // �ֵ���
	
	String TYPE_Brushman = "Brushman"; // �һ���
	
	String TYPE_Itemshop2 = "Itemshop2"; // ��Ʒ�̵�
	
	String TYPE_Titleman = "Titleman"; // �ƺ���
	
	String TYPE_Box = "box"; // ����
	
	String TYPE_NONE = ""; // ��
	
	byte APPEAR_TIME_ALL_DAY = 0;
	
	int NO_REFRESH_TIME = -1;
	
	int NPC_ID_NULL = 0;
	
	String getName();
	
	int getResourcesId();
	
	byte getDir();
	
	String getType();
	
	int getId();
	
	int getMapId();
	
	int[] getCoordinates();
	
	String getTalkType();
	
	byte getAppearTime();
	
	int getRefreshTime();

}
