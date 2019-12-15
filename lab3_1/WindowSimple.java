package lab3_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowSimple extends JFrame {
	private JButton countBtn;
	private JButton reserveBtn;
	private JButton removeBtn;
	private JTextField inputTxt;
	private JTextField outputTxt;
	private JLabel inputLbl;
	private JLabel outputLbl;

	@SuppressWarnings("deprecation")
	public WindowSimple() {

		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		countBtn = new JButton("Count Letters");
		reserveBtn = new JButton("Reserve Letters");
		removeBtn = new JButton("Remove Letters");
		inputLbl = new JLabel("input");
		outputLbl = new JLabel("output");
		inputTxt = new JTextField("");
		outputTxt = new JTextField("");
		
		
		rightPanel.add(inputLbl, BorderLayout.NORTH);
		rightPanel.add(inputTxt, BorderLayout.NORTH);
		rightPanel.add(outputLbl, BorderLayout.SOUTH);
		rightPanel.add(outputTxt, BorderLayout.SOUTH);
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.PAGE_AXIS));

		leftPanel.add(countBtn, BorderLayout.NORTH);
		leftPanel.add(reserveBtn, BorderLayout.CENTER);
		leftPanel.add(removeBtn, BorderLayout.SOUTH);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

		add(BorderLayout.WEST, leftPanel);
		add(BorderLayout.CENTER, rightPanel);
		
		outputTxt.setEditable(false);
		setTitle("Hello World");
		setVisible(true);
		setSize(400, 400);

		// register the button
		countBtn.addActionListener(new CountButtonListener());
		reserveBtn.addActionListener(new ReserveButtonListener());
		removeBtn.addActionListener(new RemoveButtonListener());

	}

	public static void main(String[] args) {
		new WindowSimple();
	}

	public class CountButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			outputTxt.setText(Integer.toString(inputTxt.getText().length()));
		}
	}

	public class ReserveButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			StringBuilder s = new StringBuilder();
			s.append(inputTxt.getText().toString());
			s.reverse();
			outputTxt.setText(s.toString());

		}
	}

	public class RemoveButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			outputTxt.setText("");
			inputTxt.setText("");
		}
	}

}
