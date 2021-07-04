package frameWork;

public class ImageFilterImpl implements ImageFilter {
    @Override
    public int[] filter(int[] data) {
        int[] resImage=data.clone();
        for (int i = 0; i < data.length ; i++) {
            resImage[i]+=4;
        }
        return resImage;
    }
}
