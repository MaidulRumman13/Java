package Maidul2;

// Java program to implement
// a Simple Registration Form
// using Java Swing
import java.lang.String.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
        extends JFrame
        implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;

    private JLabel camp;
    private JRadioButton city;
    private JRadioButton parmanent;
    private ButtonGroup campgp;

    private JLabel id;
    private JTextField idfield;

    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;

    private JLabel Seme;
    private JComboBox seme;

    private JLabel cal;
    private JCheckBox Cal, Cal1, Cal2, Cal3, Cal4, Cal5, Cal6;

    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;

    private String semester[]
            = {"Summer", "Spring", "Fall"};

    private String day[]
            = {"Saturday", "Sunday", "Monday", "Tuesday",
                "Wednesday", "Thrusday", "Friday"};

    // constructor, to initialize the components
    // with default values.
    public MyFrame() {
        setTitle("Registration Form");
        // Set the window boundaries to be 900x700 on the screen,
        // and position it 60 pixels from the top and 300 px from the left edges of the monitor.
        setBounds(300, 60, 950, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        id = new JLabel("ID");
        id.setFont(new Font("Arial", Font.PLAIN, 20));
        id.setSize(100, 20);
        id.setLocation(100, 150);
        c.add(id);

        idfield = new JTextField();
        idfield.setFont(new Font("Arial", Font.PLAIN, 15));
        idfield.setSize(190, 20);
        idfield.setLocation(200, 150);
        c.add(idfield);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        Seme = new JLabel("Semester");
        Seme.setFont(new Font("Arial", Font.PLAIN, 20));
        Seme.setSize(100, 20);
        Seme.setLocation(100, 250);
        c.add(Seme);

        seme = new JComboBox(semester);
        seme.setFont(new Font("Arial", Font.PLAIN, 15));
        seme.setSize(100, 20);
        seme.setLocation(200, 250);
        c.add(seme);

        cal = new JLabel("Class");
        cal.setFont(new Font("Arial", Font.PLAIN, 20));
        cal.setSize(100, 20);
        cal.setLocation(100, 300);
        c.add(cal);

        Cal = new JCheckBox("Sat");
        Cal.setFont(new Font("Arial", Font.PLAIN, 15));
        Cal.setSize(150, 25);
        Cal.setLocation(100, 325);
        c.add(Cal);

        Cal1 = new JCheckBox("Sun");
        Cal1.setFont(new Font("Arial", Font.PLAIN, 15));
        Cal1.setSize(150, 25);
        Cal1.setLocation(250, 325);
        c.add(Cal1);

        Cal2 = new JCheckBox("Mon");
        Cal2.setFont(new Font("Arial", Font.PLAIN, 15));
        Cal2.setSize(150, 25);
        Cal2.setLocation(100, 350);
        c.add(Cal2);

        Cal3 = new JCheckBox("Tue");
        Cal3.setFont(new Font("Arial", Font.PLAIN, 15));
        Cal3.setSize(150, 25);
        Cal3.setLocation(250, 350);
        c.add(Cal3);

        Cal4 = new JCheckBox("Wed");
        Cal4.setFont(new Font("Arial", Font.PLAIN, 15));
        Cal4.setSize(150, 25);
        Cal4.setLocation(100, 375);
        c.add(Cal4);

        Cal5 = new JCheckBox("Thu");
        Cal5.setFont(new Font("Arial", Font.PLAIN, 15));
        Cal5.setSize(150, 25);
        Cal5.setLocation(250, 375);
        c.add(Cal5);

        Cal6 = new JCheckBox("Fri");
        Cal6.setFont(new Font("Arial", Font.PLAIN, 15));
        Cal6.setSize(150, 25);
        Cal6.setLocation(100, 400);
        c.add(Cal6);

        camp = new JLabel("Campus");
        camp.setFont(new Font("Arial", Font.PLAIN, 20));
        camp.setSize(100, 20);
        camp.setLocation(100, 450);
        c.add(camp);

        city = new JRadioButton("City Campus");
        city.setFont(new Font("Arial", Font.PLAIN, 15));
        city.setSelected(true);
        city.setSize(75, 20);
        city.setLocation(200, 450);
        c.add(city);

        parmanent = new JRadioButton("Parmanent Campus");
        parmanent.setFont(new Font("Arial", Font.PLAIN, 15));
        parmanent.setSelected(false);
        parmanent.setSize(80, 20);
        parmanent.setLocation(275, 450);
        c.add(parmanent);

        campgp = new ButtonGroup();
        campgp.add(city);
        campgp.add(parmanent);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 485);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 520);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 520);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(400, 500);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 570);
        c.add(res);

        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                        = "Name : "
                        + tname.getText() + "\n"
                        + "ID : "
                        + idfield.getText() + "\n";
                if (male.isSelected()) {
                    data1 = "Gender : Male"
                            + "\n";
                } else {
                    data1 = "Gender : Female"
                            + "\n";
                }
                String data2
                        = "Semester : "
                        + (String) seme.getSelectedItem()
                        + "\n";

                String data4 = null, data5 = null, data6 = null, data7 = null, data8 = null, data9 = null, data10 = null, data11;

                String[]DataCal = new String[7];

                if (Cal.isSelected()) {
                    data4 = "Sat"+" " ;
                    DataCal[0] = data4;
                }
                if (Cal1.isSelected()) {
                    data5 = "Sun"+" " ;
                    DataCal[1] = data5;
                }
                if (Cal2.isSelected()) {
                    data6 = "Mon"+" " ;
                    DataCal[2] = data6;
                }
                if (Cal3.isSelected()) {
                    data7 = "Tue"+" " ;
                    DataCal[3] = data7;
                }
                if (Cal4.isSelected()) {
                    data8 = "Wed"+" " ;
                    DataCal[4] = data8;
                }
                if (Cal5.isSelected()) {
                    data9 = "Thu"+" " ;
                    DataCal[5] = data9;
                }
                if (Cal6.isSelected()) {
                    data10 = "Fri";
                    DataCal[6] = data10;
                }

                String ClassD = "Class Day: ";
                for (int i = 0; i < DataCal.length; i++) {
                    if (DataCal[i] != null) {
                        ClassD = ClassD.concat(DataCal[i]);
                    }
                }

                if (male.isSelected()) {
                    data11 = "\nCampus : City Campus"
                            + "\n";
                } else {
                    data11 = "\nCampus : Parmanent Campus"
                            + "\n";
                }
                
                
                tout.setText(data + data1 + data2 + ClassD + data11);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            } else {
                tout.setText("");
                res.setText("Please accept the"
                        + " terms & conditions..");
            }
        } else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            Cal.setSelected(false);
            Cal1.setSelected(false);
            Cal2.setSelected(false);
            Cal3.setSelected(false);
            Cal4.setSelected(false);
            Cal5.setSelected(false);
            Cal6.setSelected(false);
            seme.setSelectedIndex(0);

        }
    }
}

// Driver Code
class Registration {

    public static void main(String[] args) throws Exception {
        MyFrame f = new MyFrame();
    }
}
