class NameRepository {
    public String names[] = {"John", "Jane"};
    public Iterator getIterator() { return new NameIterator(); }
    private class NameIterator implements Iterator {
        int index;
        public boolean hasNext() { return index < names.length; }
        public Object next() { return hasNext() ? names[index++] : null; }
    }
}
