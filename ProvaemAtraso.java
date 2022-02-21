//ProvaemAtraso.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class ProvaemAtraso extends JFrame implements ActionListener
{
	JLabel L1, L2 ,L3, L4;
	JButton B1;
	JTextField T1,T2,T3,T4;

 public static void main(String args[])
 {
	 JFrame JProvaemAtraso = new ProvaemAtraso();
	 JProvaemAtraso.setVisible(true);
 }

 ProvaemAtraso()
 {
	 setTitle("Prestação de contas");
	 setSize(500,500);
	 setLocation(50,50);
	 L1 = new JLabel("Digite valor: ");
	 L1.setForeground(Color.black);
	 L1.setFont(new Font("",Font.BOLD,14));
	 L2 = new JLabel("Digite taxa: ");
	 L2.setForeground(Color.red);
	 L2.setFont(new Font("",Font.BOLD,14));
	 L3 = new JLabel("Digite tempo: ");
	 L3.setForeground(Color.blue);
	 L3.setFont(new Font("",Font.BOLD,14));
	 L4 = new JLabel("Prestação: ");
	 L4.setForeground(Color.blue);
	 L4.setFont(new Font("",Font.BOLD,14));
	 B1 = new JButton("Calcular prestação");
	 B1.addActionListener(this);
     B1.setFont(new Font("",Font.BOLD,18));
	 T1 = new JTextField();
	 T2 = new JTextField();
	 T3 = new JTextField();
	 T4 = new JTextField();
	 T4.setEditable(false);


	 getContentPane().setBackground(Color.cyan);
     getContentPane().setLayout(new GridLayout(5,1));
	 getContentPane().add(L1);getContentPane().add(T1);
	 getContentPane().add(L2);getContentPane().add(T2);
	 getContentPane().add(L3);getContentPane().add(T3);
	 getContentPane().add(B1);
	 getContentPane().add(L4);getContentPane().add(T4);

		}
		public void actionPerformed(ActionEvent e)
		{
			float valor=0, taxa=0, tempo=0, resultado=0;

			valor = Float.parseFloat(T1.getText());
			taxa = Float.parseFloat(T2.getText());
			tempo = Float.parseFloat(T3.getText());
			  if(e.getSource()==B1)
			  resultado = valor + (valor * (taxa/100)) * tempo;
			  T4.setText(""+resultado);



			}
		}





