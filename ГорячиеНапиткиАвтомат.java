
import java.util.List;

public class ГорячиеНапиткиАвтомат implements МашинаАвтомат{
    private final List<ГорячиеНапитки> hotDrinksList;

    public ГорячиеНапиткиАвтомат(List<ГорячиеНапитки> hotDrinksList){
        this.hotDrinksList = hotDrinksList;

    }

    @Override
    public ГорячиеНапитки getProduct(String name){
        for (ГорячиеНапитки product : hotDrinksList){
            if (product.getName().equals(name)){
                product.getVolume();
                return product;
            }
        }
        return null;
    }


     public ТемператураГорячихНапит getProduct(String name, int volume, int temp){
        for(ГорячиеНапитки product : hotDrinksList){
            if (product instanceof ТемператураГорячихНапит){
                if (product.getName().equals(name)&& ((ТемператураГорячихНапит) product).getVolume()==volume && ((ТемператураГорячихНапит) product).getTemp() == temp){
                    return (ТемператураГорячихНапит) product;
                }
            }
        }
        return null;
    }


}