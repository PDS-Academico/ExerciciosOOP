public class MyArrayList<E> implements List<E> {

    private E[] base;
    private int count;

    public MyArrayList(){
        count = 0;
        base = (E[])(new Object[10]);
    }

    @Override
    public void add(E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }
 
}
