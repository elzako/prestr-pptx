package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import java.awt.Dimension;
import java.io.OutputStream;

final class u4i implements IImage {
   private final com.aspose.slides.internal.o9b.t4 n5;

   public static u4i n5(com.aspose.slides.internal.o9b.t4 var0) {
      return var0 != null ? new u4i(var0) : null;
   }

   u4i(byte[] var1) {
      this.n5 = this.n5(var1);
   }

   u4i(com.aspose.slides.internal.o9b.t4 var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.o9b.t4 n5() {
      return this.n5;
   }

   @Override
   public final void save(String filename) {
      this.n5.l6(filename);
   }

   @Override
   public final void save(String filename, int format) {
      this.n5.n5(filename, f2o.n5(format));
   }

   @Override
   public final void save(OutputStream stream, int format) {
      com.aspose.slides.internal.l6o.l6.n5(new u4i$1(this, stream, format));
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1, int var2) {
      this.n5.n5(var1, f2o.n5(var2));
   }

   @Override
   public final void save(String filename, int format, int quality) {
      if (quality < 0 || quality > 100) {
         throw new ArgumentOutOfRangeException("quality", "Quality value must be between 0 and 100.");
      }

      if (format == 5) {
         com.aspose.slides.internal.j9e.h0 var4 = new com.aspose.slides.internal.j9e.h0(1);
         var4.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.a6, (long)quality);
         this.n5.n5(filename, com.aspose.slides.internal.s5.h0.n5(f2o.n5(format)), var4);
      } else {
         this.n5.n5(filename, f2o.n5(format));
      }
   }

   @Override
   public final void save(OutputStream stream, int format, int quality) {
      com.aspose.slides.internal.l6o.l6.n5(new u4i$2(this, stream, format, quality));
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1, int var2, int var3) {
      if (var3 < 0 || var3 > 100) {
         throw new ArgumentOutOfRangeException("quality", "Quality value must be between 0 and 100.");
      }

      if (var2 == 5) {
         com.aspose.slides.internal.j9e.h0 var4 = new com.aspose.slides.internal.j9e.h0(1);
         var4.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.a6, (long)var3);
         this.n5.n5(var1, com.aspose.slides.internal.s5.h0.n5(f2o.n5(var2)), var4);
      } else {
         this.n5.n5(var1, f2o.n5(var2));
      }
   }

   @Override
   public final Dimension getSize() {
      return com.aspose.slides.internal.o9b.p8.l6(this.l6());
   }

   com.aspose.slides.internal.o9b.p8 l6() {
      return new com.aspose.slides.internal.o9b.p8(this.getWidth(), this.getHeight());
   }

   @Override
   public final int getWidth() {
      return this.n5.e2();
   }

   @Override
   public final int getHeight() {
      return this.n5.h0();
   }

   @Override
   public final void dispose() {
      if (this.n5 != null) {
         this.n5.dispose();
      }
   }

   private com.aspose.slides.internal.o9b.t4 n5(byte[] var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(var1);
      if (com.aspose.slides.internal.n8e.k7.h0(var2.toArray())) {
         com.aspose.slides.internal.y6.l6 var3 = com.aspose.slides.internal.y6.l6.n5(var2);
         return var3.u3();
      } else {
         return com.aspose.slides.internal.o9b.t4.n5(var2);
      }
   }
}
