package algoritmolamport;

public class Algoritmo 
{
    Algoritmo()
    { 
    }
    
    public Reloj sincronizar(Reloj r1, Reloj r2, String t1, String t2)
    {
        int indiceR1=buscarIndice(r1,t1);
        int indiceR2=buscarIndice(r2,t2);
        Reloj nuevoReloj=new Reloj();
        int[] nuevosTiempos=r2.getTiempos();
        
        if(indiceR1>=10 || indiceR2>=10)
        {
            System.out.println("Tiempos Invalidos");
        }
        else
        {
            int tiempoEmisor=r1.getTiempo(indiceR1);
            int tiempoReceptor=r2.getTiempo(indiceR2);
            
            if(tiempoReceptor<tiempoEmisor)
            {
                int contador=1;
                
                for (int i = indiceR2; i < nuevosTiempos.length; i++) 
                {
                    nuevosTiempos[i]=tiempoEmisor+contador;
                    contador++;
                }   
            }
            else
            {
            }
        }
        nuevoReloj.setTiempos(nuevosTiempos);
        return nuevoReloj;
    }
    
    public int buscarIndice(Reloj r, String num)
    {
        int [] tiempos=r.getTiempos();
        int numBuscado=Integer.parseInt(num);
        System.out.println("#Buscado"+numBuscado);
        int respuesta=10;
        
        for (int i = 0; i <tiempos.length; i++)
        {
            if(numBuscado==tiempos[i])
            {
                System.out.println("Entra a comparacion");
                respuesta=i;
                System.out.println("respuesta if"+respuesta);
                break;
            }
        }
        System.out.println(respuesta);
        return respuesta;
    }
}
