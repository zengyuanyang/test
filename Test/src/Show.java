/**
    ��Ҫ��ʾ���û��Ķ���
*/

public class Show{//������show
	private GameTools tool=new GameTools();
	private User registerUser=new User();
	
	//������
	public void faceMain(){//���巽��facemax
		System.out.println("\t\t 1.��½");
		System.out.println("\t\t 2.ע��");
		System.out.println("\t\t 3.��Ϸ����");
		System.out.println("\t\t 4.�˳���Ϸ");
		System.out.println("================================================");
		System.out.println("================================================");
		
		
		int index=tool.getUserValue(4);
		
		switch(index){
			case 1:
					System.out.println("ллʹ�ã�����������Ϸ��");
					break;
			case 2:
					register();//ע��
					break;
			case 3:
					showGamePresent();//��ʾ��Ϸ����ҳ��
					break;
					
			case 4:
					System.out.println("ллʹ�ã�����������Ϸ��");
					System.exit(0);
					break;
		}
		
		
	}
	
	
	//��Ϸ����ҳ��
	public void showGamePresent(){
		System.out.println("����������Ϸ�淨���ܣ�");
		System.out.println("����������Ϸ�淨���ܣ�");
		System.out.println("����������Ϸ�淨���ܣ�");
		System.out.println("����������Ϸ�淨���ܣ�");
		System.out.println("����������Ϸ�淨���ܣ�");
		System.out.println("================================================");
		System.out.println("================================================");
		System.out.println("\t\t����");
		System.out.println("================================================");
		System.out.println("================================================");
		int index=tool.getUserValue(1);
		if(index==1){
			faceMain();
		}
	}
	
	
	//ע��
	public void register(){
		System.out.println("================================================");
		System.out.println("================================================");
		System.out.println("=================�û�ע��=======================");
		registerUser=tool.addUser();
		System.out.println("================================================");
		System.out.println("================================================");
		System.out.println("\t\t  1.����");
		System.out.println("================================================");
		System.out.println("================================================");
		int index=tool.getUserValue(1);
		if(index==1){
			faceMain();
		}
	}
	
	
	//��½
	public void userLogin(){
		System.out.println("================================================");
		System.out.println("================================================");
		System.out.println("=================�û���½=======================");
		
		for(;;){
			User loginUser=tool.login();
			if(loginUser.getUserName().equals(registerUser.getUserName())&&loginUser.getUserPwd().equals(registerUser.getUserPwd())){
				System.out.println("��½�ɹ�");
				break;
			}else{
				System.out.println("������������µ�¼");
				continue;
			}
		}
		
	}
	
	
	
}