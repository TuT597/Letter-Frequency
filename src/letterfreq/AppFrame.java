package letterfreq;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class AppFrame extends JFrame {

    static String newText;

    private Application application;

    public AppFrame(Application application){
        this.application = application;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Character-Frequency");
        this.setSize(500, 500);
        this.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        JLabel countLabel = new JLabel("Text:");
        countLabel.setBounds(20, 20, 80, 25);
        panel.add(countLabel);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 50, 440, 300);
        textArea.setBorder(new LineBorder(Color.BLACK));
        textArea.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.BLACK),
                new EmptyBorder(3, 3, 3, 3)));
        textArea.setLineWrap(true); // Enable line wrap
        textArea.setWrapStyleWord(true); // Enable word wrap
        panel.add(textArea);

        JButton countButton = new JButton("Count");
        countButton.setBounds(20,370,100,30);
        countButton.addActionListener(e -> {
            newText = textArea.getText();
            GraphBuilder.BuildGraph();
        });
        panel.add(countButton);



        this.setVisible(true);
    }
}
