

public class Leon78{
    
    public int contarLeones(String selva, String patron){
        return contarLeones(selva, 0, patron, 0);
    }
    public int contarLeones(String selva, int i, String patron, int j){
        if(i < selva.length()){
            if(j == patron.length()){
                return 1 + contarLeones(selva, i+1, patron, 0);
            }
            else{
                char cs = selva.charAt(i);
                char cp = patron.charAt(j);
                if(cs == cp)
                 return contarLeones(selva, i+1, patron, j+1);
                else
                 return contarLeones(selva, i+1, patron, j);
            }
        }else{
            if(j == patron.length())
               return 1;
            else
            return 0;
        }
        
    }
    /*private int contarLeones(String selva,int i,String patron,int j){
        if (i<selva.length()){
            char cs=selva.charAt(i);
            if(j<patron.length()){
                char cp=patron.charAt(j);
                if(cs==cp)
                 return contarLeones(selva,i+1,patron,j+1);
                else
                 return contarLeones(selva,i+1,patron,j);
            }
            else{
               return 1 + contarLeones(selva,i+1,patron,j+1);
            }
        }
        else
          return 0;
    }*/
}
