
public class Ejercicio21{
    int A[]={2,4,6,8,10,12,14,16,18,20,22,24,26};
    public int noCuatro(int n){
        return noCuatro(A,0);
    }

    public int noCuatro(int A[],int pos){
        if(pos<A.length){
            int x=A[pos];
            if((!(x%2==0))||(!(x%4==0)))
                return noCuatro(A,pos+1)+x;
            else
                return noCuatro(A,pos+1);
        }
        else
            return 0;
    }
}
