package com.aspose.slides.internal.c9t;

import java.awt.image.BufferedImage;
import javax.imageio.ImageReader;
import javax.imageio.event.IIOReadUpdateListener;

class h0 implements IIOReadUpdateListener {
   // $VF: synthetic field
   final a6 n5;

   h0(a6 var1) {
      this.n5 = var1;
   }

   @Override
   public void imageUpdate(ImageReader source, BufferedImage theImage, int minX, int minY, int width, int height, int periodX, int periodY, int[] bands) {
      a6.n5(this.n5, theImage, minX, minY, width, height, periodX, periodY, bands);
   }

   @Override
   public void passComplete(ImageReader source, BufferedImage theImage) {
      a6.n5(this.n5, theImage);
   }

   @Override
   public void passStarted(
      ImageReader source, BufferedImage theImage, int pass, int minPass, int maxPass, int minX, int minY, int periodX, int periodY, int[] bands
   ) {
      a6.n5(this.n5, theImage, pass, minPass, maxPass, minX, minY, periodX, periodY, bands);
   }

   @Override
   public void thumbnailPassComplete(ImageReader source, BufferedImage thumb) {
   }

   @Override
   public void thumbnailPassStarted(
      ImageReader source, BufferedImage thumb, int pass, int minPass, int maxPass, int minX, int minY, int periodX, int periodY, int[] bands
   ) {
   }

   @Override
   public void thumbnailUpdate(ImageReader source, BufferedImage theThumbnail, int minX, int minY, int width, int height, int periodX, int periodY, int[] bands) {
   }
}
