import frameWork.CompresseImage;
import frameWork.ImageFilter;

public class FramWork {
    private ImageFilter filter;
    private CompresseImage compresseImage;

    public void setCompresseImage(CompresseImage compresseImage) {
        this.compresseImage = compresseImage;
    }

    public void setFilter(ImageFilter filter) {
        this.filter = filter;
    }

    public void appliquerFilter(int[] image){
        System.out.println("------------------------------------------------------");
        System.out.print("image before filter : ");
        printTable(image);
        int[] filtredImage=filter.filter(image);
        System.out.print("image after filter: ");
        printTable(filtredImage);
    }

    private void printTable(int[] image) {
        System.out.print("[");
        for (int i = 0; i < image.length; i++) {
            if (i==image.length-1)
                System.out.println(image[i]+"]");
            else
                System.out.print(image[i]+",");
        }
    }

    public void compresse(int[] image) {

        System.out.println("------------------------------------------------------");
        System.out.print("image before compression : ");
        printTable(image);
        int[] compressedImage=compresseImage.compresse(image);
        System.out.print("image after compression: ");
        printTable(compressedImage);
    }
}
