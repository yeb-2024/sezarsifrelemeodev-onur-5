import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class    Main extends JFrame implements ActionListener {
    JButton şifreleme, şifreçözme;
    JTextField anahter, mesaj;
    JTextArea sonuç;
    public Main() {
        setTitle("Şifreleme Uygulaması");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel anahter = new JLabel("Anahtar 0-25");
        anahter.setBounds(50, 30, 100, 30);
        add(anahter);

        this.anahter = new JTextField();
        this.anahter.setBounds(150, 30, 100, 30);
        add(this.anahter);

        JLabel labelmesaj = new JLabel("Mesaj");
        labelmesaj.setBounds(50, 80, 100, 30);
        add(labelmesaj);

        mesaj = new JTextField();
        mesaj.setBounds(150, 80, 300, 30);
        add(mesaj);

    }
        @Override
    public void actionPerformed(ActionEvent e) {

    }
}
