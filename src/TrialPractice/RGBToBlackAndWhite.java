package TrialPractice;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class RGBToBlackAndWhite {
    public static void main(String[] args) {
        // Input and output image paths
        String inputImagePath = "SS.jpg";   // Replace with your image file
        String outputImagePath = "output_bw.jpg";

        try {
            // Read the original image
            BufferedImage original = ImageIO.read(new File(inputImagePath));

            // Create a new grayscale image with the same size
            BufferedImage grayscale = new BufferedImage(
                original.getWidth(),
                original.getHeight(),
                BufferedImage.TYPE_BYTE_GRAY
            );

            // Convert each pixel to grayscale
            for (int y = 0; y < original.getHeight(); y++) {
                for (int x = 0; x < original.getWidth(); x++) {
                    int rgb = original.getRGB(x, y);

                    // Extract color components
                    int red = (rgb >> 16) & 0xFF;
                    int green = (rgb >> 8) & 0xFF;
                    int blue = rgb & 0xFF;

                    // Calculate luminance using standard NTSC conversion formula
                    int gray = (int)(0.299 * red + 0.587 * green + 0.114 * blue);

                    // Set new gray pixel value (same value for R, G, B)
                    int newPixel = (gray << 16) | (gray << 8) | gray;
                    grayscale.setRGB(x, y, newPixel);
                }
            }

            // Save the output image
            ImageIO.write(grayscale, "jpg", new File(outputImagePath));

            System.out.println("✅ Image successfully converted to black and white!");
            System.out.println("📁 Saved as: " + outputImagePath);

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
