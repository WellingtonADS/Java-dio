package Fila;

public class Fila {

    private No refEntradaFila;

    public Fila() {

        this.refEntradaFila = null;
    }

    public void enqueue(No novoNo) {

        novoNo.setRefNo(refEntradaFila);
        refEntradaFila = novoNo;
    }

    public No first() {

        if (!this.isEmpty()) {

            No primeiroNo = refEntradaFila;

            while (true) {

                if (primeiroNo.getRefNo() != null) {

                    primeiroNo = primeiroNo.getRefNo();
                } else {

                    break;
                }
            }

            return primeiroNo;
        }

        return null;
    }

    public No dequeue() {

        if (!this.isEmpty()) {

            No primeiroNo = refEntradaFila;
            No noAuxiliar = refEntradaFila;

            while (true) {

                if (primeiroNo.getRefNo() != null) {

                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {

                    noAuxiliar.setRefNo(null);
                    break;
                }
            }

            return primeiroNo;
        }

        return null;
    }

    public boolean isEmpty() {

        return refEntradaFila == null ? true : false;
    }
    
    @Override

    public String toString() {

        String stringRetorno = "---------------------\n";
        stringRetorno += "     Fila\n";
        stringRetorno += "---------------------\n";

        No noAuxiliar = refEntradaFila;

        while (true) {

            if (noAuxiliar != null) {

                stringRetorno += "[No{object=" + noAuxiliar.getObject() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {

                break;
            }
        }

        stringRetorno += "=====================\n";
        return stringRetorno;
    }



}
