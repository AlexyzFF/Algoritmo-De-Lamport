package algoritmolamport;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interfaz extends JFrame implements ActionListener
{
    //Tamaños
    private int tamInput=30;
    private int altoLabel=30;
    private int anchoLabel=60;
    private int tamBoton=100;
    
    //Botones
    private JButton botonIniciar;
    private JButton botonSincronizar;
    
    //Etiquetas 
    private JLabel labelTitulo;
    private JLabel labelInicio;
    private JLabel labelMensaje;
    private JLabel labelEmisor;
    private JLabel labelReceptor;
    private JLabel labelDe;
    private JLabel labelPara;
    private JLabel labelInicioR2;
    private JLabel labelInicioR3;
    private JLabel labelInicioR1;
    private JLabel labelR1;
    private JLabel labelR2;
    private JLabel labelR3;
    private JLabel labelConteoR1;
    private JLabel labelConteoR2;
    private JLabel labelConteoR3;
    private JLabel labelRelojes;
    
    //Inputs Mensaje
    private JTextField campoInicioR1;
    private JTextField campoInicioR2;
    private JTextField campoInicioR3;
    private JTextField campoEmisor;
    private JTextField campoReceptor;
    private JTextField campoDe;
    private JTextField campoPara;
    
    //Inputs Conteos
    private JTextField campoR10;
    private JTextField campoR11;
    private JTextField campoR12;
    private JTextField campoR13;
    private JTextField campoR14;
    
    private JTextField campoR20;
    private JTextField campoR21;
    private JTextField campoR22;
    private JTextField campoR23;
    private JTextField campoR24;
       
    private JTextField campoR30;
    private JTextField campoR31;
    private JTextField campoR32;
    private JTextField campoR33;
    private JTextField campoR34;

   
   private Reloj r1;
   private Reloj r2;
   private Reloj r3;
    
        public Interfaz()
	{
                setLayout(null);
		setTitle("Algoritmo Lamport");
		
		setSize(400,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                this.r1=new Reloj();
                this.r2=new Reloj();
                this.r3=new Reloj();
                
                this.labelTitulo=new JLabel("Algoritmo Lamport");
                
                this.labelTitulo.setBounds(140, 10, 200, 30);
                add(this.labelTitulo);
                
                //Seccion Inicio de Relog-----------------------------------------------------
                this.labelInicio=new JLabel("Inicializar relojes");
                this.labelInicio.setForeground(new Color(0,0,255)); 
                this.labelInicio.setBounds(10, 60, 200, altoLabel);
                add(this.labelInicio);
                //--
                this.labelInicioR1=new JLabel("Reloj 1:");
                this.labelInicioR1.setBounds(10, 90, anchoLabel, altoLabel);
                add(this.labelInicioR1);
                
                this.campoInicioR1=new JTextField();
                this.campoInicioR1.setBounds(60, 90, tamInput, tamInput);
                add(this.campoInicioR1);
                //--
                this.labelInicioR2=new JLabel("Reloj 2:");
                this.labelInicioR2.setBounds(10, 130, anchoLabel, altoLabel);
                add(this.labelInicioR2);
                
                this.campoInicioR2=new JTextField();
                this.campoInicioR2.setBounds(60, 130, tamInput, tamInput);
                add(this.campoInicioR2);
                 //--
                this.labelInicioR3=new JLabel("Reloj 3:");
                this.labelInicioR3.setBounds(10, 170, anchoLabel, altoLabel);
                add(this.labelInicioR3);
                
                this.campoInicioR3=new JTextField();
                this.campoInicioR3.setBounds(60, 170, tamInput, tamInput);
                add(this.campoInicioR3);
                
                //Seccion Mensaje--------------------------------------------------------
                this.labelMensaje=new JLabel("Mensaje");
                this.labelMensaje.setForeground(new Color(0,0,255)); 
                this.labelMensaje.setBounds(240, 60, 200, altoLabel);
                add(this.labelMensaje);
                //---
                this.labelEmisor=new JLabel("Emisor:");
                this.labelEmisor.setBounds(150, 90, anchoLabel, altoLabel);
                add(this.labelEmisor);
                
                this.campoEmisor=new JTextField();
                this.campoEmisor.setBounds(210, 90, tamInput, tamInput);
                add(this.campoEmisor);
                //--
                this.labelReceptor=new JLabel("Receptor:");
                this.labelReceptor.setBounds(150, 130, anchoLabel, altoLabel);
                add(this.labelReceptor);
                
                this.campoReceptor=new JTextField();
                this.campoReceptor.setBounds(210, 130, tamInput, tamInput);
                add(this.campoReceptor);
                
                //Seccion Rango------------------------------------------------------------
                this.labelDe=new JLabel("De:");
                this.labelDe.setBounds(300, 90, anchoLabel, altoLabel);
                add(this.labelDe);
                
                this.campoDe=new JTextField();
                this.campoDe.setBounds(340, 90, tamInput, tamInput);
                add(this.campoDe);
                //--
                this.labelPara=new JLabel("Para:");
                this.labelPara.setBounds(300, 130, anchoLabel, altoLabel);
                add(this.labelPara);
                
                this.campoPara=new JTextField();
                this.campoPara.setBounds(340, 130, tamInput, tamInput);
                add(this.campoPara);
                    
                //Seccion Conteo Reloj 1
                this.labelRelojes=new JLabel("Relojes");
                this.labelRelojes.setBounds(80, 210, anchoLabel, altoLabel);
                this.labelRelojes.setForeground(new Color(0,0,255)); 
                add(this.labelRelojes);
                //--
                this.labelConteoR1=new JLabel("Reloj 1");
                this.labelConteoR1.setBounds(10, 250, anchoLabel, altoLabel);
                add(this.labelConteoR1);
                
                this.campoR10=new JTextField();
                this.campoR10.setBounds(10, 290, tamInput, tamInput);
                this.campoR10.setEditable(false); 
                add(this.campoR10);
                
                this.campoR11=new JTextField();
                this.campoR11.setBounds(10, 330, tamInput, tamInput);
                this.campoR11.setEditable(false); 
                add(this.campoR11);
                
                this.campoR12=new JTextField();
                this.campoR12.setBounds(10, 370, tamInput, tamInput);
                this.campoR12.setEditable(false); 
                add(this.campoR12);
                
                this.campoR13=new JTextField();
                this.campoR13.setBounds(10, 410, tamInput, tamInput);
                this.campoR13.setEditable(false); 
                add(this.campoR13);
                
                this.campoR14=new JTextField();
                this.campoR14.setBounds(10, 450, tamInput, tamInput);
                this.campoR14.setEditable(false); 
                add(this.campoR14);
                
                //Seccion Conteo Reloj 2
                this.labelConteoR2=new JLabel("Reloj 2");
                this.labelConteoR2.setBounds(80, 250, anchoLabel, altoLabel);
                add(this.labelConteoR2);
                
                this.campoR20=new JTextField();
                this.campoR20.setBounds(80, 290, tamInput, tamInput);
                this.campoR20.setEditable(false); 
                add(this.campoR20);
                
                this.campoR21=new JTextField();
                this.campoR21.setBounds(80, 330, tamInput, tamInput);
                this.campoR21.setEditable(false); 
                add(this.campoR21);
                
                this.campoR22=new JTextField();
                this.campoR22.setBounds(80, 370, tamInput, tamInput);
                this.campoR22.setEditable(false); 
                add(this.campoR22);
                
                this.campoR23=new JTextField();
                this.campoR23.setBounds(80, 410, tamInput, tamInput);
                this.campoR23.setEditable(false); 
                add(this.campoR23);
                
                this.campoR24=new JTextField();
                this.campoR24.setBounds(80, 450, tamInput, tamInput);
                this.campoR24.setEditable(false); 
                add(this.campoR24);
                
                //Seccion Conteo Reloj 3
                this.labelConteoR3=new JLabel("Reloj 3");
                this.labelConteoR3.setBounds(150, 250, anchoLabel, altoLabel);
                add(this.labelConteoR3);
                
                this.campoR30=new JTextField();
                this.campoR30.setBounds(150, 290, tamInput, tamInput);
                this.campoR30.setEditable(false); 
                add(this.campoR30);
                
                this.campoR31=new JTextField();
                this.campoR31.setBounds(150, 330, tamInput, tamInput);
                this.campoR31.setEditable(false); 
                add(this.campoR31);
                
                this.campoR32=new JTextField();
                this.campoR32.setBounds(150, 370, tamInput, tamInput);
                this.campoR32.setEditable(false); 
                add(this.campoR32);
                
                this.campoR33=new JTextField();
                this.campoR33.setBounds(150, 410, tamInput, tamInput);
                this.campoR33.setEditable(false); 
                add(this.campoR33);
                
                this.campoR34=new JTextField();
                this.campoR34.setBounds(150, 450, tamInput, tamInput);
                this.campoR34.setEditable(false); 
                add(this.campoR34);
         
                //Seccion botones---------------------------------------------------------
                this.botonIniciar=new JButton("Iniciar");
                this.botonIniciar.setBounds(240, 350, 100, 30);
                this.botonIniciar.addActionListener(this);
                add(this.botonIniciar);
                
                this.botonSincronizar=new JButton("Sincronizar");
                this.botonSincronizar.setBounds(240, 390, 100, 30);
                this.botonSincronizar.addActionListener(this);
                add(this.botonSincronizar);
		setResizable(false);
		setVisible(true);	
	}

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==botonIniciar)
        {            
            this.r1.inicializarReloj(Integer.parseInt(this.campoInicioR1.getText()));
            this.campoR10.setText(this.r1.getTiempoString(0));
            this.campoR11.setText(r1.getTiempoString(1));
            this.campoR12.setText(r1.getTiempoString(2));
            this.campoR13.setText(r1.getTiempoString(3));
            this.campoR14.setText(r1.getTiempoString(4));
            
            this.r2.inicializarReloj(Integer.parseInt(this.campoInicioR2.getText()));
            this.campoR20.setText(r2.getTiempoString(0));
            this.campoR21.setText(r2.getTiempoString(1));
            this.campoR22.setText(r2.getTiempoString(2));
            this.campoR23.setText(r2.getTiempoString(3));
            this.campoR24.setText(r2.getTiempoString(4));
            
            this.r3.inicializarReloj(Integer.parseInt(this.campoInicioR3.getText()));
            this.campoR30.setText(r3.getTiempoString(0));
            this.campoR31.setText(r3.getTiempoString(1));
            this.campoR32.setText(r3.getTiempoString(2));
            this.campoR33.setText(r3.getTiempoString(3));
            this.campoR34.setText(r3.getTiempoString(4));            
        }
        
        if(e.getSource()==botonSincronizar)
        {   
            Algoritmo algoritmo=new Algoritmo();
            String emisor=this.campoEmisor.getText();
            String receptor=this.campoReceptor.getText();
            
            String tiempoEmisor=this.campoDe.getText();
            String tiempoReceptor=this.campoPara.getText();
            Reloj relojEmisor=new Reloj();
            Reloj relojReceptor=new Reloj();
            
            if(emisor.equals("1"))
            {
                relojEmisor=this.r1;
            }
            else if(emisor.equals("2"))
            {
                relojEmisor=r2;
            }
            else if(emisor.equals("3"))
            {
                relojEmisor=r3;
            }
            else
            {
                System.out.println("El emisor no existe");
            }
            
            if(receptor.equals("1"))
            {
                relojReceptor=r1;
            }
            else if(receptor.equals("2"))
            {
                relojReceptor=this.r2;
            }
            else if(receptor.equals("3"))
            {
                relojReceptor=r3;
            }
            else
            {
                System.out.println("El emisor no existe");
            }
            Reloj rn=algoritmo.sincronizar(relojEmisor, relojReceptor, tiempoEmisor, tiempoReceptor);
            
            if(receptor.equals("1"))
            {
                this.campoR10.setText(rn.getTiempoString(0));
                this.campoR11.setText(rn.getTiempoString(1));
                this.campoR12.setText(rn.getTiempoString(2));
                this.campoR13.setText(rn.getTiempoString(3));
                this.campoR14.setText(rn.getTiempoString(4));
            }
            else if(receptor.equals("2"))
            {
                this.campoR20.setText(rn.getTiempoString(0));
                this.campoR21.setText(rn.getTiempoString(1));
                this.campoR22.setText(rn.getTiempoString(2));
                this.campoR23.setText(rn.getTiempoString(3));
                this.campoR24.setText(rn.getTiempoString(4));
            }
            else if(receptor.equals("3"))
            {
                this.campoR30.setText(rn.getTiempoString(0));
                this.campoR31.setText(rn.getTiempoString(1));
                this.campoR32.setText(rn.getTiempoString(2));
                this.campoR33.setText(rn.getTiempoString(3));
                this.campoR34.setText(rn.getTiempoString(4)); 
            }
        }
    }
}
