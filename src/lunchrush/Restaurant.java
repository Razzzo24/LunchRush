package lunchrush;

import static java.awt.Color.white;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Restaurant extends JFrame {
    //So, this is the first change, lets commmit
        Imagen inicio;
        Imagen scores;
        
        JPanel menu;
        JPanel highScore;
        
        JButton start;
        JButton controls;
        JButton hScores;
        JButton salir;
        JButton regresar;
        
    public Restaurant() {
        this.setTitle("Lunch & Rush");
        this.setDefaultCloseOperation(3);
        this.setSize(800, 600);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        GUI();
    }

    public void GUI() {
////////////////////////////////////////////////////////////////////////////////
        inicio = new Imagen("fondo.jpg");
        menu = new JPanel();
        menu.setSize(800, 600);
        menu.setLayout(null);
        menu.repaint();

        start = new JButton("Start");
        start.setLocation(325, 200);
        start.setSize(120, 30);

        controls = new JButton("How to play");
        controls.setLocation(325, 260);
        controls.setSize(120, 30);

        hScores = new JButton("High Scores");
        hScores.setLocation(325, 320);
        hScores.setSize(120, 30);
        hScores.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                menu.setVisible(false);
                highScore.setVisible(true);
            }
        });
        
        salir = new JButton("Salir");
        salir.setLocation(325,380);
        salir.setSize(120,30);
        salir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
////////////////////////////////////////////////////////////////////////////////
        scores = new Imagen("high_scores.jpg");
        highScore = new JPanel();
        highScore.setSize(800,600);
        highScore.setLayout(null);
        highScore.repaint();
        
        
        regresar = new JButton("Regresar");
        regresar.setLocation(50,500);
        regresar.setSize(120,30);
        regresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                menu.setVisible(true);
                highScore.setVisible(false);
            }
        });
////////////////////////////////////////////////////////////////////////////////
               
        menu.add(start);
        menu.add(controls);
        menu.add(hScores);
        menu.add(salir);
        menu.add(inicio);
        
        highScore.add(regresar);
        highScore.add(scores);
        
        this.add(menu);
        this.add(highScore);
        
        this.setVisible(true);
    }

    public class Imagen extends javax.swing.JPanel {
        private String img;

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }
        
        public Imagen(String img) {
            this.setSize(800, 600); //se selecciona el tamaño del panel
            this.img = img;
        }

        //Se crea un método cuyo parámetro debe ser un objeto Graphics
        public void paint(Graphics grafico) {
            Dimension height = getSize();

        //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
            ImageIcon Img = new ImageIcon(getClass().getResource(getImg()));

        //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

            setOpaque(false);
            super.paintComponent(grafico);
        }
    }
}
