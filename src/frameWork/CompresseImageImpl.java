package frameWork;

public class CompresseImageImpl extends CompresseImage {
    @Override
    protected int[] compresseDetail(int[] data) {
        int[] resutlImg=data.clone();
        for (int i = 0; i < resutlImg.length ; i++) {
            resutlImg[i]-=1;
        }
        return  resutlImg;
    }
}
