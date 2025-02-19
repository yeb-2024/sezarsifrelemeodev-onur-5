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
        şifreleme = new JButton("Şifrele");
        şifreleme.setBounds(100, 150, 100, 40);
        şifreleme.addActionListener(this);
        add(şifreleme);

        şifreçözme = new JButton("Şifre Çöz");
        şifreçözme.setBounds(250, 150, 100, 40);
        şifreçözme.addActionListener(this);
        add(şifreçözme);

        sonuç = new JTextArea();
        sonuç.setBounds(50, 220, 400, 100);
        sonuç.setEditable(false);
        add(sonuç);

        setVisible(true);
    }

        @Override
    public void actionPerformed(ActionEvent e) {

    }
}
