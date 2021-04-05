/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larbi
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrice m = new Matrice();
        m.GenerateMatriceContenent();
        for (int i = 0; i < m.getMatrixe().length; i++) {
            for (int j = 0; j < m.getMatrixe().length; j++) {
                System.out.println(i+" : "+j+" >>> "+((MonImage)m.getMatrixe()[i][j]).getUrl());
            }
        }
    }
}
