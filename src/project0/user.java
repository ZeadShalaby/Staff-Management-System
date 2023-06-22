package project0;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class user {

 user() {

// create JFrame(our frame that we work in) and JTable(da will creat taple zy el frame kda a3mlo search 3nha)
JFrame frame = new JFrame("employee management system");
JTable table = new JTable();

// create a table model and set a Column Identifiers to this model
// then akid 3arfen an el "opject" de bta3t el java 3momn el mohm a7na bnlg2 leha like array lmabnt3aml m3 classat mn el Language nfsha)
Object[] columns = { "Id", "Name", "Bonus",
"send_Email TO @Hr","Problems" };
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(columns);

// set the model to the table
table.setModel(model);

// Change A JTable Background Color, Font Size, Font Color, Row Height
table.setBackground(Color.CYAN.brighter());
table.setForeground(Color.black);
Font font = new Font("", 1, 18);
table.setFont(font);
table.setRowHeight(30);

// create JTextFields to hold the value (that where we write)
final JTextField textsend_Email = new JTextField ();
final JTextField textProblems = new JTextField ();
JTextField textSearch = new JTextField ();

JLabel labelsend_Email = new JLabel("send_Email");
JLabel labelProblems = new JLabel("comment");

// create JButtons to add the action
JButton btnAdd = new JButton("show");
JButton btnDelete = new JButton("clear");
JButton btnUpdate = new JButton("Send");
JLabel btnSearch = new JLabel("Enter your ID :");


// el size w el position
textsend_Email.setBounds(350, 250, 100, 25);
labelsend_Email.setBounds(275, 250, 100, 25);
textProblems.setBounds(350, 285 , 100, 25);
labelProblems.setBounds(275, 285, 100, 25);

textSearch.setBounds(120, 255, 100, 25);
btnSearch.setBounds(30, 255, 100, 25);

btnAdd.setBounds(500, 220, 100, 25);
btnUpdate.setBounds(500, 265, 100, 25);
btnDelete.setBounds(500, 310, 100, 25);

// create JScrollPane (lma el empoloyee becom to much el scroll make it easy to see all)
JScrollPane pane = new JScrollPane(table);
pane.setBounds(0, 0, 880, 200);

frame.setLayout(null);

frame.add(pane);

// add JTextFields to the jframe
frame.add(textsend_Email);
frame.add(textProblems);
frame.add(labelsend_Email);
frame.add(labelProblems);
frame.add(textSearch);
frame.add(btnSearch);

// add JButtons to the jframe
frame.add(btnAdd);
frame.add(btnDelete);
frame.add(btnUpdate);

// create an array of objects to set the row data (nfs el note el fo2 3la el object)
// row that will put on it the data 
final Object[] row = new Object[5];

//this retturn to search malkosh d3oa beha
//**




//***


// button add row - Clicked on Add Button
// search how add action to the button easy khals
btnAdd.addActionListener((ActionEvent e) -> {
    row[0] = textSearch.getText();
    int a = Integer.parseInt(textSearch.getText()); 
    if(a <= 200)
    {
    	row[1] = "ahmed";
        row[2] = "+2 d";
    }
    else if(a <= 400)
    {
    	row[1] = "mohamed";
        row[2] = "0";
    }
    else if(a <= 600)
    {
    	row[1] = "saif";
        row[2] = "-3 d";
    }
    else
    {
    	row[1] = "ibrahim";
        row[2] = "+1 d";
    }
    row[3] = textsend_Email.getText();
    row[4] = textProblems.getText();
    
// add row to the model
model.addRow(row);
});

// button remove row - Clicked on Delete Button
//search how add action to the button easy khals
//select el row make it by function getSelectedRow()
btnDelete.addActionListener((ActionEvent e) -> {
    // i = the index of the selected row
    int i = table.getSelectedRow();
    if (i >= 0) {
// remove a row from jtable
model.removeRow(i);
    } else {
        System.out
                .println("There were issue while Deleting the Row(s).");
    }
});

// get selected row data From table to textfields
// here lma select row put the data of row that selected in textfileds that we make it
table.addMouseListener(new MouseAdapter() {

@Override
public void mouseClicked(MouseEvent e) {

// i = the index of the selected row
int i = table.getSelectedRow();

textsend_Email.setText(model.getValueAt(i, 3).toString());
textProblems.setText(model.getValueAt(i, 4).toString());
}
});

// button update row - Clicked on Update Button
//search how add action to the button easy khals
btnUpdate.addActionListener((ActionEvent e) -> {
    // i = the index of the selected row
    int i = table.getSelectedRow();
    
    if (i >= 0) {
     
        model.setValueAt(textsend_Email.getText(), i, 3);
        model.setValueAt(textProblems.getText(), i, 4);
    } else {
        System.out.println("Update Error");
    }
});



frame.setSize(900, 420);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

}
}