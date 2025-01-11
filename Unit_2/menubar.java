import javax.swing.*;
import java.awt.event.*;

class menubar implements ActionListener
{
JFrame f;
JMenuBar mb;
JMenu file,edit,help;
JMenuItem cut,copy,paste,selectAll,save,print;
JTextArea ta;

menubar()
{
f=new JFrame("Notepad Editor");

cut=new JMenuItem("Cut");
copy=new JMenuItem("Copy");
paste=new JMenuItem("Paste");
selectAll=new JMenuItem("SelectAll");
save=new JMenuItem("Save");
print=new JMenuItem("Print");

cut.addActionListener(this);
copy.addActionListener(this);
paste.addActionListener(this);
selectAll.addActionListener(this);

mb=new JMenuBar();

file=new JMenu("File");
edit=new JMenu("Edit");
help=new JMenu("Help");

mb.add(file);
mb.add(edit);
mb.add(help);

file.add(save);
file.add(print);
edit.add(cut);
edit.add(copy);
edit.add(paste);
edit.add(selectAll);

ta=new JTextArea();
ta.setBounds(30,30,400,350);

f.add(mb);
f.add(ta);
f.setSize(500,500);
f.setResizable(false);
f.setJMenuBar(mb);                                 //important
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLayout(null);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==cut)
{
ta.cut();
}
if(e.getSource()==copy)
{
ta.copy();
}
if(e.getSource()==paste)
{
ta.paste();
}
if(e.getSource()==selectAll)
{
ta.selectAll();
}
}
public static void main(String args[])
{
new menubar();
}
}