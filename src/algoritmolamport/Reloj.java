package algoritmolamport;

public class Reloj 
{
    private int[] tiempos;
   
    Reloj()
    {
        this.tiempos=new int[7];
    }
    
    public void inicializarReloj(int inicio)
    {
        for(int i=0;i<5;i++)
        {

            this.tiempos[i]=inicio+i;
        }
    }
    
    public void setTiempo(String i,int num)
    {
        int aux=Integer.parseInt(i);
        this.tiempos[aux]=num;
    }
    
    public int getTiempo(int i)
    {
        return this.tiempos[i];
    }

    public int[] getTiempos()
    {
        return this.tiempos;
    }
    
    public void setTiempos(int[] nt)
    {
        this.tiempos=nt;
    }
    
    public String getTiempoString(int i)
    {
        return String.valueOf(this.tiempos[i]);
    }
}
