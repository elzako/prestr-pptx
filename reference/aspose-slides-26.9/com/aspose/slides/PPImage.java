package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public class PPImage implements IPPImage, IDisposable {
   private com.aspose.slides.internal.c8m.y8 n5 = null;
   private final c6q l6 = new c6q();
   private final com.aspose.slides.ms.System.o0 k5 = com.aspose.slides.ms.System.o0.l6().k5();
   private com.aspose.slides.internal.q7.c8 u3;
   private final IPresentation a6;
   private com.aspose.slides.internal.o9b.w1 u9 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.y2 h0 = new com.aspose.slides.internal.o9b.y2();
   private boolean c8 = false;
   private boolean t2 = false;
   private long s7;
   private long x8;
   private ISvgImage n3;

   PPImage(IPresentation presentation, byte[] data) {
      this(presentation);
      this.u3 = com.aspose.slides.internal.q7.h0.n5(data);
      this.e2();
   }

   PPImage(IPresentation presentation, com.aspose.slides.internal.q7.c8 blobHandler) {
      this(presentation);
      this.u3 = blobHandler;
      this.e2();
   }

   PPImage(IPresentation presentation, com.aspose.slides.internal.q7.c8 blobHandler, com.aspose.slides.internal.o9b.y2 imageFrame, long crc) {
      this(presentation);
      this.u3 = blobHandler;
      this.s7 = crc;
      imageFrame.u3(this.h0);
      this.e2();
   }

   PPImage(IPresentation presentation, com.aspose.slides.internal.q7.c8 blobHandler, long crc, com.aspose.slides.internal.o9b.y2 imageFrame) {
      this(presentation);
      this.u3 = blobHandler;
      this.s7 = crc;
      imageFrame.u3(this.h0);
   }

   private PPImage(IPresentation presentation) {
      if (presentation == null) {
         throw new ArgumentNullException("presentation");
      }

      this.a6 = presentation;
   }

   private void e2() {
      ((ImageCollection)this.a6.getImages()).n5(this);
   }

   @Override
   public final byte[] getBinaryData() {
      com.aspose.slides.internal.z0k.t4 var1 = this.a6().l6();

      byte[] var3;
      try {
         com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

         try {
            com.aspose.slides.internal.q7.n5.n5(var1, var2, com.aspose.slides.internal.q7.n5.n5);
            var3 = var2.toArray();
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }

      return var3;
   }

   @Override
   public final IImage getImage() {
      return u4i.n5(this.n5());
   }

   final com.aspose.slides.internal.o9b.t4 n5() {
      com.aspose.slides.internal.z0k.t4 var1 = this.a6().l6();
      com.aspose.slides.internal.z0k.e2 var2;
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.z0k.e2.class)) {
         var2 = (com.aspose.slides.internal.z0k.e2)var1;
      } else {
         var2 = new com.aspose.slides.internal.z0k.e2();
         com.aspose.slides.internal.q7.n5.n5(var1, var2, com.aspose.slides.internal.q7.n5.n5);
         var1.dispose();
      }

      var2.setPosition(0L);
      if (com.aspose.slides.internal.n8e.k7.h0(var2.toArray())) {
         com.aspose.slides.internal.y6.l6 var3 = com.aspose.slides.internal.y6.l6.n5(var2);
         return var3.u3();
      } else {
         return "image/unknown".equals(this.getContentType()) ? null : com.aspose.slides.internal.o9b.t4.n5(var2);
      }
   }

   @Override
   public final ISvgImage getSvgImage() {
      return this.n3;
   }

   @Override
   public final void setSvgImage(ISvgImage value) {
      if (value != null) {
         ((SvgImage)value).n5(this);
      }

      this.n3 = value;
   }

   @Override
   public final void replaceImage(byte[] newImageData) {
      if (newImageData == null) {
         throw new ArgumentNullException("newImageData");
      }

      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(newImageData);

      try {
         com.aspose.slides.internal.o9b.t4 var3 = com.aspose.slides.internal.o9b.t4.n5(var2);

         byte[] var4;
         try {
            if (com.aspose.slides.ms.System.o0.n5(var3.x8().n5(), com.aspose.slides.internal.j9e.x8.u3().n5())
               || com.aspose.slides.ms.System.o0.n5(var3.x8().n5(), com.aspose.slides.internal.j9e.x8.n3().n5())) {
               var4 = newImageData;
            } else if (com.aspose.slides.ms.System.o0.n5(var3.x8().n5(), com.aspose.slides.internal.j9e.x8.c8().n5())) {
               com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

               try {
                  com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(var3);

                  try {
                     var6.n5(var5, var3.x8());
                  } finally {
                     if (var6 != null) {
                        var6.dispose();
                     }
                  }

                  var4 = var5.toArray();
               } finally {
                  if (var5 != null) {
                     var5.dispose();
                  }
               }
            } else {
               var4 = var2.toArray();
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }

         if (this.x8() != null) {
            ((Presentation)this.x8()).w1().n5(this.u3);
            this.u3 = ((Presentation)this.x8()).w1().n5(var4);
         } else {
            this.u3 = com.aspose.slides.internal.q7.h0.n5(newImageData);
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      this.n5(true);
   }

   @Override
   public final void replaceImage(IImage newImage) {
      com.aspose.slides.internal.o9b.t4 var2 = ((u4i)newImage).n5();
      if (var2 == null) {
         throw new ArgumentNullException("newImage");
      }

      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

      try {
         var2.n5(var3, var2.x8());
         if (this.x8() != null) {
            ((Presentation)this.x8()).w1().n5(this.u3);
            this.u3 = ((Presentation)this.x8()).w1().n5(var3.toArray());
         } else {
            this.u3 = com.aspose.slides.internal.q7.h0.n5(var3.toArray());
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      this.n5(true);
   }

   @Override
   public final void replaceImage(IPPImage newImage) {
      if (newImage == null) {
         throw new ArgumentNullException("newImage");
      }

      if (this.x8() != null) {
         if (com.aspose.slides.ms.System.o0.n5(this.n3(), ((PPImage)newImage).n3())) {
            return;
         }

         ((Presentation)this.x8()).w1().n5(this.u3);
         this.u3 = ((Presentation)this.x8()).w1().n5(newImage.getBinaryData());
      } else {
         this.u3 = com.aspose.slides.internal.q7.h0.n5(newImage.getBinaryData());
      }

      this.n5(true);
      this.setSvgImage(newImage.getSvgImage());
   }

   final com.aspose.slides.internal.c8m.y8 l6() {
      if (this.n5 == null) {
         this.n5 = n5(this.a6());
      }

      return this.n5;
   }

   @Override
   public final String getContentType() {
      return this.l6().n5();
   }

   final com.aspose.slides.internal.o9b.y2 k5() {
      this.n5(false);
      return this.h0;
   }

   @Override
   public final int getWidth() {
      return this.k5().t2();
   }

   @Override
   public final int getHeight() {
      return this.k5().l6();
   }

   @Override
   public final int getX() {
      return this.k5().s7();
   }

   @Override
   public final int getY() {
      return this.k5().x8();
   }

   final c6q u3() {
      return this.l6;
   }

   final com.aspose.slides.internal.q7.c8 a6() {
      if (this.u3 == null && this.getSvgImage() != null) {
         boolean var1 = false;
         boolean[] var2 = new boolean[]{false};
         com.aspose.slides.internal.z0k.e2 var3 = ((ImageCollection)this.a6.getImages()).n5(this.getSvgImage(), Float.NaN, Float.NaN, 4.0F, var2);
         var1 = var2[0];
         this.u3 = ((Presentation)this.a6).w1().n5(com.aspose.slides.internal.q7.n5.n5(var3));
      }

      return this.u3;
   }

   final long u9() {
      if ((this.s7 & 4294967295L) == 0L) {
         this.s7 = n5(this.h0());
      }

      return this.s7;
   }

   static long n5(byte[] var0) {
      return com.aspose.slides.internal.h3k.u3.n5(var0);
   }

   final byte[] h0() {
      return this.a6().n5();
   }

   final com.aspose.slides.internal.o9b.t4 c8() {
      return com.aspose.slides.internal.n8e.k7.x8(this.h0());
   }

   final com.aspose.slides.internal.o9b.w1 t2() {
      this.n5(false);
      return this.u9;
   }

   final boolean s7() {
      this.n5(false);
      return this.c8;
   }

   final IPresentation x8() {
      return this.a6;
   }

   final com.aspose.slides.ms.System.o0 n3() {
      return this.k5;
   }

   final long y4() {
      return (this.x8 & 4294967295L) + (this.l6.k5() & 4294967295L) & 4294967295L;
   }

   final com.aspose.slides.internal.s5.c8 n5(i2h var1, com.aspose.slides.internal.s5.c8 var2) {
      if (var2.n5()) {
         return var2;
      }

      if (!"image/x-emf".equals(this.getContentType()) && !"image/x-wmf".equals(this.getContentType())) {
         com.aspose.slides.internal.o9b.p8 var3 = com.aspose.slides.internal.n2d.s7.n5().u3();
         com.aspose.slides.internal.y3.u3 var4 = new com.aspose.slides.internal.y3.u3(this.getBinaryData());
         if (com.aspose.slides.internal.v6g.k5.u3(var4.t9().l6() * this.t2().l6() / 96.0F, 13) > var3.l6()) {
            double var5 = 0.98;
            double var7 = 0.0;
            double var9 = 0.0;
            double var11 = (float)var3.l6() / this.getWidth();
            double var13 = (float)var3.k5() / this.getHeight();
            if (var11 < 0.98) {
               double var15 = var1.l6 * var11;
               double var17 = 100.0 - var15 - (100.0 - var1.l6 - var1.u3) * var11;
               if (var13 < 0.98) {
                  var13 *= var5;
                  var7 = var1.k5 * var13;
                  var9 = 100.0 - var7 - (100.0 - var1.k5 - var1.a6) * var13;
               }

               var2 = new com.aspose.slides.internal.s5.c8(var15 / 100.0, var17 / 100.0, var7 / 100.0, var9 / 100.0);
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   private void t9() {
      this.x8++;
   }

   private void n5(boolean var1) {
      if (!this.t2 || var1) {
         com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(this.a6().n5());

         try {
            com.aspose.slides.internal.c8m.y8[] var3 = new com.aspose.slides.internal.c8m.y8[]{this.n5};
            com.aspose.slides.internal.o9b.w1[] var4 = new com.aspose.slides.internal.o9b.w1[]{this.u9};
            boolean[] var5 = new boolean[]{this.c8};
            com.aspose.slides.internal.o9b.y2[] var6 = new com.aspose.slides.internal.o9b.y2[]{this.h0};
            n5(var2, var3, var4, var5, var6);
            this.n5 = var3[0];
            var4[0].n5(this.u9);
            this.c8 = var5[0];
            var6[0].u3(this.h0);
            this.t2 = true;
            this.t9();
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      }
   }

   static void n5(com.aspose.slides.internal.z0k.t4 var0, com.aspose.slides.internal.c8m.y8[] var1, com.aspose.slides.internal.o9b.y2[] var2) {
      com.aspose.slides.internal.o9b.w1 var3 = new com.aspose.slides.internal.o9b.w1();
      boolean var4 = false;
      com.aspose.slides.internal.o9b.w1[] var5 = new com.aspose.slides.internal.o9b.w1[]{var3};
      boolean[] var6 = new boolean[]{false};
      n5(var0, var1, var5, var6, var2);
      var5[0].n5(var3);
      var4 = var6[0];
   }

   static void n5(
      com.aspose.slides.internal.z0k.t4 var0,
      com.aspose.slides.internal.c8m.y8[] var1,
      com.aspose.slides.internal.o9b.w1[] var2,
      boolean[] var3,
      com.aspose.slides.internal.o9b.y2[] var4
   ) {
      com.aspose.slides.internal.y3.u3 var5 = new com.aspose.slides.internal.y3.u3(var0);
      var0.setPosition(0L);
      var1[0] = n5(var0);
      var0.setPosition(0L);
      if (var5.z1() == 0) {
         var0.setPosition(0L);

         try {
            com.aspose.slides.internal.o9b.t4 var6 = com.aspose.slides.internal.o9b.t4.n5(var0);

            try {
               var2[0] = new com.aspose.slides.internal.o9b.w1(com.aspose.slides.internal.n2d.m1.n5(var6), com.aspose.slides.internal.n2d.m1.l6(var6));
               var3[0] = false;
               var4[0] = new com.aspose.slides.internal.o9b.y2(0, 0, var6.e2(), var6.h0());
            } finally {
               if (var6 != null) {
                  var6.dispose();
               }
            }
         } catch (RuntimeException var11) {
            var0.seek(0L, 0);
            var2[0] = new com.aspose.slides.internal.o9b.w1(96.0F, 96.0F);
            var3[0] = false;
            com.aspose.slides.internal.o9b.y2.n5.u3(var4[0]);
         }
      } else {
         var2[0] = new com.aspose.slides.internal.o9b.w1(var5.s7(), var5.x8());
         var3[0] = true;
         com.aspose.slides.internal.o9b.y2.n5(var5.n3().y4()).u3(var4[0]);
      }
   }

   private static com.aspose.slides.internal.c8m.y8 n5(com.aspose.slides.internal.q7.c8 var0) {
      com.aspose.slides.internal.z0k.t4 var1 = var0.l6();

      try {
         return n5(var1);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.c8m.y8 n5(com.aspose.slides.internal.z0k.t4 var0) {
      byte[] var1 = new byte[(int)com.aspose.slides.internal.q7.n5.n5];
      var0.read(var1, 0, var1.length);
      return l6(var1);
   }

   static com.aspose.slides.internal.c8m.y8 l6(byte[] var0) {
      switch (com.aspose.slides.internal.k4d.a6.l6(var0)) {
         case 1:
            return new com.aspose.slides.internal.c8m.d1();
         case 2:
            return new com.aspose.slides.internal.c8m.k8();
         case 3:
            return new com.aspose.slides.internal.c8m.c3();
         case 4:
            return new com.aspose.slides.internal.c8m.h6();
         case 5:
            return new com.aspose.slides.internal.c8m.l4();
         case 6:
            return new com.aspose.slides.internal.c8m.p6();
         case 7:
            return new com.aspose.slides.internal.c8m.s4();
         case 8:
            return new com.aspose.slides.internal.c8m.a7();
         default:
            return new com.aspose.slides.internal.c8m.r8();
      }
   }

   @Override
   public int hashCode() {
      return (int)this.u9();
   }

   @Override
   public final void dispose() {
      if (this.u3 != null) {
         this.u3.dispose();
      }
   }
}
