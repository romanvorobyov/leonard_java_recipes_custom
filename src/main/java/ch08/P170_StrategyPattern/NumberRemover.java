package ch08.P170_StrategyPattern;

public class NumberRemover implements RemoveStrategy {

    @Override
    public String execute(String s) {
        return s.replaceAll("\\d","");
    }         
}
