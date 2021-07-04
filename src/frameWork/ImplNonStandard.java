package frameWork;

public class ImplNonStandard {
    public int[] appliquerFilter(String filterName,int[] data){

        System.out.println("filterName: "+filterName);

        int[] resutlImg=data.clone();
        for (int i = 0; i < resutlImg.length ; i++) {
            resutlImg[i]+=1;
        }
        return  resutlImg;
    }
}
