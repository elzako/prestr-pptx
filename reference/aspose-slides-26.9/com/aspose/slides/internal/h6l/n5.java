package com.aspose.slides.internal.h6l;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.c5e.x8;
import com.aspose.slides.internal.c5e.z1;
import com.aspose.slides.internal.e8p.a6;
import com.aspose.slides.internal.e8p.c8;
import com.aspose.slides.internal.e8p.h0;
import com.aspose.slides.internal.e8p.k5;
import com.aspose.slides.internal.e8p.l6;
import com.aspose.slides.internal.e8p.s7;
import com.aspose.slides.internal.e8p.t2;
import com.aspose.slides.internal.e8p.u3;
import com.aspose.slides.internal.e8p.u9;
import com.aspose.slides.internal.f7v.w2;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import javax.imageio.IIOException;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;

public class n5 extends ImageReader {
   private boolean n5 = false;
   private x8 l6 = null;
   private w2 k5 = null;
   private boolean u3 = false;

   public n5(ImageReaderSpi var1) {
      super(var1);
   }

   @Override
   public void setInput(Object input) {
      this.input = input;
   }

   private void n5() {
      if (!this.n5) {
         this.k5();
         this.l6 = new x8(n5((ImageInputStream)this.input), "pnginput");
         this.l6.u9();
         this.l6.n5(true);
         this.k5 = this.l6.l6();
         this.u3 = this.l6();
         this.n5 = true;
      }
   }

   private boolean l6() {
      if (this.l6.n5.t2 > 32) {
         return true;
      }

      switch (this.k5.a6().a6()) {
         case 0:
            if (this.l6.n5.t2 != 1) {
               return true;
            }
         case 1:
         case 2:
         case 5:
         default:
            break;
         case 3:
            if (this.k5.a6().u3() == 2) {
               return true;
            }
            break;
         case 4:
            return true;
         case 6:
            return false;
      }

      return this.k5.u3() != null;
   }

   @Override
   public int getNumImages(boolean allowSearch) throws IOException {
      this.k5();
      return 1;
   }

   @Override
   public int getWidth(int imageIndex) throws IOException {
      this.n5(imageIndex);
      this.n5();
      return this.k5.a6().k5();
   }

   @Override
   public int getHeight(int imageIndex) throws IOException {
      this.n5(imageIndex);
      this.n5();
      return this.k5.a6().l6();
   }

   @Override
   public Iterator<ImageTypeSpecifier> getImageTypes(int imageIndex) throws IOException {
      this.n5(imageIndex);
      this.n5();
      int var2 = this.k5.a6().u3();
      int var3 = this.k5.a6().a6();
      ArrayList var4 = new ArrayList(1);
      if (this.u3) {
         this.n5(var4);
      } else {
         switch (var3) {
            case 0:
               this.n5(var4, var2);
               break;
            case 1:
            case 5:
            default:
               throw new ArgumentOutOfRangeException(
                  "PNG image type should be on of (0 - Greyscale, 2 - Truecolour, 3 - Indexed-colour, 4 - Greyscale with alpha, 6 - Truecolour with alpha) but got "
                     + var3
               );
            case 2:
               this.u3(var4, var2);
               break;
            case 3:
               this.k5(var4, var2);
               break;
            case 4:
               this.l6(var4, var2);
               break;
            case 6:
               this.a6(var4, var2);
         }
      }

      return var4.iterator();
   }

   private void n5(List<ImageTypeSpecifier> var1, int var2) {
      if (var2 != 1) {
         throw new ArgumentOutOfRangeException("BitDepth for Greyscale PNG image should be 1 but got " + var2);
      }

      var1.add(com.aspose.slides.internal.v4y.n5.l6(var2));
   }

   private void l6(List<ImageTypeSpecifier> var1, int var2) {
      throw new ArgumentOutOfRangeException("Greyscale with alpha PNG image should be converted into PixelFormat.Format32bppArgb");
   }

   private void k5(List<ImageTypeSpecifier> var1, int var2) {
      if (var2 != 1 && var2 != 4 && var2 != 8) {
         throw new ArgumentOutOfRangeException("BitDepth for Indexed-colour PNG image should be one of (1, 4, 8) but got " + var2);
      }

      byte[] var3 = this.k5.k5().k5()[0];
      byte[] var4 = this.k5.k5().k5()[1];
      byte[] var5 = this.k5.k5().k5()[2];
      var1.add(com.aspose.slides.internal.v4y.n5.n5(var2, var3, var4, var5));
   }

