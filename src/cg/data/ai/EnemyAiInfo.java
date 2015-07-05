package cg.data.ai;

public interface EnemyAiInfo {
	
	/**
	 * 100%������� �������0 ��100%ai��ѡ�����
	 */
	byte AI_CONDITION_100 = 0;
	/**
	 * 75%������� �������0 ��75%ai��ѡ�����
	 */
	byte AI_CONDITION_75 = 1;
	/**
	 * 50%������� �������0 ��50%ai��ѡ�����
	 */
	byte AI_CONDITION_50 = 2;
	/**
	 * 25%������� �������0 ��25%ai��ѡ�����
	 */
	byte AI_CONDITION_25 = 3;
	/**
	 * ��������HP = 100%
	 */
	byte AI_CONDITION_S_HP_E_100 = 4;
	/**
	 * ��������HP > 75%
	 */
	byte AI_CONDITION_S_HP_G_75 = 5;
	/**
	 * ��������HP > 50%
	 */
	byte AI_CONDITION_S_HP_G_50 = 6;
	/**
	 * ��������HP < 50%
	 */
	byte AI_CONDITION_S_HP_L_50 = 7;
	/**
	 * ��������HP < 25%
	 */
	byte AI_CONDITION_S_HP_L_25 = 8;
	/**
	 * ��������MP >= 50%
	 */
	byte AI_CONDITION_S_MP_GE_50 = 9;
	/**
	 * ��������MP < 50%
	 */
	byte AI_CONDITION_S_MP_L_50 = 10;
	/**
	 * ������ӪHP < 50%
	 */
	byte AI_CONDITION_T_HP_L_50 = 11;
	/**
	 * ������ӪHP < 25%
	 */
	byte AI_CONDITION_T_HP_L_25 = 12;
	/**
	 * ������Ӫ���ж���λ
	 */
	byte AI_CONDITION_T_POSITION = 13;
	/**
	 * ������Ӫ�л��ҵ�λ
	 */
	byte AI_CONDITION_T_CONFUSION = 14;
	/**
	 * ������Ӫ��ʯ����λ
	 */
	byte AI_CONDITION_T_STONE = 15;
	/**
	 * ������Ӫ��˯�ߵ�λ
	 */
	byte AI_CONDITION_T_SLEEP = 16;
	/**
	 * ������Ӫ����Ƶ�λ
	 */
	byte AI_CONDITION_T_INTOXICATION = 17;
	/**
	 * ������Ӫ��������λ
	 */
	byte AI_CONDITION_T_AMNESIA = 18;
	/**
	 * ��Ҵ�λ���� = 0
	 */
	byte AI_CONDITION_PT_COUNT_E_0 = 19;
	/**
	 * ��Ҵ�λ���� = 1
	 */
	byte AI_CONDITION_PT_COUNT_E_1 = 20;
	/**
	 * ��Ҵ�λ���� = 2
	 */
	byte AI_CONDITION_PT_COUNT_E_2 = 21;
	/**
	 * ����������� = 10
	 */
	byte AI_CONDITION_T_COUNT_E_10 = 22;
	/**
	 * ����������� >= 8
	 */
	byte AI_CONDITION_T_COUNT_GE_8 = 23;
	/**
	 * ����������� >= 5
	 */
	byte AI_CONDITION_T_COUNT_GE_5 = 24;
	/**
	 * ����������� < 5
	 */
	byte AI_CONDITION_T_COUNT_L_5 = 25;
	/**
	 * ����������� < 4
	 */
	byte AI_CONDITION_T_COUNT_L_4 = 26;
	/**
	 * ����������� <= 1
	 */
	byte AI_CONDITION_T_COUNT_LE_1 = 27;
	/**
	 * ��Ч����
	 */
	byte AI_CONDITION_NONE = 28;
	/**
	 * ����ƽ���ȼ�С�����ƽ���ȼ�
	 */
	byte AI_CONDITION_LEVEL_T_L_PT = 29;
	/**
	 * ����ƽ���ȼ����ڵ������ƽ���ȼ�
	 */
	byte AI_CONDITION_LEVEL_T_GE_PT = 30;
	/**
	 * ���ĳһ��λHP = 100%
	 */
	byte AI_CONDITION_P_HP_E_100 = 31;
	/**
	 * ���ĳһ��λHP > 75%
	 */
	byte AI_CONDITION_P_HP_G_75 = 32;
	/**
	 * ���ĳһ��λHP > 50%
	 */
	byte AI_CONDITION_P_HP_G_50 = 33;
	/**
	 * ���ĳһ��λHP < 50%
	 */
	byte AI_CONDITION_P_HP_L_50 = 34;
	/**
	 * ���ĳһ��λHP < 25%
	 */
	byte AI_CONDITION_P_HP_L_25 = 35;
	/**
	 * �����Ӫ��װ��Զ�̹��������ĵ�λ
	 */
	byte AI_CONDITION_P_FAR = 36;
	/**
	 * �����Ӫû��װ��Զ�̹��������ĵ�λ
	 */
	byte AI_CONDITION_P_NOFAR = 37;
	/**
	 * �����Ӫ�����ж��ĵ�λ
	 */
	byte AI_CONDITION_P_POSITION = 38;
	/**
	 * �����Ӫ����û���ж��ĵ�λ
	 */
	byte AI_CONDITION_P_NOPOSITION = 39;
	/**
	 * �����Ӫ���ڻ��ҵĵ�λ
	 */
	byte AI_CONDITION_P_CONFUSION = 40;
	/**
	 * �����Ӫ����û�л��ҵĵ�λ
	 */
	byte AI_CONDITION_P_NOCONFUSION = 41;
	/**
	 * �����Ӫ����ʯ���ĵ�λ
	 */
	byte AI_CONDITION_P_STONE = 42;
	/**
	 * �����Ӫ����û��ʯ���ĵ�λ
	 */
	byte AI_CONDITION_P_NOSTONE = 43;
	/**
	 * �����Ӫ����˯�ߵĵ�λ
	 */
	byte AI_CONDITION_P_SLEEP = 44;
	/**
	 * �����Ӫ����û��˯�ߵĵ�λ
	 */
	byte AI_CONDITION_P_NOSLEEP = 45;
	/**
	 * �����Ӫ������Ƶĵ�λ
	 */
	byte AI_CONDITION_P_INTOXICATION = 46;
	/**
	 * �����Ӫ����û����Ƶĵ�λ
	 */
	byte AI_CONDITION_P_NOINTOXICATION = 47;
	/**
	 * �����Ӫ���������ĵ�λ
	 */
	byte AI_CONDITION_P_AMNESIA = 48;
	/**
	 * �����Ӫ����û�������ĵ�λ
	 */
	byte AI_CONDITION_P_NOAMNESIA = 49;
	/**
	 * ���ʹ�ûָ�ħ��
	 */
	byte AI_CONDITION_P_USE_HUIFU = 50;
	/**
	 * ����д���ħ��/ħ��/ħ��״̬�ĵ�λʱ
	 */
	byte AI_CONDITION_P_MAGIC_WITCHCRAFT = 51;
	/**
	 * ����д���û��ħ��/ħ��/ħ��״̬�ĵ�λʱ
	 */
	byte AI_CONDITION_P_MAGIC_NOWITCHCRAFT = 52;
	/**
	 * ����д��ڹ���/����/����״̬�ĵ�λʱ
	 */
	byte AI_CONDITION_P_PHYSICS_WITCHCRAFT = 53;
	/**
	 * ����д���û�й���/����/����״̬�ĵ�λʱ
	 */
	byte AI_CONDITION_P_PHYSICS_NOWITCHCRAFT = 54;
	/**
	 * �����غ�ʱ
	 */
	byte AI_CONDITION_ODD_ROUND = 55;
	/**
	 * ż���غ�ʱ
	 */
	byte AI_CONDITION_EVEN_ROUND = 56;
	/**
	 * ���2�غ�
	 */
	byte AI_CONDITION_INTERVAL_ROUND_2 = 57;
	/**
	 * ��ǰ��Ϸ��ʱ��Ϊ����ʱ
	 */
	byte AI_CONDITION_DAY = 58;
	/**
	 * ��ǰ��Ϸ��ʱ��Ϊҹ��ʱ
	 */
	byte AI_CONDITION_NIGHT = 59;
	/**
	 * ��Ҵ�����
	 */
	byte AI_CONDITION_P_HAS_PET = 60;
	/**
	 * ��Ҳ�������
	 */
	byte AI_CONDITION_P_NO_PET = 61;
	/**
	 * ����ж���Ŀ�����0��λ��λʱ #λ�� ���� 4 2 0 1 3 ǰ�� 9 7 5 6 8
	 */
	byte AI_CONDITION_P_TARGET_0 = 62;
	/**
	 * ����ж���Ŀ�����1��λ��λʱ
	 */
	byte AI_CONDITION_P_TARGET_1 = 63;
	/**
	 * ����ж���Ŀ�����2��λ��λʱ
	 */
	byte AI_CONDITION_P_TARGET_2 = 64;
	/**
	 * ����ж���Ŀ�����3��λ��λʱ
	 */
	byte AI_CONDITION_P_TARGET_3 = 65;
	/**
	 * ����ж���Ŀ�����4��λ��λʱ
	 */
	byte AI_CONDITION_P_TARGET_4 = 66;
	/**
	 * ����ж���Ŀ�����5��λ��λʱ
	 */
	byte AI_CONDITION_P_TARGET_5 = 67;
	/**
	 * ����ж���Ŀ�����6��λ��λʱ
	 */
	byte AI_CONDITION_P_TARGET_6 = 68;
	/**
	 * ����ж���Ŀ�����7��λ��λʱ
	 */
	byte AI_CONDITION_P_TARGET_7 = 69;
	/**
	 * ����ж���Ŀ�����8��λ��λʱ
	 */
	byte AI_CONDITION_P_TARGET_8 = 70;
	/**
	 * ����ж���Ŀ�����9��λ��λʱ
	 */
	byte AI_CONDITION_P_TARGET_9 = 71;
	/**
	 * ���û�ж���Ŀ�����0��λ��λʱ #λ�� ���� 4 2 0 1 3 ǰ�� 9 7 5 6 8
	 */
	byte AI_CONDITION_P_NOTARGET_0 = 72;
	/**
	 * ���û�ж���Ŀ�����1��λ��λʱ
	 */
	byte AI_CONDITION_P_NOTARGET_1 = 73;
	/**
	 * ���û�ж���Ŀ�����2��λ��λʱ
	 */
	byte AI_CONDITION_P_NOTARGET_2 = 74;
	/**
	 * ���û�ж���Ŀ�����3��λ��λʱ
	 */
	byte AI_CONDITION_P_NOTARGET_3 = 75;
	/**
	 * ���û�ж���Ŀ�����4��λ��λʱ
	 */
	byte AI_CONDITION_P_NOTARGET_4 = 76;
	/**
	 * ���û�ж���Ŀ�����5��λ��λʱ
	 */
	byte AI_CONDITION_P_NOTARGET_5 = 77;
	/**
	 * ���û�ж���Ŀ�����6��λ��λʱ
	 */
	byte AI_CONDITION_P_NOTARGET_6 = 78;
	/**
	 * ���û�ж���Ŀ�����7��λ��λʱ
	 */
	byte AI_CONDITION_P_NOTARGET_7 = 79;
	/**
	 * ���û�ж���Ŀ�����8��λ��λʱ
	 */
	byte AI_CONDITION_P_NOTARGET_8 = 80;
	/**
	 * ���û�ж���Ŀ�����9��λ��λʱ
	 */
	byte AI_CONDITION_P_NOTARGET_9 = 81;
	/**
	 * ���ֻ��1���������
	 */
	byte AI_CONDITION_P_COUNT_E_1 = 82;
	/**
	 * ��ҳ���1���������
	 */
	byte AI_CONDITION_P_COUNT_G_1 = 83;
	/**
	 * ��ҳ���2���������
	 */
	byte AI_CONDITION_P_COUNT_G_2 = 84;
	/**
	 * ��ҳ���3���������
	 */
	byte AI_CONDITION_P_COUNT_G_3 = 85;
	/**
	 * �����5���������
	 */
	byte AI_CONDITION_P_COUNT_E_5 = 86;
	/**
	 * �غ�����4�ı���
	 */
	byte AI_CONDITION_GROUND_M_4 = 87;
	/**
	 * �غ�����5�ı���
	 */
	byte AI_CONDITION_GROUND_M_5 = 88;
	/**
	 * ��һ�غ�
	 */
	byte AI_CONDITION_GROUND_E_1 = 89;
	/**
	 * ��������MP < 25%
	 */
	byte AI_CONDITION_S_MP_L_25 = 90;
	/**
	 * ��������MP < 15%
	 */
	byte AI_CONDITION_S_MP_L_15 = 91;
	/**
	 * ��������MP < 5%
	 */
	byte AI_CONDITION_S_MP_L_5 = 92;
	
