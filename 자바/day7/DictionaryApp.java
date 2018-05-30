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
				rt = "삭제된 값:"+valueArray[k];
				valueArray[k] = "-";	
				arraylength--;
				break;
			}else
				rt = "삭제할 값이 없습니다.";
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
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		System.out.println(dic.delete("이재문"));
		
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		System.out.println("저장된 배열의 개수>>"+dic.length());
	}
}
