package com.aspose.slides.internal.m4d;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;

public class k5 extends ImageReader {
   private e2 n5 = null;
   private byte[] l6 = null;
   private boolean k5 = false;
   private com.aspose.slides.internal.e2l.u9 u3 = null;
   private com.aspose.slides.internal.e2l.u3 a6 = null;
   private List<com.aspose.slides.internal.v2x.k5> u9 = null;
   private int h0 = 0;
   private boolean c8 = false;
   private boolean t2 = false;
   private Map<Integer, Integer> s7 = new HashMap<>();
   private a6 x8 = null;
   private n5 n3 = null;

   public k5(ImageReaderSpi var1) {
      super(var1);
   }

   @Override
   public void setInput(Object input) {
      if (input instanceof t4) {
         this.n5 = com.aspose.slides.internal.l6o.l6.n5((t4)input);
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

      this.l6 = this.n5.toArray();
   }

   @Override
   public void dispose() {
      this.n5 = null;
      this.l6 = null;
      this.u3 = null;
      this.a6 = null;
      this.u9 = null;
      this.s7 = null;
      this.x8 = null;
      this.n3 = null;
   }

   @Override
   public int getNumImages(boolean allowSearch) throws IOException {
      this.n5();
      return this.h0;
   }

   @Override
   public int getWidth(int imageIndex) throws IOException {
      this.n5(imageIndex);
      this.n5();
      return this.u9.get_Item(imageIndex).t9();
   }

   @Override
   public int getHeight(int imageIndex) throws IOException {
      this.n5(imageIndex);
      this.n5();
      return this.u9.get_Item(imageIndex).n3();
   }

   @Override
   public Iterator<ImageTypeSpecifier> getImageTypes(int imageIndex) throws IOException {
      this.n5(imageIndex);
      ArrayList var2 = new ArrayList(1);
      if (this.c8) {
         var2.add(ImageTypeSpecifier.createFromBufferedImageType(6));
      } else {
         h0 var3 = this.x8.l6(imageIndex);
         byte[] var4 = null;
         if (var3.n5 >= 0) {
            var4 = new byte[var3.a6];
            Arrays.fill(var4, (byte)-1);
            var4[var3.n5] = 0;
         }

         var2.add(ImageTypeSpecifier.createIndexed(var3.l6, var3.k5, var3.u3, var4, var3.u9, 0));
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
      com.aspose.slides.internal.v2x.k5 var2 = this.u9.get_Item(imageIndex);
      return new l6(this.u3, this.a6, var2, this.s7.get(imageIndex), this.l6, this.t2);
   }

   @Override
   public BufferedImage read(int imageIndex, ImageReadParam param) throws IOException {
      this.n5(imageIndex);
      this.n5();
      if (param == null) {
         param = this.getDefaultReadParam();
      }

      if (imageIndex >= this.u9.size()) {
         return null;
      }

      BufferedImage var3 = null;
      if (imageIndex == 0) {
         var3 = this.n3.n5(imageIndex);
      } else {
         var3 = new c8(this.a6.l6(), this.a6.k5(), this.n3.n5(), imageIndex, this.n3);
      }

      return var3;
   }

   private synchronized void n5() {
      if (!this.k5) {
         if (this.n5 == null) {
            throw new IllegalArgumentException("input object was not set");
         }

         a0 var1 = new a0(this.n5);
         com.aspose.slides.internal.o9i.n5 var2 = new com.aspose.slides.internal.o9i.n5();
         this.u3 = (com.aspose.slides.internal.e2l.u9)var2.n5(var1, null);
         this.a6 = this.u3.m3();
         com.aspose.slides.internal.e2l.h0[] var3 = this.u3.q0();
         if (this.n5(var3) && var3.length > 1) {
            this.u3.k7();
            this.u3.n5(new com.aspose.slides.internal.v2x.u3());
            this.u3.n5((com.aspose.slides.internal.e2l.h0)(this.n5(this.u3, var3)));
            this.t2 = true;
         }

         var3 = this.u3.q0();
         this.u9 = new List<>();

         for (com.aspose.slides.internal.e2l.h0 var7 : var3) {
            if (var7 instanceof com.aspose.slides.internal.v2x.k5) {
               this.u9.addItem((com.aspose.slides.internal.v2x.k5)var7);
               this.h0++;
            } else if (var7 instanceof com.aspose.slides.internal.v2x.u3 && ((com.aspose.slides.internal.v2x.u3)var7).k5()) {
               this.s7.put(this.h0, ((com.aspose.slides.internal.v2x.u3)var7).l6() & 255);
            }
         }

         if (this.u9.size() > 1 || this.t2) {
            this.c8 = true;
         }

         this.x8 = new a6(this.u3, this.u9, this.s7);
         this.n3 = new n5(this.u3, this.u9, this.c8, this.x8);
         this.k5 = true;
      }
   }

   private boolean n5(com.aspose.slides.internal.e2l.h0[] var1) {
      for (com.aspose.slides.internal.e2l.h0 var5 : var1) {
         if (!(var5 instanceof com.aspose.slides.internal.v2x.k5)) {
            return false;
         }
      }

      return true;
   }

   private com.aspose.slides.internal.v2x.k5 n5(com.aspose.slides.internal.e2l.u9 var1, com.aspose.slides.internal.e2l.h0[] var2) {
      com.aspose.slides.internal.v2x.k5 var3 = new com.aspose.slides.internal.v2x.k5(var1.t9(), var1.n3());
      int[] var4 = new int[var1.t9() * var1.n3()];

      for (com.aspose.slides.internal.e2l.h0 var8 : var2) {
         if (var8 instanceof com.aspose.slides.internal.v2x.k5) {
            com.aspose.slides.internal.v2x.k5 var9 = (com.aspose.slides.internal.v2x.k5)var8;
            int[] var10 = var9.k5(var9.s7());
            int var11 = var9.z8();
            int var12 = var9.n3() + var11;
            int var13 = var9.m3();
            int var14 = var9.t9() + var13;
            int var15 = var13 + var11 * var3.t9();
            int var16 = 0;

            for (int var17 = var11; var17 < var12; var17++) {
               System.arraycopy(var10, var16, var4, var15, var9.t9());
               var16 += var9.t9();
               var15 += var9.t9();
               var15 += var13 + (var3.t9() - var14);
            }
         }
      }

      var3.l6(var3.s7(), var4);
      return var3;
   }

   private void n5(int var1) {
      if (var1 < 0) {
         throw new IndexOutOfBoundsException("imageIndex < 0!");
      }
   }
}
