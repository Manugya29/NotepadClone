

package notepad;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MainPane extends JPanel
{
  
    
    
}
        




class NewWindow extends JFrame
{
    MainPane mainpane =new MainPane();
     private JMenuBar    menubar;
    private JMenu        File,Edit,Format,View,Help;
    private JMenuItem    File1,File2,File3,File4,File5,File6,File7,File8,
                         Edit1,Edit2,Edit3,Edit4,Edit5,Edit6,Edit7,Edit8,Edit9,Edit10,
                         Format1,Format2,
                         View1,View2,View3,
                         Help1;
    private JTextArea    NoteArea;
    private JScrollPane  ScrollPane;
    
    private JMenu makemenubar(String cap)
    {
        
        JMenu temp=new JMenu(cap);
       
        temp.setFont(new Font("Arial",0,16));
        menubar.add(temp);
        return temp;
    }
    
    
    private JMenuItem makemenuItem(String cap)
    {
        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj = e.getSource();
                if(obj==File1){
                    
                  NoteArea.setText("");
                  
                }
                if(obj==File2){
                    
                    
                }
                
                
            }
        };
        
        
        JMenuItem temp=new JMenuItem(cap);
       
        temp.setFont(new Font("Arial",0,16));
        File.add(temp);
        temp.addActionListener(act);
        return temp;
    }
    private JMenuItem makemenuItem1(String cap)
    {
        JMenuItem temp=new JMenuItem(cap);
       
        temp.setFont(new Font("Arial",0,16));
        Edit.add(temp);
        return temp;
    }
    private JMenuItem makemenuItem2(String cap)
    {
        JMenuItem temp=new JMenuItem(cap);
       
        temp.setFont(new Font("Arial",0,16));
        Format.add(temp);
        return temp;
    }
    private JMenuItem makemenuItem3(String cap)
    {
        JMenuItem temp=new JMenuItem(cap);
       
        temp.setFont(new Font("Arial",0,16));
        View.add(temp);
        return temp;
    }
    private JMenuItem makemenuItem4(String cap)
    {
        JMenuItem temp=new JMenuItem(cap);
       
        temp.setFont(new Font("Arial",0,16));
        Help.add(temp);
        return temp;
    }
    
    public  NewWindow(){
        
        menubar = new JMenuBar();
        this.setJMenuBar(menubar);
        
        
        
        NoteArea    = new JTextArea();
        NoteArea.setFont(new Font("Courier New",1,16));
        
        ScrollPane =new JScrollPane(NoteArea);
        ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        ScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        ScrollPane.setBounds(00,00,825,730);
        add(ScrollPane);
        
        
        File=makemenubar("File");
        Edit=makemenubar("Edit");
        Format=makemenubar("Format");
        View=makemenubar("View");
        Help=makemenubar("Help");

        File1=makemenuItem("   New");
        File2 = makemenuItem("   New Window");
        File3 =makemenuItem("   Open");
        File.addSeparator();
        File4 =makemenuItem("   Save");
        File5 =makemenuItem("   Save As");
        File6 =makemenuItem("   Exit");
       
        
        Edit1 =makemenuItem1("   Undo");
        Edit2 =makemenuItem1("   Cut");
        Edit3 =makemenuItem1("   Copy");
        Edit4 =makemenuItem1("   Paste");
        Edit5 =makemenuItem1("   Find");
        Edit6 =makemenuItem1("   Find Next");
        Edit7 =makemenuItem1("   Find Previous");
        Edit8 =makemenuItem1("   Replace");
        Edit9 =makemenuItem1("   Select All");
        Edit10 =makemenuItem1("   Time Date");
        
        
        
        
        Format1 =makemenuItem2("   Word Wrap");
        Format2 =makemenuItem2("   Font");
       
        
        View1 =makemenuItem3("  Zoom In");
        View2 =makemenuItem3("  Zoom Out");
        View3 =makemenuItem3("  Restore Default Zoom");
        
        Help1 =makemenuItem4("  About Notepad");
       
        
        
        
        
        
        
        

        
        
        
        
        
        
    mainpane.setBackground(Color.WHITE);
        mainpane.setLayout(new BorderLayout());
        super.add(mainpane);
    
}
    
    
}

