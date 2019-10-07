    int elementoEspecialAux(int[] vector, int i0, int iN){
        if (i0 == iN)
            if (vector[i0] == i0) return i0; else return -1;
        else {
            int k = (i0 + iN) / 2;
            if (vector[k] > k)
                return elementoEspecialAux(vector, i0, k);
            else if (vector[k] == k)
                return k;
            else
                return elementoEspecialAux(vector, k + 1, iN);
        }
    }
    int elementoEspecial(int[] vector) {
        return elementoEspecialAux(vector, 0, vector.length - 1);
    }
