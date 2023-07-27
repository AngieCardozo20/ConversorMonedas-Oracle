package com.ConversorMonedas.co;

import javax.swing.JOptionPane;

import com.gui.VentanaOperaciones;

public class Conversor {
	

	      public static void main(String[] args) {
	    	  
	    	  presentarVentana();
	    	  
	    	  String menu= (JOptionPane.showInputDialog(null, "Selecciona una opción de conversión", "Menú", 
	    				JOptionPane.PLAIN_MESSAGE,null,new Object[] { "Selecciona", "Conversor de Moneda"},
	    				"Selecciona")).toString();
	    	  

	    	  // CODIGO
	    	  
	    	  /*
	    	   * 
					COP - Dolar // 0
					COP - Euros // 1
					COP - Libras Esterlinas // 2
					COP - Yen // 3
					COP - WON // 4
					
					Dolar - COP // 5
					Euros - COP // 6
					Libras Esterlinas - COP // 7
					Yen - COP // 8
					Won - COP // 9
	    	   * **/
	    	  
	    	  String menu1="CONVERSOR DE MONEDAS\n";
	    	  menu1+="1- Pesos COP - Dolar\n";
	    	  menu1+="2- Pesos COP - Euros\n";
	    	  menu1+="3- Pesos COP - Libras Esterlinas\n";
	    	  menu1+="4- Pesos COP - Yen \n";
	    	  menu1+="5- Pesos COP - WON\n";
	    	  menu1+="6- Dolar - Pesos COP \n";
	    	  menu1+="7- Euros - Pesos COP \n";
	    	  menu1+="8- Libras Esterlinas - Pesos COP\n";
	    	  menu1+="9- Yen - Pesos COP\n";
	    	  menu1+="10- Won - Pesos COP\n";
	    	  
	    	
	    	  
	    	  
			String optionSelected = JOptionPane.showInputDialog(menu1);
			
			String value = JOptionPane.showInputDialog("Ingrese el valor que desea convertir");
			
			currencyConverterOperations currencyConverter = new currencyConverterOperations();
			currencyConverter.setValue(value);
		
			int result = currencyConverter.convertCurrency(Integer.parseInt(optionSelected));
			
			JOptionPane.showMessageDialog(null, "El valor convertido es:" + result);
		}

	      private static void presentarVentana() {
	    	  VentanaOperaciones miVentana= new VentanaOperaciones();
	    	  miVentana.setVisible(true);
			
		     
				
			}
		
		
  
    
    
    }
    
    
    	
   


	  
		
		
		
