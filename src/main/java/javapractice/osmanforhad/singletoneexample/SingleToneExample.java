package javapractice.osmanforhad.singletoneexample;

/**
 *
 * @author osman forhad
 */
public class SingleToneExample {

    public static void main(String[] args) {
        My x = My.continuaous();
    }
}

class My {
    
    //create object
    static My obj = new My();
    
    //create construtor
    private My(){
        
    }
    
    //method for continuaously reuse single tone class(My)
    public static My continuaous(){
        return obj;
    }
}
