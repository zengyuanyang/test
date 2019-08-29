import java.io.IOException;
/**
 * 
 * @author 曾远洋
 *
 */
public class m
{
	public static void main(String[] args)
			throws IOException, InterruptedException
	{
		for (int i = 0; i < 20; i++)
		{
			System.out.println("%%%%%%  " + i + "   %%%%%");
		}
		// 睡眠三秒
		Thread.currentThread().sleep(1000 * 3);
		// 控制台清屏
		cls();
		System.out.println("%%%%%%    %%%%%");
	}
    /**
     * 控制台清屏
     * @throws IOException
     * @throws InterruptedException
     */
    public static void cls() throws IOException, InterruptedException
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
    }
}