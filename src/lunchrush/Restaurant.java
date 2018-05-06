package lunchrush;

import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Restaurant extends JFrame {
    
        //Declaraciones
        Imagen imgInicio;
        Imagen imgScores;
        Imagen imgRestaurant;
        
        //ImageIcon imgTable;
        ImageIcon iconTable;
        Imagen imgTable;
        
        JPanel pMenu;
        JPanel pHighScore;
        JPanel pLvlOne;
        
        JButton btnStart;
        JButton btnControls;
        JButton btnHScores;
        JButton btnSalir;
        JButton btnRegresar;
        
        JButton btnWaitres;
        JButton btnTable;
         
        JButton btnTable1;
        JButton btnTable2;
        JButton btnTable3;
        JButton btnTable4;
        
    //Constructor
    public Restaurant() {
        this.setTitle("Lunch & Rush");
        this.setDefaultCloseOperation(3);
        this.setSize(800, 600);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        GUI();
    }

    //Metodo Grafico
    public void GUI() {
////////////////////////////////////////////////////////////////////////////////
        imgInicio = new Imagen("../images/fondo.jpg");
        pMenu = new JPanel();
        pMenu.setSize(800, 600);
        pMenu.setLayout(null);

        btnStart = new JButton("Start");
        btnStart.setLocation(325, 200);
        btnStart.setSize(120, 30);
        btnStart.addMouseListener(new MouseAdapter() {   
            @Override
            public void mouseClicked(MouseEvent e){
                pMenu.setVisible(false);
                pHighScore.setVisible(false);
                pLvlOne.setVisible(true);
                
            }
        });

        btnControls = new JButton("How to play");
        btnControls.setLocation(325, 260);
        btnControls.setSize(120, 30);

        btnHScores = new JButton("High Scores");
        btnHScores.setLocation(325, 320);
        btnHScores.setSize(120, 30);
        btnHScores.addMouseListener(new MouseAdapter() {   
            @Override
            public void mouseClicked(MouseEvent e){
                pMenu.setVisible(false);
                pHighScore.setVisible(true);
            }
        });
 
        btnSalir = new JButton("Salir");
        btnSalir.setLocation(325,380);
        btnSalir.setSize(120,30);
        btnSalir.addMouseListener(new MouseAdapter() {   
            @Override
            public void mouseClicked(MouseEvent e){
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
        btnRegresar.addMouseListener(new MouseAdapter() {   
            @Override
            public void mouseClicked(MouseEvent e){
                pMenu.setVisible(true);
                pHighScore.setVisible(false);
                pLvlOne.setVisible(false);
            }
        });
////////////////////////////////////////////////////////////////////////////////
    imgRestaurant = new Imagen("../images/Background.jpg");
    pLvlOne = new JPanel();
    pLvlOne.setSize(800,600);
    pLvlOne.setLayout(null);
    pLvlOne.setVisible(false);
    
    iconTable = new ImageIcon(getClass().getResource("../images/table2.png"));
    
    btnWaitres = new JButton();
    
    btnTable1 = new JButton(iconTable);
    btnTable1.setSize(180, 91);
    btnTable1.setLocation(250, 250);
    btnTable1.setBackground(new Color(0, 0, 0, 0));
    
    btnTable2 = new JButton(iconTable);
    btnTable2.setSize(180, 91);
    btnTable2.setLocation(500, 400);
    
    btnTable3 = new JButton(iconTable);
    btnTable3.setSize(180, 91);
    btnTable3.setLocation(250, 400);
    
    btnTable4 = new JButton(iconTable);
    btnTable4.setSize(180, 91);
    btnTable4.setLocation(500, 250);


////////////////////////////////////////////////////////////////////////////////
        pMenu.add(btnStart);
        pMenu.add(btnControls);
        pMenu.add(btnHScores);
        pMenu.add(btnSalir);
        pMenu.add(imgInicio);
        
        pHighScore.add(btnRegresar);
        pHighScore.add(imgScores);
        
        
        pLvlOne.add(btnRegresar);
        pLvlOne.add(btnTable1);
        pLvlOne.add(btnTable2);
        pLvlOne.add(btnTable3);
        pLvlOne.add(btnTable4);
        pLvlOne.add(imgRestaurant);
        
        this.add(pMenu);
        this.add(pHighScore);
        this.add(pLvlOne);
        
        this.setVisible(true);
    }

}
