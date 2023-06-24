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

public class project extends JFrame {
	
project() {

		// create JFrame(our frame that we work in) and JTable(da will creat taple zy el frame kda a3mlo search 3nha)
		JFrame frame = new JFrame("employee management system");
		JTable table = new JTable();

		// create a table model and set a Column Identifiers to this model
		// then akid 3arfen an el "opject" de bta3t el java 3momn el mohm a7na bnlg2 leha like array lmabnt3aml m3 classat mn el Language nfsha)
		Object[] columns = { "Id", "Name", "Salary",
		"Contact-no","email" };
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);

		// set the model to the table
		table.setModel(model);

		// Change A JTable Background Color, Font Size, Font Color, Row Height
		Color color = new Color(173,173,173);
                Color colortable = new Color(200,200,200);

                table.setOpaque(true);
                table.setFillsViewportHeight(true);
                table.setBackground(colortable);

                JScrollPane scroll1 = new JScrollPane(table);
                table.getTableHeader().setBackground(colortable);
                add(scroll1, BorderLayout.CENTER);

		Font font = new Font("", 1, 18);
		table.setFont(font);
		table.setRowHeight(30);

		// create JTextFields to hold the value (that where we write)
		final JTextField textId = new JTextField ();
		final JTextField textName = new JTextField ();
		final JTextField textSalary = new JTextField ();
		final JTextField textContact = new JTextField ();
		final JTextField textEmail = new JTextField ();
		JTextField textSearch = new JTextField ();

		JLabel labelId = new JLabel("Id");
		JLabel labelName = new JLabel("Name");
		JLabel labelSalary = new JLabel("Salary");
		JLabel labelContact = new JLabel("Contact-no");
		JLabel labelEmail = new JLabel("Email *@*");

		// create JButtons to add the action
		JButton btnAdd = new JButton("Add");
		JButton btnDelete = new JButton("Delete");
		JButton btnUpdate = new JButton("Update");
		JButton btnSearch = new JButton("search");


		// el size w el position
		textId.setBounds(90, 205, 100, 25);
		labelId.setBounds(40, 205, 100, 25);
		textName.setBounds(90, 235, 100, 25);
		labelName.setBounds(30, 235, 100, 25);
		textSalary.setBounds(90, 265, 100, 25);
		labelSalary.setBounds(30, 265, 100, 25);
		textContact.setBounds(90, 295, 100, 25);
		labelContact.setBounds(20, 295, 100, 25);
		textEmail.setBounds(90, 325, 100, 25);
		labelEmail.setBounds(20, 325, 100, 25);

		textSearch.setBounds(600, 265, 200, 25);
		btnSearch.setBounds(480, 265, 100, 25);

		btnAdd.setBounds(250, 220, 100, 25);
		btnUpdate.setBounds(250, 265, 100, 25);
		btnDelete.setBounds(250, 310, 100, 25);

		// create JScrollPane (lma el empoloyee becom to much el scroll make it easy to see all)
		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(0, 0, 880, 200);

		frame.setLayout(null);

		frame.add(pane);

		// add JTextFields to the jframe
		frame.add(textId);
		frame.add(textName);
		frame.add(textSalary);
		frame.add(textContact);
		frame.add(textEmail);
		frame.add(labelId);
		frame.add(labelName);
		frame.add(labelSalary);
		frame.add(labelContact);
		frame.add(labelEmail);
		frame.add(textSearch);
		frame.add(btnSearch);

		// add JButtons to the jframe
		frame.add(btnAdd);
		frame.add(btnDelete);
		frame.add(btnUpdate);

		// create an array of objects to set the row data (nfs el note el fo2 3la el object)
		// row that will put on it the data 
		final Object[] row = new Object[5];

		//this retturn to search *malkosh d3oa beha*
		//**********************************************
		 TableRowSorter sorter;
		 sorter = new TableRowSorter<>(model);
		 table.setRowSorter(sorter);

		btnSearch.addActionListener((ActionEvent e) -> {
                    String x1 = textSearch.getText();
                    if (x1.length() == 0) {
                        sorter.setRowFilter(null);
                    } else {
                        sorter.setRowFilter(RowFilter.regexFilter(x1));
                    }
                });
		//*********************************************


		// button add row - Clicked on Add Button
		// search how add action to the button easy khals
		btnAdd.addActionListener((ActionEvent e) -> {
                    row[0] = textId.getText();
                    row[1] = textName.getText();
                    row[2] = textSalary.getText();
                    row[3] = textContact.getText();
                    row[4] = textEmail.getText();
                    
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

		textId.setText(model.getValueAt(i, 0).toString());
		textName.setText(model.getValueAt(i, 1).toString());
		textSalary.setText(model.getValueAt(i, 2).toString());
		textContact.setText(model.getValueAt(i, 3).toString());
		textEmail.setText(model.getValueAt(i, 4).toString());
		}
		});

		// button update row - Clicked on Update Button
		//search how add action to the button easy khals
		btnUpdate.addActionListener((ActionEvent e) -> {
                    // i = the index of the selected row
                    int i = table.getSelectedRow();
                    
                    if (i >= 0) {
                        model.setValueAt(textId.getText(), i, 0);
                        model.setValueAt(textName.getText(), i, 1);
                        model.setValueAt(textSalary.getText(), i, 2);
                        model.setValueAt(textContact.getText(), i, 3);
                        model.setValueAt(textEmail.getText(), i, 4);
                    } else {
                        System.out.println("Update Error");
                    }
                });


                frame.getContentPane().setBackground(color);
		frame.setSize(900, 420);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		}


static class Action implements ActionListener {
        @Override
	public void actionPerformed (ActionEvent e) {
		
		project pr = new project();

	}
}

public static void main(String[] args) {
	
	first f = new first();
	
}
}

