package movecomu;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class QuoteEx extends JLabel {
   

    public QuoteEx() {
    
    	setFont(new Font("Nanum Pen", Font.BOLD | Font.ITALIC, 45));

        setVisible(true);

        startUpdatingThread();
    }

    private void startUpdatingThread() {
        Thread thread = new Thread(() -> {
            while (true) {
            	
                String quote = QuoteApiExample.getQuote();
                String translatedQuote = Papago.getTranslatedString(quote);
                
                
                
            
                if(translatedQuote == null) {
                	settext("명언 : " +  quote);
                }else {
                	settext("명언 : " +  translatedQuote);
				}
                
                
                
                try {
                    Thread.sleep(5000); // 5초 대기
                } catch (InterruptedException e) {
                	
        
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
    
    private void settext(String a) {
    
    	  setText( a);
    } 
   

}
