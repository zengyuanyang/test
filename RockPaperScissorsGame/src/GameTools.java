import java.io.IOException;
import java.util.Scanner;

/**
 * ��Ϸִ�еĹ�����
 * @author ��Զ��
 * @version V1.0
 */
public class GameTools {

	public GameTools() {		//���췽��
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ����dos��������
	 * @throws IOException	�쳣�׳�
	 * @throws InterruptedException	�쳣�׳�
	 */
	public void cls() throws IOException, InterruptedException
    {
        //// �½�һ�� ProcessBuilder����Ҫִ�е������� cmd.exe�������� /c �� cls
        new ProcessBuilder("cmd", "/c", "cls")
                // �� ProcessBuilder ���������ܵ��� Java �Ľ��̽��й�������������ķ���ֵҲ��һ��
                // ProcessBuilder
                .inheritIO()
                // ��ʼִ�� ProcessBuilder �е�����
                .start()
                // �ȴ� ProcessBuilder �е���������ִ�����
                // ������ȴ��������������������������������
                .waitFor(); // ��������
        System.out.println("==========================��������=========================");
        
    }
	
	/**
	 * �ж��û������ѡ���Ƿ�Ϸ�
	 * @param maxOption	��ǰ���湦��ѡ������ѡ��ֵ
	 * @return	�û������ѡ��
	 */
	public int inputOption(int maxOption) {
		Scanner sc = new Scanner(System.in);	//����Scanner�����
		System.out.print("��������ţ�1-" + maxOption + "��ѡ����Ӧ���ܣ�");
		int input;	
		while(true) {
			if(sc.hasNextInt()) {	//�ж���������Ƿ�Ϊ����
				input = sc.nextInt();
				if(input < 1 || input > maxOption) {
					System.out.println("�������ѡ��û�ڷ�Χ�ڣ����������룡");
				}else {
					break;
				}
			}else {
				System.out.println("�������ѡ���������������룡");
				sc.nextLine();
			}
		}
		return input;	//���غϷ�ѡ��
	}
	
	/**
	  *  �������أ��ж��û�ѡ���ɫ�����ѡ���Ƿ�ϸ�
	 * @param maxOption	���ѡ��ֵ
	 * @param flag	��ʱ��������������ԭ�������γɷ�������
	 * @return	�����û�����Ľ�ɫѡ��
	 */
	public int inputOption(int maxOption,int flag) {
		Scanner sc = new Scanner(System.in);	//����Scanner�����
		System.out.print("��������ţ�1-" + maxOption + "��ѡ����Ӧ��ɫ��");
		int input;	
		while(true) {
			if(sc.hasNextInt()) {
				input = sc.nextInt();
				if(input < 1 || input > maxOption) {
					System.out.println("�������ѡ��û�ڷ�Χ�ڣ����������룡");
				}else {
					break;
				}
			}else {
				System.out.println("�������ѡ���������������룡");
				sc.nextLine();
			}
		}
		return input;	//���غϷ�ѡ��
	}
	
	/**
	  *  �������أ��ж������������ȭ�Ƿ����
	 * @param maxOption ���ѡ��ֵ
	 * @param role	��ɫ��
	 * @return	���س�ȭֵ
	 */
	public int inputOption(int maxOption,String role) {
		Scanner sc = new Scanner(System.in);	//����Scanner�����
		System.out.print(role + "���ȭ(1��ʯͷ  2������  3����)��");
		int input;	
		while(true) {
			if(sc.hasNextInt()) {
				input = sc.nextInt();
				if(input < 1 || input > maxOption) {
					System.out.println("��ȭ���������³�ȭ��");
				}else {
					break;
				}
			}else {
				System.out.println("��ȭ���������³�ȭ��");
				sc.nextLine();
			}
		}
		return input;	//���غϷ�ѡ��
	}
	
	/**
	 * ע���ȡ�û������û�����
	 * @return ����һ��User����
	 */
	public User register() {
		Scanner sc = new Scanner(System.in);	//����Scanner�����
		User user = new User() ;	//����User�����
		while(true) {
			System.out.print("�������û�����");
			String userName = sc.nextLine();
			System.out.print("�������û����룺");
			String userPwd = sc.nextLine();
			System.out.print("���ٴ������û����룺");
			String userPwdTo = sc.nextLine();
			if(userPwd.equals(userPwdTo)) {
				user.setUserName(userName);		//����user����userName��Ա������ֵ
				user.setUserPwd(userPwd);		//����user����userPwd��Ա������ֵ
				System.out.println("��ϲ��ע��ɹ���");
				break;
			}else {
				System.out.println("��������������벻ͬ�����������룡");
			}
		}
		return user;	//���ظ�ֵ���user����
	}
	
	/**
	  * ���ڷ���ѡ��Ľ�ɫ��
	 * @param option ѡ��
	 * @return 	���ؽ�ɫ��
	 */
	public String role(int option) {
		String character = "���̸�";
		switch(option){
		case 1:
			character = "����";
			break;
		case 2:
			character = "�ܲ�";
			break;
		case 3:
			character = "��Ȩ";
			break;
		}
		return character;	//������Ӧѡ��Ľ�ɫ��
	}
	
	/**
	 *  ��ҳ�ȭ
	 * @param role ��ɫ��
	 * @return ������ҳ���ȭ
	 */
	public int userBunch(String role) {
		
		int option = inputOption(3,role);	//�������ص�inputOption����
		return option;	//������ҳ�ȭ��ֵ
	}
	
	/**
	 * ���Գ�ȭ
	 * @return ���ص��Գ���ȭ
	 */
	public int computerBunch() {
		int bunch = (int)(Math.random()*3+1);	//����random��������1-3�������
		return bunch;	//���ص��Գ�ȭ��ֵ
	}
	
	public void gameKeyCode(String role) {
		int user = 0; //���ʤ�ľ���
		int com = 0; //����ʤ�ľ���
		int ping = 0; //ƽ����
		int count = 0; //�ܵ���Ϸ����
		while(true){
			int userBunch = userBunch(role);	//��ȡ��ҳ�ȭ
			int computerBunch = computerBunch();	//��ȡ���Գ�ȭ
			switch(userBunch) {	//����������ж�
			case 1:
				if(computerBunch == 1) {
					System.out.println("��ҳ���ʯͷ�����Գ���ʯͷ��ƽ�֣�");
					count++;
					ping++;
				}else if(computerBunch == 2){
					System.out.println("��ҳ���ʯͷ�����Գ��ļ��������ʤ��");
					count++;
					user++;
				}else {
					System.out.println("��ҳ���ʯͷ�����Գ��Ĳ�������ʤ��");
					count++;
					com++;
				}
				break;
			case 2:
				if(computerBunch == 1) {
					System.out.println("��ҳ��ļ��������Գ���ʯͷ������ʤ��");
					count++;
					com++;
				}else if(computerBunch == 2){
					System.out.println("��ҳ��ļ��������Գ��ļ�����ƽ�֣�");
					count++;
					ping++;
				}else {
					System.out.println("��ҳ��ļ��������Գ��Ĳ������ʤ��");
					count++;
					user++;
				}
				break;
			case 3:
				if(computerBunch == 1) {
					System.out.println("��ҳ��Ĳ������Գ���ʯͷ�����ʤ��");
					count++;
					user++;
				}else if(computerBunch == 2){
					System.out.println("��ҳ��Ĳ������Գ��ļ���������ʤ��");
					count++;
					com++;
				}else {
					System.out.println("��ҳ��Ĳ������Գ��Ĳ���ƽ�֣�");
					count++;
					ping++;
				}
				break;
			}	
			if(user == 3 || com == 3) {	//�����������ʤ�ƣ������ж���һ�����Ƿ�Ӯ��������
				if(user > com) {	//�ж����ֻ���ʤ�����ǵ���ʤ��
					System.out.println("������" + role + "ʤ����");
				}else {
					System.out.println("������ʤ����");
				}
				System.out.println("����Ϸ������" + count + "�����ʤ��" + user + "�֣�����ʤ��" + com + "�֣�ƽ��" + ping + "�֡�");
				break;
			}
		}
		
	}

}
