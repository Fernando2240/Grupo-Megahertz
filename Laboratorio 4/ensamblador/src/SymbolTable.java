import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, Integer> map = new HashMap<>();;

    public SymbolTable(){

    }
    public void addEntry(String symbol, Integer address){
        this.map.put(symbol, address);
    }

    public Boolean contains(String symbol){
        return this.map.containsKey(symbol);
    }

    public Integer getAddress(String symbol){
        return this.map.get(symbol);
    }


}
