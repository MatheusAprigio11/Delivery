package Screens;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class LoginScreen extends JFrame {

    private BufferedImage imagemDeFundo;

    public LoginScreen() {
        // Carregando a imagem de fundo
        try {
            imagemDeFundo = ImageIO.read(new File("/images/GILogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Configurando o JFrame
        setTitle("JFrame com Imagem de Fundo");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Adicionando um JPanel personalizado com a imagem de fundo
        JPanel painelComImagem = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagemDeFundo, 0, 0, getWidth(), getHeight(), this);
            }
        };

        setContentPane(painelComImagem);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginScreen frame = new LoginScreen();
            frame.setVisible(true);
        });
    }
}