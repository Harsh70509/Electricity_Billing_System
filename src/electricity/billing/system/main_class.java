package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {

    String acctype;
    String meter_pass;

    main_class(String acctype, String meter_pass){
        this.acctype = acctype;
        this.meter_pass = meter_pass;
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/ebs.png"));
        Image image = imageIcon.getImage().getScaledInstance(1530,830,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(image);
        JLabel imageLabel = new JLabel(imageIcon2);
        add(imageLabel);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Menu");
        menu.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("serif",Font.PLAIN,14));
        ImageIcon customerImg = new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.png"));
        Image customerImage = customerImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(customerImage));
        newcustomer.addActionListener(this);
        menu.add(newcustomer);

        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("serif",Font.PLAIN,14));
        ImageIcon customerdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/customerDetails.png"));
        Image customerdetailsImage = customerdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(customerdetailsImage));
        customerdetails.addActionListener(this);
        menu.add(customerdetails);

        JMenuItem depositedetails = new JMenuItem("Deposite Details");
        depositedetails.setFont(new Font("serif",Font.PLAIN,14));
        ImageIcon depositedetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/depositdetails.png"));
        Image depositedetailsImage = depositedetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        depositedetails.setIcon(new ImageIcon(depositedetailsImage));
        depositedetails.addActionListener(this);
        menu.add(depositedetails);

        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("serif",Font.PLAIN,14));
        ImageIcon calculatebillImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculatorbills.png"));
        Image calculatebillImage = calculatebillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(calculatebillImage));
        calculatebill.addActionListener(this);
        menu.add(calculatebill);

        JMenu info = new JMenu("Information");
        info.setFont(new Font("serif",Font.PLAIN,15));

        JMenuItem upinfo = new JMenuItem("Update Information");
        upinfo.setFont(new Font("serif",Font.PLAIN,14));
        ImageIcon upinfoImg = new ImageIcon(ClassLoader.getSystemResource("icon/refresh.png"));
        Image upinfoImage = upinfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        upinfo.setIcon(new ImageIcon(upinfoImage));
        upinfo.addActionListener(this);
        info.add(upinfo);

        JMenuItem viewinfo = new JMenuItem("View Information");
        viewinfo.setFont(new Font("serif",Font.PLAIN,14));
        ImageIcon viewinfoImg = new ImageIcon(ClassLoader.getSystemResource("icon/information.png"));
        Image viewinfoImage = viewinfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        viewinfo.setIcon(new ImageIcon(viewinfoImage));
        viewinfo.addActionListener(this);
        info.add(viewinfo);

        JMenu user = new JMenu("User");
        user.setFont(new Font("serif",Font.PLAIN,15));

        JMenuItem paybill = new JMenuItem("Pay Bill");
        paybill.setFont(new Font("serif",Font.PLAIN,14));
        ImageIcon paybillImg = new ImageIcon(ClassLoader.getSystemResource("icon/pay.png"));
        Image paybillImage = paybillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(paybillImage));
        paybill.addActionListener(this);
        user.add(paybill);

        JMenuItem billdetails = new JMenuItem("Bill Details");
        billdetails.setFont(new Font("serif",Font.PLAIN,14));
        ImageIcon billdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/detail.png"));
        Image billdetailsImage = billdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(billdetailsImage));
        billdetails.addActionListener(this);
        user.add(billdetails);

        JMenu bill = new JMenu("Bill");
        bill.setFont(new Font("serif",Font.PLAIN,15));

        JMenuItem genBill = new JMenuItem("Generate Bill");
        genBill.setFont(new Font("serif",Font.PLAIN,14));
        ImageIcon genBillImg = new ImageIcon(ClassLoader.getSystemResource("icon/bill.png"));
        Image genBillImage = genBillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        genBill.setIcon(new ImageIcon(genBillImage));
        genBill.addActionListener(this);
        bill.add(genBill);

        JMenu utility = new JMenu("Utility");
        utility.setFont(new Font("serif",Font.PLAIN,15));

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setFont(new Font("serif",Font.PLAIN,14));
        ImageIcon notepadImg = new ImageIcon(ClassLoader.getSystemResource("icon/notepad.png"));
        Image notepadImage = notepadImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(notepadImage));
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("serif",Font.PLAIN,14));
        ImageIcon calculatorImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculator.png"));
        Image calculatorImage = calculatorImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calculatorImage));
        calculator.addActionListener(this);
        utility.add(calculator);

        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("serif",Font.PLAIN,15));


        JMenuItem eexit = new JMenuItem("Exit");
        eexit.setFont(new Font("serif",Font.PLAIN,14));
        ImageIcon eexitImg = new ImageIcon(ClassLoader.getSystemResource("icon/exit.png"));
        Image eexitImage = eexitImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        eexit.setIcon(new ImageIcon(eexitImage));
        eexit.addActionListener(this);
        exit.add(eexit);

        if(acctype.equals("Admin")){
            menuBar.add(menu);
        }
        else{
            menuBar.add(bill);
            menuBar.add(user);
            menuBar.add(info);
        }
        menuBar.add(utility);
        menuBar.add(exit);


        setLayout(new FlowLayout());
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if(msg.equals("New Customer")){
            new newCustomer();
        } else if (msg.equals("Customer Details")) {
            new customer_details();
        } else if (msg.equals("Deposite Details")) {
            new deposite_details();
        } else if (msg.equals("Calculate Bill")) {
            new calculate_bill();
        } else if (msg.equals("View Information")) {
            new view_information(meter_pass);
        }
    }

    public static void main(String[] args) {
        new main_class("","");
    }
}
