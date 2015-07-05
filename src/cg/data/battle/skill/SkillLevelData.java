package cg.data.battle.skill;

import cg.base.skill.SkillLevelInfo;

public interface SkillLevelData extends SkillLevelInfo {
	
	int NO_SKILL = -1;
	
	byte LEVEL_PET = 30;
	
	byte LEVEL_BOSS = 50;
	
	SelfEffect[] getSelfEffects();
	
	int getSkillCode();
	
	short getSkillId();
	
	int getPrice();
	
	int getBeginAnimation();
	
	int getAttachAnimation();
	
	int getHitAnimation();
	
	int getBackAnimation();
	
	int getTrackAnimation();
	
	public static interface SelfEffect {

		/** �����ٶ� */
		String EFFECT_ATTACK_SPEED = "AS";
		/** ��С�������� */
		String EFFECT_ATTACK_MIN = "AN";
		/** ��󹥻����� */
		String EFFECT_ATTACK_MAX = "AM";
		/** �˺��� */
		String EFFECT_DAMAGE = "DD";
		/** �������ٷֱ� */
		String EFFECT_ATTACK_RATE = "TR";
		/** �������� */
		String EFFECT_DEFEND_RATE = "DR";
		/** ħ������ */
		String EFFECT_MAGIC_RATE = "MR";
		/** ���� */
		String EFFECT_HIT_RATE = "HR";
		/** �ķѶԷ�MP�İٷֱ� */
		String EFFECT_TARGET_MANA_RATE = "FR";
		/** ħ������ */
		String EFFECT_MAGIC_DEFEND = "RS";
		/** ������� */
		String EFFECT_PHYSICAL_DEFEND = "RE";
		/** ���� */
		String EFFECT_AVOID = "AV";
		/** ����Ĭ����(����) */
		String EFFECT_CO = "CO";
		/** ������(����) */
		String EFFECT_COUNTER = "CM";
		/** ��С�ָ��� */
		String EFFECT_D1 = "D1";
		/** ���ָ��� */
		String EFFECT_D2 = "D2";
		/** �������� */
		String EFFECT_POISON = "PO";
		/** ��˯���� */
		String EFFECT_SLEEP = "SL";
		/** ��ʯ���� */
		String EFFECT_STONE = "ST";
		/** �������� */
		String EFFECT_INTOXICATION = "YO";
		/** �������� */
		String EFFECT_CONFUSION = "CN";
		/** �������� */
		String EFFECT_AMNESIA = "AA";
		/** ����Ļ��� */
		String EFFECT_AC = "AC";
		/** ħ�� �ָ����� */
		String EFFECT_MAGIC_ATTACK = "AR";
		/** �Է�������� */
		String EFFECT_S_RATE = "SR";
		/** �غ��� */
		String EFFECT_ROUND = "CH";
		/** �ָ��� */
		String EFFECT_RECOVER_RATE = "RR";
		/** ��ɱ */
		String EFFECT_CRITICAL_RATE = "CR";
		/** Ԫ�����ԡ�EX�� */
		String EFFECT_EX_ELEMENT = "EL";
		
		String getType();
		
		short getValue();
		
	}

}
