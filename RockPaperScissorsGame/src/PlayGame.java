import java.io.IOException;

/**
 * ����������Ϸִ�����
 * @author ��Զ��
 * @version V1.0
 */
public class PlayGame {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		GameTools tools = new GameTools();	//����GameTools�����
		tools.cls();	//����GameTools���е�cls������������
		Face face = new Face();		//����Face�����
		face.showMain();	//����showMain����
	}

}
