import javax.swing.JButton;

public class PinoColorido extends JButton {
    public COLOR cor;
    public PinoColorido(COLOR c){
        super(" ");
        cor = c;
        setCor();
    }


    private void setCor(){
        this.setBackground(cor.getCor());
    }

    public void setCor(COLOR c){
        cor = c;
        setCor();
    }

    public void toggle(){
        this.setEnabled(!this.isEnabled());
    }
    

}
