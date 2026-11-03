package com.aspose.slides.internal.g3y;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.IIOImage;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageWriterSpi;
import javax.imageio.stream.ImageOutputStream;

public class h0 extends ImageWriter {
   private boolean l6 = false;
   List<BufferedImage> n5;

   public h0(ImageWriterSpi var1) {
      super(var1);
   }

   @Override
   public void setOutput(Object output) {
      if (output instanceof ImageOutputStream) {
         ((ImageOutputStream)output).setByteOrder(ByteOrder.LITTLE_ENDIAN);
         super.setOutput(output);
      } else {
         throw new IllegalArgumentException("Illegal output type!");
      }
   }

   @Override
   public IIOMetadata getDefaultStreamMetadata(ImageWriteParam param) {
      return null;
   }

   @Override
   public IIOMetadata getDefaultImageMetadata(ImageTypeSpecifier imageType, ImageWriteParam param) {
      return null;
   }

   @Override
   public IIOMetadata convertStreamMetadata(IIOMetadata inData, ImageWriteParam param) {
      return null;
   }

   @Override
   public IIOMetadata convertImageMetadata(IIOMetadata inData, ImageTypeSpecifier imageType, ImageWriteParam param) {
      return null;
   }

   @Override
   public boolean canWriteSequence() {
      return true;
   }

   @Override
   public void prepareWriteSequence(IIOMetadata streamMetadata) throws IOException {
      if (this.getOutput() == null) {
         throw new IllegalStateException("Output is not set.");
      }

      this.l6 = true;
      this.n5 = new ArrayList<>();
   }

   @Override
   public void writeToSequence(IIOImage image, ImageWriteParam param) throws IOException {
      if (image == null) {
         throw new IllegalArgumentException("image == null!");
      }

      if (!this.l6) {
         throw new IllegalStateException("prepareWriteSequence() was not invoked!");
      }

      this.n5.add((BufferedImage)image.getRenderedImage());
   }

   @Override
   public void endWriteSequence() throws IOException {
      a6.n5(this.n5, (ImageOutputStream)this.output);
      ((ImageOutputStream)this.output).flush();
      this.l6 = false;
      this.n5 = null;
   }

   @Override
   public void reset() {
      super.reset();
      this.l6 = false;
      this.n5 = null;
   }

   @Override
   public void write(IIOMetadata streamMetadata, IIOImage image, ImageWriteParam param) throws IOException {
      BufferedImage var4 = (BufferedImage)image.getRenderedImage();
      a6.n5(var4, (ImageOutputStream)this.getOutput());
      ((ImageOutputStream)this.output).flush();
   }
}
