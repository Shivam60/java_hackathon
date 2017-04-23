import java.awt.EventQueue;
import javax.swing.JFrame;

public class Breakout extends JFrame {

    public Breakout() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Brick_Board());
        setTitle("BrickBreaker");
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(Commons.WIDTH, Commons.HEIGTH);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    public static void fun(){
            EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                Breakout game = new Breakout();
                game.setVisible(true);                
            }
        });}
    public static void main(String[] args) {
        fun();
    }

}