import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrmJuego extends JFrame {

    // método constructor
    public FrmJuego() {
        setSize(400, 300);
        setTitle("Juego de dados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        String archivoImagen = "imagenes/2.jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(archivoImagen));

        JLabel lblDado1 = new JLabel(imgDado);
        lblDado1.setBounds(10, 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        add(lblDado1);

        JLabel lblDado2 = new JLabel(imgDado);
        lblDado2.setBounds(20 + imgDado.getIconWidth(), 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        add(lblDado2);

        JLabel lblTituloLanzamientos = new JLabel("Lanzamientos");
        lblTituloLanzamientos.setBounds(30 + 2 * imgDado.getIconWidth(), 10, 100, 25);
        add(lblTituloLanzamientos);

        JLabel lblLanzamientos = new JLabel("0");
        lblLanzamientos.setBounds(30 + 2 * imgDado.getIconWidth(), 45, 100, 100);
        lblLanzamientos.setFont(new Font("Tahoma", Font.BOLD, 72));
        lblLanzamientos.setBackground(new Color(0,0,0));
        lblLanzamientos.setForeground(new Color(0,255,0));
        lblLanzamientos.setOpaque(true);
        lblLanzamientos.setHorizontalAlignment(JLabel.RIGHT);
        add(lblLanzamientos);

    }
}
