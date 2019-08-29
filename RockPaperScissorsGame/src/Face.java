import java.io.IOException;
import java.util.Scanner;

/**
 * 界面输出类，主界面、注册界面、登录界面、游戏介绍界面
 * @author 曾远洋
 * @version V1.0
 */
public class Face {
	GameTools tools = new GameTools();	//创建GameTools类的对象tools
	User user  = new User();	//创建User类的对象user
	public Face() {	//构造函数
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 显示主界面
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public void showMain() throws IOException, InterruptedException {
		System.out.println("======================欢迎来到三国争霸======================");
		System.out.println("======================制作团队：刀疤哥======================");
		System.out.println("1.登录");
		System.out.println("2.注册");
		System.out.println("3.游戏介绍");
		System.out.println("4.退出游戏");
		int option = tools.inputOption(4);	//调用GameTools类中的inputOption方法，获取用户输入的选项值
		switch(option) {
		case 1:
			userLogin();	//调用用户登录方法
			break;
		case 2:
			userReg();	//调用用户注册方法
			break;
		case 3:
			showIntroduce();	//调用游戏介绍方法
			break;
		case 4:
			tools.cls();	//调用GameTools类中的cls（）清屏方法
			System.out.println("谢谢使用再见");	
			System.exit(0);		//结束程序
		}
		
	}
	
	/**
	 * 显示游戏介绍界面
	 * @throws IOException	抛出异常
	 * @throws InterruptedException	抛出异常
	 */
	public void showIntroduce() throws IOException, InterruptedException {
		tools.cls();	//调用GameTools类中的cls（）清屏方法
		System.out.println("==========================游戏介绍==========================");
		System.out.println("游戏名称：三国争霸");
		System.out.println("制作团队：刀疤哥");
		System.out.println("游戏版本：1.0");
		System.out.println("游戏角色：曹操、刘备、孙权");
		System.out.println("游戏玩法：");
		System.out.println('\t' + "人机对战：1.提示用户出拳；2.电脑出拳");
		System.out.println("游戏规则：");
		System.out.println('\t' + "a.判断输赢");
		System.out.println('\t' + "b.五局三胜制");
		System.out.println('\t' + "c.每局三把");
		System.out.println('\t' + "d.最后统计玩家的胜率");
		System.out.println('\t' + "e.赢了以后，每次增加1点经验值，每增长十点经验升一级");
		System.out.println("1.返回");
		System.out.println("2.退出游戏");
		int option = tools.inputOption(2);	//调用GameTools类中的inputOption方法，获取用户输入的选项值
		switch(option) {
		case 1:
			tools.cls();	//调用GameTools类中的cls（）清屏方法
			showMain();		//调用showMain（）方法显示主页
			break;
		case 2:
			tools.cls();	//调用GameTools类中的cls（）清屏方法
			System.out.println("谢谢使用再见");
			System.exit(0);		//结束程序
		}
	}
	
	/**
	 * 用户注册界面显示
	 * @throws IOException	抛出异常
	 * @throws InterruptedException	抛出异常
	 */
	public void userReg() throws IOException, InterruptedException {
		tools.cls();	//调用GameTools类中的cls（）清屏方法
		System.out.println("==========================用户注册==========================");
		user = tools.register();	//调用GameTools类中的register方法将值赋给user对象
		System.out.println("1.返回");	
		System.out.println("2.退出游戏");
		int option = tools.inputOption(2);	//调用GameTools类中的inputOption方法，获取用户输入的选项值
		switch(option) {
		case 1:
			tools.cls();	//调用GameTools类中的cls（）清屏方法
			showMain();		//调用showMain（）方法显示主页
			break;
		case 2:
			tools.cls();	//调用GameTools类中的cls（）清屏方法
			System.out.println("谢谢使用再见");
			System.exit(0);	//结束程序
		}
	}
	
	/**
	 * 用户注册方法
	 * @throws IOException	抛出异常
	 * @throws InterruptedException 抛出异常
	 */
	public void userLogin() throws IOException, InterruptedException {
		tools.cls();	//结束程序
		Scanner sc = new Scanner(System.in);	//创建Scanner类的sc对象
		System.out.println("==========================用户登录==========================");
		while(true) {
			System.out.print("请输入用户名：");
			String userName = sc.nextLine();	//获取输入的用户名
			System.out.print("请输入用户密码：");
			String userPwd = sc.nextLine();		//获取输入的用户密码
			if((userName.equals(user.getUserName()) && userPwd.equals(user.getUserPwd()))) {	//判断用户登录时输入的账号和密码是否与注册时的账号和密码相等
				System.out.println("恭喜您，登陆成功！");
				selectRole();
				break;
			}else {
				System.out.println("您输入的账号或密码错误，请重新输入！");
			}
		}
	}
	
	/**
	  * 角色选择界面
	 * @throws InterruptedException 
	 * @throws IOException 
	 * 
	 */
	public void selectRole() throws IOException, InterruptedException {
		tools.cls();
		System.out.println("==========================角色选择==========================");
		System.out.println("1.刘备");
		System.out.println("2.曹操");
		System.out.println("3.孙权");
		String role = tools.role(tools.inputOption(3,1));	//返回当前选择角色的角色名
		switch(role) {
		case "刘备":
			System.out.println("您选择的角色是刘备！");
			game(role);		//调用game方法执行游戏
			break;
		case "曹操":
			System.out.println("您选择的角色是曹操！");
			game(role);		//调用game方法执行游戏
			break;
		case "孙权":
			System.out.println("您选择的角色是孙权！");
			game(role);		//调用game方法执行游戏
			break;
		}
	}
	
	
	/**
	  *  游戏进行界面
	 * @throws IOException	抛出异常
	 * @throws InterruptedException	抛出异常
	 */
	public void game(String role) throws IOException, InterruptedException {
		tools.cls();	//清屏
		System.out.println("========================"+ role +"开始游戏=======================");
		tools.gameKeyCode(role);	//调用游戏执行的核心方法gameKeyCode	
		System.out.println("1.继续游戏");
		System.out.println("2.返回主界面");
		int option = tools.inputOption(2);	//获取功能选项值
		switch(option) {
		case 1:
			selectRole();	//回到角色选择界面
			break;	
		case 2:
			tools.cls();	
			showMain();		//回到主界面
		}
	}

}
