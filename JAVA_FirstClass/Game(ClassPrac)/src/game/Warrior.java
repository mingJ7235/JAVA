package game;


public  class Warrior extends CharacterPublic{
	
	//���� �� ĳ���� ����
	int cHp = 800;
	int cMp = 100;
	String cName = "";
	int damage = 200;

	
	@Override
	String attack(int cDamage, int mHp) {
		// �����ϰ� �ϴ� ������ �� �� �ְ� ����. 
		String result = "";
		
		result = "" + (cDamage - mHp);
		return result;	
	}


	@Override
	void defense() {
		
	}

	@Override
	void escape() {
		
	}

	@Override
	void showStatus() {
		
	}

	
	
	
}
