
/**
 * @author larbi
 */
public class Matrice {

    private MonImage[][] Matrixe = new MonImage[4][4];
//  private  int TableauPhotoAffected[] = new int[16];

    public Matrice() {
    }

    public void GenerateMatriceContenent() {
        for (int i = 0; i < Matrixe.length; i++) {
            for (int j = 0; j < Matrixe.length; j++) {
                boolean DontPasse = true;
                do {
                    int idPhoto = getImageNumber();
                    if (isAffectedTwice(idPhoto) < 2) {
                        DontPasse = false;
                        //System.out.println(">> " + idPhoto);
                        Matrixe[i][j] = new MonImage(idPhoto, "/img/" + idPhoto + ".png", new int[]{i, j});
                    }
                } while (DontPasse);
            }
        }
    }

    private int getImageNumber() {
        int Number = (int) (Math.random() * 10);
        if (Number >= 0 && Number <= 1) {
            return 1;
        } else if (Number > 1 && Number <= 2) {
            return 2;
        } else if (Number > 2 && Number <= 3) {
            return 3;
        } else if (Number > 3 && Number <= 4) {
            return 4;
        } else if (Number > 4 && Number <= 5) {
            return 5;
        } else if (Number > 5 && Number <= 6) {
            return 6;
        } else if (Number > 6 && Number <= 7) {
            return 7;
        } else {
            return 8;
        }

    }

    public int isAffectedTwice(int id) {
        // cpt sert a denombrer le  nombre  d'affectaion d'un image a notre matrice
        int cpt = 0;
        for (int i = 0; i < Matrixe.length && cpt < 2; i++) {
            for (int j = 0; j < Matrixe.length && cpt < 2; j++) {
                MonImage img = Matrixe[i][j];
                if (img != null) {
                    if (img.getId() == id) {
                        cpt++;

                    }
                }
            }
        }
        return cpt;
    }

    public MonImage[][] getMatrixe() {
        return Matrixe;
    }

    public void setMatrixe(MonImage[][] Matrixe) {
        this.Matrixe = Matrixe;
    }
}
