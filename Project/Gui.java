import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Gui {

	private JFrame frame;

	public Gui() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Cript 2.1");
		frame.setSize(1100, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextArea area_L = new JTextArea();
		area_L.setBounds(20, 70, 480, 630);
		JTextArea area_R = new JTextArea();
		area_R.setBounds(590, 70, 480, 630);

		JScrollPane scroll_pane_L = new JScrollPane(area_L);
		scroll_pane_L.setBounds(20, 70, 480, 630);
		JScrollPane scroll_pane_R = new JScrollPane(area_R);
		scroll_pane_R.setBounds(590, 70, 480, 630);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu fileMenu = new JMenu("File");

		JMenuItem openItem = new JMenuItem("Open");
		fileMenu.add(openItem);

		JMenuItem saveItem = new JMenuItem("Save");
		fileMenu.add(saveItem);

		JMenu saveUsItem = new JMenu("Save us");
		fileMenu.add(saveUsItem);

		JMenuItem txtFileItem = new JMenuItem("Text file");
		saveUsItem.add(txtFileItem);

		JMenuItem imgFileItem = new JMenuItem("Image file");
		saveUsItem.add(imgFileItem);

		fileMenu.addSeparator();

		JMenuItem exitItem = new JMenuItem("Exit");
		fileMenu.add(exitItem);

		JMenu fileEdit = new JMenu("Edit");

		JMenuItem cleanItem = new JMenuItem("Clean");
		fileEdit.add(cleanItem);

		JMenu fileSetting = new JMenu("Setting");

		JMenuItem settingItem = new JMenuItem("Setting");
		fileSetting.add(settingItem);

		JMenuItem settingCriptItem = new JMenuItem("Setting Cript");
		fileSetting.add(settingCriptItem);

		JMenu helpMenu = new JMenu("Help");
		JMenuItem aboutItem = new JMenuItem("About");
		helpMenu.add(aboutItem);

		aboutItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,
						"<html><h3 align=\"center\" style=\"color:red;\" style=\"font-family:Calibri;\">Yet unnamed program</h3><p align=\"center\" >Created by <b>LEO_smb</b> (Vitaliy Dzen)</p><p align=\"left\" ><i>version 2.1</i> </p></html>",
						"Information", JOptionPane.INFORMATION_MESSAGE);

			}
		});

		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		cleanItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area_R.setText("");
				area_L.setText("");
			}
		});

		menuBar.add(fileMenu);
		menuBar.add(fileEdit);
		menuBar.add(fileSetting);
		menuBar.add(helpMenu);

		frame.setJMenuBar(menuBar);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Cript", null, panel_1, null);

		Icon icon_encrypt = new ImageIcon("src/foto/encrypt.png");
		Icon icon_decrypt = new ImageIcon("src/foto/decrypt.png");
		Icon icon_red_arrow_R = new ImageIcon("src/foto/red_arrow_R.png");
		Icon icon_red_arrow_L = new ImageIcon("src/foto/red_arrow_L.png");
		Icon icon_clean = new ImageIcon("src/foto/clean.png");
		Icon icon_open = new ImageIcon("src/foto/open.png");
		Icon icon_save = new ImageIcon("src/foto/save.png");
		Icon icon_copy = new ImageIcon("src/foto/copy.png");
		Icon icon_paste = new ImageIcon("src/foto/paste.png");
		Icon icon_save_img = new ImageIcon("src/foto/save_img.png");
		JButton button_encrypt = new JButton(icon_encrypt);
		JButton button_decrypt = new JButton(icon_decrypt);
		JButton button_red_arrow_R = new JButton(icon_red_arrow_R);
		JButton button_red_arrow_L = new JButton(icon_red_arrow_L);
		JButton button_clean = new JButton(icon_clean);
		JButton button_open = new JButton(icon_open);
		JButton button_save = new JButton(icon_save);
		JButton button_save_file = new JButton(icon_save_img);
		JButton copy_area_L = new JButton(icon_copy);
		JButton copy_area_R = new JButton(icon_copy);
		JButton paste_area_L = new JButton(icon_paste);
		JCheckBox use_cript_setting = new JCheckBox("Use cript setting");
		button_encrypt.setBounds(510, 160, 65, 87);
		button_decrypt.setBounds(510, 270, 65, 87);
		button_red_arrow_L.setBounds(510, 410, 70, 35);
		button_red_arrow_R.setBounds(510, 480, 70, 35);
		button_clean.setBounds(510, 610, 70, 71);
		button_open.setBounds(25, 7, 56, 55);
		button_save.setBounds(1010, 7, 55, 55);
		button_save_file.setBounds(940, 7, 55, 55);
		use_cript_setting.setBounds(475, 30, 150, 15);
		copy_area_L.setBounds(230, 4, 57, 62);
		copy_area_R.setBounds(750, 4, 57, 62);
		paste_area_L.setBounds(310, 4, 57, 62);

		button_red_arrow_L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area_L.setText(area_R.getText());
				area_R.setText("");
			}
		});

		button_red_arrow_R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area_R.setText(area_L.getText());
				area_L.setText("");
			}
		});

		button_clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area_R.setText("");
				area_L.setText("");
			}
		});

		button_open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area_L.setText(open_file());
			}
		});

		button_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save_file(area_R.getText());
			}
		});
		
		button_save_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReadFiles.saveImg(area_R.getText());
			}
		});

		copy_area_L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Clipboard clipboard = toolkit.getSystemClipboard();
				StringSelection strSel = new StringSelection(area_L.getText());
				clipboard.setContents(strSel, null);
			}
		});

		copy_area_R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Clipboard clipboard = toolkit.getSystemClipboard();
				StringSelection strSel = new StringSelection(area_R.getText());
				clipboard.setContents(strSel, null);
			}
		});

		paste_area_L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					area_L.setText(
							(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor));
				} catch (HeadlessException | UnsupportedFlavorException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		panel_1.setSize(1100, 770);
		panel_1.setLayout(null);
		// panel_1.setVisible(true);
		panel_1.add(button_encrypt);
		panel_1.add(button_decrypt);
		panel_1.add(button_red_arrow_R);
		panel_1.add(button_red_arrow_L);
		panel_1.add(button_clean);
		panel_1.add(button_open);
		panel_1.add(button_save);
		panel_1.add(button_save_file);
		panel_1.add(use_cript_setting);
		panel_1.add(copy_area_L);
		panel_1.add(copy_area_R);
		panel_1.add(scroll_pane_L);
		panel_1.add(scroll_pane_R);
		panel_1.add(paste_area_L);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Cript Setting", null, panel_2, null);

		JLabel title_RSA_label = new JLabel("RSA", SwingConstants.CENTER);
		JButton generate_RSA_key_button = new JButton("Generate RSA key");
		JButton select_RSA_Public_key_button = new JButton("Select RSA Public key");
		JButton select_RSA_Private_key_button = new JButton("Select RSA Private key");
		JButton save_RSA_Public_key_button = new JButton("Save RSA Public key");
		JButton save_RSA_Private_key_button = new JButton("Save RSA Private key");
		ButtonGroup key_RSA_group_button = new ButtonGroup();
		JRadioButton key_RSA_RadioButton_generate = new JRadioButton("Generate RSA keys", false);
		key_RSA_group_button.add(key_RSA_RadioButton_generate);
		JRadioButton key_RSA_RadioButton_select = new JRadioButton("Select RSA keys", false);
		key_RSA_group_button.add(key_RSA_RadioButton_select);
		JLabel info_of_RSA_Public_key_label = new JLabel("Public key", SwingConstants.CENTER);
		JLabel info_of_RSA_Private_key_label = new JLabel("Private key", SwingConstants.CENTER);
		JTextArea select_RSA_Public_key_area = new JTextArea();
		JTextArea select_RSA_Private_key_area = new JTextArea();
		JScrollPane scroll_pane_RSA_Public_key_area = new JScrollPane(select_RSA_Public_key_area);
		JScrollPane scroll_pane_RSA_Private_key_area = new JScrollPane(select_RSA_Private_key_area);
		JCheckBox use_RSA = new JCheckBox("Use RSA");

		JTextArea select_AES_key_area = new JTextArea();
		JTextArea finished_AES_key_area = new JTextArea();
		JButton generate_AES_key_button = new JButton("Generate AES key");
		JButton select_AES_key_button = new JButton("Select AES key");
		JButton convert_select_AES_key_button = new JButton("Convert to AES key");
		JButton save_AES_key_button = new JButton("Save AES key");
		ButtonGroup key_AES_group_button = new ButtonGroup();
		JRadioButton key_AES_button_generate = new JRadioButton("Generate AES key", false);
		key_AES_group_button.add(key_AES_button_generate);
		JRadioButton key_AES_button_select = new JRadioButton("Select AES key", false);
		key_AES_group_button.add(key_AES_button_select);
		JRadioButton key_AES_button_fill_in = new JRadioButton("Fill in key", false);
		key_AES_group_button.add(key_AES_button_fill_in);
		JCheckBox use_AES = new JCheckBox("Use AES");
		JLabel info_of_AES_key_label = new JLabel("", SwingConstants.CENTER);
		JLabel title_AES_label = new JLabel("AES (Rijndael)", SwingConstants.CENTER);
		JLabel select_AES_key_label = new JLabel("Fill in string key", SwingConstants.CENTER);
		JSlider slider_AES = new JSlider(JSlider.HORIZONTAL, 10, 30, 10);

		JTextArea generate_key_area = new JTextArea();
		JButton generate_key_button = new JButton("Generate keys");
		JButton select_key_button = new JButton("Select keys");
		JButton save_key_button = new JButton("Save keys");
		ButtonGroup key_group_button = new ButtonGroup();
		JRadioButton key_button_generate = new JRadioButton("Generate keys", false);
		key_group_button.add(key_button_generate);
		JRadioButton key_button_select = new JRadioButton("Select keys", false);
		key_group_button.add(key_button_select);
		JCheckBox use_keys = new JCheckBox("Use this keys");
		JScrollPane scroll_pane_generate_key_area = new JScrollPane(generate_key_area);
		JLabel select_key_label = new JLabel("", SwingConstants.CENTER);
		Dictionary<Integer, Component> labelTable = new Hashtable<Integer, Component>();
		labelTable.put(10, new JLabel("128"));
		labelTable.put(20, new JLabel("192"));
		labelTable.put(30, new JLabel("256"));

		title_RSA_label.setBounds(800, 10, 120, 30);
		title_RSA_label.setFont(new java.awt.Font("Arial", Font.ROMAN_BASELINE, 20));
		title_RSA_label.setForeground(Color.RED);
		generate_RSA_key_button.setBounds(700, 100, 170, 30);
		generate_RSA_key_button.setEnabled(false);
		select_RSA_Public_key_button.setBounds(880, 85, 190, 30);
		select_RSA_Public_key_button.setEnabled(false);
		select_RSA_Private_key_button.setBounds(880, 125, 200, 30);
		select_RSA_Private_key_button.setEnabled(false);
		save_RSA_Public_key_button.setBounds(700, 335, 180, 30);
		save_RSA_Public_key_button.setEnabled(false);
		save_RSA_Private_key_button.setBounds(890, 335, 190, 30);
		save_RSA_Private_key_button.setEnabled(false);
		key_RSA_RadioButton_generate.setBounds(800, 40, 200, 15);
		key_RSA_RadioButton_select.setBounds(800, 60, 200, 15);
		info_of_RSA_Public_key_label.setBounds(750, 165, 250, 25);
		info_of_RSA_Public_key_label.setFont(new java.awt.Font("Arial", Font.ITALIC, 16));
		info_of_RSA_Public_key_label.setOpaque(true);
		info_of_RSA_Public_key_label.setForeground(Color.BLUE);
		info_of_RSA_Public_key_label.setBackground(Color.WHITE);
		info_of_RSA_Private_key_label.setBounds(750, 250, 250, 25);
		info_of_RSA_Private_key_label.setFont(new java.awt.Font("Arial", Font.ITALIC, 16));
		info_of_RSA_Private_key_label.setOpaque(true);
		info_of_RSA_Private_key_label.setForeground(Color.BLUE);
		info_of_RSA_Private_key_label.setBackground(Color.WHITE);
		select_RSA_Public_key_area.setBounds(750, 200, 250, 40);
		select_RSA_Public_key_area.setEditable(false);
		select_RSA_Private_key_area.setBounds(750, 285, 250, 40);
		select_RSA_Private_key_area.setEditable(false);
		scroll_pane_RSA_Public_key_area.setBounds(750, 200, 250, 40);
		scroll_pane_RSA_Private_key_area.setBounds(750, 285, 250, 40);
		use_RSA.setBounds(830, 370, 170, 30);
		use_RSA.setEnabled(false);

		slider_AES.setLabelTable(labelTable);
		slider_AES.setPaintLabels(true);
		slider_AES.setMajorTickSpacing(10);
		slider_AES.setPaintTicks(true);
		slider_AES.setSnapToTicks(true);
		slider_AES.setBounds(400, 100, 150, 50);
		generate_AES_key_button.setBounds(330, 150, 170, 30);
		generate_AES_key_button.setEnabled(false);
		select_AES_key_button.setBounds(510, 150, 140, 30);
		select_AES_key_button.setEnabled(false);
		save_AES_key_button.setBounds(440, 330, 140, 30);
		save_AES_key_button.setEnabled(false);
		key_AES_button_generate.setBounds(400, 40, 200, 15);
		key_AES_button_select.setBounds(400, 60, 200, 15);
		key_AES_button_fill_in.setBounds(400, 80, 200, 15);
		convert_select_AES_key_button.setBounds(420, 265, 170, 30);
		convert_select_AES_key_button.setEnabled(false);
		select_AES_key_area.setBounds(320, 240, 360, 20);
		select_AES_key_area.setToolTipText("Fill in key"); // підказки
		select_AES_key_area.setDocument(new JTextFieldLimit(key_AES_size(slider_AES.getValue()) / 8));
		select_AES_key_area.setEditable(false);
		finished_AES_key_area.setBounds(315, 300, 370, 20);
		finished_AES_key_area.setEditable(false);
		select_AES_key_label.setBounds(430, 215, 120, 30);
		info_of_AES_key_label.setBounds(340, 190, 300, 25);
		info_of_AES_key_label.setFont(new java.awt.Font("Arial", Font.ITALIC, 16));
		info_of_AES_key_label.setOpaque(true);
		info_of_AES_key_label.setForeground(Color.BLUE);
		info_of_AES_key_label.setBackground(Color.WHITE);
		title_AES_label.setBounds(400, 10, 150, 30);
		title_AES_label.setFont(new java.awt.Font("Arial", Font.ROMAN_BASELINE, 20));
		title_AES_label.setForeground(Color.RED);
		use_AES.setBounds(440, 360, 170, 50);
		use_AES.setEnabled(false);

		generate_key_button.setBounds(20, 70, 140, 30);
		generate_key_button.setEnabled(false);
		select_key_button.setBounds(170, 70, 120, 30);
		select_key_button.setEnabled(false);
		save_key_button.setBounds(150, 300, 110, 30);
		save_key_button.setEnabled(false);
		key_button_generate.setBounds(30, 10, 200, 20);
		key_button_select.setBounds(30, 30, 200, 20);
		generate_key_area.setBounds(30, 160, 100, 300); // !!!
		generate_key_area.setEditable(false);
		scroll_pane_generate_key_area.setBounds(30, 110, 100, 300);
		select_key_label.setBounds(155, 110, 150, 30);
		select_key_label.setFont(new java.awt.Font("Arial", Font.ITALIC, 16));
		select_key_label.setOpaque(true);
		select_key_label.setForeground(Color.BLUE);
		select_key_label.setBackground(Color.WHITE);
		use_keys.setBounds(140, 360, 170, 50);
		use_keys.setEnabled(false);

		generate_RSA_key_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cript.create_keys_RSA(true, false, false, "", "");
				select_RSA_Public_key_area.setText(Cript.getPublicKey_RSA_toString());
				select_RSA_Private_key_area.setText(Cript.getPrivateKey_RSA_toString());
				use_RSA.setEnabled(true);
				save_RSA_Public_key_button.setEnabled(true);
				save_RSA_Private_key_button.setEnabled(true);
				info_of_RSA_Public_key_label.setText("Public key generated");
				info_of_RSA_Public_key_label.setForeground(Color.GREEN);
				info_of_RSA_Private_key_label.setText("Private key generated");
				info_of_RSA_Private_key_label.setForeground(Color.GREEN);
			}
		});

		select_RSA_Public_key_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder inputData = new StringBuilder(open_file());
				if (inputData.length() == 392) {
					Cript.create_keys_RSA(false, true, false, inputData.toString(), "");
					select_RSA_Public_key_area.setText(Cript.getPublicKey_RSA_toString());
					save_RSA_Public_key_button.setEnabled(true);
					use_RSA.setEnabled(true);
					info_of_RSA_Public_key_label.setText("Public key added");
					info_of_RSA_Public_key_label.setForeground(Color.GREEN);
				} else {
					info_of_RSA_Public_key_label.setText("Error. Wrong key");
					info_of_RSA_Public_key_label.setForeground(Color.RED);
					select_RSA_Public_key_area.setText("");
					save_RSA_Public_key_button.setEnabled(false);
				}
			}
		});

		select_RSA_Private_key_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder inputData = new StringBuilder(open_file());
				if (inputData.length() == 1624) {
					Cript.create_keys_RSA(false, false, true, "", inputData.toString());
					select_RSA_Private_key_area.setText(Cript.getPrivateKey_RSA_toString());
					save_RSA_Private_key_button.setEnabled(true);
					use_RSA.setEnabled(true);
					info_of_RSA_Private_key_label.setText("Public key added");
					info_of_RSA_Private_key_label.setForeground(Color.GREEN);
				} else {
					info_of_RSA_Private_key_label.setText("Error. Wrong key");
					info_of_RSA_Private_key_label.setForeground(Color.RED);
					select_RSA_Private_key_area.setText("");
					save_RSA_Private_key_button.setEnabled(false);
				}
			}
		});

		key_RSA_RadioButton_generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generate_RSA_key_button.setEnabled(true);
				select_RSA_Public_key_button.setEnabled(false);
				select_RSA_Private_key_button.setEnabled(false);
				info_of_RSA_Public_key_label.setText("Public key");
				info_of_RSA_Public_key_label.setForeground(Color.BLUE);
				info_of_RSA_Private_key_label.setText("Private key");
				info_of_RSA_Private_key_label.setForeground(Color.BLUE);
				select_RSA_Public_key_area.setText("");
				select_RSA_Private_key_area.setText("");
				use_RSA.setEnabled(false);
				save_RSA_Public_key_button.setEnabled(false);
				save_RSA_Private_key_button.setEnabled(false);
			}
		});

		key_RSA_RadioButton_select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generate_RSA_key_button.setEnabled(false);
				select_RSA_Public_key_button.setEnabled(true);
				select_RSA_Private_key_button.setEnabled(true);
				info_of_RSA_Public_key_label.setText("Waiting for the public key...");
				info_of_RSA_Private_key_label.setText("Waiting for the private key...");
				info_of_RSA_Public_key_label.setForeground(Color.BLUE);
				info_of_RSA_Private_key_label.setForeground(Color.BLUE);
				select_RSA_Public_key_area.setText("");
				select_RSA_Private_key_area.setText("");
				use_RSA.setEnabled(false);
				save_RSA_Public_key_button.setEnabled(false);
				save_RSA_Private_key_button.setEnabled(false);
			}
		});

		save_RSA_Public_key_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save_file(Cript.getPublicKey_RSA_toString());
			}
		});

		save_RSA_Private_key_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save_file(Cript.getPrivateKey_RSA_toString());
			}
		});

		generate_AES_key_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Cript.create_key_AES(true, key_AES_size(slider_AES.getValue()), "");
					finished_AES_key_area.setText(Cript.getSecretKeySpec_AES_toString());
					System.out.println(Cript.getSecretKeySpec_AES_toString().length());
					info_of_AES_key_label.setForeground(Color.GREEN);
					info_of_AES_key_label.setText("Key generated");
					save_AES_key_button.setEnabled(true);
					use_AES.setEnabled(true);
				} catch (NoSuchAlgorithmException e1) {
					e1.printStackTrace();
				}
			}
		});

		convert_select_AES_key_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (select_AES_key_area.getText().length() == (key_AES_size(slider_AES.getValue())) / 8) {
					try {
						Cript.create_key_AES(false, key_AES_size(slider_AES.getValue()), select_AES_key_area.getText());
						finished_AES_key_area.setText(Cript.getSecretKeySpec_AES_toString());
						// System.out.println(Cript.getSecretKeySpec_AES_toString().length());
						info_of_AES_key_label.setForeground(Color.GREEN);
						info_of_AES_key_label.setText("Key converted");
						save_AES_key_button.setEnabled(true);
						use_AES.setEnabled(true);
					} catch (NoSuchAlgorithmException e1) {
						e1.printStackTrace();
					}
				} else {
					info_of_AES_key_label.setForeground(Color.RED);
					info_of_AES_key_label
							.setText("Text length must be " + key_AES_size(slider_AES.getValue()) / 8 + " characters");
					finished_AES_key_area.setText("");
					save_AES_key_button.setEnabled(false);
					use_AES.setEnabled(false);
				}
			}
		});

		select_AES_key_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder(open_file());
				if (sb.length() == 24 || sb.length() == 32 || sb.length() == 44) {
					finished_AES_key_area.setText(sb.toString());
					byte[] decodedKey = Base64.getDecoder().decode(sb.toString());
					SecretKeySpec key = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");
					Cript.setSecretKeySpec_AES(key);
					info_of_AES_key_label.setForeground(Color.GREEN);
					info_of_AES_key_label.setText("Key added");
					save_AES_key_button.setEnabled(true);
					use_AES.setEnabled(true);
				} else {
					info_of_AES_key_label.setForeground(Color.RED);
					info_of_AES_key_label.setText("Error. Wrong Keys");
					save_AES_key_button.setEnabled(false);
					use_AES.setEnabled(false);
				}
			}
		});

		key_AES_button_fill_in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convert_select_AES_key_button.setEnabled(true);
				select_AES_key_area.setEditable(true);
				info_of_AES_key_label.setForeground(Color.BLUE);
				info_of_AES_key_label
						.setText("Text length must be " + key_AES_size(slider_AES.getValue()) / 8 + " characters");
				generate_AES_key_button.setEnabled(false);
				select_AES_key_button.setEnabled(false);
				select_AES_key_area.setText("");
				finished_AES_key_area.setText("");
			}
		});

		key_AES_button_generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convert_select_AES_key_button.setEnabled(false);
				select_AES_key_area.setEditable(false);
				info_of_AES_key_label.setText("");
				generate_AES_key_button.setEnabled(true);
				select_AES_key_button.setEnabled(false);
				select_AES_key_area.setText("");
				finished_AES_key_area.setText("");
			}
		});

		key_AES_button_select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convert_select_AES_key_button.setEnabled(false);
				select_AES_key_area.setEditable(false);
				select_AES_key_area.setText("");
				generate_AES_key_button.setEnabled(false);
				select_AES_key_button.setEnabled(true);
				info_of_AES_key_label.setForeground(Color.BLUE);
				info_of_AES_key_label.setText("Waiting...");
				finished_AES_key_area.setText("");
			}
		});

		save_AES_key_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save_file(Base64.getEncoder().encodeToString(Cript.getSecretKeySpec_AES().getEncoded()));
			}
		});

		slider_AES.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent ce) {
				if (key_AES_button_fill_in.isSelected()) {
					info_of_AES_key_label.setForeground(Color.BLUE);
					info_of_AES_key_label
							.setText("Text length must be " + key_AES_size(slider_AES.getValue()) / 8 + " characters");
					select_AES_key_area.setDocument(new JTextFieldLimit(key_AES_size(slider_AES.getValue()) / 8));
				}
			}
		});

		key_button_generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				use_keys.setEnabled(false);
				use_keys.setSelected(false);
				generate_key_button.setEnabled(true);
				select_key_button.setEnabled(false);
				save_key_button.setEnabled(false);
				select_key_label.setText("");
				generate_key_area.setText("");
			}
		});

		key_button_select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				use_keys.setEnabled(false);
				use_keys.setSelected(false);
				select_key_button.setEnabled(true);
				generate_key_button.setEnabled(false);
				save_key_button.setEnabled(false);
				select_key_label.setForeground(Color.BLUE);
				select_key_label.setText("Waiting...");
				generate_key_area.setText("");
			}
		});

		select_key_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder(open_file());
				if (Cript.check_selected_key(sb)) {
					generate_key_area.setText(sb.toString());
					select_key_label.setForeground(Color.GREEN);
					select_key_label.setText("Keys added");
					use_keys.setEnabled(true);
					save_key_button.setEnabled(true);
				} else {
					use_keys.setEnabled(false);
					generate_key_area.setText("");
					select_key_label.setForeground(Color.RED);
					select_key_label.setText("Error. Wrong Keys");
				}
			}
		});

		generate_key_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generate_key_area.setText(Cript.get_entered_generated_key());
				StringBuilder sb = new StringBuilder(generate_key_area.getText());
				if (generate_key_area.getText().length() > 3) {
					use_keys.setEnabled(true);
					save_key_button.setEnabled(true);
				}
			}
		});

		save_key_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save_file(Cript.get_entered_generated_key());
			}
		});

		// select_AES_key_area.addMouseListener(new MouseAdapter() {
		// public void mouseClicked(MouseEvent e) {
		// select_AES_key_area.setDocument(new
		// JTextFieldLimit(key_AES_size(slider_AES.getValue())/8));
		// }
		// });

		JLabel ERROR = new JLabel("<html>При шифруванні RSA великої кількості даних - <br>"
				+ "вибивається помилка. Ще з цим не розібрався<br></html>", SwingConstants.CENTER);
		ERROR.setBounds(650, 500, 400, 60);
		panel_2.add(ERROR);

		panel_2.add(scroll_pane_generate_key_area);
		panel_2.add(generate_key_button);
		panel_2.add(use_keys);
		panel_2.add(select_key_button);
		panel_2.add(save_key_button);
		panel_2.add(select_key_label);
		panel_2.add(key_button_generate);
		panel_2.add(key_button_select);

		panel_2.add(info_of_AES_key_label);
		panel_2.add(use_AES);
		panel_2.add(select_AES_key_area);
		panel_2.add(title_AES_label);
		panel_2.add(generate_AES_key_button);
		panel_2.add(select_AES_key_button);
		panel_2.add(select_AES_key_label);
		panel_2.add(key_AES_button_generate);
		panel_2.add(key_AES_button_select);
		panel_2.add(key_AES_button_fill_in);
		panel_2.add(slider_AES);
		panel_2.add(save_AES_key_button);
		panel_2.add(finished_AES_key_area);
		panel_2.add(convert_select_AES_key_button);
		panel_2.add(title_RSA_label);

		panel_2.add(title_RSA_label);
		panel_2.add(generate_RSA_key_button);
		panel_2.add(select_RSA_Public_key_button);
		panel_2.add(select_RSA_Private_key_button);
		panel_2.add(save_RSA_Public_key_button);
		panel_2.add(save_RSA_Private_key_button);
		panel_2.add(key_RSA_RadioButton_generate);
		panel_2.add(key_RSA_RadioButton_select);
		panel_2.add(info_of_RSA_Public_key_label);
		panel_2.add(info_of_RSA_Private_key_label);
		panel_2.add(scroll_pane_RSA_Public_key_area);
		panel_2.add(scroll_pane_RSA_Private_key_area);
		panel_2.add(use_RSA);

		panel_2.setSize(1100, 770);
		panel_2.setLayout(null);
		// panel_2.setVisible(true);

		frame.setVisible(true);

		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area_L.setText(open_file());
			}
		});

		saveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save_file(area_R.getText());
			}
		});

		button_encrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!use_cript_setting.isSelected()) {
					area_R.setText(Cript.encrypt(area_L.getText(), Key.getKey()));
				} else {
					try {
						area_R.setText(Cript.encrypt_whis_setting(area_L.getText(), use_keys.isSelected(),
								use_AES.isSelected(), use_RSA.isSelected(), generate_key_area.getText()));
					} catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException
							| IllegalBlockSizeException | BadPaddingException e1) {
						e1.printStackTrace();
					}
				}
			}
		});

		button_decrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!use_cript_setting.isSelected()) {
					area_R.setText(Cript.decrypt(area_L.getText(), Key.getKey()));
				} else {
					try {
						area_R.setText(Cript.decrypt_whis_setting(area_L.getText(), use_keys.isSelected(),
								use_AES.isSelected(), use_RSA.isSelected(), generate_key_area.getText()));
					} catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException
							| IllegalBlockSizeException | BadPaddingException e1) {
						e1.printStackTrace();
					}
				}
			}
		});

	}

	public static int key_AES_size(int key_size) {
		int output = 0;
		switch (key_size) {
		case 10:
			output = 128;
			break;
		case 20:
			output = 192;
			break;
		case 30:
			output = 256;
			break;
		}
		return output;
	}

	public static String open_file() /* throws Exception */ {
		JFileChooser fileChooser = new JFileChooser();
		FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
		fileChooser.setFileFilter(imageFilter);
		FileFilter txtFilter = new FileNameExtensionFilter("Text files", "txt");
		fileChooser.setFileFilter(txtFilter);
		StringBuilder string_builder = new StringBuilder();
		if (fileChooser.showOpenDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
			String format3 = fileChooser.getSelectedFile().toString().substring(
					fileChooser.getSelectedFile().toString().length() - 4,
					fileChooser.getSelectedFile().toString().length());
			String format4 = fileChooser.getSelectedFile().toString().substring(
					fileChooser.getSelectedFile().toString().length() - 5,
					fileChooser.getSelectedFile().toString().length());
			if (format3.equals(".jpg") || format3.equals(".png") || format3.equals(".gif") || format3.equals(".ico")
					|| format4.equals(".jpeg")) {
				try {
					string_builder.append(ReadFiles.readImg(fileChooser.getSelectedFile().toString()));
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				try (FileReader file_reader = new FileReader(fileChooser.getSelectedFile());) {
					Scanner scanner = new Scanner(file_reader);
					while (scanner.hasNext()) {
						string_builder.append(scanner.nextLine() + "\n");
					}
					string_builder.delete(string_builder.length() - 1, string_builder.length());
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return string_builder.toString();
	}

	private void save_file(String output_text) /* throws Exception */ {
		JFileChooser fileChooser = new JFileChooser();
		if (fileChooser.showSaveDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
			try {
				FileWriter file_writer = new FileWriter(fileChooser.getSelectedFile().getPath());
				file_writer.write(output_text);
				file_writer.flush();
				file_writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	/*
	 * private void open_byte_file(){ JFileChooser fileChooser = new JFileChooser();
	 * if (fileChooser.showOpenDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
	 * 
	 * 
	 * // byte bytearray[] = new byte[fileinputstream.available()];
	 * try(FileInputStream fileinputstream = new
	 * FileInputStream(fileChooser.getSelectedFile())) {
	 * fileinputstream.read(Cript.encripted_AES_arr); } catch (IOException e) {
	 * e.printStackTrace(); }
	 * 
	 * // Path path = Paths.get(fileChooser.getSelectedFile()); // byte[] data =
	 * null; // try { // data = Files.readAllBytes(path); // } catch (IOException
	 * ex) { // ex.printStackTrace(); // } } }
	 * 
	 * private void save_byte_file() { JFileChooser fileChooser = new
	 * JFileChooser(); if (fileChooser.showSaveDialog(fileChooser) ==
	 * JFileChooser.APPROVE_OPTION) { try(FileOutputStream fOutputStrm = new
	 * FileOutputStream(fileChooser.getSelectedFile())) {
	 * fOutputStrm.write(Cript.getEncripted_AES_arr()); } catch (IOException e) {
	 * e.printStackTrace(); } // File f = new File(fileName); // byte[] fileContent
	 * = msg.getByteSequenceContent(); // Path path =
	 * Paths.get(f.getAbsolutePath()); // try { // Files.write(path, fileContent);
	 * // } catch (IOException ex) { // ex.printStackTrace(); // }
	 * 
	 * 
	 * 
	 * } }
	 */

}