	/**
	 * ��������
	 */
	byte AI_TARGET_SELF = 0;
	/**
	 * �������
	 */
	byte AI_TARGET_T_RANDOM = 1;
	/**
	 * ������
	 */
	byte AI_TARGET_PT_RANDOM = 2;
	/**
	 * ����Ѫ���� �������һ�������ȡ����һ��
	 */
	byte AI_TARGET_T_HP_MOST = 3;
	/**
	 * ���Ѫ���� �������һ�������ȡ����һ��
	 */
	byte AI_TARGET_PT_HP_MOST = 4;
	/**
	 * ����Ѫ���� �������һ�������ȡ����һ��
	 */
	byte AI_TARGET_T_HP_LOW = 5;
	/**
	 * ���Ѫ���� �������һ�������ȡ����һ��
	 */
	byte AI_TARGET_P_HP_LOW = 6;
	/**
	 * �������
	 */
	byte AI_TARGET_T_RANDOM_EX = 7;
	/**
	 * ������
	 */
	byte AI_TARGET_PT_RANDOM_EX = 8;
	/**
	 * ������Ӫ�ж���λ
	 */
	byte AI_TARGET_T_POSITION = 9;
	/**
	 * �����Ӫ�ж���λ
	 */
	byte AI_TARGET_P_POSITION = 10;
	/**
	 * ������Ӫ���ҵ�λ
	 */
	byte AI_TARGET_T_CONFUSION = 11;
	/**
	 * �����Ӫ���ҵ�λ
	 */
	byte AI_TARGET_P_CONFUSION = 12;
	/**
	 * ������Ӫʯ���ĵ�λ
	 */
	byte AI_TARGET_T_STONE = 13;
	/**
	 * �����Ӫʯ���ĵ�λ
	 */
	byte AI_TARGET_P_STONE = 14;
	/**
	 * ������Ӫ˯�ߵĵ�λ
	 */
	byte AI_TARGET_T_SLEEP = 15;
	/**
	 * �����Ӫ˯�ߵĵ�λ
	 */
	byte AI_TARGET_P_SLEEP = 16;
	/**
	 * ������Ӫ��Ƶĵ�λ
	 */
	byte AI_TARGET_T_INTOXICATION = 17;
	/**
	 * �����Ӫ��Ƶĵ�λ
	 */
	byte AI_TARGET_P_INTOXICATION = 18;
	/**
	 * ������Ӫ�����ĵ�λ
	 */
	byte AI_TARGET_T_AMNESIA = 19;
	/**
	 * �����Ӫ�����ĵ�λ
	 */
	byte AI_TARGET_P_AMNESIA = 20;
	/**
	 * �����Ӫʹ��Զ�������ĵ�λ
	 */
	byte AI_TARGET_P_FAR = 21;
	/**
	 * �����Ӫʹ�ý�ս�����ĵ�λ
	 */
	byte AI_TARGET_P_NEAR = 22;
	/**
	 * ������Ӫħ��/ħ��/ħ��״̬�ĵ�λ
	 */
	byte AI_TARGET_T_MAGIC_WITCHCRAFT = 23;
	/**
	 * �����Ӫħ��/ħ��/ħ��״̬�ĵ�λ
	 */
	byte AI_TARGET_PT_MAGIC_WITCHCRAFT = 24;
	/**
	 * ������Ӫ����/����/����״̬�ĵ�λ
	 */
	byte AI_TARGET_T_PHYSICS_WITCHCRAFT = 25;
	/**
	 * �����Ӫ����/����/����״̬�ĵ�λ
	 */
	byte AI_TARGET_PT_PHYSICS_WITCHCRAFT = 26;
	/**
	 * ������Ӫ�ָ�ħ��Ч���ĵ�λ
	 */
	byte AI_TARGET_T_USE_HUIFU = 27;
	/**
	 * �����Ӫ�ָ�ħ��Ч���ĵ�λ
	 */
	byte AI_TARGET_PT_USE_HUIFU = 28;
	/**
	 * �ҷ���Ӫ���Ե�λ��ͼ����
	 */
	byte AI_TARGET_PT_MALE = 29;
	/**
	 * �ҷ���ӪŮ�Ե�λ��ͼ����
	 */
	byte AI_TARGET_PT_FEMALE = 30;
	/**
	 * �ҷ���Ӫ�����ҵ�λ
	 */
	byte AI_TARGET_PT_PLAYER_RANDOM = 31;
	/**
	 * �ҷ���Ӫ������ﵥλ
	 */
	byte AI_TARGET_PT_PET_RANDOM = 32;
	/**
	 * �����Ӫû��ħ��/ħ��/ħ��״̬�ĵ�λ
	 */
	byte AI_TARGET_PT_MAGIC_NOWITCHCRAFT = 33;
	/**
	 * �����Ӫû�й���/����/����״̬�ĵ�λ
	 */
	byte AI_TARGET_PT_PHYSICS_NOWITCHCRAFT = 34;
	/**
	 * δ���쳣״̬��λ,�ж�
	 */
	byte AI_TARGET_P_NOPOSITION = 35;
	/**
	 * δ���쳣״̬��λ,����
	 */
	byte AI_TARGET_P_NOCONFUSION = 36;
	/**
	 * δ���쳣״̬��λ,ʯ��
	 */
	byte AI_TARGET_P_NOSTONE = 37;
	/**
	 * δ���쳣״̬��λ,��˯
	 */
	byte AI_TARGET_P_NOSLEEP = 38;
	/**
	 * δ���쳣״̬��λ,����
	 */
	byte AI_TARGET_P_NOINTOXICATION = 39;
	/**
	 * δ���쳣״̬��λ,����
	 */
	byte AI_TARGET_P_NOAMNESIA = 40;
	/**
	 * �з���Ӫû�лָ�ħ��Ч���ĵ�λ
	 */
	byte AI_TARGET_T_NOHUIFU = 41;
	/**
	 * �з���Ӫû��ħ��/ħ��/ħ��״̬�ĵ�λ
	 */
	byte AI_TARGET_T_MAGIC_NOWITCHCRAFT = 42;
	/**
	 * �з���Ӫû�й���/����/����״̬�ĵ�λ
	 */
	byte AI_TARGET_T_PHYSICS_NOWITCHCRAFT = 43;
	
	int getId();
	
	AiInfo[] getAiInfos();
	
	public static interface AiInfo {
		
		byte getCondition();
		
		byte getTargetType();
		
		int getSkillCode();
		
		byte getRate();
		
	}

}
