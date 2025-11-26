
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author evada
 */
public class Interface extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Interface.class.getName());
    
    
    ArrayList<Question> Question = new ArrayList<>();
    
    private int indexQuestionCourante = 0;
    
    private void afficherQuestionCourante(){
        Question q = Question.get(indexQuestionCourante);
        Intitule_question.setText(q.getIntitule());
        
        P1.setText(q.getP1());
        P2.setText(q.getP2());
        P3.setText(q.getP3());
        P4.setText(q.getP4());
        
        P1.setEnabled(true);
        P2.setEnabled(true);
        P3.setEnabled(true);
        P4.setEnabled(true); 
    }
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        Intitule_question.setVisible(false);
        P1.setVisible(true);
        P2.setVisible(true);
        P3.setVisible(true);
        P4.setVisible(true);      
        
        
        
        Question.add(new Question("Quel est le plus grand océan du monde ?","A. Océan Indien","B. Océan Atlantique","C. Océan Arctique","D. Océan Pacifique",1)); 
        Question.add(new Question("Quel est le plus grand océan du monde ?", "A. Océan Indien", "B. Océan Atlantique", "C. Océan Arctique", "D. Océan Pacifique", 4));
        Question.add(new Question("Quelle est la capitale de l’Espagne ?", "A. Lisbonne", "B. Barcelone", "C. Valence", "D. Madrid", 4));
        Question.add(new Question("Combien font 9 x 7 ?", "A. 54", "B. 63", "C. 56", "D. 72", 2));
        Question.add(new Question("Quel gaz les plantes absorbent-elles ?", "A. Oxygène", "B. Azote", "C. Dioxyde de carbone", "D. Hélium", 3));
        Question.add(new Question("Quel animal a le plus long cou ?", "A. Zèbre", "B. Éléphant", "C. Girafe", "D. Lion", 3));
        Question.add(new Question("Quel est le plus petit continent ?", "A. Afrique", "B. Europe", "C. Asie", "D. Australie", 4));
        Question.add(new Question("Quel est l’organe principal de la respiration ?", "A. Cœur", "B. Foie", "C. Rein", "D. Poumons", 4));
        Question.add(new Question("Combien de côtés a un hexagone ?", "A. 5", "B. 7", "C. 6", "D. 8", 3));
        Question.add(new Question("Qui a peint la Joconde ?", "A. Picasso", "B. Van Gogh", "C. Monet", "D. Léonard de Vinci", 4));
        Question.add(new Question("Quelle est la capitale du Japon ?", "A. Pékin", "B. Séoul", "C. Osaka", "D. Tokyo", 4));
        Question.add(new Question("Quel métal correspond au symbole Fe ?", "A. Argent", "B. Or", "C. Fer", "D. Plomb", 3));
        Question.add(new Question("Quel est le fleuve le plus long du monde ?", "A. Amazone", "B. Nil", "C. Danube", "D. Mississippi", 2));
        Question.add(new Question("Quel est l’animal terrestre le plus rapide ?", "A. Tigre", "B. Cheval", "C. Guépard", "D. Lion", 3));
        Question.add(new Question("Quelle planète est la plus proche du Soleil ?", "A. Vénus", "B. Mercure", "C. Terre", "D. Mars", 2));
        Question.add(new Question("Combien de jours compte une année bissextile ?", "A. 360", "B. 364", "C. 365", "D. 366", 4));
        Question.add(new Question("Dans quel pays se trouve la Tour Eiffel ?", "A. Italie", "B. Belgique", "C. France", "D. Suisse", 3));
        Question.add(new Question("De quelle couleur est le drapeau du Japon ?", "A. Bleu et blanc", "B. Rouge et jaune", "C. Noir et blanc", "D. Blanc et rouge", 4));
        Question.add(new Question("Quelle mer borde le sud de la France ?", "A. Mer du Nord", "B. Océan Atlantique", "C. Mer Méditerranée", "D. Mer Noire", 3));
        Question.add(new Question("Combien de continents existe-t-il ?", "A. 5", "B. 6", "C. 7", "D. 8", 3));
        Question.add(new Question("Quelle est la langue la plus parlée au monde ?", "A. Anglais", "B. Espagnol", "C. Hindi", "D. Mandarin", 4));
        Question.add(new Question("Quel est le plus grand désert du monde ?", "A. Sahara", "B. Gobi", "C. Antarctique", "D. Atacama", 3));
        Question.add(new Question("Quel est le plus grand mammifère ?", "A. Éléphant", "B. Baleine bleue", "C. Hippopotame", "D. Rhinocéros", 2));
        Question.add(new Question("Quel est l’organe qui pompe le sang ?", "A. Poumons", "B. Estomac", "C. Cœur", "D. Rein", 3));
        Question.add(new Question("Quelle planète est surnommée la planète rouge ?", "A. Vénus", "B. Saturne", "C. Mars", "D. Uranus", 3));
        Question.add(new Question("Quel pays a inventé le sushi ?", "A. Chine", "B. Japon", "C. Corée", "D. Thaïlande", 2));
        Question.add(new Question("Combien y a-t-il de minutes dans une heure ?", "A. 30", "B. 45", "C. 60", "D. 90", 3));
        Question.add(new Question("Quelle est la capitale de l’Italie ?", "A. Rome", "B. Venise", "C. Milan", "D. Naples", 1));
        Question.add(new Question("Quelle est la monnaie utilisée aux États-Unis ?", "A. Euro", "B. Yen", "C. Dollar", "D. Livre", 3));
        Question.add(new Question("Quel est l’animal symbole de l’Australie ?", "A. Koala", "B. Kangourou", "C. Émeu", "D. Dingo", 2));
        Question.add(new Question("Quel océan borde l’ouest de la France ?", "A. Pacifique", "B. Arctique", "C. Indien", "D. Atlantique", 4));
        Question.add(new Question("En quelle saison tombe la neige (en général) ?", "A. Printemps", "B. Été", "C. Automne", "D. Hiver", 4));
        Question.add(new Question("Quel fruit donne le pommier ?", "A. Poire", "B. Banane", "C. Orange", "D. Pomme", 4));
        Question.add(new Question("Quelle est la capitale de l’Allemagne ?", "A. Munich", "B. Berlin", "C. Hambourg", "D. Cologne", 2));
        Question.add(new Question("Combien de doigts a un humain ?", "A. 8", "B. 10", "C. 12", "D. 14", 2));
        Question.add(new Question("Quel gaz est indispensable à la respiration humaine ?", "A. Azote", "B. Dioxyde de carbone", "C. Oxygène", "D. Hélium", 3));
        Question.add(new Question("Quelle est la langue officielle du Brésil ?", "A. Espagnol", "B. Portugais", "C. Anglais", "D. Italien", 2));
        Question.add(new Question("Quelle est la capitale du Canada ?", "A. Toronto", "B. Ottawa", "C. Montréal", "D. Vancouver", 2));
        Question.add(new Question("Combien de côtés a un carré ?", "A. 3", "B. 4", "C. 5", "D. 6", 2));
        Question.add(new Question("Quel est le plus grand pays du monde ?", "A. Chine", "B. Canada", "C. États-Unis", "D. Russie", 4));
        Question.add(new Question("Quelle planète possède des anneaux visibles ?", "A. Mars", "B. Saturne", "C. Vénus", "D. Mercure", 2));
        Question.add(new Question("Quel est le principal ingrédient du guacamole ?", "A. Tomate", "B. Avocat", "C. Concombre", "D. Basilic", 2));
        Question.add(new Question("La tour de Pise se trouve en…", "A. Espagne", "B. Italie", "C. Grèce", "D. Portugal", 2));
        Question.add(new Question("Combien de couleurs y a-t-il dans l’arc-en-ciel ?", "A. 5", "B. 6", "C. 7", "D. 8", 3));
        Question.add(new Question("Quel est le satellite naturel de la Terre ?", "A. Soleil", "B. Mars", "C. Lune", "D. Vénus", 3));
        Question.add(new Question("Quel animal miaule ?", "A. Chien", "B. Chat", "C. Cheval", "D. Lapin", 2));
        Question.add(new Question("Quelle est la capitale de la France ?", "A. Lyon", "B. Marseille", "C. Paris", "D. Bordeaux", 3));
        Question.add(new Question("Quel est le métal le plus léger ?", "A. Or", "B. Fer", "C. Aluminium", "D. Lithium", 4));
        Question.add(new Question("Quel est le plus grand océan sur Terre ?", "A. Arctique", "B. Indien", "C. Atlantique", "D. Pacifique", 4));
        Question.add(new Question("Quel sport se joue avec un ballon rond ?", "A. Tennis", "B. Football", "C. Golf", "D. Boxe", 2));
        Question.add(new Question("Quelle boisson est fabriquée à partir de raisins ?", "A. Eau", "B. Vin", "C. Lait", "D. Jus d’orange", 2));

        
        
       
    }
    
    
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Intitule_question = new javax.swing.JLabel();
        P1 = new javax.swing.JButton();
        P2 = new javax.swing.JButton();
        P3 = new javax.swing.JButton();
        P4 = new javax.swing.JButton();
        Message_feedback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Intitule_question.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Intitule_question.setForeground(new java.awt.Color(255, 51, 153));
        Intitule_question.setText("BONJOUR");
        getContentPane().add(Intitule_question, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 65, -1, -1));

        P1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        P1.setText("OK");
        P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ActionPerformed(evt);
            }
        });
        getContentPane().add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        P2.setText("jButton1");
        P2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2ActionPerformed(evt);
            }
        });
        getContentPane().add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        P3.setText("jButton2");
        P3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3ActionPerformed(evt);
            }
        });
        getContentPane().add(P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        P4.setText("jButton3");
        P4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4ActionPerformed(evt);
            }
        });
        getContentPane().add(P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        Message_feedback.setText("jLabel1");
        getContentPane().add(Message_feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_P1ActionPerformed

    private void P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_P2ActionPerformed

    private void P3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_P3ActionPerformed

    private void P4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_P4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Interface().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Intitule_question;
    private javax.swing.JLabel Message_feedback;
    private javax.swing.JButton P1;
    private javax.swing.JButton P2;
    private javax.swing.JButton P3;
    private javax.swing.JButton P4;
    // End of variables declaration//GEN-END:variables

