package batailleNavale;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
import javax.swing.border.*;
import javax.swing.event.ChangeListener;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import javax.swing.event.ChangeEvent;


public class BatailleNavale {
	private static JTextField fieldTailleGrille;
	private static JTextField fieldNomJ1;
	private static JTextField fieldNomJ2;
	private static JTextField textFieldNav1;
	private static JTextField textFieldNav2;
	    
	public BatailleNavale() {
	}

	public static int[] convertIntegers(ArrayList<Integer> integers)
	{
	    int[] ret = new int[integers.size()];
	    Iterator<Integer> iterator = integers.iterator();
	    for (int i = 0; i < ret.length; i++)
	    {
	        ret[i] = iterator.next().intValue();
	    }
	    return ret;
	}
	
	
	public static void main(String[] args) {
				

		  ArrayList<Integer> nbNavAutoArray = new ArrayList<Integer>();
		  JFrame f = new JFrame("Bataille Navale");
		  		  
		  f.getContentPane().setSize(400, 900);
		  f.setBackground(new Color(240, 255, 255));
//		  f.size
		  
	      f.setSize(400, 900);
		  f.pack();
//	      f.setLocationRelativeTo(50);
		  f.setLocation(200, 200);
	      
	      JPanel panelTailleGrille = new JPanel();
	      FlowLayout fl_panelTailleGrille = (FlowLayout) panelTailleGrille.getLayout();
	      fl_panelTailleGrille.setAlignment(FlowLayout.LEFT);
	      panelTailleGrille.setBackground(new Color(240, 255, 255));
	      
	      JTextArea txtNomJ1 = new JTextArea();
	      txtNomJ1.setBackground(new Color(240, 255, 255));
	      txtNomJ1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	      txtNomJ1.setText("Taille de la grille :");
	      panelTailleGrille.add(txtNomJ1);
	      				
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
	      panelGroup2JRB.add(jRB2JoueurTexte);//	      splitPane.setRightComponent(btnAjouterDesNavires);

	      panelGroup2JRB.add(jRB2JoueurAuto);

	      
	      JTextPane textPane_18 = new JTextPane();
	      panelGroup2JRB.add(textPane_18);
	      
	      JTextPane textPane_19 = new JTextPane();
	      panelGroup2JRB.add(textPane_19);
	      
	      
	      
	      JPanel panel_2 = new JPanel();
	      panel_2.setForeground(new Color(240, 255, 255));
	      panel_2.setBorder(new LineBorder(new Color(176, 224, 230)));
	      panel_2.setBackground(new Color(240, 255, 255));
	      
	      JPanel panelSetupJ1 = new JPanel();
	      panelSetupJ1.setForeground(new Color(240, 255, 255));
	      panelSetupJ1.setBorder(new LineBorder(new Color(176, 224, 230)));
	      panelSetupJ1.setBackground(new Color(240, 255, 255));
	      
	      JInternalFrame jInternalFrameConfigurationFlotte = new JInternalFrame("Configuration de la flotte ds joueurs");
	      jInternalFrameConfigurationFlotte.setBackground(new Color(240, 255, 255));
	      jInternalFrameConfigurationFlotte.setSize(300, 450);
	      jInternalFrameConfigurationFlotte.pack();
//		  internalFrame.setLocationRelativeTo();
	      jInternalFrameConfigurationFlotte.setVisible(false);
	      

	      
	     
	      
	      JToggleButton tglbtnPlacementAuto = new JToggleButton("Placement Auto.");
	      
	      
	     	
	      JButton btnConfOk = new JButton(" OK ");
	      
	      JPanel panelConfAutoJ1 = new JPanel();
	      panelConfAutoJ1.setBackground(new Color(240, 255, 255));
	      
	      JPanel panelConfAutoJ2 = new JPanel();
	      panelConfAutoJ2.setBackground(new Color(240, 255, 255));
	      
	      JTextPane txtJ2 = new JTextPane();
	      txtJ2.setText("Joueur 2");
	      txtJ2.setBackground(new Color(240, 255, 255));
	      
	      JTextPane txtpnNavire2 = new JTextPane();
	      txtpnNavire2.setText("Navire "+(nbNavAutoArray.size()));
	      txtpnNavire2.setBackground(new Color(240, 255, 255));
	      
	      textFieldNav2 = new JTextField();
	      textFieldNav2.setColumns(10);
	      
	      JTextPane textPane_2 = new JTextPane();
	      textPane_2.setText("Nb navires:");
	      textPane_2.setBackground(new Color(240, 255, 255));
	      
	      JTextPane textPane_4 = new JTextPane();
	      textPane_4.setText("Longueur :");
	      textPane_4.setBackground(new Color(240, 255, 255));
	      
	      JSplitPane splitPane_1 = new JSplitPane();
	      
	      JButton btnAjouternNavireJ2 = new JButton(" + ");
	      splitPane_1.setLeftComponent(btnAjouternNavireJ2);
	      
	      JButton button_1 = new JButton(" - ");
	      splitPane_1.setRightComponent(button_1);
	      GroupLayout gl_panelConfAutoJ2 = new GroupLayout(panelConfAutoJ2);
	      gl_panelConfAutoJ2.setHorizontalGroup(
	      	gl_panelConfAutoJ2.createParallelGroup(Alignment.TRAILING)
	      		.addGap(0, 202, Short.MAX_VALUE)
	      		.addGroup(gl_panelConfAutoJ2.createSequentialGroup()
	      			.addGroup(gl_panelConfAutoJ2.createParallelGroup(Alignment.LEADING)
	      				.addGroup(gl_panelConfAutoJ2.createSequentialGroup()
	      					.addContainerGap()
	      					.addComponent(txtpnNavire2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      					.addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
	      					.addComponent(textFieldNav2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
	      				.addGroup(gl_panelConfAutoJ2.createSequentialGroup()
	      					.addContainerGap()
	      					.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
	      					.addComponent(textPane_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	      				.addGroup(gl_panelConfAutoJ2.createSequentialGroup()
	      					.addGap(45)
	      					.addComponent(splitPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	      				.addGroup(gl_panelConfAutoJ2.createSequentialGroup()
	      					.addContainerGap()
	      					.addComponent(txtJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	      			.addContainerGap())
	      );
	      gl_panelConfAutoJ2.setVerticalGroup(
	      	gl_panelConfAutoJ2.createParallelGroup(Alignment.LEADING)
	      		.addGap(0, 135, Short.MAX_VALUE)
	      		.addGroup(gl_panelConfAutoJ2.createSequentialGroup()
	      			.addComponent(txtJ2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      			.addGap(9)
	      			.addGroup(gl_panelConfAutoJ2.createParallelGroup(Alignment.LEADING)
	      				.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      				.addComponent(textPane_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	      			.addPreferredGap(ComponentPlacement.RELATED)
	      			.addGroup(gl_panelConfAutoJ2.createParallelGroup(Alignment.LEADING)
	      				.addComponent(txtpnNavire2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      				.addComponent(textFieldNav2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	      			.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
	      			.addComponent(splitPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      			.addContainerGap())
	      );
	      panelConfAutoJ2.setLayout(gl_panelConfAutoJ2);
	      
	      GroupLayout groupLayout_1 = new GroupLayout(jInternalFrameConfigurationFlotte.getContentPane());
	      groupLayout_1.setHorizontalGroup(
	      	groupLayout_1.createParallelGroup(Alignment.LEADING)
	      		.addGroup(groupLayout_1.createSequentialGroup()
	      			.addContainerGap()
	      			.addGroup(groupLayout_1.createParallelGroup(Alignment.LEADING)
	      				.addComponent(panelConfAutoJ1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
	      				.addComponent(tglbtnPlacementAuto))
	      			.addContainerGap(201, Short.MAX_VALUE))
	      		.addGroup(groupLayout_1.createSequentialGroup()
	      			.addContainerGap()
	      			.addComponent(panelConfAutoJ2, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
	      			.addContainerGap(201, Short.MAX_VALUE))
	      		.addGroup(Alignment.TRAILING, groupLayout_1.createSequentialGroup()
	      			.addContainerGap(187, Short.MAX_VALUE)
	      			.addComponent(btnConfOk)
	      			.addGap(166))
	      );
	      groupLayout_1.setVerticalGroup(
	      	groupLayout_1.createParallelGroup(Alignment.LEADING)
	      		.addGroup(groupLayout_1.createSequentialGroup()
	      			.addContainerGap()
	      			.addComponent(tglbtnPlacementAuto)
	      			.addPreferredGap(ComponentPlacement.RELATED)
	      			.addComponent(panelConfAutoJ1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
	      			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	      			.addComponent(panelConfAutoJ2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
	      			.addPreferredGap(ComponentPlacement.RELATED)
	      			.addComponent(btnConfOk)
	      			.addGap(6))
	      );
	      
	      JTextPane txtNbNav = new JTextPane();
	      txtNbNav.setBackground(new Color(240, 255, 255));
	      txtNbNav.setText("Nb navires:");
	      
	      JTextPane txtpnNavire1 = new JTextPane();
	      txtpnNavire1.setText("Navire "+(nbNavAutoArray.size()));
	      txtpnNavire1.setBackground(new Color(240, 255, 255));

	      textFieldNav1 = new JTextField();
	      textFieldNav1.setColumns(10);
	      
	      JSplitPane splitPane = new JSplitPane();
	      
	      JTextPane txtLgNav = new JTextPane();
	      txtLgNav.setText("Longueur :");
	      txtLgNav.setBackground(new Color(240, 255, 255));
	      
	      JTextPane txtJ1 = new JTextPane();
	      txtJ1.setText("Joueur 1");
	      txtJ1.setBackground(new Color(240, 255, 255));
	      
	      
	      GroupLayout gl_panelConfAutoJ1 = new GroupLayout(panelConfAutoJ1);
	      gl_panelConfAutoJ1.setHorizontalGroup(
	      	gl_panelConfAutoJ1.createParallelGroup(Alignment.TRAILING)
	      		.addGroup(gl_panelConfAutoJ1.createSequentialGroup()
	      			.addGroup(gl_panelConfAutoJ1.createParallelGroup(Alignment.LEADING)
	      				.addGroup(gl_panelConfAutoJ1.createSequentialGroup()
	      					.addContainerGap()
	      					.addComponent(txtpnNavire1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      					.addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
	      					.addComponent(textFieldNav1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
	      				.addGroup(gl_panelConfAutoJ1.createSequentialGroup()
	      					.addContainerGap()
	      					.addComponent(txtNbNav, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
	      					.addComponent(txtLgNav, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	      				.addGroup(gl_panelConfAutoJ1.createSequentialGroup()
	      					.addGap(45)
	      					.addComponent(splitPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	      				.addGroup(gl_panelConfAutoJ1.createSequentialGroup()
	      					.addContainerGap()
	      					.addComponent(txtJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	      			.addContainerGap())
	      );
	      gl_panelConfAutoJ1.setVerticalGroup(
	      	gl_panelConfAutoJ1.createParallelGroup(Alignment.LEADING)
	      		.addGroup(gl_panelConfAutoJ1.createSequentialGroup()
	      			.addComponent(txtJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      			.addGap(9)
	      			.addGroup(gl_panelConfAutoJ1.createParallelGroup(Alignment.LEADING)
	      				.addComponent(txtNbNav, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      				.addComponent(txtLgNav, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	      			.addPreferredGap(ComponentPlacement.RELATED)
	      			.addGroup(gl_panelConfAutoJ1.createParallelGroup(Alignment.LEADING)
	      				.addComponent(txtpnNavire1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      				.addComponent(textFieldNav1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	      			.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
	      			.addComponent(splitPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      			.addContainerGap())
	      );
	      
	      JButton btnAjouternNavireJ1 = new JButton(" + ");
	      
	      
//	      btnAjouternNavire.addChangeListener(new ChangeListener() {
//	      	public void stateChanged(ChangeEvent e) {
//	      	}
//	      });
	      
	      splitPane.setLeftComponent(btnAjouternNavireJ1);
	      
	      JButton btnSupprimerNavire = new JButton(" - ");
	      splitPane.setRightComponent(btnSupprimerNavire);
	      
	      panelConfAutoJ1.setLayout(gl_panelConfAutoJ1);
	      jInternalFrameConfigurationFlotte.getContentPane().setLayout(groupLayout_1);
	      
	      
	      JButton btnAddNaviresJ1 = new JButton("Ajouter des navires");
	      panelSetupJ1.add(btnAddNaviresJ1);
	      
	      btnAddNaviresJ1.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		
	      		if (!jInternalFrameConfigurationFlotte.isVisible()) {
		      		jInternalFrameConfigurationFlotte.setVisible(true);
		      		tglbtnPlacementAuto.setSelected(true);					
				}
	      		else{
		      		jInternalFrameConfigurationFlotte.setVisible(false);
	      		}

	      		
	      		
	            tglbtnPlacementAuto.addActionListener(new ActionListener() {
	    	      	public void actionPerformed(ActionEvent e) {
	    	      		
	    	      		
	    	      		// bug 
	    	     		if (tglbtnPlacementAuto.isSelected()) {

	    	      			panelConfAutoJ1.setVisible(true);
	    				}
	    	     		else{

	    	      			panelConfAutoJ1.setVisible(false);

	    	      		}
	    	     		
	    	      	}
	    	      });
	      		
	            btnAjouternNavireJ1.addActionListener(new ActionListener() {
	    	      	public void actionPerformed(ActionEvent e) {
		
	    	      		if (nbNavAutoArray.size() >= 0 && nbNavAutoArray.size() < 5) {
							
	    	      			nbNavAutoArray.add(Integer.parseInt(textFieldNav1.getText())); // ajout d'un élément dans la liste   	      		
	    	      			txtpnNavire1.setText("Navire "+(nbNavAutoArray.size()));	// maj affichage nbNavires
	    	      		}
	    	      		else{
	    	      			JOptionPane.showMessageDialog(btnAjouternNavireJ1, "Erreur: le nombre max \n de navire est de 5");
	    	      		}

	    	      	}
	    	      });

	      		//populate your frames with stuff
			  	
			  	
			  	
			  	
	      		
	      		btnConfOk.addActionListener(new ActionListener() {
	    	      	public void actionPerformed(ActionEvent e) {
	    	      			    	      		

	    	      		jInternalFrameConfigurationFlotte.dispose();
	    	      		f.setVisible(true);
	    	      		

	      		  }
	    	      	
	    	      	
	      		}); // fin event btnConfOK actionListener
	      		
	      		// debut de la Jframe de configuration de la flotte
	      		
  		      
	       		btnConfOk.setBackground(new Color(224, 255, 255));
	      		btnConfOk.setFont(new Font("Tahoma", Font.PLAIN, 13));
	      		
	   
	      		// 	fin de la Jframe de configuration de la flotte
	      	}
	      }); // fin event btnAjouterDesNavires actionListener
	      
	      
	     
	      
	      JButton btnLancerLaPartie = new JButton("Lancer la partie");
	      btnLancerLaPartie.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		
	      	// conversion intergerArray en tableau de int
	      	int tabNavAuto[] = convertIntegers(nbNavAutoArray);
	      		
	      	if (jRB1Graphique.isSelected()) {
	      		System.out.println("jgraphique");
	      		JFrame j1Gra = new FenetreJoueur(fieldNomJ1.getText(), Integer.parseInt(fieldTailleGrille.getText()));
	      		JFrame j2Gra = new FenetreJoueur(fieldNomJ2.getText(), Integer.parseInt(fieldTailleGrille.getText()));
	      		
	      		j1Gra.setVisible(true);
	      		j2Gra.setVisible(true);
	      		j1Gra.pack();
	      		j2Gra.pack();
	      		

			}
	      	
	      	if(jRB1Texte.isSelected()){
	      		System.out.println("texte");
	      		System.out.println(tabNavAuto);
	      		GrilleNavale grilleJText1 = new GrilleNavale(Integer.parseInt(fieldTailleGrille.getText()), tabNavAuto);
	      		GrilleNavale grilleJText2 = new GrilleNavale(Integer.parseInt(fieldTailleGrille.getText()), tabNavAuto);
	      		JoueurTexte joueur1 = new JoueurTexte(grilleJText1, fieldNomJ1.getText());
	      		JoueurTexte joueur2 = new JoueurTexte(grilleJText2, fieldNomJ2.getText());
	      		
	      		joueur1.jouerAvec(joueur2);
	      		joueur1.debutAttaque();
	      		
	      	}
	
	      	
	      	}
	      });
	      btnLancerLaPartie.setBackground(new Color(224, 255, 255));
	      btnLancerLaPartie.setFont(new Font("Tahoma", Font.PLAIN, 13));
	      
	      JPanel panelSetupJ2 = new JPanel();
	      panelSetupJ2.setForeground(new Color(240, 255, 255));
	      panelSetupJ2.setBorder(new LineBorder(new Color(176, 224, 230)));
	      panelSetupJ2.setBackground(new Color(240, 255, 255));
	      
	      JButton btnAddNaviresJ2 = new JButton("Ajouter des navires");
	      panelSetupJ2.add(btnAddNaviresJ2);
	      
	      btnAddNaviresJ2.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		
	      		
	      		if (!jInternalFrameConfigurationFlotte.isVisible()) {
		      		jInternalFrameConfigurationFlotte.setVisible(true);
		      		tglbtnPlacementAuto.setSelected(true);					
				}
	      		else{
		      		jInternalFrameConfigurationFlotte.setVisible(false);
	      		}

	      		
	      	}
	      });
	      
	      
	      GroupLayout groupLayout = new GroupLayout(f.getContentPane());
	      groupLayout.setHorizontalGroup(
	      	groupLayout.createParallelGroup(Alignment.TRAILING)
	      		.addGroup(groupLayout.createSequentialGroup()
	      			.addContainerGap()
	      			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	      				.addComponent(panelTailleGrille, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
	      				.addGroup(groupLayout.createSequentialGroup()
	      					.addComponent(panelGroup2JRB, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
	      					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	      						.addGroup(groupLayout.createSequentialGroup()
	      							.addPreferredGap(ComponentPlacement.RELATED)
	      							.addComponent(panelSetupJ2, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
	      						.addGroup(groupLayout.createSequentialGroup()
	      							.addGap(36)
	      							.addComponent(btnLancerLaPartie))))
	      				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
	      				.addComponent(pannelNomJ1, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
	      				.addComponent(panelNomJ2, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
	      				.addGroup(groupLayout.createSequentialGroup()
	      					.addComponent(panelGroup1JRB, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
	      					.addPreferredGap(ComponentPlacement.RELATED)
	      					.addComponent(panelSetupJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	      				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
	      			.addGap(18)
	      			.addComponent(jInternalFrameConfigurationFlotte, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE)
	      			.addGap(46))
	      );
	      groupLayout.setVerticalGroup(
	      	groupLayout.createParallelGroup(Alignment.TRAILING)
	      		.addGroup(groupLayout.createSequentialGroup()
	      			.addComponent(panelTailleGrille, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      			.addPreferredGap(ComponentPlacement.RELATED)
	      			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
	      				.addComponent(jInternalFrameConfigurationFlotte, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
	      				.addGroup(groupLayout.createSequentialGroup()
	      					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      					.addGap(14)
	      					.addComponent(pannelNomJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      					.addGap(12)
	      					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	      						.addComponent(panelSetupJ1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      						.addComponent(panelGroup1JRB, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
	      					.addGap(18)
	      					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	      					.addPreferredGap(ComponentPlacement.UNRELATED)
	      					.addComponent(panelNomJ2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
	      					.addPreferredGap(ComponentPlacement.UNRELATED)
	      					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	      						.addComponent(panelSetupJ2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
	      						.addComponent(panelGroup2JRB, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))))
	      			.addGap(55))
	      		.addGroup(groupLayout.createSequentialGroup()
	      			.addContainerGap(419, Short.MAX_VALUE)
	      			.addComponent(btnLancerLaPartie)
	      			.addGap(29))
	      );
	      
	      
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