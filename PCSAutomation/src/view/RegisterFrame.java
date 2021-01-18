package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RegisterFrame extends JFrame{

	Container container;
	JLabel lUserId, lPassword,lConform_Password,lDob;
	JTextField tUserId;
	JTextField tDob;
	JPasswordField tPassword;
	JPasswordField tConform_Password;
	JButton  bRegister;
	JCheckBox cShowPassword;
	
	public RegisterFrame() {
		container=getContentPane();
		lUserId=new JLabel("USERNAME");
		lPassword=new JLabel("PASSWORD");
		tUserId=new JTextField();
		tDob=new JTextField();
		tPassword=new JPasswordField();
	    tConform_Password=new JPasswordField();
		bRegister=new JButton("REGISTER");
		
		bRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				callDispose();
				new RegisterFrame();
				
			}
			
		});
		cShowPassword=new JCheckBox("Show Password");
		
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		this.setTitle("REGISTRATION FORM");
		this.setVisible(true);
		this.setBounds(10, 10, 500, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); // fixed size frame
	}
	
	public void setLayoutManager() {
		container.setLayout(null);
	}
	
	public void setLocationAndSize() {
		lUserId.setBounds(50, 150, 100, 30);
		lPassword.setBounds(50,250,100,30);
		lConform_Password.setBounds(50,250,100,30);
		tUserId.setBounds(250,150,150,30);
		tDob.setBounds(50,250,100,30);
		tPassword.setBounds(250,250,150,30);
		cShowPassword.setBounds(250,300,150,30);
	
		bRegister.setBounds(200,400,100,30);
	}
	
	
	public void addComponentsToContainer() {
		container.add(lUserId);
		container.add(tUserId);
		container.add(lPassword);
		container.add(tPassword);
		container.add(cShowPassword);
		container.add(lConform_Password);
		container.add(tConform_Password);
		container.add(tDob);
		container.add(bRegister);
		
	}
	
	public void callDispose() {
		this.dispose();
	}
}
