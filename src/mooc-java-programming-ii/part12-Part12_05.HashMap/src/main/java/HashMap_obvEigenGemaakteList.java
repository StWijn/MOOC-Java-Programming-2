

public class HashMap_obvEigenGemaakteList<Key, Value> {
    private List<Paar<Key, Value>>[] lijst;
    private int vrijeIndex;

    public HashMap_obvEigenGemaakteList() {
        this.lijst = new List[30];
        this.vrijeIndex = 0;
    }

    public Value get(Key key) {
        int hashValue = Math.abs(key.hashCode() % this.lijst.length);
        if (this.lijst[hashValue] == null) {
            return null;
        }

        List<Paar<Key, Value>> HMopIndex = this.lijst[hashValue];

        for (int i = 0; i < HMopIndex.grootte(); i++) {
            if (HMopIndex.returnWaarde(i).getKey().equals(key)) {
                return HMopIndex.returnWaarde(i).getValue();
            }
        }

        return null;
    }

    public void add(Key key, Value value) {
        List<Paar<Key, Value>> valuesAtIndex = getListobvKey(key);
        int index = getIndexobvKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Paar<>(key, value));
            this.vrijeIndex++;
        } else {
            valuesAtIndex.returnWaarde(index).setValue(value);
        }

        if (1.0 * this.vrijeIndex / this.lijst.length > 0.75) {
            grow();
        }
    }

    public Value remove(Key key) {
        List<Paar<Key, Value>> HMopIndex = getListobvKey(key);
        if (HMopIndex.grootte() == 0) {
            return null;
        }

        int index = getIndexobvKey(HMopIndex, key);
        if (index < 0) {
            return null;
        }

        Paar<Key, Value> paar = HMopIndex.returnWaarde(index);
        HMopIndex.remove(paar);
        return paar.getValue();
    }

    private List<Paar<Key, Value>> getListobvKey(Key key) {
        int hashValue = Math.abs(key.hashCode() % lijst.length);
        if (lijst[hashValue] == null) {
            lijst[hashValue] = new List<>();
        }

        return lijst[hashValue];
    }

    private int getIndexobvKey(List<Paar<Key, Value>> templijst, Key key) {
        for (int i = 0; i < templijst.grootte(); i++) {
            if (templijst.returnWaarde(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }

    private void grow() {
        // crete a new array
        List<Paar<Key, Value>>[] newValues = new List[this.lijst.length * 2];

        for (int i = 0; i < this.lijst.length; i++) {
            // copy the values of the old array into the new one
            copy(newValues, i);
        }

        // replace the old array with the new one
        this.lijst = newValues;
    }

    private void copy(List<Paar<Key, Value>>[] nieuwe, int fromIndex) {
        for (int i = 0; i < this.lijst[fromIndex].grootte(); i++) {
            Paar<Key, Value> paar = this.lijst[fromIndex].returnWaarde(i);

            int hashCode = Math.abs(paar.getKey().hashCode() % nieuwe.length);
            if (nieuwe[hashCode] == null) {
                nieuwe[hashCode] = new List<>();
            }

            nieuwe[hashCode].add(paar);

        }

        }

}
