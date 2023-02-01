public class Ejercicio88
{

    public Ejercicio88()

    {   

    } 

    public void resolver()
    {
        String[] nombres={"luis","orian","tom","darla"};
        String a="orian";
        String b="darla";
        String[] res=new String[nombres.length];
        boolean[] flags=new boolean[nombres.length];            // " " " " " " " " 
        //ArrayList<String[]> respuestas=new ArrayList<>();˚˚
        resolver(nombres,res,a,b,0,flags,0);
    }

    private void resolver(String[] nombres,String[] res,String a,String b,
    int pos,boolean[] flags,int i)
    {
        int ans=0;
        if(pos == nombres.length){
            imprimir(res);
        }
        else{
            if( i < nombres.length) //for(int i=0;i<nombres.length;i++)
            {
                if(flags[i] == false){
                    //marca
                    String palabra=nombres[i];
                    flags[i]=true;//ya esta marcado
                    res[pos]=palabra;

                    //explotar

                    if(juntos(a,b,res,pos) == false){
                        resolver(nombres,res,a,b,pos+1,flags,0);
                    }

                    //desmarcar
                    flags[i]=false;
                    res[pos] = "";
                }           
                resolver(nombres,res,a,b,pos,flags,i+1);
            }

        }
    } 

    private boolean juntos(String a,String b,String[]res,int actual){
        boolean ans=false;
        if(actual > 0){
            if(res[actual].equals(a) || res[actual].equals(b)){
                if( res[actual-1].equals(b) || res[actual-1].equals(a))
                    ans=true;
            }
        }
        return ans;
    }

    public void imprimir(String[] res)
    {
        for(String w: res)
            System.out.print(w+" ");
        System.out.println();
    }
}//eliminar bandera para el ejercicio 74
