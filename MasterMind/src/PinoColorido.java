import javax.swing.JButton;

public class PinoColorido extends JButton {//Pedro
    public COLOR cor;
    public PinoColorido(COLOR c){
        super(" ");
        setCor(c);
    }
    public PinoColorido(int index){
        super(" ");
        setCor(index);
    }


    private void setCor(){
        this.setBackground(cor.getCor());
    }

    public void setCor(COLOR c){
        cor = c;
        setCor();
    }

    public void setCor(int index){
        COLOR[] array = COLOR.values();
        cor = (array[index]);
        setCor();
    }

    public void toggle(){
        this.setEnabled(!this.isEnabled());
    }
    

}
