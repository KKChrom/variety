package techlab_sam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator implements ActionListener {
	private JButton add;
	private JButton sub;
	private JButton mul;
	private JButton div;
	private JButton show;
	private JButton mod;
	static double total;
	static double modt;

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// System.out.print("Enter your string: ");
		// String org = in.nextLine();

		JPanel jp = new JPanel();
		JFrame jf = new JFrame();
		JButton add = new JButton();
		JButton sub = new JButton();
		JButton div = new JButton();
		JButton mul = new JButton();
		JButton mod = new JButton();
		JButton show = new JButton();

		jf.add(jp);
		jp.add(add);
		jp.add(sub);
		jp.add(mul);
		jp.add(div);
		jp.add(mod);
		jp.add(show);
		mod.setText("Mod");
		mul.setText("Multiply");
		div.setText("Divide");
		sub.setText("Subtract");
		add.setText("Add");
		show.setText("Total");

		show.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				show();

			}

		});

		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				add();

			}

		});
		sub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				subtract();

			}

		});
		mul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Multiply();

			}

		});
		div.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				divide();

			}

		});
		mod.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mod();

			}

		});

		jf.pack();
		jf.setVisible(true);

		// Scanner in = new Scanner(System.in);
		// System.out.print("Enter your command: ");
		// String org = in.nextLine();
		// if(org.toLowerCase().equals("add"))
		// {
		// add();
		// System.out.println("Your total after this is: "+total);
		//
		// }
		// else if(org.toLowerCase().equals("subtract"))
		// {
		// subtract();
		// System.out.println("Your total after this is: "+total);
		//
		// }
		// else if( org.toLowerCase().equals("multiply"))
		// {
		// Multiply();
		// System.out.println("Your total after this is: "+total);
		//
		// }
		// else if(org.toLowerCase().equals("divide"))
		// {
		// divide();
		// System.out.println("Your total after this is: "+total);
		// }
		// else if(org.toLowerCase().equals("mod"))
		// {
		// mod();
		// System.out.println("Your total after this is(your normal total wasnt
		// changed): "+modt);
		// }

	}

	public static void show() {
		System.out.println("Your total is: " + total);
	}

	public static void add() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your number: ");
		String org = in.nextLine();
		double numc = Double.parseDouble(org);
		total += numc;
		System.out.println("Your total is " + total);

	}

	public static void subtract() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your number: ");
		String org = in.nextLine();
		double numc = Double.parseDouble(org);
		total -= numc;
		System.out.println("Your total is " + total);
	}

	public static void Multiply() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your number: ");
		String org = in.nextLine();
		double numc = Double.parseDouble(org);
		total *= numc;
		System.out.println("Your total is " + total);

	}

	public static void divide() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your number: ");
		String org = in.nextLine();
		double numc = Double.parseDouble(org);

		total /= numc;
		System.out.println("Your total is " + total);

	}

	public static void mod() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your number: ");
		String org = in.nextLine();
		double numc = Double.parseDouble(org);
		modt = total;
		modt %= numc;
		System.out.println("Your total is(normal total not affected) " + modt);
	}

	public void init() {
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				add();

			}

		});
		sub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				subtract();

			}

		});
		mul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Multiply();

			}

		});
		div.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				divide();

			}

		});
		mod.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mod();

			}

		});
		// if(e.getSource() == add)
		// {
		// add();
		// }
		// else if(e.getSource() == sub)
		// {
		// subtract();
		// }
		// else if(e.getSource() == mul)
		// {
		// Multiply();
		// }
		// else if(e.getSource() == div)
		// {
		// divide();
		// }
		// else if(e.getSource() == mod)
		// {
		// mod();
		// }
		// }

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
