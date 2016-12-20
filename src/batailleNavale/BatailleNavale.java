package batailleNavale;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
import javax.swing.border.*;


public class BatailleNavale {
	private static JTextField fieldTailleGrille;
	private static JTextField fieldNomJ1;
	private static JTextField fieldNomJ2;

	public BatailleNavale() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
				
		  JFrame f = new JFrame("Bataille Navale");
		  f.getContentPane().setBackground(new Color(240, 255, 255));
	      f.setSize(200, 550);
		  f.pack();
	      f.setLocationRelativeTo(null);
	      
	      JPanel panelTailleGrille = new JPanel();
	      FlowLayout fl_panelTailleGrille = (FlowLayout) panelTailleGrille.getLayout();
	      fl_panelTailleGrille.setAlignment(FlowLayout.LEFT);
	      panelTailleGrille.setBackground(new Color(240, 255, 255));
	      
	      JTextArea txtNomJ1 = new JTextArea();
	      txtNomJ1.setBackground(new Color(240, 255, 255));
	      txtNomJ1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	      txtNomJ1.setText("Taille de la grille :");
	      panelTailleGrille.add(txtNomJ1);
	      
	      JTextPane textPane = new JTextPane();
	      panelTailleGrille.add(textPane);
	      				
	      fieldTailleGrille = new JTextField();
	      fieldTailleGrille.setBackground(new Color(224, 255, 255));
	      panelTailleGrille.add(fieldTailleGrille);
	      fieldTailleGrille.setColumns(10);
	      
	      JPanel panel_1 = new JPanel();
//	      FlowLayout flowLayout_2 = (FlowLayout) panel_1.getLayout();
	      panel_1.setBackground(new Color(240, 255, 255));
	      panel_1.setBorder(new LineBorder(new Color(176, 224, 230)));
	      panel_1.setForeground(new Color(72, 209, 204));
	      
	      JPanel pannelNomJ1 = new JPanel();
	      FlowLayout fl_pannelNomJ1 = (FlowLayout) pannelNomJ1.getLayout();
	      fl_pannelNomJ1.setAlignment(FlowLayout.LEFT);
	      pannelNomJ1.setBackground(new Color(240, 255, 255));
	      
	      JTextPane textPane_3 = new JTextPane();
	      pannelNomJ1.add(textPane_3);
	      
	      JTextPane nomJ1 = new JTextPane();
	      nomJ1.setEditable(false);
	      nomJ1.setText("Nom du joueur");
	      nomJ1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	      nomJ1.setBackground(new Color(240, 255, 255));
	      pannelNomJ1.add(nomJ1);
	      
	      JTextPane textPane_5 = new JTextPane();
	      pannelNomJ1.add(textPane_5);
	      
	      
	      JPanel panelGroup1JRB = new JPanel();
	      FlowLayout fl_panelGroup1JRB = (FlowLayout) panelGroup1JRB.getLayout();
	      fl_panelGroup1JRB.setAlignment(FlowLayout.LEFT);
	      panelGroup1JRB.setBackground(new Color(240, 255, 255));
	      
	      
	      JRadioButton jRB1Graphique = new JRadioButton("Joueur graphique");
	      jRB1Graphique.setBackground(new Color(240, 255, 255));
	      jRB1Graphique.setSelected(true);
	      JRadioButton jRB1Texte = new JRadioButton("Joueur texte");
	      jRB1Texte.setBackground(new Color(240, 255, 255));

	      jRB1Texte.setSelected(false);
	      JRadioButton jRB1JoueurAuto = new JRadioButton("Joueur auto");
	      jRB1JoueurAuto.setBackground(new Color(240, 255, 255));

	      jRB1JoueurAuto.setSelected(true);
	      
	      ButtonGroup groupButtonTypeJoueur1 = new ButtonGroup();
	      groupButtonTypeJoueur1.add(jRB1Graphique);
	      groupButtonTypeJoueur1.add(jRB1Texte);
	      groupButtonTypeJoueur1.add(jRB1JoueurAuto);
	      
	      panelGroup1JRB.add(jRB1Graphique);
	      panelGroup1JRB.add(jRB1Texte);
	      panelGroup1JRB.add(jRB1JoueurAuto);
	      
	      JPanel panelNomJ2 = new JPanel();
	      FlowLayout fl_panelNomJ2 = (FlowLayout) panelNomJ2.getLayout();
	      fl_panelNomJ2.setAlignment(FlowLayout.LEFT);
	      panelNomJ2.setBackground(new Color(240, 255, 255));
	      
