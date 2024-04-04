import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HackAssembler {

    private Parser parser;
    private SymbolTable symbolTable;
    private String fileName;
    private Integer defaultValue = 16;
    private ArrayList<String> document;
    private Code code;
    public HackAssembler(String fileName) {
        this.fileName = fileName;
        this.symbolTable = new SymbolTable();
        this.symbolTable.addEntry("R0", 0);
        this.symbolTable.addEntry("R1", 1);
        this.symbolTable.addEntry("R2", 2);
        this.symbolTable.addEntry("R3", 3);
        this.symbolTable.addEntry("R4", 4);
        this.symbolTable.addEntry("R5", 5);
        this.symbolTable.addEntry("R6", 6);
        this.symbolTable.addEntry("R7", 7);
        this.symbolTable.addEntry("R8", 8);
        this.symbolTable.addEntry("R9", 9);
        this.symbolTable.addEntry("R10", 10);
        this.symbolTable.addEntry("R11", 11);
        this.symbolTable.addEntry("R12", 12);
        this.symbolTable.addEntry("R13", 13);
        this.symbolTable.addEntry("R14", 14);
        this.symbolTable.addEntry("R15", 15);
        this.symbolTable.addEntry("SCREEN", 16384);
        this.symbolTable.addEntry("KBD", 24576);
        this.symbolTable.addEntry("SP", 0);
        this.symbolTable.addEntry("LCL", 1);
        this.symbolTable.addEntry("ARG", 2);
        this.symbolTable.addEntry("THIS", 3);
        this.symbolTable.addEntry("THAT", 4);
        document = new ArrayList<>();
    }

    public void firstPass(){
        this.parser = new Parser(this.fileName);
        this.parser.setCurrentLine(0);
        while(parser.hasMoreLines()){
            if(parser.instructionType().equals("L_INSTRUCTION")){
                this.symbolTable.addEntry(this.parser.symbol(), this.parser.getCurrentLine());
                this.parser.deleteItem();
            }else{
                this.parser.advance();
            }
        }
    }

    public void secondPass(ArrayList<String[]> comps, ArrayList<String[]> dests, ArrayList<String[]> jumps){
        this.parser.setCurrentLine(0);
        while(parser.hasMoreLines()){
            if(parser.instructionType().equals("A_INSTRUCTION")){
                if(this.symbolTable.contains(this.parser.symbol())) {
                    this.document.add(Integer.toBinaryString(this.symbolTable.getAddress(this.parser.symbol())));
                }else{
                    Integer value = 0;
                    try {
                        value = Integer.valueOf(this.parser.symbol());
                    }catch (RuntimeException e){
                        value = defaultValue;
                        defaultValue++;
                    }finally {
                        this.symbolTable.addEntry(this.parser.symbol(), value);
                    }
                    this.document.add(Integer.toBinaryString(value));
                }
            }else if(parser.instructionType().equals("C_INSTRUCTION")){
                this.code = new Code(parser.getList().get(parser.getCurrentLine()));
                this.document.add("111" + code.compFuntion(comps) + code.destFuntion(dests) + code.jumpFuntion(jumps));
            }
            parser.advance();
        }

    }

    public void write(String name){
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(name));
            document.forEach(doc -> {
                while (doc.length() < 16){
                    doc = "0" + doc;
                }
                try {
                    writer.write(doc);
                    writer.write("\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<String[]> comps = new ArrayList<>();
        comps.add(new String[]{"0", "0101010"});
        comps.add(new String[]{"1", "0111111"});
        comps.add(new String[]{"-1", "0111010"});
        comps.add(new String[]{"D", "0001100"});
        comps.add(new String[]{"A", "0110000"});
        comps.add(new String[]{"!D", "0001101"});
        comps.add(new String[]{"!A", "0110001"});
        comps.add(new String[]{"-D", "0001111"});
        comps.add(new String[]{"-A", "0110011"});
        comps.add(new String[]{"D+1", "0011111"});
        comps.add(new String[]{"A+1", "0110111"});
        comps.add(new String[]{"D-1", "0001110"});
        comps.add(new String[]{"A-1", "0110010"});
        comps.add(new String[]{"D+A", "0000010"});
        comps.add(new String[]{"D-A", "0010011"});
        comps.add(new String[]{"A-D", "0000111"});
        comps.add(new String[]{"D&A", "0000000"});
        comps.add(new String[]{"D|A", "0010101"});
        comps.add(new String[]{"M", "1110000"});
        comps.add(new String[]{"!M", "1110001"});
        comps.add(new String[]{"-M", "1110011"});
        comps.add(new String[]{"M+1", "1110111"});
        comps.add(new String[]{"M-1", "1110010"});
        comps.add(new String[]{"D+M", "1000010"});
        comps.add(new String[]{"D-M", "1010011"});
        comps.add(new String[]{"M-D", "1000111"});
        comps.add(new String[]{"D&M", "1000000"});
        comps.add(new String[]{"D|M", "1010101"});

        ArrayList<String[]> dests = new ArrayList<>();
        dests.add(new String[]{"M", "001"});
        dests.add(new String[]{"D", "010"});
        dests.add(new String[]{"DM", "011"});
        dests.add(new String[]{"MD", "011"});
        dests.add(new String[]{"A", "100"});
        dests.add(new String[]{"AM", "101"});
        dests.add(new String[]{"AD", "110"});
        dests.add(new String[]{"ADM", "111"});

        ArrayList<String[]> jumps = new ArrayList<>();

        jumps.add(new String[]{"JGT", "001"});
        jumps.add(new String[]{"JEQ", "010"});
        jumps.add(new String[]{"JGE", "011"});
        jumps.add(new String[]{"JLT", "100"});
        jumps.add(new String[]{"JNE", "101"});
        jumps.add(new String[]{"JLE", "110"});
        jumps.add(new String[]{"JMP", "111"});

        HackAssembler hackAssembler = new HackAssembler("PongL.asm");
        hackAssembler.firstPass();
        hackAssembler.secondPass(comps, dests, jumps);
        hackAssembler.write("PongL.hack");
    }

}
