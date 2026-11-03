package com.aspose.slides.internal.g3y;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;

public class u9 extends ImageReader {
   private boolean l6 = false;
   List<BufferedImage> n5 = new ArrayList<>();

   public u9(ImageReaderSpi var1) {
      super(var1);
   }

   private void n5() throws IOException {
      if (!this.l6) {
         if (this.input == null) {
            throw new IllegalArgumentException("input == null");
         }

         ImageInputStream var1 = (ImageInputStream)this.input;
         this.n5 = u3.n5(var1);
         this.l6 = true;
      }
   }

   @Override
   public void setInput(Object input) {
      if (input instanceof ImageInputStream) {
         ((ImageInputStream)input).setByteOrder(ByteOrder.LITTLE_ENDIAN);
         super.setInput(input);
      } else {
         throw new IllegalArgumentException("Incorrect input type!");
      }
   }

   @Override
   public int getNumImages(boolean allowSearch) throws IOException {
      this.n5();
      return this.n5.size();
   }

   @Override
   public int getWidth(int imageIndex) throws IOException {
      this.n5();
      this.n5(imageIndex);
      return this.n5.get(imageIndex).getWidth();
   }

   private void n5(int var1) {
      if (var1 < 0 || var1 >= this.n5.size()) {
         throw new IllegalArgumentException("index was out of range");
      }
   }

   @Override
   public int getHeight(int imageIndex) throws IOException {
      this.n5();
      this.n5(imageIndex);
      return this.n5.get(imageIndex).getHeight();
   }

   @Override
   public Iterator<ImageTypeSpecifier> getImageTypes(int imageIndex) throws IOException {
      this.n5();
      this.n5(imageIndex);
      BufferedImage var2 = this.n5.get(imageIndex);
      ArrayList var3 = new ArrayList();
      var3.add(new ImageTypeSpecifier(var2.getColorModel(), var2.getSampleModel()));
      return var3.iterator();
   }

   @Override
   public IIOMetadata getStreamMetadata() throws IOException {
      return null;
   }

   @Override
   public IIOMetadata getImageMetadata(int imageIndex) throws IOException {
      return null;
   }

   @Override
   public BufferedImage read(int imageIndex, ImageReadParam param) throws IOException {
      this.n5();
      if (imageIndex < 0) {
         throw new IllegalArgumentException("index was out of range");
      } else {
         return imageIndex >= this.n5.size() ? null : this.n5.get(imageIndex);
      }
   }
}
