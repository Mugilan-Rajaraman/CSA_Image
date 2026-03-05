
/*
  ImageApp: 
 */
import java.awt.Color;

public class ImageApp {
  public static void main(String[] args) {

    // use any file from the lib folder
    String pictureFile = "lib/beach.jpg";
    String pictureFile2 = "lib/koala.jpg";

    // Get an image, get 2d array of pixels, show a color of a pixel, and display
    // the image
    Picture origImg2 = new Picture(pictureFile2);
    Pixel[][] origPixels2 = origImg2.getPixels2D();
    System.out.println(origPixels2[0][0].getColor());
    origImg2.explore();

    // Image #1 Using the original image and pixels, recolor an image by changing
    // the RGB color of each Pixel

    Picture recoloredImg2 = new Picture(pictureFile2);
    Pixel[][] recoloredPixels2 = recoloredImg2.getPixels2D();
    Pixel recoloredpix2 = recoloredPixels2[0][0];
    recoloredpix2.setColor(Color.RED);
    recoloredImg2.explore();

    /* to be implemented */

    // Image #2 Using the original image and pixels, create a photographic negative
    // of the image
    Picture negImg2 = new Picture(pictureFile2);
    Pixel[][] negPixels2 = negImg2.getPixels2D();
    Pixel negpix2 = negPixels2[0][0];
    negpix2.setRed(255 - negpix2.getRed());
    negpix2.setGreen(255 - negpix2.getGreen());
    negpix2.setBlue(255 - negpix2.getBlue());
    negImg2.explore();

    /* to be implemented */

    // Image #3 Using the original image and pixels, create a grayscale version of
    // the image
    Picture grayscaleImg2 = new Picture(pictureFile2);
    Pixel[][] grayscalePixels2 = grayscaleImg2.getPixels2D();
    Pixel grayscalepix2 = grayscalePixels2[0][0];
    int avg = (grayscalepix2.getRed() + grayscalepix2.getGreen() + grayscalepix2.getBlue()) / 3;
    grayscalepix2.setRed(avg);
    grayscalepix2.setGreen(avg);
    grayscalepix2.setBlue(avg);
    grayscaleImg2.explore();

    /* to be implemented */

    // Image #4 Using the original image and pixels, rotate it 180 degrees
    Picture upsidedownImage2 = new Picture(pictureFile2);
    Pixel[][] upsideDownPixels2 = upsidedownImage2.getPixels2D();
    for (int i = 0; i < upsideDownPixels2.length; i++) {
      for (int j = 0; j < upsideDownPixels2[i].length; j++) {
        Pixel upsideDownpix2 = upsideDownPixels2[i][j];
        upsideDownpix2
            .setRed(upsideDownPixels2[upsideDownPixels2.length - 1 - i][upsideDownPixels2[i].length - 1 - j].getRed());
        upsideDownpix2.setGreen(
            upsideDownPixels2[upsideDownPixels2.length - 1 - i][upsideDownPixels2[i].length - 1 - j].getGreen());
        upsideDownpix2.setBlue(
            upsideDownPixels2[upsideDownPixels2.length - 1 - i][upsideDownPixels2[i].length - 1 - j].getBlue());
      }
    }
    upsidedownImage2.explore();
    /* to be implemented */

    // Image #5 Using the original image and pixels, rotate image 90
    Picture rotateImg2 = new Picture(pictureFile2);
    Pixel[][] rotatePixels2 = rotateImg2.getPixels2D();
    for (int i = 0; i < rotatePixels2.length; i++) {
      for (int j = 0; j < rotatePixels2[i].length; j++) {
        Pixel rotatepix2 = rotatePixels2[i][j];
        rotatepix2.setRed(rotatePixels2[j][rotatePixels2.length - 1 - i].getRed());
        rotatepix2.setGreen(rotatePixels2[j][rotatePixels2.length - 1 - i].getGreen());
        rotatepix2.setBlue(rotatePixels2[j][rotatePixels2.length - 1 - i].getBlue());
      }
    }
    rotateImg2.explore();

    /* to be implemented */

    // Image #6 Using the original image and pixels, rotate image -90
    Picture rotateImg21 = new Picture(pictureFile2);
    Pixel[][] rotatePixels21 = rotateImg21.getPixels2D();
    for (int i = 0; i < rotatePixels21.length; i++) {
      for (int j = 0; j < rotatePixels21[i].length; j++) {
        rotatePixels21[j][rotatePixels21.length - 1 - i].setRed(rotatePixels21[i][j].getRed());
        rotatePixels21[j][rotatePixels21.length - 1 - i].setGreen(rotatePixels21[i][j].getGreen());
        rotatePixels21[j][rotatePixels21.length - 1 - i].setBlue(rotatePixels21[i][j].getBlue());
      }
    }
    rotateImg2.explore();

    Picture origImg = new Picture(pictureFile);
    Pixel[][] origPixels = origImg.getPixels2D();
    System.out.println(origPixels[0][0].getColor());
    origImg.explore();

    // Image #1 Using the original image and pixels, recolor an image by changing
    // the RGB color of each Pixel

    Picture recoloredImg = new Picture(pictureFile);
    Pixel[][] recoloredPixels = recoloredImg.getPixels2D();
    Pixel recoloredpix = recoloredPixels[0][0];
    recoloredpix.setColor(Color.RED);
    recoloredImg.explore();

    /* to be implemented */

    // Image #2 Using the original image and pixels, create a photographic negative
    // of the image
    Picture negImg = new Picture(pictureFile);
    Pixel[][] negPixels = negImg.getPixels2D();
    Pixel negpix = negPixels[0][0];
    negpix.setRed(255 - negpix.getRed());
    negpix.setGreen(255 - negpix.getGreen());
    negpix.setBlue(255 - negpix.getBlue());
    negImg.explore();

    /* to be implemented */

    // Image #3 Using the original image and pixels, create a grayscale version of
    // the image
    Picture grayscaleImg = new Picture(pictureFile);
    Pixel[][] grayscalePixels = grayscaleImg.getPixels2D();
    Pixel grayscalepix = grayscalePixels[0][0];
    int avg1 = (grayscalepix.getRed() + grayscalepix.getGreen() + grayscalepix.getBlue()) / 3;
    grayscalepix.setRed(avg);
    grayscalepix.setGreen(avg);
    grayscalepix.setBlue(avg);
    grayscaleImg.explore();

    /* to be implemented */

    // Image #4 Using the original image and pixels, rotate it 180 degrees
    Picture upsidedownImage = new Picture(pictureFile);
    Pixel[][] upsideDownPixels = upsidedownImage.getPixels2D();
    for (int i = 0; i < upsideDownPixels.length; i++) {
      for (int j = 0; j < upsideDownPixels[i].length; j++) {
        Pixel upsideDownpix = upsideDownPixels[i][j];
        upsideDownpix
            .setRed(upsideDownPixels[upsideDownPixels.length - 1 - i][upsideDownPixels[i].length - 1 - j].getRed());
        upsideDownpix
            .setGreen(upsideDownPixels[upsideDownPixels.length - 1 - i][upsideDownPixels[i].length - 1 - j].getGreen());
        upsideDownpix
            .setBlue(upsideDownPixels[upsideDownPixels.length - 1 - i][upsideDownPixels[i].length - 1 - j].getBlue());
      }
    }
    upsidedownImage.explore();
    /* to be implemented */

    // Image #5 Using the original image and pixels, rotate image 90
    Picture rotateImg = new Picture(pictureFile);
    Pixel[][] rotatePixels = rotateImg.getPixels2D();
    for (int i = 0; i < rotatePixels.length; i++) {
      for (int j = 0; j < rotatePixels[i].length; j++) {
        Pixel rotatepix = rotatePixels[i][j];
        rotatepix.setRed(rotatePixels[j][rotatePixels.length - 1 - i].getRed());
        rotatepix.setGreen(rotatePixels[j][rotatePixels.length - 1 - i].getGreen());
        rotatepix.setBlue(rotatePixels[j][rotatePixels.length - 1 - i].getBlue());
      }
    }
    rotateImg.explore();

    /* to be implemented */

    // Image #6 Using the original image and pixels, rotate image -90
    Picture rotateImg22 = new Picture(pictureFile);
    Pixel[][] rotatePixels22 = rotateImg22.getPixels2D();
    for (int i = 0; i < rotatePixels22.length; i++) {
      for (int j = 0; j < rotatePixels22[i].length; j++) {
        rotatePixels22[j][rotatePixels22.length - 1 - i].setRed(rotatePixels22[i][j].getRed());
        rotatePixels22[j][rotatePixels22.length - 1 - i].setGreen(rotatePixels22[i][j].getGreen());
        rotatePixels2[j][rotatePixels2.length - 1 - i].setBlue(rotatePixels2[i][j].getBlue());
      }
    }
    rotateImg2.explore();
    /* to be implemented */

    // Final Image: Add a small image to a larger one
    Picture largeImg = new Picture(pictureFile);
    Picture smallImg = new Picture("lib2/rocket.png");
    Pixel[][] largePixels = largeImg.getPixels2D();
    Pixel[][] smallPixels = smallImg.getPixels2D();

    int startRow = 50;
    int startCol = 50;

    for (int i = 0; i < smallPixels.length; i++) {
      for (int j = 0; j < smallPixels[i].length; j++) {
        Pixel smallPix = smallPixels[i][j];
        // Only copy non-white pixels so the background doesn't cover the large image
        if (!(smallPix.getRed() > 250 && smallPix.getGreen() > 250 && smallPix.getBlue() > 250)) {
          if (startRow + i < largePixels.length && startCol + j < largePixels[0].length) {
            Pixel largePix = largePixels[startRow + i][startCol + j];
            largePix.setRed(smallPix.getRed());
            largePix.setGreen(smallPix.getGreen());
            largePix.setBlue(smallPix.getBlue());
          }
        }
      }
    }
    largeImg.explore();

    // for testing 2D algorithms
    int[][] test1 = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };
    int[][] test2 = new int[4][4];

  }
}
