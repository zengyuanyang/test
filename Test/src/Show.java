/**
    需要显示给用户的东西
*/

public class Show{//定义类show
	private GameTools tool=new GameTools();
	private User registerUser=new User();
	
	//主界面
	public void faceMain(){//定义方法facemax
		System.out.println("\t\t 1.登陆");
		System.out.println("\t\t 2.注册");
		System.out.println("\t\t 3.游戏介绍");
		System.out.println("\t\t 4.退出游戏");
		System.out.println("================================================");
		System.out.println("================================================");
		
		
		int index=tool.getUserValue(4);
		
		switch(index){
			case 1:
					System.out.println("谢谢使用，三国争霸游戏！");
					break;
			case 2:
					register();//注册
					break;
			case 3:
					showGamePresent();//显示游戏介绍页面
					break;
					
			case 4:
					System.out.println("谢谢使用，三国争霸游戏！");
					System.exit(0);
					break;
		}
		
		
	}
	
	
	//游戏介绍页面
	public void showGamePresent(){
		System.out.println("三国争霸游戏玩法介绍：");
		System.out.println("三国争霸游戏玩法介绍：");
		System.out.println("三国争霸游戏玩法介绍：");
		System.out.println("三国争霸游戏玩法介绍：");
		System.out.println("三国争霸游戏玩法介绍：");
		System.out.println("================================================");
		System.out.println("================================================");
		System.out.println("\t\t返回");
		System.out.println("================================================");
		System.out.println("================================================");
		int index=tool.getUserValue(1);
		if(index==1){
			faceMain();
		}
	}
	
	
	//注册
	public void register(){
		System.out.println("================================================");
		System.out.println("================================================");
		System.out.println("=================用户注册=======================");
		registerUser=tool.addUser();
		System.out.println("================================================");
		System.out.println("================================================");
		System.out.println("\t\t  1.返回");
		System.out.println("================================================");
		System.out.println("================================================");
		int index=tool.getUserValue(1);
		if(index==1){
			faceMain();
		}
	}
	
	
	//登陆
	public void userLogin(){
		System.out.println("================================================");
		System.out.println("================================================");
		System.out.println("=================用户登陆=======================");
		
		for(;;){
			User loginUser=tool.login();
			if(loginUser.getUserName().equals(registerUser.getUserName())&&loginUser.getUserPwd().equals(registerUser.getUserPwd())){
				System.out.println("登陆成功");
				break;
			}else{
				System.out.println("输入错误，请重新登录");
				continue;
			}
		}
		
	}
	
	
	
}