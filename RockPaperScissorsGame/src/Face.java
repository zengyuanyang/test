import java.io.IOException;
import java.util.Scanner;

/**
 * ��������࣬�����桢ע����桢��¼���桢��Ϸ���ܽ���
 * @author ��Զ��
 * @version V1.0
 */
public class Face {
	GameTools tools = new GameTools();	//����GameTools��Ķ���tools
	User user  = new User();	//����User��Ķ���user
	public Face() {	//���캯��
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ��ʾ������
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public void showMain() throws IOException, InterruptedException {
		System.out.println("======================��ӭ������������======================");
		System.out.println("======================�����Ŷӣ����̸�======================");
		System.out.println("1.��¼");
		System.out.println("2.ע��");
		System.out.println("3.��Ϸ����");
		System.out.println("4.�˳���Ϸ");
		int option = tools.inputOption(4);	//����GameTools���е�inputOption��������ȡ�û������ѡ��ֵ
		switch(option) {
		case 1:
			userLogin();	//�����û���¼����
			break;
		case 2:
			userReg();	//�����û�ע�᷽��
			break;
		case 3:
			showIntroduce();	//������Ϸ���ܷ���
			break;
		case 4:
			tools.cls();	//����GameTools���е�cls������������
			System.out.println("ллʹ���ټ�");	
			System.exit(0);		//��������
		}
		
	}
	
	/**
	 * ��ʾ��Ϸ���ܽ���
	 * @throws IOException	�׳��쳣
	 * @throws InterruptedException	�׳��쳣
	 */
	public void showIntroduce() throws IOException, InterruptedException {
		tools.cls();	//����GameTools���е�cls������������
		System.out.println("==========================��Ϸ����==========================");
		System.out.println("��Ϸ���ƣ���������");
		System.out.println("�����Ŷӣ����̸�");
		System.out.println("��Ϸ�汾��1.0");
		System.out.println("��Ϸ��ɫ���ܲ١���������Ȩ");
		System.out.println("��Ϸ�淨��");
		System.out.println('\t' + "�˻���ս��1.��ʾ�û���ȭ��2.���Գ�ȭ");
		System.out.println("��Ϸ����");
		System.out.println('\t' + "a.�ж���Ӯ");
		System.out.println('\t' + "b.�����ʤ��");
		System.out.println('\t' + "c.ÿ������");
		System.out.println('\t' + "d.���ͳ����ҵ�ʤ��");
		System.out.println('\t' + "e.Ӯ���Ժ�ÿ������1�㾭��ֵ��ÿ����ʮ�㾭����һ��");
		System.out.println("1.����");
		System.out.println("2.�˳���Ϸ");
		int option = tools.inputOption(2);	//����GameTools���е�inputOption��������ȡ�û������ѡ��ֵ
		switch(option) {
		case 1:
			tools.cls();	//����GameTools���е�cls������������
			showMain();		//����showMain����������ʾ��ҳ
			break;
		case 2:
			tools.cls();	//����GameTools���е�cls������������
			System.out.println("ллʹ���ټ�");
			System.exit(0);		//��������
		}
	}
	
	/**
	 * �û�ע�������ʾ
	 * @throws IOException	�׳��쳣
	 * @throws InterruptedException	�׳��쳣
	 */
	public void userReg() throws IOException, InterruptedException {
		tools.cls();	//����GameTools���е�cls������������
		System.out.println("==========================�û�ע��==========================");
		user = tools.register();	//����GameTools���е�register������ֵ����user����
		System.out.println("1.����");	
		System.out.println("2.�˳���Ϸ");
		int option = tools.inputOption(2);	//����GameTools���е�inputOption��������ȡ�û������ѡ��ֵ
		switch(option) {
		case 1:
			tools.cls();	//����GameTools���е�cls������������
			showMain();		//����showMain����������ʾ��ҳ
			break;
		case 2:
			tools.cls();	//����GameTools���е�cls������������
			System.out.println("ллʹ���ټ�");
			System.exit(0);	//��������
		}
	}
	
	/**
	 * �û�ע�᷽��
	 * @throws IOException	�׳��쳣
	 * @throws InterruptedException �׳��쳣
	 */
	public void userLogin() throws IOException, InterruptedException {
		tools.cls();	//��������
		Scanner sc = new Scanner(System.in);	//����Scanner���sc����
		System.out.println("==========================�û���¼==========================");
		while(true) {
			System.out.print("�������û�����");
			String userName = sc.nextLine();	//��ȡ������û���
			System.out.print("�������û����룺");
			String userPwd = sc.nextLine();		//��ȡ������û�����
			if((userName.equals(user.getUserName()) && userPwd.equals(user.getUserPwd()))) {	//�ж��û���¼ʱ������˺ź������Ƿ���ע��ʱ���˺ź��������
				System.out.println("��ϲ������½�ɹ���");
				selectRole();
				break;
			}else {
				System.out.println("��������˺Ż�����������������룡");
			}
		}
	}
	
	/**
	  * ��ɫѡ�����
	 * @throws InterruptedException 
	 * @throws IOException 
	 * 
	 */
	public void selectRole() throws IOException, InterruptedException {
		tools.cls();
		System.out.println("==========================��ɫѡ��==========================");
		System.out.println("1.����");
		System.out.println("2.�ܲ�");
		System.out.println("3.��Ȩ");
		String role = tools.role(tools.inputOption(3,1));	//���ص�ǰѡ���ɫ�Ľ�ɫ��
		switch(role) {
		case "����":
			System.out.println("��ѡ��Ľ�ɫ��������");
			game(role);		//����game����ִ����Ϸ
			break;
		case "�ܲ�":
			System.out.println("��ѡ��Ľ�ɫ�ǲܲ٣�");
			game(role);		//����game����ִ����Ϸ
			break;
		case "��Ȩ":
			System.out.println("��ѡ��Ľ�ɫ����Ȩ��");
			game(role);		//����game����ִ����Ϸ
			break;
		}
	}
	
	
	/**
	  *  ��Ϸ���н���
	 * @throws IOException	�׳��쳣
	 * @throws InterruptedException	�׳��쳣
	 */
	public void game(String role) throws IOException, InterruptedException {
		tools.cls();	//����
		System.out.println("========================"+ role +"��ʼ��Ϸ=======================");
		tools.gameKeyCode(role);	//������Ϸִ�еĺ��ķ���gameKeyCode	
		System.out.println("1.������Ϸ");
		System.out.println("2.����������");
		int option = tools.inputOption(2);	//��ȡ����ѡ��ֵ
		switch(option) {
		case 1:
			selectRole();	//�ص���ɫѡ�����
			break;	
		case 2:
			tools.cls();	
			showMain();		//�ص�������
		}
	}

}
