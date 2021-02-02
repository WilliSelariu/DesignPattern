package main.lab6.services;

public class ImageLoaderFactory implements ImageLoader {

    public ImageLoaderFactory() { }

    @Override
    public void load(String path) {
        if(path.endsWith(".png")) {
            new PNGImageLoader(path);
        }
        else if(path.endsWith(".jpg")) {
            new JPGImageLoader(path);
        }
        else if(path.endsWith(".bmp")) {
            new BMPImageLoader(path);
        }
        else {
            System.out.println("Wrong picture format.");
        }

    }


}