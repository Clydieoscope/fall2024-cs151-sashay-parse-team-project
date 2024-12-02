import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ReceiptFrame extends Frame{
	
	public ReceiptFrame() {
		Color defaultBorderColor = new Color(200, 221, 242);
		
		// dummy data
		Store store = new Store("COSTCO Wholesale", "San Jose", "CA", "(409) 123-9876", 5.0);
		Employee employee = new Employee("Clyde Joshua", "Delgado");
		
		
		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0; // Column 0
		c.gridy = 0; // Row 0
		//c.gridwidth = 1; // Occupies 1 column
		//c.gridheight = 1; // Occupies 1 row
		//c.weightx = 1.0; // Relative horizontal weight
		//c.weighty = 1.0; // Relative vertical weight
		c.fill = GridBagConstraints.BOTH; // Fill the cell in both directions
		//c.anchor = GridBagConstraints.CENTER; // Anchor the component in the center of the cell
		c.insets = new Insets(5, 5, 5, 5); // Add padding around the component
		
		
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}        
		});
		
		setTitle("Cashier Window");
		pack();
		setVisible(true);
	}
	
}
