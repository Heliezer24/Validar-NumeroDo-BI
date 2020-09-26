/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HELIEZERTOMAS MARIA
 */
public class ValidarBI {
    private String expressaoRegular ="\\d{9}[A-Z]{2}\\d{3}";
    private Pattern expressaoRegularComp;
    private Matcher Compara;
    public boolean Validar(String palavra){
        expressaoRegularComp= Pattern.compile(expressaoRegular);
        Compara = expressaoRegularComp.matcher(palavra);
        
      
        return Compara.find();
            
     
    }

    public String getCompara() {
        return Compara.group();
    }
    
    
         
}

