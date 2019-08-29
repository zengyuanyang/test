import java.io.IOException;
import java.util.Scanner;

/**
 * 游戏执行的工具类
 * @author 曾远洋
 * @version V1.0
 */
public class GameTools {

	public GameTools() {		//构造方法
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 用于dos界面清屏
	 * @throws IOException	异常抛出
	 * @throws InterruptedException	异常抛出
	 */
	public void cls() throws IOException, InterruptedException
    {
        //// 新建一个 ProcessBuilder，其要执行的命令是 cmd.exe，参数是 /c 和 cls
        new ProcessBuilder("cmd", "/c", "cls")
                // 将 ProcessBuilder 对象的输出管道和 Java 的进程进行关联，这个函数的返回值也是一个
                // ProcessBuilder
                .inheritIO()
                // 开始执行 ProcessBuilder 中的命令
                .start()
                // 等待 ProcessBuilder 中的清屏命令执行完毕
                // 如果不等待则会出现清屏代码后面的输出被清掉的情况
                .waitFor(); // 清屏命令
        System.out.println("==========================三国争霸=========================");
        
    }
	
	/**
	 * 判断用户输入的选项是否合法
	 * @param maxOption	当前界面功能选项的最大选项值
	 * @return	用户输入的选项
	 */
	public int inputOption(int maxOption) {
		Scanner sc = new Scanner(System.in);	//创建Scanner类对象
		System.out.print("请输入序号（1-" + maxOption + "）选择相应功能：");
		int input;	
		while(true) {
			if(sc.hasNextInt()) {	//判断输入的数是否为整数
				input = sc.nextInt();
				if(input < 1 || input > maxOption) {
					System.out.println("您输入的选项没在范围内，请重新输入！");
				}else {
					break;
				}
			}else {
				System.out.println("您输入的选项有误，请重新输入！");
				sc.nextLine();
			}
		}
		return input;	//返回合法选项
	}
	
	/**
	  *  方法重载，判断用户选择角色输入的选项是否合格
	 * @param maxOption	最大选项值
	 * @param flag	临时参数，用于区别原方法，形成方法重载
	 * @return	返回用户输入的角色选项
	 */
	public int inputOption(int maxOption,int flag) {
		Scanner sc = new Scanner(System.in);	//创建Scanner类对象
		System.out.print("请输入序号（1-" + maxOption + "）选择相应角色：");
		int input;	
		while(true) {
			if(sc.hasNextInt()) {
				input = sc.nextInt();
				if(input < 1 || input > maxOption) {
					System.out.println("您输入的选项没在范围内，请重新输入！");
				}else {
					break;
				}
			}else {
				System.out.println("您输入的选项有误，请重新输入！");
				sc.nextLine();
			}
		}
		return input;	//返回合法选项
	}
	
	/**
	  *  方法重载，判断玩家玩家输入出拳是否合理
	 * @param maxOption 最大选项值
	 * @param role	角色名
	 * @return	返回出拳值
	 */
	public int inputOption(int maxOption,String role) {
		Scanner sc = new Scanner(System.in);	//创建Scanner类对象
		System.out.print(role + "请出拳(1：石头  2：剪刀  3：布)：");
		int input;	
		while(true) {
			if(sc.hasNextInt()) {
				input = sc.nextInt();
				if(input < 1 || input > maxOption) {
					System.out.println("出拳错误，请重新出拳！");
				}else {
					break;
				}
			}else {
				System.out.println("出拳错误，请重新出拳！");
				sc.nextLine();
			}
		}
		return input;	//返回合法选项
	}
	
	/**
	 * 注册获取用户名和用户密码
	 * @return 返回一个User类型
	 */
	public User register() {
		Scanner sc = new Scanner(System.in);	//创建Scanner类对象
		User user = new User() ;	//创建User类对象
		while(true) {
			System.out.print("请输入用户名：");
			String userName = sc.nextLine();
			System.out.print("请输入用户密码：");
			String userPwd = sc.nextLine();
			System.out.print("请再次输入用户密码：");
			String userPwdTo = sc.nextLine();
			if(userPwd.equals(userPwdTo)) {
				user.setUserName(userName);		//设置user对象userName成员变量的值
				user.setUserPwd(userPwd);		//设置user对象userPwd成员变量的值
				System.out.println("恭喜您注册成功！");
				break;
			}else {
				System.out.println("您两次输入的密码不同，请重新输入！");
			}
		}
		return user;	//返回赋值后的user对象
	}
	
	/**
	  * 用于返回选择的角色名
	 * @param option 选项
	 * @return 	返回角色名
	 */
	public String role(int option) {
		String character = "刀疤哥";
		switch(option){
		case 1:
			character = "刘备";
			break;
		case 2:
			character = "曹操";
			break;
		case 3:
			character = "孙权";
			break;
		}
		return character;	//返回相应选项的角色名
	}
	
	/**
	 *  玩家出拳
	 * @param role 角色名
	 * @return 返回玩家出的拳
	 */
	public int userBunch(String role) {
		
		int option = inputOption(3,role);	//调用重载的inputOption方法
		return option;	//返回玩家出拳的值
	}
	
	/**
	 * 电脑出拳
	 * @return 返回电脑出的拳
	 */
	public int computerBunch() {
		int bunch = (int)(Math.random()*3+1);	//调用random方法生成1-3的随机数
		return bunch;	//返回电脑出拳的值
	}
	
	public void gameKeyCode(String role) {
		int user = 0; //玩家胜的局数
		int com = 0; //电脑胜的局数
		int ping = 0; //平局数
		int count = 0; //总的游戏局数
		while(true){
			int userBunch = userBunch(role);	//获取玩家出拳
			int computerBunch = computerBunch();	//获取电脑出拳
			switch(userBunch) {	//九种情况的判断
			case 1:
				if(computerBunch == 1) {
					System.out.println("玩家出的石头，电脑出的石头，平局！");
					count++;
					ping++;
				}else if(computerBunch == 2){
					System.out.println("玩家出的石头，电脑出的剪刀，玩家胜！");
					count++;
					user++;
				}else {
					System.out.println("玩家出的石头，电脑出的布，电脑胜！");
					count++;
					com++;
				}
				break;
			case 2:
				if(computerBunch == 1) {
					System.out.println("玩家出的剪刀，电脑出的石头，电脑胜！");
					count++;
					com++;
				}else if(computerBunch == 2){
					System.out.println("玩家出的剪刀，电脑出的剪刀，平局！");
					count++;
					ping++;
				}else {
					System.out.println("玩家出的剪刀，电脑出的布，玩家胜！");
					count++;
					user++;
				}
				break;
			case 3:
				if(computerBunch == 1) {
					System.out.println("玩家出的布，电脑出的石头，玩家胜！");
					count++;
					user++;
				}else if(computerBunch == 2){
					System.out.println("玩家出的布，电脑出的剪刀，电脑胜！");
					count++;
					com++;
				}else {
					System.out.println("玩家出的布，电脑出的布，平局！");
					count++;
					ping++;
				}
				break;
			}	
			if(user == 3 || com == 3) {	//由于是五局三胜制，所以判断玩家或电脑是否赢到第三次
				if(user > com) {	//判断最后只玩家胜利还是电脑胜利
					System.out.println("最后玩家" + role + "胜利！");
				}else {
					System.out.println("最后电脑胜利！");
				}
				System.out.println("总游戏局数：" + count + "，玩家胜利" + user + "局，电脑胜利" + com + "局，平局" + ping + "局。");
				break;
			}
		}
		
	}

}
