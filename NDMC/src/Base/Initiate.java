
package Base;

public class Initiate 
{
    public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new first_page().setVisible(true);
            }
        });
    }
}
