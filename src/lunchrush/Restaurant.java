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
    
        Imagen imgInicio;
        Imagen imgScores;
        
        JPanel pMenu;
        JPanel pHighScore;
        
        JButton btnStart;
        JButton btnControls;
        JButton btnHScores;
        JButton btnSalir;
        JButton btnRegresar;
        
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
        imgInicio = new Imagen("../images/fondo.jpg");
        pMenu = new JPanel();
        pMenu.setSize(800, 600);
        pMenu.setLayout(null);
        pMenu.repaint();

        btnStart = new JButton("Start");
        btnStart.setLocation(325, 200);
        btnStart.setSize(120, 30);

        btnControls = new JButton("How to play");
        btnControls.setLocation(325, 260);
        btnControls.setSize(120, 30);

        btnHScores = new JButton("High Scores");
        btnHScores.setLocation(325, 320);
        btnHScores.setSize(120, 30);
        btnHScores.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                pMenu.setVisible(false);
                pHighScore.setVisible(true);
            }
        });
        
        btnSalir = new JButton("Salir");
        btnSalir.setLocation(325,380);
        btnSalir.setSize(120,30);
        btnSalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
////////////////////////////////////////////////////////////////////////////////
        imgScores = new Imagen("../images/high_scores.jpg");
        pHighScore = new JPanel();
        pHighScore.setSize(800,600);
        pHighScore.setLayout(null);
        pHighScore.repaint();
        
        
        btnRegresar = new JButton("Regresar");
        btnRegresar.setLocation(50,500);
        btnRegresar.setSize(120,30);
        btnRegresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                pMenu.setVisible(true);
                pHighScore.setVisible(false);
            }
        });
////////////////////////////////////////////////////////////////////////////////
               
        pMenu.add(btnStart);
        pMenu.add(btnControls);
        pMenu.add(btnHScores);
        pMenu.add(btnSalir);
        pMenu.add(imgInicio);
        
        pHighScore.add(btnRegresar);
        pHighScore.add(imgScores);
        
        this.add(pMenu);
        this.add(pHighScore);
        
        this.setVisible(true);
    }

}
