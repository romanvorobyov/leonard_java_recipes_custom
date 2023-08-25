package ch08.P174_DecoratorPattern;

public class BaseCake implements Cake {

    @Override
    public String decorate() {
        return "Base cake ";
    }    
}
