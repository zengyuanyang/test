import java.io.IOException;
/**
 * 
 * @author ��Զ��
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
		// ˯������
		Thread.currentThread().sleep(1000 * 3);
		// ����̨����
		cls();
		System.out.println("%%%%%%    %%%%%");
	}
    /**
     * ����̨����
     * @throws IOException
     * @throws InterruptedException
     */
    public static void cls() throws IOException, InterruptedException
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
    }
}