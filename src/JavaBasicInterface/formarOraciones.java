package JavaBasicInterface;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class formarOraciones extends JFrame implements ActionListener
{
	JButton boton1,boton2,boton3,boton4,boton5,salir;
	JTextField texto = new JTextField(40);
	JLabel label;
	String oracion="";
	int i1=0,i2=0,i3=0,i4=0;
	
	public static void main(String[] args)
	{
		formarOraciones ventana =new formarOraciones();
		ventana.crearGUI();
		ventana.setSize(600,600);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}
	
	private void crearGUI()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container frame = this.getContentPane();
		frame.setLayout(new FlowLayout());
		this.setTitle("GENERADOR DE ORACIONES");
		
		label = new JLabel("<html>ESTA INTERFAZ VA CREANDO UNA ORACIÓN CON RESPECTO A SUS BOTONES. UN BOTÓN NO PUEDE <br> REPETIRSE MÁS DE 2 VECES.</html>");
		boton1= new JButton("Bienvenido, ");
		boton1.addActionListener(this);
		boton2= new JButton("esta es");
		boton2.addActionListener(this);
		boton3= new JButton("una");
		boton3.addActionListener(this);
		boton4= new JButton("Interfaz");
		boton4.addActionListener(this);
		boton5= new JButton("Imprimir oración formada");
		boton5.addActionListener(this);
		salir = new JButton("Salir");
		salir.addActionListener(this);
		
		frame.add(label);
		frame.add(boton1);
		frame.add(boton2);
		frame.add(boton3);
		frame.add(boton4);
		frame.add(boton5);
		frame.add(texto);
		frame.add(salir);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == boton1)
		{
			i1++;
			oracion +=" Bienvenido, ";
			if(i1==2)
			{
				boton1.setEnabled(false);
			}
		}else if(e.getSource()==boton2)
		{
			i2++;
			oracion +=" esta es ";
			if(i2==2)
			{
				boton2.setEnabled(false);
			}
		}else if(e.getSource()==boton3)
		{
			i3++;
			oracion+= " una ";
			if(i3==2)
			{
				boton3.setEnabled(false);
			}
		}else if(e.getSource()==boton4)
		{
			i4++;
			oracion+= " interfaz. ";
			if(i4==2)
			{
				boton4.setEnabled(false);
			}
		}else if(e.getSource()==boton5)
		{
			texto.setText(""+oracion);
		}else if(e.getSource()==salir)
		{
			System.exit(0);
		}
	}

}
