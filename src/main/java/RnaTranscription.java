public class RnaTranscription {

    public String transcribe(String dnaStrand) {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<dnaStrand.length();i++)
        {
            if(dnaStrand.charAt(i)=='G')
            {
                s.append('C');
            }
            else if(dnaStrand.charAt(i)=='C')
            {
                s.append('G');
            }
            else if(dnaStrand.charAt(i)=='T')
            {
                s.append('A');
            }
            else if(dnaStrand.charAt(i)=='A')
            {
                s.append('U');
            }
        }

        return s.toString();
    }

}
