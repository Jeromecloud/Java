import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIPlay {
	public static void main(String[] args) {
		new JFrameDemo();
	}
}

class JFrameDemo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JFrameDemo() {
		setTitle("Jerome's Java First GUI program");//����
		setSize(400, 200);//	�ߴ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ÿɷ�ر�
		Container c = getContentPane();//������������
		JLabel jl = new JLabel("This is a window created by JFrame class");//���ñ�ǩ
		c.add(jl);//��ӱ�ǩ����������
		setVisible(true);//�����Ƿ�ɼ�

	}
}