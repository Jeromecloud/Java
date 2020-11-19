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
		setTitle("Jerome's Java First GUI program");//标题
		setSize(400, 200);//	尺寸
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置可否关闭
		Container c = getContentPane();//设置内容容器
		JLabel jl = new JLabel("This is a window created by JFrame class");//设置标签
		c.add(jl);//添加标签到内容容器
		setVisible(true);//设置是否可见

	}
}