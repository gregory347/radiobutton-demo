import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame {
    private JRadioButton birdButton;
    private JRadioButton catButton;
    private JRadioButton dogButton;
    private JRadioButton rabbitButton;
    private JRadioButton pigButton;
    private ButtonGroup group;
    private JLabel petLabel;
    private JLabel petImageLabel;

    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setLayout(new BorderLayout());

        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        JPanel radioPanel = new JPanel(new GridLayout(5, 1));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);

        add(radioPanel, BorderLayout.WEST);

        petLabel = new JLabel();
        petLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(petLabel, BorderLayout.NORTH);

        petImageLabel = new JLabel();
        petImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(petImageLabel, BorderLayout.CENTER);

        birdButton.addActionListener(new PetActionListener());
        catButton.addActionListener(new PetActionListener());
        dogButton.addActionListener(new PetActionListener());
        rabbitButton.addActionListener(new PetActionListener());
        pigButton.addActionListener(new PetActionListener());

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class PetActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String pet = "No pet";
            String petImage = null;
            if (birdButton.isSelected()) {
                pet = "Bird";
                petImage = "C:\\Users\\User\\OneDrive\\Desktop\\assignment 2\\pexels-70588695-21567511.jpg";
            } else if (catButton.isSelected()) {
                pet = "Cat";
                petImage = "C:\\Users\\User\\OneDrive\\Desktop\\assignment 2\\pexels-kmerriman-20787.jpg";
            } else if (dogButton.isSelected()) {
                pet = "Dog";
                petImage = "C:\\Users\\User\\OneDrive\\Desktop\\assignment 2\\pexels-krystian-beben-603997-1404727.jpg";
            } else if (rabbitButton.isSelected()) {
                pet = "Rabbit";
                petImage = "C:\\Users\\User\\OneDrive\\Desktop\\assignment 2\\pexels-smpicturez-4001296.jpg";
            } else if (pigButton.isSelected()) {
                pet = "Pig";
                petImage = "C:\\Users\\User\\OneDrive\\Desktop\\assignment 2\\pexels-mali-110820.jpg";
            }

            petLabel.setText(pet);

            if (petImage != null) {
                ImageIcon petIcon = new ImageIcon(petImage);
                petImageLabel.setIcon(petIcon);
            } else {
                petImageLabel.setIcon(null);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RadioButtonDemo::new);
    }
}
