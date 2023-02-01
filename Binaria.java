
public class Binaria{
    //int A[]={-5,-2,3,3,4,8,8,50,61};

    public boolean busBin(int A[],int x){
        return busBin(A,x,0,A.length-1);
    }

    private boolean busBin(int A[],int x, int li, int ls){
        if(li<ls){
            int m = (li+ls/2);
            if(x == A[m])
                return true;
            else if(x>A[m])
                return busBin(A,x,m+1,ls);
            else
                return busBin(A,x,li,m-1);
        }
        else
            return false;
    }
}
