package frameWork;

public class FilterAdapter implements ImageFilter {
    @Override
    public int[] filter(int[] data) {
        ImplNonStandard implNonStandard=new ImplNonStandard();

        return implNonStandard.appliquerFilter("ImplNonStandard",data) ;
    }
}
