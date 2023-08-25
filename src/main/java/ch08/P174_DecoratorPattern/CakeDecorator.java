package ch08.P174_DecoratorPattern;

public class CakeDecorator implements Cake {

    private final Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }        
    
    @Override
    public String decorate() {
        return cake.decorate();
    }
    
}