	      JTextPane textPane_15 = new JTextPane();
	      panelNomJ2.add(textPane_15);
	      
	      JTextPane textPane_16 = new JTextPane();
	      textPane_16.setEditable(false);
	      textPane_16.setText("Nom du joueur");
	      textPane_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
	      textPane_16.setBackground(new Color(240, 255, 255));
	      panelNomJ2.add(textPane_16);
	      
	      JTextPane textPane_17 = new JTextPane();
	      panelNomJ2.add(textPane_17);
	      
	      fieldNomJ2 = new JTextField();
	      fieldNomJ2.setBackground(new Color(224, 255, 255));
	      fieldNomJ2.setColumns(10);
	      panelNomJ2.add(fieldNomJ2);
	      
	      JPanel panelGroup2JRB = new JPanel();
	      FlowLayout flowLayout = (FlowLayout) panelGroup2JRB.getLayout();
	      flowLayout.setAlignment(FlowLayout.LEFT);
	      panelGroup2JRB.setBackground(new Color(240, 255, 255));
	      
	      JRadioButton jRB2Graphique = new JRadioButton("Joueur graphique");
	      jRB2Graphique.setBackground(new Color(240, 255, 255));
	      jRB2Graphique.setSelected(true);
	      JRadioButton jRB2JoueurTexte = new JRadioButton("Joueur texte");
	      jRB2JoueurTexte.setBackground(new Color(240, 255, 255));
	      jRB2JoueurTexte.setSelected(false);
	      JRadioButton jRB2JoueurAuto = new JRadioButton("Joueur auto");
	      jRB2JoueurAuto.setBackground(new Color(240, 255, 255));
	      jRB2JoueurAuto.setSelected(false);
	      
	      ButtonGroup groupButtonTypeJoueur2 = new ButtonGroup();
	      groupButtonTypeJoueur2.add(jRB2Graphique);
	      groupButtonTypeJoueur2.add(jRB2JoueurTexte);
	      groupButtonTypeJoueur2.add(jRB2JoueurAuto);
	      
	      panelGroup2JRB.add(jRB2Graphique);
	      panelGroup2JRB.add(jRB2JoueurTexte);
	      panelGroup2JRB.add(jRB2JoueurAuto);

	      
	      JTextPane textPane_18 = new JTextPane();
	      panelGroup2JRB.add(textPane_18);
	      
	      JTextPane textPane_19 = new JTextPane();
	      panelGroup2JRB.add(textPane_19);
	      
	      JButton btnLancerLaPartie = new JButton("Lancer la partie");
	      btnLancerLaPartie.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      	if (jRB1Graphique.isSelected()) {
	      		JFrame jGraphique = new FenetreJoueur(fieldNomJ1.getText(), Integer.parseInt(fieldTailleGrille.getText()));
	      		jGraphique.setVisible(true);
	      		jGraphique.pack();
	      		jGraphique.setVisible(false);
			}
	      	
