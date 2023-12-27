
public class ТемператураГорячихНапит extends ГорячиеНапитки {
    private int temp;

    public ТемператураГорячихНапит(String name, int volume) {
        super(name, volume);
        this.temp = temp;
    }
    public int getTemp(){
        return temp;
    }
    public void setTemp(int temp){
        this.temp = temp;
    }
    @Override
    public String toString(){
        return "ТемператураГорячихНапит{" + "Temp" + temp + ", name=" + getName() + '}';
    }
} 