import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class Parser {
    private BufferedReader txt;
    private ArrayList<String> list;
    private Integer currentLine = 0;
    public Parser(String fileName) {
        try {
            this.txt = new BufferedReader(new FileReader("src/" + fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        this.list = new ArrayList<>();

        txt.lines().toList().forEach(line -> this.list.add(line.replace(" ","")));
        deleteLines(this.list);
    }
    public Boolean hasMoreLines(){
        return currentLine < this.list.size();
    }

    public void advance(){
        if(hasMoreLines()) {
            currentLine++;
        }
    }

    private void deleteLines(ArrayList<String> lines){
        lines.removeIf(line -> (line.isEmpty() || line.contains("//")));
    }

    public void deleteItem(){
        System.out.println(this.list.remove((int) currentLine));
    }
    public String instructionType(){
        if(this.list.get(currentLine).startsWith("@")){
            return "A_INSTRUCTION";
        }else if(this.list.get(currentLine).startsWith("(")){
            return "L_INSTRUCTION";
        }else{
            return "C_INSTRUCTION";
        }
    }

    public String symbol(){
        String aux = "";
        String line = this.list.get(currentLine);
        int cont = 1;
        if(instructionType().equals("A_INSTRUCTION")){
            while(cont <= (line.length()-1)){
                aux = aux + line.charAt(cont);
                cont++;
            }
        }else if(instructionType().equals("L_INSTRUCTION")){
            while(cont <= (line.length()-1) && line.charAt(cont) != ')'){
                aux = aux + line.charAt(cont);
                cont++;
            }
        }
        return aux;
    }

    public String dest(ArrayList<String[]> dests) {
        if (instructionType().equals("C_INSTRUCTION")) {
            return (String) new Code(list.get(currentLine)).destFuntion(dests);
        }else{
            return null;
        }
    }

    public String comp(ArrayList<String[]> comps) {
        if (instructionType().equals("C_INSTRUCTION")) {
            return (String) new Code(list.get(currentLine)).destFuntion(comps);
        }else{
            return null;
        }
    }

    public String jump(ArrayList<String[]> jumps) {
        if (instructionType().equals("C_INSTRUCTION")) {
            return (String) new Code(list.get(currentLine)).destFuntion(jumps);
        }else{
            return null;
        }
    }

    public BufferedReader getTxt() {
        return txt;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public Integer getCurrentLine() {
        return currentLine;
    }

    public void setCurrentLine(int i) {
        this.currentLine = i;
    }
}