	      	if(jRB1Texte.isSelected()){
	      		
	
	      		
	      		
	      		int tabNavire[] = {1};
	      		GrilleNavale grilleJText = new GrilleNavale(Integer.parseInt(fieldTailleGrille.getText()), tabNavire);
	      		JoueurTexte jTexte = new JoueurTexte(grilleJText, fieldNomJ1.getText());
	      		
	      	}
	
	      	
	      	}
	      });
	      btnLancerLaPartie.setBackground(new Color(224, 255, 255));
	      btnLancerLaPartie.setFont(new Font("Tahoma", Font.PLAIN, 13));
	      
	      JPanel panel_2 = new JPanel();
	      panel_2.setForeground(new Color(240, 255, 255));
	      panel_2.setBorder(new LineBorder(new Color(176, 224, 230)));
	      panel_2.setBackground(new Color(240, 255, 255));
	      
	      JPanel panelSetup = new JPanel();
	      panelSetup.setForeground(new Color(240, 255, 255));
	      panelSetup.setBorder(new LineBorder(new Color(176, 224, 230)));
	      panelSetup.setBackground(new Color(240, 255, 255));
	      

	      
	      GroupLayout groupLayout = new GroupLayout(f.getContentPane());
	      groupLayout.setHorizontalGroup(
	      	groupLayout.createParallelGroup(Alignment.LEADING)
	      		.addGroup(groupLayout.createSequentialGroup()
	      			.addContainerGap()
	      			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	      				.addComponent(panelTailleGrille, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
	      				.addComponent(panelGroup2JRB, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
	      				.addGroup(groupLayout.createSequentialGroup()
	      					.addGap(148)
	      					.addComponent(btnLancerLaPartie))
	      				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
	      				.addComponent(pannelNomJ1, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
	      				.addComponent(panelNomJ2, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
	      				.addGroup(groupLayout.createSequentialGroup()
	      					.addComponent(panelGroup1JRB, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
	      					.addGap(18)
	      					.addComponent(panelSetup, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
	      				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
	      			.addGap(489))
	      );
	      groupLayout.setVerticalGroup(
	      	groupLayout.createParallelGroup(Alignment.TRAILING)
	      		.addGroup(groupLayout.createSequentialGroup()
	      			.addComponent(panelTailleGrille, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      			.addPreferredGap(ComponentPlacement.RELATED)
	      			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      			.addGap(14)
	      			.addComponent(pannelNomJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      			.addGap(12)
	      			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
	      				.addComponent(panelSetup, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
	      				.addComponent(panelGroup1JRB, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
	      			.addGap(18)
	      			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      			.addPreferredGap(ComponentPlacement.UNRELATED)
	      			.addComponent(panelNomJ2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
	      			.addPreferredGap(ComponentPlacement.UNRELATED)
	      			.addComponent(panelGroup2JRB, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
	      			.addPreferredGap(ComponentPlacement.RELATED)
	      			.addComponent(btnLancerLaPartie)
	      			.addGap(22))
	      );
	      
	      JSplitPane splitPane = new JSplitPane();
	      splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
	      panelSetup.add(splitPane);
	      
	      JToggleButton tglbtnPlacementAuto = new JToggleButton("Placement Auto.");
	      splitPane.setLeftComponent(tglbtnPlacementAuto);
	      
	      JButton btnAjouterDesNavires = new JButton("Ajouter des navires");
	      btnAjouterDesNavires.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		
	      		JFrame fenetreConfNavires = new JFrame();
	      		fenetreConfNavires.getContentPane().setBackground(new Color(240, 255, 255));
	      		fenetreConfNavires.setSize(300, 450);
			  	f.pack();
			  	fenetreConfNavires.setLocationRelativeTo(null);
//	      		

	      		//populate your frames with stuff
			  	
			  	

	      		f.setVisible(false);
	      		fenetreConfNavires.setVisible(true);
	      		
	      		JButton btnConfOK = new JButton(" OK ");
	      		fenetreConfNavires.getContentPane().add(btnConfOK);
	      		
	      		btnConfOK.addActionListener(new ActionListener() {
	    	      	public void actionPerformed(ActionEvent e) {

	    	      		fenetreConfNavires.dispose();
//	      		      EnglishFrame eng = new EnglishFrame();
	      		      f.setVisible(true);
	      		  }
	      		});
	      		
	       		btnConfOK.setBackground(new Color(224, 255, 255));
	      		btnConfOK.setFont(new Font("Tahoma", Font.PLAIN, 13));
	      		
	   
	      		
	      	}
	      });
	      
	      splitPane.setRightComponent(btnAjouterDesNavires);
	      
	      JTextPane txtpnJoueur_1 = new JTextPane();
	      txtpnJoueur_1.setText("Joueur 2");
	      txtpnJoueur_1.setFont(new Font("Dialog", Font.PLAIN, 13));
	      txtpnJoueur_1.setEditable(false);
	      txtpnJoueur_1.setBackground(new Color(240, 255, 255));
	      panel_2.add(txtpnJoueur_1);
	      
	      JTextPane txtpnJoueur = new JTextPane();
	      txtpnJoueur.setEditable(false);
	      txtpnJoueur.setText("Joueur 1");
	      txtpnJoueur.setFont(new Font("Dialog", Font.PLAIN, 13));
	      txtpnJoueur.setBackground(new Color(240, 255, 255));
	      panel_1.add(txtpnJoueur);
	      
	      fieldNomJ1 = new JTextField();
	      fieldNomJ1.setBackground(new Color(224, 255, 255));
	      pannelNomJ1.add(fieldNomJ1);
	      fieldNomJ1.setColumns(10);
	      f.getContentPane().setLayout(groupLayout);
	      f.pack();
	      f.setVisible(true);
	  
	}
}