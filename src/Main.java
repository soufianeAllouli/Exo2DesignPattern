import frameWork.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        int[] image={1,2,1,3};
        FramWork framWork=new FramWork();
        Scanner scanner=new Scanner(System.in);

            System.out.println("Enter your ImageFilter implementation name:");
            String filterClass=scanner.next();
            System.out.println("Enter your ImageCompression implementation name:");
            String compressClass=scanner.next();

            try {
                ImageFilter filter= (ImageFilter) Class.forName("frameWork."+filterClass).newInstance();
                CompresseImage compresseImage= (CompresseImage) Class.forName("frameWork."+compressClass).newInstance();

                framWork.setFilter(filter);
                framWork.appliquerFilter(image);

                framWork.setCompresseImage(compresseImage);
                framWork.compresse(image);

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } finally {
                framWork.setFilter(new FilterAdapter());
                framWork.appliquerFilter(image);

                framWork.setFilter(new ImageFilterImpl());
                framWork.appliquerFilter(image);

                framWork.setCompresseImage(new CompresseImageImpl());
                framWork.compresse(image);
            }
    }
}
