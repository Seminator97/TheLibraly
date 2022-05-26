import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;


public class TheLib {
    public static void main(String[] args) {
        Images.addAllImages();
        Frame lib = new Frame();
        lib.show();
    }
    
}

class Frame { 
    static Date date = new Date();
    static String dateString = date.toString();
    void show(){
        
        JLabel dateLabel = new JLabel("Текущая дата: " + dateString);
        dateLabel.setBounds(0,0,250,15);

        
        JButton test = new JButton("Главная");
        test.setLayout(null);
        test.setBounds(0, 0, 320, 40);

        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(0, 0, 320, 720);
        mainPanel.setBackground(new Color(255,235,190));
        mainPanel.add(test);
        
        
        
        
      
        
        JPanel content = new JPanel();
        content.setLayout(null);
        content.setBounds(320, 0, 960, 720);
        content.setBackground(new Color(192,222,254));
        content.add(dateLabel);
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(0,0,1280,720);
        frame.setLocationRelativeTo(null);
        frame.add(mainPanel);
        frame.add(content);
        frame.setVisible(true);
    }
}

class Images {
    static ArrayList<ImageIcon> allIcons = new ArrayList<>();
    
    static void addImage(String a){
        ImageIcon abc = new ImageIcon(a);
        allIcons.add(abc);
    }
    
    static void addAllImages(){
        addImage("data/but1.png");
    }
    
    static ImageIcon getIcon(int position){
        return allIcons.get(position);
    }
}

