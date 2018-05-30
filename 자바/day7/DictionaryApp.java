package day7;

abstract class PairMap{
	protected String keyArray [];
	protected String valueArray [];
	abstract String get(String key);
	abstract void put(String key, String value);
	
	abstract String delete(String key);
	abstract int length();
}
class Dictionary extends PairMap{
	int i=0,arraylength = 0;
	public Dictionary(int le){
		keyArray = new String[le];
		valueArray = new String[le];
		this.i = 0;
		for(int j=0;j<keyArray.length;j++){
			keyArray[j] = "-";
			valueArray[j] = "-";
		}
	}
	
	@Override
	public String get(String key) {
		int k = 0;
		for(int j=0;j<keyArray.length;j++){
			if(keyArray[j].equals(key)){
				k=j;
				break;
			}
		}
		return valueArray[k];
	}

	@Override
	public void put(String key, String value) {
		for(int j=0;j<keyArray.length;j++){
			if(keyArray[j].equals(key)){
				keyArray[j] = key;
				valueArray[j] = value;
				break;
			}
			else if(keyArray[j] == "-"){
				keyArray[j] = key;
				valueArray[j] = value;
				arraylength++;
				break;
			}
		}
		
		
	}

	@Override
	public String delete(String key) {
		String rt = null;
		int k = 0;
		for(int j=0;j<keyArray.length;j++){
			if(keyArray[j].equals(key)){
				k=j;
				rt = "������ ��:"+valueArray[k];
				valueArray[k] = "-";	
				arraylength--;
				break;
			}else
				rt = "������ ���� �����ϴ�.";
		}
		return rt;
	}

	@Override
	public int length() {
		return arraylength;
	}
	
}
public class DictionaryApp extends Dictionary{
	public DictionaryApp(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		System.out.println(dic.delete("���繮"));
		
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		System.out.println("����� �迭�� ����>>"+dic.length());
	}
}
