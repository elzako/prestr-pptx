package com.aspose.slides.internal.d2a;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.b7s.q0;
import com.aspose.slides.internal.n6h.a6;
import com.aspose.slides.internal.r1x.k7;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;

public class l6 extends ImageReader {
   private t4 n5 = null;
   private v3 l6 = null;
   private q0 k5 = null;
   private boolean u3 = false;

   public l6(ImageReaderSpi var1) {
      super(var1);
   }

   @Override
   public void setInput(Object input) {
      if (input instanceof t4) {
         this.n5 = (t4)input;
      } else if (input instanceof ImageInputStream) {
         try {
            this.n5 = com.aspose.slides.internal.t5g.u3.u3((ImageInputStream)input);
         } catch (IOException var3) {
            this.n5 = null;
         }
      }

      if (this.n5 == null) {
         throw new IllegalArgumentException("Incorrect input type!");
      }

      this.l6 = new v3(this.n5);
   }

   @Override
   public void dispose() {
      if (this.l6 != null) {
         a6.n5(this.l6);
         this.l6 = null;
      }

      if (this.k5 != null) {
         this.k5.dispose();
         this.k5 = null;
      }
   }

   private void n5() throws IOException {
      if (!this.u3) {
         if (this.n5 == null) {
            throw new IllegalArgumentException("input object was not set");
         }

         com.aspose.slides.internal.e5q.n5 var1 = new com.aspose.slides.internal.e5q.n5();
         this.k5 = (q0)var1.n5(this.l6, null);
         if (this.k5 == null) {
            throw new IOException("Unable to read jpeg Image");
         }

         this.k5.e5().k5(100);
         if (this.k5.e5().z1() == 2) {
            if (this.k5.u6() == null) {
               this.k5.l6(k7.n5());
            }

            if (this.k5.v4() == null) {
               this.k5.n5(k7.l6());
            }
         }

         if (this.k5.e5().z1() == 3) {
            this.k5.u3(true);
         }

         this.u3 = true;
      }
   }

   @Override
   public int getNumImages(boolean allowSearch) throws IOException {
      this.n5();
      return 1;
   }

   @Override
   public int getWidth(int imageIndex) throws IOException {
      this.n5(imageIndex);
      this.n5();
      return this.k5.z1();
   }

   @Override
   public int getHeight(int imageIndex) throws IOException {
      this.n5(imageIndex);
      this.n5();
      return this.k5.y4();
   }

   @Override
   public Iterator<ImageTypeSpecifier> getImageTypes(int imageIndex) throws IOException {
      this.n5(imageIndex);
      this.n5();
      ArrayList var2 = new ArrayList(1);
      switch (this.k5.e5().z1()) {
         case 0:
            var2.add(com.aspose.slides.internal.v4y.n5.l6(8));
            break;
         case 1:
            var2.add(ImageTypeSpecifier.createFromBufferedImageType(5));
            break;
         case 2:
            if (com.aspose.slides.internal.d2a.u3.n5(this.k5.e5().z1())) {
               var2.add(com.aspose.slides.internal.v4y.n5.n5(this.k5.u6().n5(), this.k5.v4().n5()));
            } else {
               var2.add(ImageTypeSpecifier.createFromBufferedImageType(5));
            }
            break;
         case 3:
            if (com.aspose.slides.internal.d2a.u3.l6(this.k5.e5().z1())) {
               var2.add(com.aspose.slides.internal.v4y.n5.k5());
            } else {
               var2.add(ImageTypeSpecifier.createFromBufferedImageType(5));
            }
            break;
         case 4:
            var2.add(ImageTypeSpecifier.createFromBufferedImageType(5));
            break;
         default:
            throw new ArgumentException(d1.n5("Jpeg Compression {0} is not supported", new Object[]{this.k5.e5().z1()}));
      }

      return var2.iterator();
   }

   @Override
   public IIOMetadata getStreamMetadata() throws IOException {
      return null;
   }

   @Override
   public IIOMetadata getImageMetadata(int imageIndex) throws IOException {
      this.n5(imageIndex);
      this.n5();
      return new n5(this.k5.e5());
   }

   @Override
   public BufferedImage read(int imageIndex, ImageReadParam param) throws IOException {
      this.n5(imageIndex);
      this.n5();
      BufferedImage var3 = getDestination(param, this.getImageTypes(imageIndex), this.getWidth(imageIndex), this.getHeight(imageIndex));
      v4 var4 = this.k5.y1();
      if (!com.aspose.slides.internal.d2a.u3.n5(this.k5.e5().z1()) && !com.aspose.slides.internal.d2a.u3.l6(this.k5.e5().z1())) {
         var4 = v4.u3();
      }

      com.aspose.slides.internal.l9a.k5 var5 = (com.aspose.slides.internal.l9a.k5)this.k5.f2().l6();
      var5.n5(var4, this.k5, var3);
      this.k5.a6(this.k5.x8());
      return com.aspose.slides.internal.d2a.u3.n5(var3, this.k5);
   }

   private void n5(int var1) {
      if (var1 < 0) {
         throw new IndexOutOfBoundsException("imageIndex < 0!");
      }
   }
}
