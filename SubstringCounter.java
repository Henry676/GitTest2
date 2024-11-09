package GitTest2;
import java.util.ArrayList;
import java.util.List;

public class SubstringCounter{
    private String stringI;

    public SubstringCounter(String args){
        this.stringI = args;
    }

    public List<String> createSubstrings(){
        List<String> substrings = new ArrayList<>();

        for(int start = 0; start < stringI.length(); start++){
            int countZeros = 0, countOnes = 0;
            for(int end = start; end < stringI.length(); end++){
                if(stringI.charAt(end) == '0') countZeros++;
                else countOnes++;
                if(countOnes == countZeros)
                substrings.add(stringI.substring(start, end+1));
            }
        }
        return substrings;
    }

    public void showSubstrings(List<String> result){
        for(int i = 0; i<result.size(); i++){
            System.out.println("Substring #"+(i+1)+": "+result.get(i));
        }
    }
    public static void main(String[] args) {
        SubstringCounter s = new SubstringCounter(args[0]);
        List<String> result = s.createSubstrings();
        System.out.println("Substrings total: "+result.size());
        s.showSubstrings(result);
    }
}

// Codigo revisado exitosamente

// Arregle issue 1
// Se ha arreglado el bug de la ventana que no cierra