   private void u3(List<ImageTypeSpecifier> var1, int var2) {
      if (var2 != 8 && var2 != 16) {
         throw new ArgumentOutOfRangeException("BitDepth for Truecolour PNG image should be one of (8, 16) but got " + var2);
      }

      var1.add(ImageTypeSpecifier.createFromBufferedImageType(5));
      var1.add(ImageTypeSpecifier.createFromBufferedImageType(1));
      var1.add(ImageTypeSpecifier.createFromBufferedImageType(4));
   }

   private void a6(List<ImageTypeSpecifier> var1, int var2) {
      if (var2 != 8 && var2 != 16) {
         throw new ArgumentOutOfRangeException("BitDepth for Truecolour with alpha PNG image should be one of (8, 16) but got " + var2);
      }

      this.n5(var1);
   }

   private void n5(List<ImageTypeSpecifier> var1) {
      var1.add(ImageTypeSpecifier.createFromBufferedImageType(6));
      var1.add(ImageTypeSpecifier.createFromBufferedImageType(2));
   }

   @Override
   public IIOMetadata getStreamMetadata() throws IOException {
      return null;
   }

   @Override
   public IIOMetadata getImageMetadata(int imageIndex) throws IIOException {
      this.n5(imageIndex);
      this.n5();
      return this.k5;
   }

   @Override
   public BufferedImage read(int imageIndex, ImageReadParam param) throws IOException {
      this.n5(imageIndex);
      BufferedImage var3 = this.n5(param);
      return this.n5(var3, imageIndex);
   }

   private BufferedImage n5(ImageReadParam var1) throws IOException {
      this.n5();
      int var2 = this.l6.n5.n5;
      int var3 = this.l6.n5.l6;
      BufferedImage var4 = getDestination(var1, this.getImageTypes(0), var2, var3);

      try {
         u9 var5 = this.n5(this.k5.a6().a6(), var4);
         var5.n5();
      } catch (z1 var6) {
      }

      this.l6.a6();
      return var4;
   }

   private u9 n5(int var1, BufferedImage var2) {
      switch (var1) {
         case 0:
            if (this.l6.n5.t2 == 1) {
               return new com.aspose.slides.internal.e8p.n5(this.l6, var2);
            }

            return new k5(this.l6, var2);
         case 1:
         case 5:
         default:
            throw new ArgumentOutOfRangeException("colorModel", "should be Gray(0), GrayAlpha(4), Palette(3), Rgb(2), Rgba(6)");
         case 2:
            if (this.l6.n5.t2 > 32) {
               return new h0(this.l6, var2);
            } else {
               if (this.u3) {
                  return new t2(this.l6, var2);
               }

               return new c8(this.l6, var2);
            }
         case 3:
            if (this.u3) {
               return new a6(this.l6, var2);
            }

            return new u3(this.l6, var2);
         case 4:
            return new l6(this.l6, var2);
         case 6:
            return this.l6.n5.t2 > 32 ? new s7(this.l6, var2) : new com.aspose.slides.internal.e8p.x8(this.l6, var2);
      }
   }

   private BufferedImage n5(BufferedImage var1, int var2) throws IIOException {
      Hashtable var3 = new Hashtable();
      int var4 = this.l6.n5.t2;
      double[] var5 = this.k5.n5();
      if (var5[0] > 0.0 && var5[1] > 0.0) {
         var3.put("dpiX", (float)var5[0]);
         var3.put("dpiY", (float)var5[1]);
      }

      var3.put("bitspPixel", var4);
      if (this.u3) {
         var3.put("pixelFormat", 2498570);
         var3.put("bitspPixel", 32);
      }

      return new BufferedImage(var1.getColorModel(), var1.getRaster(), var1.isAlphaPremultiplied(), var3);
   }

   private void k5() {
      if (this.input == null) {
         throw new InvalidOperationException("No input source set!");
      }
   }

   private void n5(int var1) {
      if (var1 != 0) {
         throw new IndexOutOfBoundsException("imageIndex != 0!");
      }
   }

   private static InputStream n5(ImageInputStream var0) {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         if (var0 == null) {
            return null;
         }

         var0.mark();
         byte[] var2 = new byte[1024];

         int var3;
         while ((var3 = var0.read(var2)) > -1) {
            var1.write(var2, 0, var3);
         }

         var1.flush();
         ByteArrayInputStream var4 = new ByteArrayInputStream(var1.toByteArray());
         var0.reset();
         return var4;
      } catch (IOException var5) {
         return null;
      }
   }
}
