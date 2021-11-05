import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Teste extends JFrame {

    private JPanel contentPane;
    private static int tamanho = 429;

    public static void main(String[] args) {
        Teste frame = new Teste();
        frame.setVisible(true);
    }

    private static int qtButton = 0;

    public Teste() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scroll = new JScrollPane();
        //aqui eu isolo a localização do scrollpane
        scroll.setLocation(10, 11);
        contentPane.add(scroll);
        //alterei pra final para que fosse possivel
        //chamar o componente dentro da classe anonima
        //do actionPerformed
        final JPanel panel = new JPanel();
        //aqui defino um boxlayout, e a forma de alinhamento
        //dos componentes, no caso, somente em vertical
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setSize(new Dimension(464, 439));
        //adicionar borda transparente ao painel
        //defini right e left pros botoes não ficarem
        //colados na borda
        panel.setBorder(new EmptyBorder(0, 5, 0, 5));
        scroll.setViewportView(panel);
        //vincula o tamanho do panel pro tamanho do scroll
        scroll.setSize(panel.getSize());

        JButton adicionar = new JButton("Adicionar");
        adicionar.setBounds(481, 11, 134, 23);
        contentPane.add(adicionar);

        adicionar.addActionListener(new ActionListener(this)); {
            @Override
            public void actionPerformed(ActionEvent e) {
                // gerarButton(panel);

            }
        });
    }

    public static void gerarButton(JPanel panel) {
        JButton NewButton = new JButton("New button");
        //pro botão ficar com tamanho maximo no BoxLayout
        // é preciso definir a dimensão maxima do botao
        //Integer.MAX_VALUE definir a maior largura possivel
        NewButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, NewButton.getMinimumSize().height));
        //adicionei um espaçamento pro proximo botao não
        //ficar colado, você pode alterar a vontade
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(NewButton);

        qtButton++;
        tamanho = 11 + (34 * qtButton) + 50;

        if (qtButton == 16) {
        }
        //o revalidate deve ser aplicado ao componente root
        //neste caso, o JFrame
        //pra evitar problemas com tamanho de outros containers
        //da tela
        panel.getRootPane().revalidate();
    }
}
    