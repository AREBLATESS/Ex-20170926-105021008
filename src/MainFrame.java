import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class MainFrame extends Frame{
    private Button btnexit =new Button("exit");
    private Button btnadd =new Button("ADD");
    private Label lab =new Label("ˊ_>ˋ");
    private int count=0,labX=0,labY=0;
    private Timer t1;
    private boolean flag=true ,flag2=true;
    public MainFrame(){
        initComp();

    }
    public void initComp(){
        this.setLayout(null);
        this.setBounds(120,220,720,720);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        btnexit.setBounds(330,70,100,30);
        btnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.add(btnexit);


        btnadd.setBounds(330,100,100,30);
        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
                MainFrame.this.setTitle("ಠ⌣ಠ"+Integer.toString(count));
            }
        });
        this.add(btnadd);

        lab.setBounds(120,220,100,30);
        this.add(lab);

        t1=new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setText("Q_x_x_x_O"+Integer.toString(labY));
                lab.setBackground(new Color(labX/3,120,labY/3));
              lab.setLocation(labX,labY);


              if(labX==630){
                  flag=false;
              }else if(labX==0){
                  flag=true;
              }

              if(flag==true){
                  labX+=5;
              }else if(flag==false){
                  labX-=5;
              }


                if(labY==0){
                    flag2=true;
                }else if(labY==700){
                    flag2=false;
                }
              if(flag2==true){
                  labY+=5;
              }else if(flag2==false){
                  labY-=5;
              }
            }
        });
    }

}
