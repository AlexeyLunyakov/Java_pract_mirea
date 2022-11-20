package git.old_pr.pr4_done;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_lab4 extends JFrame{
    private JPanel mainbackgr;
    private JButton ACMButton;
    private JButton RlMaButton;
    private JLabel lastScorerLabel;
    private JLabel resLabel;
    private JLabel winLabel;

    private int mil = 0, rea = 0;

    private GUI_lab4(){
        setContentPane(mainbackgr);
        setSize(500, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        ACMButton.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mil++;
                upd("AC Milan");
            }

        });
        RlMaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rea++;
                upd("Real Madrid");
            }
        });
    }

    private void upd(String last){
        lastScorerLabel.setText("Last Scorer: " + last);
        resLabel.setText("Result: " + mil + " X " + rea);
        String w = "DRAW";
        if(mil > rea)
            w = "AC Milan";
        else if (rea > mil)
            w = "Real Madrid";
        winLabel.setText("Winner: " + w);
    }

    public static void main(String[] args) {
        new GUI_lab4();
    }

}
