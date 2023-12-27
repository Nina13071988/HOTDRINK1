
public class ГорячиеНапитки {

    public ГорячиеНапитки(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    private String name;// НАЗВАНИЕ

    private int volume;// ОБЪЕМ

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
    @Override
    public String toString(){
        return "Product{" + "name='" + name + '\'' + ", volume=" + volume +'}';
    }
}