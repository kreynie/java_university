import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ShapeApp {
    private static JPanel shapePanel;
    private static Timer animationTimer;
    private static int animationStep = 0;
    private static int animationDirection = 1;

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Random Shapes");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);
        mainFrame.setLayout(new BorderLayout());

        shapePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random rand = new Random();
                for (int i = 0; i < 20; i++) {
                    int x = rand.nextInt(getWidth());
                    int y = rand.nextInt(getHeight());
                    int width = rand.nextInt(100) + 20;
                    int height = rand.nextInt(100) + 20;
                    Color randomColor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
                    Shape shape;
                    if (rand.nextBoolean()) {
                        shape = new Ellipse2D.Double(x, y, width, height);
                    } else {
                        shape = new Rectangle2D.Double(x, y, width, height);
                    }
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setColor(randomColor);
                    g2d.fill(shape);
                }
            }
        };

        JPanel controlPanel = getjPanel(mainFrame);

        mainFrame.add(controlPanel, BorderLayout.SOUTH);
        mainFrame.add(shapePanel, BorderLayout.CENTER);

        mainFrame.setVisible(true);
    }

    private static JPanel getjPanel(JFrame mainFrame) {
        JButton openImageBtn = getjButton(mainFrame);

        JButton animateBtn = new JButton("Animate");
        animateBtn.addActionListener(e -> {
            if (animationTimer == null) {
                animationStep = 0;
                animationDirection = 1;
                animationTimer = new Timer(50, e1 -> animateShapes());
                animateBtn.setText("Stop Animation");
                animationTimer.start();
            } else {
                animationTimer.stop();
                animateBtn.setText("Animate");
                animationTimer = null;
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(openImageBtn);
        controlPanel.add(animateBtn);
        return controlPanel;
    }

    private static JButton getjButton(JFrame mainFrame) {
        JButton openImageBtn = new JButton("Open Image");
        openImageBtn.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                BufferedImage image;
                try {
                    image = ImageIO.read(selectedFile);
                    ImageIcon icon = new ImageIcon(image);
                    JLabel imageLabel = new JLabel(icon);
                    mainFrame.getContentPane().removeAll();
                    mainFrame.getContentPane().add(imageLabel, BorderLayout.CENTER);
                    mainFrame.revalidate();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        return openImageBtn;
    }

    private static void animateShapes() {
        animationStep += animationDirection;
        if (animationStep >= 50 || animationStep <= 0) {
            animationDirection *= -1;
        }
        shapePanel.repaint();
    }
}
