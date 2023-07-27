package com.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ConversorMonedas.co.currencyConverterOperations;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaOperaciones extends JFrame implements ActionListener {
	
	private JPanel panelPrincipal;
	private JTextField txtCampoNum1;
	private JComboBox cmbMoneda;
	JButton btnConvertir;
	
	
	
	
	/**
	 * Create the frame.
	 */
	public VentanaOperaciones() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciarComponentes();
		
		
		setTitle("CONVERSOR DE MONEDAS=]");
		setLocationRelativeTo(null);
		setResizable(false);
		
		
	}
		
	   @SuppressWarnings("unchecked")
	private void iniciarComponentes() {
		setBounds(100, 100, 415, 226);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
				
		JLabel lblTitulo = new JLabel("CONVERSOR DE MONEDAS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblTitulo.setBounds(10, 11, 379, 14);
		panelPrincipal.add(lblTitulo);
		
		txtCampoNum1 = new JTextField();
		txtCampoNum1.setHorizontalAlignment(SwingConstants.CENTER);
		txtCampoNum1.setBounds(100, 82, 188, 20);
		panelPrincipal.add(txtCampoNum1);
		txtCampoNum1.setColumns(10);
		
		JLabel lblTexto1 = new JLabel("Ingresa la cantidad de dinero que deseas convertir:");
		lblTexto1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblTexto1.setBounds(10, 50, 389, 20);
		panelPrincipal.add(lblTexto1);
		
		JLabel lblTexto2 = new JLabel("Elije la moneda a la que deseas convertir tu dinero:");
		lblTexto2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto2.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblTexto2.setBounds(10, 113, 379, 20);
		panelPrincipal.add(lblTexto2);
		
		cmbMoneda = new JComboBox();
		cmbMoneda.setModel(new DefaultComboBoxModel(new String[] {"Pesos COP a Dólares", "Pesos COP a Euros ", 
				"Pesos COP a Libras Esterlinas", "Pesos COP a Yen ", "Pesos COP a Won", "Dólares a Pesos COP", 
				"Euros a Pesos COP", "Libras Esterlinas a Pesos COP", "Yen a Pesos COP", "Won a Pesos COP"}));
		cmbMoneda.setBounds(20, 144, 188, 28);
		panelPrincipal.add(cmbMoneda);
		
		btnConvertir = new JButton("CONVERTIR");
		btnConvertir.setBounds(264, 144, 112, 23);
		btnConvertir.addActionListener(this);
		panelPrincipal.add(btnConvertir);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnConvertir==e.getSource()){
					
			currencyConverterOperations misOperaciones= new currencyConverterOperations();
			
			misOperaciones.setValue(txtCampoNum1.getText());
			
			int result = misOperaciones.convertCurrency(cmbMoneda.getSelectedIndex());
			
			JOptionPane.showMessageDialog(null, "El resultado es: " + result);

		}
		
		
	}
	
	
		
	
}
