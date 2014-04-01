package Gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import Components.CTabbedPane;
import Menus.FrameMenu;

import component_listeners.frameExitListener;

public class JEditor {
	
	public static JFrame frame;
	
	public JEditor(){
		init();
	}
	
	public void init(){
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setJMenuBar(new FrameMenu());
		frame.add(CTabbedPane.getInstance() , BorderLayout.CENTER);
		frame.addWindowListener(new frameExitListener());
		frame.setSize(new Dimension(850,650));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}