package day6;
interface PhoneInterface{//�������̽� �ۼ�
	int BUTTONS = 20;//��� �ʵ� ����
	void  sendCall();
	void receiveCall();
}
interface MobilePhoneInterface extends PhoneInterface{//�������̽� ���
	void sendSMS();
	void receiveSMS();
	
}
interface MP3Interface{ //�������̽� �ۼ�
	public void play();
	public void stop();
}
class PDA{
	public int calculate(int x, int y){
		return x+y;
	}
}
//SmartPhone Ŭ������ PDA�� ��ӹް�,
//MobilePhoneInterface �� MP3Interface �������̽��� ����� �޼ҵ带 ��� �����Ѵ�.
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	//MobilePhoneInterface �� �߻�޼ҵ� ����
	@Override
	public void sendCall(){
		System.out.println("��ȭ �ɱ�");
	}
	@Override
	public void receiveCall(){
		System.out.println("��ȭ �ޱ�");
	}
	@Override
	public void sendSMS(){
		System.out.println("SMS������");
	}
	@Override
	public void receiveSMS(){
		System.out.println("SMS�ޱ�");
	}
	//MP3Interface �� �߻�޼ҵ� ����
	@Override
	public void play(){
		System.out.println("�������");
	}
	@Override
	public void stop(){
		System.out.println("�������");
	}
	//�߰��� �ۼ��� �޼ҵ�
	public void schedule(){
		System.out.println("��������");
	}
	
}
public class InterfaceEx{
	public static void main(String[] agrs){
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(3, 5));
		p.schedule();
	}
}