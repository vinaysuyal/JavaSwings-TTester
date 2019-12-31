
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import ttester.TTester;


public class Main {
    public static void main(String args[])
    {
         try
        {
        
        for(UIManager.LookAndFeelInfo l:UIManager.getInstalledLookAndFeels())
        {
            if(l.getName().equals("Nimbus"))
             UIManager.setLookAndFeel(l.getClassName());
        }
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e)
        {
            System.out.println(e);
        }
        
         TTester tt=new TTester();
         tt.setSize(800,600);
         tt.setExtendedState( JFrame.MAXIMIZED_BOTH );
         tt.setLocationRelativeTo(null);
         tt.setVisible(true);
         
        
    }
    
}
