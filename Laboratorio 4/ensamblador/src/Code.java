import java.util.ArrayList;
import java.util.Arrays;

public class Code {
    private String dest;
    private String comp;
    private String jump;

    private String[] splitEquals(String line) {
        return line.split("=");
    }

    private String[] splitComma(String line) {
        return line.split(";");
    }

    private void validation(String line) {
        if (line.contains("=")) {
            String[] aux = splitEquals(line);
            this.dest = aux[0];
            if (line.contains(";")) {
                this.comp = splitComma(aux[1])[0];
                this.jump = splitComma(aux[1])[1];
            } else {
                this.comp = aux[1];
                this.jump = null;
            }
        } else if (line.contains(";")) {
            this.dest = null;
            this.comp = splitComma(line)[0];
            this.jump = splitComma(line)[1];
        } else {
            this.dest = null;
            this.comp = line;
            this.jump = null;
        }
    }

    public Code(String line) {
        validation(line);
    }

    public String compFuntion(ArrayList<String[]> comps) {
        final String[] aux = new String[1];
        comps.forEach(option -> {
            if (this.comp.equals(option[0])) {
                aux[0] = option[1];
            }
        });
        return aux[0];
    }

    public String destFuntion(ArrayList<String[]> dests) {
        final String[] aux = new String[1];
        dests.forEach(option -> {
            if (dest != null){
                if (this.dest.equals(option[0])) {
                    aux[0] = option[1];
                }
            }else{
                aux[0] = "000";
            }

        });
        return aux[0];
    }

    public String jumpFuntion(ArrayList<String[]> jumps){
        final String[] aux = new String[1];
        jumps.forEach(option -> {
            if (this.jump != null){
                if(this.jump.equals(option[0])){
                    aux[0] = option[1];
                }
            }else{
                aux[0] = "000";
            }

        });
        return aux[0];
    }

    public String getDest() {
        return dest;
    }

    public String getComp() {
        return comp;
    }

    public String getJump() {
        return jump;
    }
}
