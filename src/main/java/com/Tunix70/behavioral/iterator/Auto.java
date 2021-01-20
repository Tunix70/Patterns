package main.java.com.Tunix70.behavioral.iterator;

public class Auto implements Collection{
    private String name;
    private String[]characteristic;

    public Auto(String name, String[] characteristic) {
        this.name = name;
        this.characteristic = characteristic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String[] characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public Iterator getIterator() {
        return new CharacteristicIterator();
    }

    private class CharacteristicIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index < characteristic.length) {
                return true;
            }
            else return false;
        }

        @Override
        public Object next() {
            return characteristic[index++];
        }
    }
}
