/**
 * An incorrect example max heap strategy for adding an int to an existing max heap
 */
public class FaultyMaxHeapStrategy2 extends AbsBTStrategy implements BTStrategy{
    @Override
    public NodeBT addInt(int i, IBinTree b) {
        if(b.isEmpty()){
            return new NodeBT(i, new EmptyBT(), new EmptyBT());
        }
        else{
            if(i < b.getRoot()){
                return new NodeBT(b.getRoot(), new EmptyBT(), new NodeBT(i, b.getLeft(), b.getRight()));
            }
            else{
                return new NodeBT(i, b.getLeft(), b.getRight());
            }
        }
    }
}
