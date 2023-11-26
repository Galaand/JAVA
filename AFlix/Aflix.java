import java.awt.Color;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Aflix extends JFrame {

	private JLabel titulo;
	private JLabel userJLabel;
	private JTextField userJTextField;
	private JLabel passworJLabel;
	private JTextField passworJTextField;
	private JButton signInJButton;
	private JButton submitSerie;
	private JLabel balanceLJLabel;
	private JLabel balanceNumber;
	private String saldo = "0.00";

	public Aflix(){

		setTitle("JavaFlix");
		setVisible(true);
		setLayout(null);
		setBounds(1000,1000,1000,1000);

		titulo = adicionaJLabel(480, 10, 200, 100, "Bem-vindo a JavaFlix");

		userJLabel = adicionaJLabel(400, 30, 200, 200, "Usuário:");
		userJTextField = adicionaJTextField(450, 115, 150, 30);

		passworJLabel = adicionaJLabel(400, 65, 200, 200, "Senha");
		passworJTextField = adicionaJTextField(450, 150, 150, 30);

		signInJButton = adicionaJButton(425, 200, 200, 30, "Cadastrar");

		submitSerie = adicionaJButton(425, 240, 200, 30, "Cadastrar serie");

		balanceLJLabel = adicionaJLabel(800, 10, 100, 100, "Saldo: ");
		balanceNumber = adicionaJLabel(850, 10, 100, 100, saldo);

		setLocationRelativeTo(null);
		setVisible( true );
		setDefaultCloseOperation( DISPOSE_ON_CLOSE );
	}

	private JLabel adicionaJLabel(int x, int y, int w, int h, String texto){
		JLabel novaLabel = new JLabel(texto);
		novaLabel.setBounds(x, y, w, h);
		getContentPane().add(novaLabel);
		return novaLabel;
	}
	
	private JTextField adicionaJTextField(int x, int y, int w, int h){
		JTextField novoTextField = new JTextField();
		novoTextField.setBounds(x, y, w, h);
		getContentPane().add(novoTextField);
		return novoTextField;
	}
	
	private JButton adicionaJButton(int x, int y, int w, int h, String texto){
		JButton novoBotao = new JButton(texto);
		novoBotao.setBounds(x, y, w, h);
		getContentPane().add(novoBotao);
		return novoBotao;
	}
	
}