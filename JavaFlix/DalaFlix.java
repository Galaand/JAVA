import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class DalaFlix extends JFrame {
	
	private JDialog caixaDialogo;
	private JTextArea areaTexto;
	


	private JLabel titulo;
	private JLabel lblNome;
	private JLabel lblValor;
	private JLabel lblUser;
	private JLabel lblSenha;
	private JLabel lblMensagem;
	private JTextField usuarioTxtField;
	private JTextField senhaTxtField;
	private JButton btnCadastrarUsuario;
	private JButton btnDepositar;
	private JButton btnCadastrarSerie;
	
	

	public DalaFlix(){
		setTitle( "DALA FLIX" );
		setBounds( 100, 120, 600, 500 );
		setLayout( null );
		
		titulo = adicionaJLabel(220, 10, 200, 30, "BEM VINDO AO DALA FLIX");
		
		lblUser = adicionaJLabel(200, 40, 100, 30, "Usuário");
		usuarioTxtField = adicionaJTextField(250, 40, 150, 30);
		
		
		lblSenha = adicionaJLabel(200, 70, 100, 30, "Senha");
		senhaTxtField = adicionaJTextField(250, 70, 150, 30);
		
		
		btnCadastrarUsuario = adicionaJButton(230, 100, 150, 30, "Cadastrar");
		
		
		lblNome = adicionaJLabel(200, 31, 100, 23, "");

		btnDepositar = adicionaJButton(470, 30, 100, 30, "Add Crédito");
	
		lblMensagem = adicionaJLabel(470, 10, 100, 23, "Seu saldo: ");
		
		lblValor = adicionaJLabel(540, 10, 80, 23, "0.00");;
		lblValor.setForeground( new Color( 0xffab12 ) );
		
		
		btnCadastrarSerie = adicionaJButton(230, 150, 150, 30, "Cadastrar série");
		

		
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

	
	public static void main(String[] args) {
		new DalaFlix();
	}


	

}
