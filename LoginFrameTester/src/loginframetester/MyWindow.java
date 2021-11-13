
package loginframetester;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;


public class MyWindow extends JFrame {
    private JButton btnReg;
    private JTextField txtPassword;
    private JPanel panel;
    
    public MyWindow()
    {
        setSize(150,150);
        setTitle("login in system");
        
        this.setLayout(new BorderLayout());
        
        btnReg = new JButton("login");
        this.add(this.btnReg, BorderLayout.SOUTH);
        
        txtPassword = new JTextField("");
        this.add(this.txtPassword, BorderLayout.NORTH);
        
        
        
    }
}
