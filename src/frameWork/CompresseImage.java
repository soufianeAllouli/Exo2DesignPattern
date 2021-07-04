package frameWork;

public abstract class CompresseImage {
    public int[] compresse(int[] data){
        int[] res=data;
        res=compresseDetail(res);
        return res;
    }
    protected abstract int[] compresseDetail(int[] data);
}
