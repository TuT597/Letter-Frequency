package letterfreq;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class GraphBuilder extends JFrame {

    private static final HashMap<Character, Integer> map = Counter.count(AppFrame.newText);

    public static void BuildGraph() {
        JFrame frame2 = new JFrame();
        frame2.setSize(500,500);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setTitle("Character-Frequency");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        frame2.add(panel);

        JTable table = new JTable(getTableModel());
        table.setFont(table.getFont().deriveFont(Font.PLAIN, 22));
        table.setRowHeight(30);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        frame2.setVisible(true);
    }

    private static DefaultTableModel getTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Character");
        model.addColumn("Frequency");

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            model.addRow(new Object[]{entry.getKey(), entry.getValue()});
        }

        return model;
    }
}
