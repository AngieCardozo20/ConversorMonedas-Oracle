package com.ConversorMonedas.co;


public class currencyConverterOperations{
    
    private int result;
    private double value;
    
    public void setValue(String Value) {
        this.value = Double.parseDouble(Value);
    }

    public int convertCurrency(int selected) {
            
        result = 0;
        
        switch (selected) {
            case 0:
                result = (int) ((double) value * 0.00024);
                break;
            case 1:
                result = (int) ((double) value * 0.00022);
                break;
            case 2:
                result = (int) ((double) value * 0.00019);
                break;
            case 3:
                result = (int) ((double) value * 0.034);
                break;
            case 4:
                result = (int) ((double) value * 0.31);
                break;
            case 5: 
                result = (int) ((double) value * 4160);
                break;
            case 6:
                result = (int) ((double) value * 4576);
                break;
            case 7: 
                result = (int) ((double) value * 5.349);
                break;
            case 8:
                result = (int) ((double) value * 29.43);
                break;
            case 9: 
                result = (int) ((double) value * 3.20);
                break;
        }
        
        return result;
        
        
    }

	

	
    
}