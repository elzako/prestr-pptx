package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.UriFormatException;
import com.aspose.slides.internal.e1.t4$n5;
import com.aspose.slides.ms.System.IDisposable;

final class w2 extends e3 {
   private IOleObjectFrame c8;
   private final float t2;
   private final float s7;
   private com.aspose.slides.internal.o9b.f2 x8 = new com.aspose.slides.internal.o9b.f2();
   private com.aspose.slides.internal.w0.l6 n3;
   private com.aspose.slides.internal.w0.s7 y4;
   private com.aspose.slides.internal.w0.c8 e2;
   private com.aspose.slides.internal.e1.t2 t9 = new com.aspose.slides.internal.e1.t2();
   private com.aspose.slides.internal.e1.z3 z1;
   private IHyperlink t4;
   private IHyperlink q0;
   private boolean z3;
   private final boolean m1;
   private com.aspose.slides.internal.o9b.y1 k7 = new com.aspose.slides.internal.o9b.y1();
   private final k6j m3;
   private List<Integer> z8;
   private y4x j5;
   private boolean w1;

   w2(int var1, int var2, float var3, float var4, boolean var5, y4x var6, k6j var7, List<Integer> var8) {
      super((com.aspose.slides.internal.o9b.l6)null);
      if (var7 == null) {
         throw new ArgumentNullException("fontsManager");
      }

      this.j5 = var6;
      this.m3 = var7;
      this.t2 = var3;
      this.s7 = var4;
      this.m1 = var5;
      this.z8 = var8;
      com.aspose.slides.internal.o9b.f2 var9 = new com.aspose.slides.internal.o9b.f2(
         (float)com.aspose.slides.internal.n2d.t2.l6(var1, 72.0), (float)com.aspose.slides.internal.n2d.t2.l6(var2, 72.0)
      );
      this.x8 = new com.aspose.slides.internal.o9b.f2(var1, var2);
      this.e2 = new com.aspose.slides.internal.w0.c8();
      this.k7 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, 0.0F, 0.0F);
      this.n5(var9.a6());
   }

   final IOleObjectFrame n5() {
      return this.c8;
   }

   final void n5(IOleObjectFrame var1) {
      this.c8 = var1;
   }

   final boolean l6() {
      return this.j5.y4 == null ? false : ((PdfOptions)this.j5.y4).l6().l6();
   }

   public final IPdfOptions k5() {
      return this.j5.y4;
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.s7 var1, l6v var2, a1v var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var3, q3d.class) && this.n5(var1, var2, (q3d)var3, true)) {
         q3d var17 = (q3d)var3;
         if (this.n5(var17.w1(), !var17.t9().n5())) {
            this.l6(var17);
         } else {
            this.n5(var17);
         }
      } else {
         boolean var4 = false;
         boolean var5 = false;
         var1.s7().a6(this.k7);
         byte var6 = 0;
         if (com.aspose.slides.internal.v6g.k5.l6(var3, m2a.class)) {
            m2a var7 = (m2a)var3;
            com.aspose.slides.internal.w0.y4 var8 = null;

            try {
               var8 = d4.n5(var7);
            } catch (RuntimeException var15) {
               com.aspose.slides.internal.n8e.v4.n5(var15);
               this.n3 = d4.l6(var3);
            }

            if (var8 != null) {
               com.aspose.slides.internal.w0.c8 var9 = this.q0();
               com.aspose.slides.internal.x4g.m1 var10 = new com.aspose.slides.internal.x4g.m1(var9.u3(), var9.a6(), var9.u9(), var9.h0(), 0.0F, 0.0F);
               if (!var10.l6() && var10.k5()) {
                  var10.h0();
                  float[] var11 = var10.n5();
                  var8.n5(new com.aspose.slides.internal.w0.c8(var11[0], var11[1], var11[2], var11[3], 0.0F, 0.0F));
               }

               this.n3 = var8;
            }

            var5 = true;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var3, u4z.class)) {
            this.n3 = n5((u4z)var3);
            var5 = true;
         } else if (var3 != null && var3.u3() != 0) {
            this.n3 = d4.n5(var3);
            var5 = true;
         }

         if (var2 != null && var2.u9()) {
            var1.y4();
            boolean var18 = (var2.x8() != 0 || var2.s7() != 0) && !this.n5(var1);
            if (!var18 && (var2.l6() == -1 || var2.l6() == 0)) {
               if (com.aspose.slides.internal.v6g.k5.l6(var2.z3(), u4z.class) && !((u4z)var2.z3()).r4()) {
                  this.n3 = n5((u4z)var2.z3());
                  com.aspose.slides.internal.o9b.m3 var20 = var2.q0();

                  try {
                     var1.n5(var20);
                  } finally {
                     if (var20 != null) {
                        var20.dispose();
                     }
                  }

                  var5 = true;
               } else {
                  this.y4 = var2.t4();
                  var4 = true;
               }
            } else {
               com.aspose.slides.internal.o9b.m3 var19 = var2.q0();
               if (var18) {
                  this.n5(var1, var2);
                  return;
               }

               this.l6.n5(var19, var1);
               com.aspose.slides.internal.n2d.y4.n5(var1, var19);
               if (var3 == null) {
                  this.n3 = new com.aspose.slides.internal.w0.n3(com.aspose.slides.internal.p1s.n5.n5(var2.h0().o8()));
                  var5 = true;
                  this.y4 = null;
                  var6 = 1;
               }
            }
         }

         this.n5(var1, var4, var5, var6);
      }
   }

   private void n5(com.aspose.slides.internal.x4g.s7 var1, l6v var2) {
      com.aspose.slides.internal.x4g.s7 var3 = null;
      com.aspose.slides.internal.x4g.s7 var4 = null;
      com.aspose.slides.internal.x4g.s7[] var5 = new com.aspose.slides.internal.x4g.s7[]{var3};
      com.aspose.slides.internal.x4g.s7[] var6 = new com.aspose.slides.internal.x4g.s7[]{var4};
      com.aspose.slides.internal.x4g.s7 var7 = n5(var1, var2, var5, var6);
      var3 = var5[0];
      var4 = var6[0];
      this.y4 = var2.t4();
      boolean var8 = true;
      boolean var9 = false;
      byte var10 = 1;
      if (var3 != null) {
         this.y4.l6(0);
      }

      if (var4 != null) {
         this.y4.k5(0);
      }

      this.n5(var7, var8, var9, var10);
      if (var2.u9 == null) {
         this.n3 = new com.aspose.slides.internal.w0.n3(com.aspose.slides.internal.p1s.n5.n5(var2.h0().o8()));
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2.u9, u4z.class)) {
         this.n3 = n5((u4z)var2.u9);
      } else {
         this.n3 = d4.n5(var2.u9);
      }

      if (var3 != null) {
         this.y4 = var2.t4();
         this.y4.l6(0);
         this.n5(var3, var2.s7());
      }

      if (var4 != null) {
         this.y4 = var2.t4();
         this.y4.k5(0);
         this.n5(var4, var2.x8());
      }
   }

   private void n5(com.aspose.slides.internal.x4g.s7 var1, byte var2) {
      if (var2 == 5) {
         this.y4.l6(2);
         this.y4.k5(2);
         this.y4.u9(0);
         this.y4.u3(0);
         this.n5(var1, true, false, 1);
      } else {
         this.y4 = null;
         this.n5(var1, true, true, 1);
      }
   }

   private void n5(q3d var1) {
      com.aspose.slides.internal.o9b.y1 var2 = var1.o0().y4();
      com.aspose.slides.internal.o9b.y1 var3 = var1.q0().y4();
      com.aspose.slides.internal.o9b.y1 var4 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var3.s7(), var3.k5());
      var1.k5(var4.y4());
      com.aspose.slides.internal.o9b.t4 var5 = var1.y1();
      com.aspose.slides.internal.o9b.p8 var6 = l6(var3.y4()).u3();
      com.aspose.slides.internal.o9b.y1[] var7 = new com.aspose.slides.internal.o9b.y1[]{var4};
      com.aspose.slides.internal.o9b.u6 var8 = d4.n5(var1, this, var7);
      var7[0].a6(var4);
      var1.l6(var4.y4());
      float var9 = 1.0F;
      if (n5(var1, var6.u3(), var8, var4.y4())) {
         float[] var10 = new float[]{1.0F};
         n5(var6.u3(), var8, var10).k5(var6);
         var9 = var10[0];
         var8.k5(var9, var9);
      }

      int var53 = var5.s7();
      if (com.aspose.slides.internal.n8e.k7.k5(var5)) {
         var53 = 2498570;
      }

      com.aspose.slides.internal.o9b.l6 var11 = new com.aspose.slides.internal.o9b.l6(var6.l6(), var6.k5(), var53);

      try {
         var11.n5();
         com.aspose.slides.internal.o9b.z1 var12 = com.aspose.slides.internal.o9b.z1.n5(var11);

         try {
            var12.c8(3);
            var12.a6(2);
            com.aspose.slides.internal.x4g.s7 var13 = new com.aspose.slides.internal.x4g.s7();
            var13.l6(new com.aspose.slides.internal.o9b.y1(var3.x8(), var3.n3(), var6.l6(), var6.k5()));
            float var14 = 1.0F / var8.c8().n5()[0];
            float var15 = 1.0F / var8.c8().n5()[3];
            if (var14 != 1.0F || var15 != 1.0F) {
               var8.u3(var3.x8() * var14 * 2.0F, var3.n3() * var15 * 2.0F);
            }

            com.aspose.slides.internal.o9b.u6 var16 = var8;

            try {
               var12.n5(var16, var13);
            } finally {
               if (var16 != null) {
                  var16.dispose();
               }
            }
         } finally {
            if (var12 != null) {
               var12.dispose();
            }
         }

         int var55 = com.aspose.slides.internal.v6g.k5.u3(var3.s7() * var9, 13);
         int var56 = com.aspose.slides.internal.v6g.k5.u3(var3.k5() * var9, 13);
         com.aspose.slides.internal.o9b.l6 var57 = new com.aspose.slides.internal.o9b.l6(var55, var56);

         byte[] var54;
         try {
            var57.n5();
            com.aspose.slides.internal.o9b.z1 var17 = com.aspose.slides.internal.o9b.z1.n5(var57);

            try {
               var17.c8(3);
               var17.a6(2);
               int var18 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var3.x8()), 14);
               int var19 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var3.n3()), 14);
               var17.n5(var11, new com.aspose.slides.internal.o9b.y2(0, 0, var55, var56), new com.aspose.slides.internal.o9b.y2(var18, var19, var55, var56), 2);
            } finally {
               if (var17 != null) {
                  var17.dispose();
               }
            }

            var54 = com.aspose.slides.internal.n8e.k7.n5((com.aspose.slides.internal.o9b.t4)var57);
         } finally {
            if (var57 != null) {
               var57.dispose();
            }
         }

         if (this.t4() != null) {
            com.aspose.slides.internal.k9.h0 var58 = com.aspose.slides.internal.k9.h0.n5(var54);
            com.aspose.slides.internal.o9b.t4 var60 = com.aspose.slides.internal.n8e.k7.x8(var54);
            this.t4().t4().n5(var58, new com.aspose.slides.internal.k9.u9(var60, var54));
         }

         int var59 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5((double)(var2.x8()), (short)((short)1)), 14);
         int var61 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5((double)(var2.n3()), (short)((short)1)), 14);
         com.aspose.slides.internal.e1.k7 var62 = new com.aspose.slides.internal.e1.k7(
            new com.aspose.slides.internal.o9b.w1(var59, var61), var2.c8().a6(), var54, new com.aspose.slides.internal.s5.c8(0.0, 0.0, 0.0, 0.0)
         );
         if (this.n5() != null) {
            var62.n5(
               com.aspose.slides.internal.z0k.z1.l6(this.n5().getEmbeddedFileName()),
               this.n5().getEmbeddedData().getEmbeddedFileExtension(),
               this.n5().getEmbeddedData().getEmbeddedFileData()
            );
         }

         var62.l6(var1.c8());
         this.n5(var62);
      } finally {
         if (var11 != null) {
            var11.dispose();
         }
      }
   }

   private void l6(q3d var1) {
      com.aspose.slides.internal.o9b.y1 var2 = var1.o0().y4();
      int var3 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5((double)(var2.x8()), (short)((short)1)), 14);
      int var4 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5((double)(var2.n3()), (short)((short)1)), 14);
      com.aspose.slides.internal.o9b.f2 var5 = new com.aspose.slides.internal.o9b.f2(var2.s7(), var2.k5());
      com.aspose.slides.internal.e1.t2 var6 = new com.aspose.slides.internal.e1.t2();
      com.aspose.slides.internal.k9.u9 var7 = var1.c4();
      byte[] var8;
      if (var7 != null && var7.u3()) {
         var8 = var7.a6();
      } else {
         var8 = ((PPImage)var1.w1().getImage()).h0();
      }

      if (!com.aspose.slides.internal.n8e.k7.k5(var8) && !com.aspose.slides.internal.n8e.k7.l6(var8)) {
         if (var7 == null || com.aspose.slides.internal.n8e.k7.a6(var8)) {
            ColorChange var23 = null;
            ColorChange[] var26 = new ColorChange[]{var23};
            boolean var28 = this.n5(var1.w1().getImageTransform(), var26) && var26[0].u3();
            var23 = var26[0];
            if (var28) {
               com.aspose.slides.internal.o9b.l6 var12 = new com.aspose.slides.internal.o9b.l6(new com.aspose.slides.internal.z0k.e2(var8));

               try {
                  com.aspose.slides.internal.o9b.l6 var13;
                  if (!com.aspose.slides.internal.o9b.t4.k5(var12.s7())) {
                     var13 = var12.n5(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var12.e2(), var12.h0()), 2498570);
                  } else {
                     var13 = var12;
                  }

                  com.aspose.slides.internal.n8e.n1.n5(var13, ((ColorFormat)var23.getToColor()).u3().o8(), 99);
                  com.aspose.slides.internal.z0k.e2 var14 = new com.aspose.slides.internal.z0k.e2();

                  try {
                     var13.n5(var14, com.aspose.slides.internal.j9e.x8.s7());
                     var8 = var14.toArray();
                  } finally {
                     if (var14 != null) {
                        var14.dispose();
                     }
                  }
               } finally {
                  if (var12 != null) {
                     var12.dispose();
                  }
               }
            }

            if (this.t4() != null) {
               com.aspose.slides.internal.k9.h0 var29 = com.aspose.slides.internal.k9.h0.n5(var8);
               com.aspose.slides.internal.o9b.t4 var30 = com.aspose.slides.internal.n8e.k7.x8(var8);
               this.t4().t4().n5(var29, new com.aspose.slides.internal.k9.u9(var30, var8));
            }
         }
      } else if (this.m1) {
         boolean var9 = var1.w1().getImage().getSvgImage() != null;
         float var10 = this.t4().z3() * (this.t4().y4() / 96.0F);
         com.aspose.slides.internal.o9b.f2 var11 = new com.aspose.slides.internal.o9b.f2(var5.l6() * var10, var5.k5() * var10);
         var8 = n5(var8, var11.a6(), this.t4().z3(), var9);
      }

      com.aspose.slides.internal.e1.k7 var25 = new com.aspose.slides.internal.e1.k7(
         new com.aspose.slides.internal.o9b.w1(var3, var4), var5.a6(), var8, var1.t9()
      );
      if (this.m1() != null && this.m1().isGrouped()) {
         var25.l6(this.m1().getParentGroup().isDecorative());
      } else {
         var25.l6(this.m1() != null && this.m1().a5());
      }

      if (this.n5() != null) {
         var25.n5(
            com.aspose.slides.internal.z0k.z1.l6(this.n5().getEmbeddedFileName()),
            this.n5().getEmbeddedData().getEmbeddedFileExtension(),
            this.n5().getEmbeddedData().getEmbeddedFileData()
         );
      }

      PictureFrame var27 = com.aspose.slides.internal.v6g.k5.n5(var1.y2().getParent_Immediate(), PictureFrame.class);
      if (var27 != null) {
         var25.n5(var27.getAlternativeText());
      }

      var6.n5(var25);
      var6.n5(this.n3().k5());
      this.n5(var6);
   }

   private boolean n5(IImageTransformOperationCollection var1, ColorChange[] var2) {
      var2[0] = null;
      if (var1 != null && var1.size() != 0) {
         IGenericEnumerator var3 = var1.iterator();

         try {
            while (var3.hasNext()) {
               IImageTransformOperation var4 = (IImageTransformOperation)var3.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var4, ColorChange.class)) {
                  var2[0] = (ColorChange)var4;
                  return true;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void n5(com.aspose.slides.internal.x4g.s7 var1, boolean var2, boolean var3, int var4) {
      com.aspose.slides.internal.o9b.w1[] var5 = var1.a6();
      byte[] var6 = var1.u9();
      int[] var7 = new int[var6.length];

      for (int var8 = 0; var8 < var6.length; var8++) {
         var7[var8] = var6[var8] & 255;
      }

      List var17 = new List();
      r1m var9 = null;

      for (int var10 = 0; var10 < var7.length; var10++) {
         if (var7[var10] == 0) {
            var9 = new r1m();
            var17.addItem(var9);
         }

         if (var9 != null) {
            if ((var7[var10] & 128) == 128) {
               var9.n5(true);
            }

            var9.n5(var5[var10].u3(), var7[var10]);
         }
      }

      com.aspose.slides.internal.e1.r4 var18 = new com.aspose.slides.internal.e1.r4();
      List$Enumerator var11 = var17.iterator();

      try {
         while (var11.hasNext()) {
            r1m var12 = (r1m)var11.next();
            com.aspose.slides.internal.e1.r4[] var13 = new com.aspose.slides.internal.e1.r4[]{var18};
            o6m.n5(var13, var12.k5(), var12.l6(), var12.n5());
            var18 = var13[0];
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }

      this.n5(var18, var2, var3, var4);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3) {
      this.n5(var1, new com.aspose.slides.internal.o9b.w1(var2, var3), new com.aspose.slides.internal.o9b.f2(var1.e2(), var1.h0()));
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3, int var4, int var5) {
      this.n5(var1, new com.aspose.slides.internal.o9b.w1(var2, var3), new com.aspose.slides.internal.o9b.f2(var4, var5));
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3) {
      this.n5(var1, new com.aspose.slides.internal.o9b.w1(var2, var3), new com.aspose.slides.internal.o9b.f2(var1.e2(), var1.h0()));
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3, float var4, float var5) {
      this.n5(var1, new com.aspose.slides.internal.o9b.w1(var2, var3), new com.aspose.slides.internal.o9b.f2(var4, var5));
   }

   private void n5(com.aspose.slides.internal.o9b.t4 var1, com.aspose.slides.internal.o9b.w1 var2, com.aspose.slides.internal.o9b.f2 var3) {
      byte[] var4 = null;
      if (this.t4() != null) {
         Dictionary$Enumerator var5 = this.t4().t4().l6().iterator();

         try {
            while (var5.hasNext()) {
               KeyValuePair var6 = (KeyValuePair)var5.next();
               if (((com.aspose.slides.internal.k9.u9)var6.getValue()).u3() && var1.equals(((com.aspose.slides.internal.k9.u9)var6.getValue()).k5())) {
                  var4 = ((com.aspose.slides.internal.k9.u9)var6.getValue()).a6();
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      if (var4 == null) {
         com.aspose.slides.internal.z0k.e2 var15 = new com.aspose.slides.internal.z0k.e2();

         try {
            var1.n5(var15, com.aspose.slides.internal.j9e.x8.s7());
            var4 = var15.toArray();
         } finally {
            if (var15 != null) {
               var15.dispose();
            }
         }
      }

      com.aspose.slides.internal.e1.k7 var16 = new com.aspose.slides.internal.e1.k7(
         var2.u3(), var3.a6(), var4, new com.aspose.slides.internal.s5.c8(0.0, 0.0, 0.0, 0.0)
      );
      var16.l6(this.w1 || this.m1() != null && (this.m1().a5() || com.aspose.slides.internal.v6g.k5.l6(this.m1(), Chart.class)));
      if (this.q0 != null && !this.z3) {
         IGeometryShape var17 = com.aspose.slides.internal.v6g.k5.n5(((Hyperlink)this.q0).s7(), IGeometryShape.class);
         if (var17 != null) {
            if (com.aspose.slides.internal.v6g.k5.l6(var17, Shape.class)) {
               ((Shape)var17).e5().s7().a6(this.k7);
            } else {
               this.k7 = new com.aspose.slides.internal.o9b.y1(var17.getX(), var17.getY(), var17.getWidth(), var17.getHeight());
            }
         } else {
            var16.k5().a6(this.k7);
         }

         var16.n5(this.k5(this.q0));
         this.z3 = true;
      }

      this.n5(var16);
   }

   private void n5(com.aspose.slides.internal.e1.k7 var1) {
      com.aspose.slides.internal.e1.t2 var2 = new com.aspose.slides.internal.e1.t2();
      var2.n5(var1);
      var2.n5(this.n3().k5());
      this.n5(var2);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.y2 var1, l6v var2, a1v var3) {
      com.aspose.slides.internal.o9b.y1 var4 = new com.aspose.slides.internal.o9b.y1(var1.s7(), var1.x8(), var1.t2(), var1.l6());
      this.n5(var4.y4(), var2, var3);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.y1 var1, l6v var2, a1v var3) {
      com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7();
      var4.l6(var1.y4());
      if (com.aspose.slides.internal.v6g.k5.l6(var3, q3d.class) && this.n5(var4, var2, (q3d)var3, true)) {
         q3d var9 = (q3d)var3;
         if (this.n5(var9.w1(), !var9.t9().n5())) {
            this.l6(var9);
         } else {
            this.n5(var9);
         }
      } else {
         var1.a6(this.k7);
         boolean var5 = false;
         boolean var6 = false;
         float var7 = 288.0F;
         if (com.aspose.slides.internal.v6g.k5.l6(var3, u4z.class)) {
            this.n3 = n5((u4z)var3, var7);
            var6 = true;
         } else if (var3 != null && var3.u3() != 0) {
            this.n3 = d4.n5(var3, var7);
            var6 = true;
         }

         if (var2 != null && var2.u9()) {
            this.y4 = var2.t4();
            var5 = true;
         }

         com.aspose.slides.internal.e1.r4 var8 = com.aspose.slides.internal.e1.r4.n5(var1.y4());
         if (this.n5() != null) {
            var8.n5(
               com.aspose.slides.internal.z0k.z1.l6(this.n5().getEmbeddedFileName()),
               this.n5().getEmbeddedData().getEmbeddedFileExtension(),
               this.n5().getEmbeddedData().getEmbeddedFileData()
            );
         }

         this.n5(var8, var5, var6);
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.o9b.y1 var1, l6v var2, a1v var3) {
      var1.a6(this.k7);
      boolean var4 = false;
      boolean var5 = false;
      if (com.aspose.slides.internal.v6g.k5.l6(var3, u4z.class)) {
         this.n3 = n5((u4z)var3);
         var5 = true;
      } else if (var3 != null && var3.u3() != 0) {
         this.n3 = d4.n5(var3);
         var5 = true;
      }

      if (var2 != null && var2.u9()) {
         this.y4 = var2.t4();
         var4 = true;
      }

      com.aspose.slides.internal.e1.r4 var6 = com.aspose.slides.internal.e1.r4.n5(var1.y4());
      this.n5(var6, var4, var5);
   }

   @Override
   public void n5(IPPImage var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.o9b.y1 var3, a6l var4) {
      this.n5(var1, var2.y4(), var4);
   }

   @Override
   public void n5(IPPImage var1, com.aspose.slides.internal.o9b.y1 var2, a6l var3) {
      if (var1.getWidth() >= 1 && var1.getHeight() >= 1) {
         com.aspose.slides.internal.o9b.f2 var4 = new com.aspose.slides.internal.o9b.f2(var2.s7(), var2.k5());
         com.aspose.slides.internal.e1.t2 var5 = new com.aspose.slides.internal.e1.t2();
         byte[] var6 = this.n5(var1, var4.a6());
         com.aspose.slides.internal.s5.c8 var7 = var3 == null ? new com.aspose.slides.internal.s5.c8(0.0, 0.0, 0.0, 0.0) : var3.n5();
         com.aspose.slides.internal.e1.k7 var8 = new com.aspose.slides.internal.e1.k7(var2.u9().u3(), var2.c8().a6(), var6, var7);
         if (this.n5() != null) {
            var8.n5(
               com.aspose.slides.internal.z0k.z1.l6(this.n5().getEmbeddedFileName()),
               this.n5().getEmbeddedData().getEmbeddedFileExtension(),
               this.n5().getEmbeddedData().getEmbeddedFileData()
            );
         }

         if (this.q0 != null && !this.z3) {
            var2.a6(this.k7);
            var8.n5(this.k5(this.q0));
            var8.n5(var8.c8().h0());
            this.z3 = true;
         }

         var5.n5(var8);
         com.aspose.slides.internal.o9b.y1 var9 = var8.k5().y4();
         var9.n5(1.0F, 1.0F);
         var5.n5(com.aspose.slides.internal.e1.r4.n5(var9.y4()));
         var5.n5(this.n3().k5());
         this.n5(var5);
      }
   }

   private com.aspose.slides.internal.e1.z1 n5(
      com.aspose.slides.internal.p1s.l6 var1,
      com.aspose.slides.internal.w0.l6 var2,
      com.aspose.slides.internal.o9b.c8 var3,
      com.aspose.slides.internal.o9b.c8 var4,
      com.aspose.slides.internal.o9b.w1 var5,
      String var6,
      TextParam var7
   ) {
      if (var6.length() > 1 && var6.charAt(0) == 8237 && var6.charAt(var6.length() - 1) == 8236) {
         var6 = com.aspose.slides.ms.System.d1.l6(var6, 1, var6.length() - 2);
      }

      com.aspose.slides.internal.i0e.l6 var8 = new com.aspose.slides.internal.i0e.l6();

      com.aspose.slides.internal.e1.z1 var15;
      try {
         com.aspose.slides.internal.o9b.n3 var9 = this.m3.n5(var1.h0(), var1.c8(), var1.l6());
         com.aspose.slides.internal.p1s.n5 var10 = new com.aspose.slides.internal.p1s.n5(var4.h0());
         com.aspose.slides.internal.p1s.n5 var11 = com.aspose.slides.internal.o9b.c8.l6(var3, com.aspose.slides.internal.o9b.c8.u3)
            ? new com.aspose.slides.internal.p1s.n5(var3.h0())
            : com.aspose.slides.internal.p1s.n5.b2;
         com.aspose.slides.internal.o9b.f2 var12 = new com.aspose.slides.internal.o9b.f2();

         for (int var13 = 0; var13 < 3; var13++) {
            try {
               var8.n5(var6, var9).l6(var12);
               break;
            } catch (RuntimeException var25) {
               if (var13 == 2) {
                  throw var25;
               }
            }
         }

         com.aspose.slides.internal.w0.s7 var30 = new com.aspose.slides.internal.w0.s7(var11);
         float var14 = var7.a6() != null ? (float)var7.a6().n5() : 0.5F;
         if (var2 != null) {
            var15 = new com.aspose.slides.internal.e1.z1(var1, var2, var30, var14, var5.u3(), var6, var12.a6(), var7.q0());
            var15.n5(var7.z8());
         } else {
            var15 = new com.aspose.slides.internal.e1.z1(var1, var10, var11, var14, var5.u3(), var6, var12.a6(), var7.q0(), var7.z8());
         }

         var15.n5(n5(var7, var1.c8(), var1.n5(), var6));
         if (!com.aspose.slides.ms.System.n1.k5(var7.q0()) && var7.q0() != 0.0F) {
            t4$n5 var16 = new t4$n5();

            for (int var17 = 0; var17 < var6.length(); var17++) {
               for (int var18 = 0; var18 < 3; var18++) {
                  try {
                     var8.n5(com.aspose.slides.ms.System.d1.n5(var6.charAt(var17), 1), var9).l6(var12);
                     break;
                  } catch (RuntimeException var24) {
                     if (var18 == 2) {
                        throw var24;
                     }
                  }
               }

               var16.n5(var12.l6() + var7.q0());
            }

            var15.n5(var16.u9());
         }
      } finally {
         if (var8 != null) {
            var8.dispose();
         }
      }

      var15.n5(this.n3().k5());
      var15.n5(var5.u3());
      if (this.t4 != null) {
         com.aspose.slides.internal.o9b.w1 var27 = new com.aspose.slides.internal.o9b.w1(var15.s7().l6(), var15.s7().k5() - var15.l6().t2());
         this.k7 = new com.aspose.slides.internal.o9b.y1(var27.u3(), var15.y4().a6());
         var15.n5(this.k5(this.t4));
      }

      AutoShape var28 = this.n5(var7.u3);
      var15.n5(var28 != null && var28.getPlaceholder() != null && var28.getPlaceholder().getType() == 1 ? 3 : 0);
      c9g var29 = var7.a6;
      var15.n5(var29 != null ? var29.getLanguageId() : null);
      return var15;
   }

   private static boolean n5(TextParam var0, float var1, com.aspose.slides.internal.e1x.i1 var2, String var3) {
      if (var3.length() <= 1) {
         return false;
      }

      var2.b3();
      boolean var4 = com.aspose.slides.internal.n2d.u9.u3((int)var3.charAt(0)) == 2;
      c9g var5 = var0.a6;
      boolean var6 = var5 != null && var1 >= var5.getKerningMinimalSize() && !var4 && var5.getKerningMinimalSize() > 0.0F;
      return var6 && var2.d5() != null ? true : var6;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3) {
      for (int var4 = 0; var4 < var1.length(); var4++) {
         if (var1.charAt(var4) == 8205 || var1.charAt(var4) == 8237 || var1.charAt(var4) == 8238 || var1.charAt(var4) == 8236) {
            com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();

            for (int var6 = 0; var6 < var1.length(); var6++) {
               if (var1.charAt(var6) != 8205 && var1.charAt(var6) != 8237 && var1.charAt(var6) != 8238 && var1.charAt(var6) != 8236) {
                  var5.n5(var1.charAt(var6));
               }
            }

            var1 = var5.toString();
            break;
         }
      }

      e4z var7 = var3.d2();
      if (this.n5(var7)) {
         this.l6(var1, var2.y4(), var3, var7);
      } else {
         float var8 = var3.k5() / 100.0F;
         var2.u3(var2.n3() - var3.t4() * var8);
         if (var3.e2() == 1 && var3.u3() != null && var3.u3().u3() > 1) {
            this.l6(var1, var2.y4(), var3);
         } else {
            this.n5(var1, var2.y4(), var3, var7);
         }
      }
   }

   private boolean n5(e4z var1) {
      return var1.u9() && this.j5.y4 != null && this.j5.y4.getRasterizeUnsupportedFontStyles();
   }

   private void l6(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3, e4z var4) {
      if (this.n5(var4)) {
         int var5 = com.aspose.slides.internal.v6g.k5.u3(var4.h0(), 13);
         float var6 = 4.0F;
         com.aspose.slides.internal.o9b.p8 var7 = new com.aspose.slides.internal.o9b.p8(
            com.aspose.slides.internal.v6g.k5.u3(var2.s7(), 13) + var5, com.aspose.slides.internal.v6g.k5.u3(var2.k5(), 13) + var5
         );
         com.aspose.slides.internal.o9b.p8 var8 = new com.aspose.slides.internal.o9b.p8(
            com.aspose.slides.internal.v6g.k5.u3(var7.l6() * var6, 13), com.aspose.slides.internal.v6g.k5.u3(var7.k5() * var6, 13)
         );
         com.aspose.slides.internal.o9b.l6 var9 = new com.aspose.slides.internal.o9b.l6(var8.l6(), var8.k5());

         try {
            com.aspose.slides.internal.o9b.z1 var10 = com.aspose.slides.internal.o9b.z1.n5(var9);

            try {
               var10.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
            } finally {
               if (var10 != null) {
                  var10.dispose();
               }
            }

            r1c var11 = new r1c(var9, var9.e2(), var9.h0());

            try {
               var11.l6(var6, var6);
               var11.n5(var1, new com.aspose.slides.internal.o9b.y1(0.0F, var9.h0() / var6 - var5, var9.e2() / var6, var9.h0() / var6), var3);
               com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1(var2.x8(), var2.n3() - (var7.k5() - var5));
               this.n5(var9, var12.u3(), com.aspose.slides.internal.o9b.p8.n5(var7).a6());
            } finally {
               if (var11 != null) {
                  var11.dispose();
               }
            }
         } finally {
            if (var9 != null) {
               var9.dispose();
            }
         }
      }
   }

   @Override
   void n5(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3, e4z var4) {
      var1 = var4.n5(var1);
      com.aspose.slides.internal.w0.l6 var5 = d4.n5(var3.u3());
      com.aspose.slides.internal.o9b.c8 var6 = com.aspose.slides.internal.o9b.c8.u3.o8();
      com.aspose.slides.internal.p1s.l6 var7 = var4.l6();
      if (this.j5.y4 == null || !n5(this.j5.y4.getCompliance())) {
         this.n5(var1, var2.u9().u3(), var5, var7, var3, var4);
         if (this.l6() && var5.n5() != 0) {
            float var8 = e7k.n5(var4).l6;
            var2.u3(var2.n3() - var8);
         }
      }

      com.aspose.slides.internal.w0.s7 var12 = null;
      com.aspose.slides.internal.o9b.c8 var9 = com.aspose.slides.internal.o9b.c8.u3.o8();
      if (var3.a6() != null) {
         if (var3.a6().u9.u3() == 1) {
            var3.a6().h0().n5(var9);
         } else if (var3.a6().u9.u3() == 2) {
            float var10 = 0.75F;
            var12 = var3.a6().n5(72.0F * var10);
         }
      }

      com.aspose.slides.internal.e1.z1 var13 = this.n5(var7, var5, var9.o8(), var6.o8(), var2.u9().u3(), var1, var3);
      var13.l6(
         this.m1() != null
            && (
               this.m1().a5()
                  || com.aspose.slides.internal.v6g.k5.l6(this.m1(), SmartArtShape.class)
                  || com.aspose.slides.internal.v6g.k5.l6(this.m1(), Chart.class)
            )
      );
      if (this.z1 != null) {
         if ("Footer".equals(this.z1.k5())) {
            var13.k5(true);
            var13.l6(true);
         } else if ("Header".equals(this.z1.k5())) {
            var13.u3(true);
            var13.l6(true);
         }
      }

      if (var12 != null) {
         var13.n5(var12);
      }

      this.n5(var13);
   }

   private void n5(
      String var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.w0.l6 var3,
      com.aspose.slides.internal.p1s.l6 var4,
      TextParam var5,
      e4z var6
   ) {
      if (var5.o0() || var5.b3() || var5.x8() || var5.n3()) {
         com.aspose.slides.internal.x4g.s7 var7 = n2d.n5(var1, this, var5, var2.u3(), this.a6, 0.0F);
         boolean var8 = this.w1;
         this.w1 = this.k5() != null && this.k5().getCompliance() == 9;

         try {
            if (var5.o0() && !var5.u6()) {
               if (var5.t2 != null) {
                  c8k var9 = new c8k(var5.t2);
                  var9.n5(this, var7, var5);
               }

               if (var5.n3 != null && var5.u6()) {
                  i5q var13 = new i5q(var5.n3);
                  var13.n5(this, var7, var5.u3(), null);
               }
            }

            if (var5.b3()) {
               q1k var14 = new q1k(var5.c8);
               var14.n5(this, var7, var5, var2.u3());
            }

            if (var5.x8() && !var5.u6()) {
               this.n5(var5.x8, var1, var5, var3, var4, var2.u3(), true);
               this.n5(var5.s7, var1, var5, var3, var4, var2.u3(), false);
            }

            if (var5.n3()) {
               this.n5(var1, var2.u3(), var6, var4, var5);
            }
         } finally {
            this.w1 = var8;
         }
      }
   }

   private void n5(
      IOuterShadowEffectiveData var1,
      String var2,
      TextParam var3,
      com.aspose.slides.internal.w0.l6 var4,
      com.aspose.slides.internal.p1s.l6 var5,
      com.aspose.slides.internal.o9b.w1 var6,
      boolean var7
   ) {
      if (var1 != null) {
         k0p var8 = com.aspose.slides.internal.v6g.k5.n5(var1, k0p.class);
         z2r var9 = new z2r(var8, var7);
         if (var8.getScaleHorizontal() != 0.0 && var8.getScaleVertical() != 0.0) {
            if (!var8.u9()
               && var8.getScaleHorizontal() == 100.0
               && var8.getScaleVertical() == 100.0
               && (!(var8.getBlurRadius() > 2.0) || var3.t4() <= 28.0F && var8.getBlurRadius() < 4.0)) {
               com.aspose.slides.internal.x4g.m1 var15 = var9.n5(
                  var3, new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var3.n5.n5, var3.n5.l6), var3.t4(), false
               );
               com.aspose.slides.internal.o9b.w1[] var16 = new com.aspose.slides.internal.o9b.w1[]{var6};
               var15.n5(var16);
               com.aspose.slides.internal.o9b.w1 var12 = var16[0].u3();
               com.aspose.slides.internal.o9b.c8 var13 = com.aspose.slides.internal.o9b.c8.u3.o8();
               if (var3.a6() != null && var3.a6().u9.u3() == 1) {
                  if (var3.u3() != null && var3.u3().u3() != 0) {
                     n5(var3.h0().o8()).n5(var13);
                  } else {
                     var3.h0().n5(var13);
                  }
               }

               com.aspose.slides.internal.o9b.c8 var14 = com.aspose.slides.internal.o9b.c8.u3.o8();
               if (var3.u3() != null && var3.u3().u3() != 0) {
                  var8.l6().n5(var14);
               }

               if (var3.u3() != null && var3.u3().u3() != 0 || var3.a6() != null && var3.a6().u9.u3() != 0) {
                  this.n5(this.n5(var5, null, var13.o8(), var14.o8(), var12.u3(), var2, var3));
               }
            } else {
               com.aspose.slides.internal.o9b.w1 var10 = var6.u3();
               if (var4.n5() == 3) {
                  var10 = new com.aspose.slides.internal.o9b.w1(var6.l6(), var6.k5() + var3.t4() / 10.0F);
               }

               com.aspose.slides.internal.x4g.s7 var11 = n2d.n5(var2, this, var3, var10.u3(), this.a6, 0.0F);
               var9.n5(this, var11, var3);
            }
         }
      }
   }

   private void n5(String var1, com.aspose.slides.internal.o9b.w1 var2, e4z var3, com.aspose.slides.internal.p1s.l6 var4, TextParam var5) {
      com.aspose.slides.internal.o9b.w1 var6 = this.r4().u3();
      float var7 = var3.n5().n5(this.l6);
      com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1(var2.l6() + var6.l6() * var7 / 20.0F, var2.k5() + var6.k5() * var7 / 20.0F);
      com.aspose.slides.internal.o9b.c8 var9 = com.aspose.slides.internal.o9b.c8.u3.o8();
      com.aspose.slides.internal.o9b.c8 var10 = n5(var5.h0().o8()).o8();
      this.n5(this.n5(var4, null, var9.o8(), var10.o8(), var8.u3(), var1, var5));
   }

   @Override
   public void n5(IHyperlink var1) {
      if (!this.j5.n5() || !this.j5.y4.getSkipJavaScriptLinks() || !((Hyperlink)var1).k5(false)) {
         this.t4 = var1;
      }
   }

   @Override
   public void u3() {
      this.t4 = null;
   }

   @Override
   public void l6(IHyperlink var1) {
      if (!this.j5.n5() || !this.j5.y4.getSkipJavaScriptLinks() || !((Hyperlink)var1).k5(false)) {
         this.q0 = var1;
         this.z3 = false;
      }
   }

   @Override
   public void a6() {
      this.q0 = null;
      this.z3 = false;
   }

   @Override
   public boolean n5(String var1) {
      if (this.z1 != null && "Figure".equals(this.z1.k5())) {
         return false;
      } else if (!"Paragraph".equals(var1)
         || this.z1 == null
         || !"Title".equals(this.z1.k5())
            && !"SubTitle".equals(this.z1.k5())
            && !"Footer".equals(this.z1.k5())
            && !"Header".equals(this.z1.k5())
            && !"MathBlock".equals(this.z1.k5())) {
         com.aspose.slides.internal.e1.z3 var2 = new com.aspose.slides.internal.e1.z3();
         var2.l6(var1);
         this.n5(var2);
         this.z1 = var2;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean n5(String var1, Object var2) {
      if (this.z1 != null && "Figure".equals(this.z1.k5())) {
         return false;
      }

      com.aspose.slides.internal.e1.z3 var3 = new com.aspose.slides.internal.e1.z3();
      var3.l6(var1);
      var3.n5(var2);
      this.n5(var3);
      this.z1 = var3;
      return true;
   }

   @Override
   public boolean n5(String var1, Object var2, String var3) {
      if (this.z1 != null && "Figure".equals(this.z1.k5())) {
         return false;
      }

      com.aspose.slides.internal.e1.z3 var4 = new com.aspose.slides.internal.e1.z3();
      var4.l6(var1);
      var4.n5(var2);
      var4.n5(var3);
      this.n5(var4);
      this.z1 = var4;
      return true;
   }

   @Override
   public void u9() {
      if (this.z1 != null && this.z1.y2() != null) {
         this.z1 = com.aspose.slides.internal.v6g.k5.n5(this.z1.y2(), com.aspose.slides.internal.e1.z3.class);
      }
   }

   @Override
   protected void h0() {
   }

   @Override
   public float c8() {
      return this.t2;
   }

   @Override
   public float t2() {
      return this.s7;
   }

   @Override
   public int s7() {
      return com.aspose.slides.internal.v6g.k5.u3(this.x8.l6(), 13);
   }

   @Override
   public int x8() {
      return com.aspose.slides.internal.v6g.k5.u3(this.x8.k5(), 13);
   }

   @Override
   protected com.aspose.slides.internal.w0.c8 n3() {
      return this.e2;
   }

   @Override
   protected void n5(com.aspose.slides.internal.w0.c8 var1) {
      this.e2 = var1.k5();
      this.h0();
   }

   final com.aspose.slides.internal.e1.t2 y4() {
      return this.t9;
   }

   private void n5(com.aspose.slides.internal.o9b.f2 var1) {
      float var2 = var1.l6() / this.x8.l6();
      float var3 = var1.k5() / this.x8.k5();
      this.t9.n5(new com.aspose.slides.internal.w0.c8(var2, 0.0F, 0.0F, var3, 0.0F, 0.0F));
   }

   private void n5(com.aspose.slides.internal.e1.r4 var1, boolean var2, boolean var3) {
      this.n5(var1, var2, var3, 0);
   }

   private void n5(com.aspose.slides.internal.e1.r4 var1, boolean var2, boolean var3, int var4) {
      if (!var3 && !var2) {
         if (this.q0 == null) {
            return;
         }

         var1.c8();
      } else {
         var1.n5(var2 ? this.y4 : null);
         var1.n5(var3 ? this.n3 : null);
         com.aspose.slides.internal.w0.c8 var5 = this.q0().k5();
         var1.k5(var4);
         var1.n5(this.n3().k5());
      }

      if (this.q0 != null && !this.z3) {
         var1.n5(this.k5(this.q0));
         this.z3 = true;
      }

      if (this.m1() != null) {
         var1.l6(true);
      }

      this.n5(var1);
   }

   private void n5(com.aspose.slides.internal.e1.m3 var1) {
      if (this.z1 == null) {
         this.t9.n5(var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.e1.r4.class) && this.d2()) {
         ((com.aspose.slides.internal.e1.z3)this.z1.y2()).n5(var1);
      } else {
         this.z1.n5(var1);
      }
   }

   private boolean d2() {
      return this.k5() != null
         && this.k5().getCompliance() == 9
         && com.aspose.slides.internal.v6g.k5.l6(this.z1.y2(), com.aspose.slides.internal.e1.z3.class)
         && !this.z1.s7().isEmpty()
         && com.aspose.slides.internal.v6g.k5.l6(this.z1.s7().get_Item(this.z1.s7().size() - 1), com.aspose.slides.internal.e1.z1.class)
         && ((com.aspose.slides.internal.e1.z1)this.z1.s7().get_Item(this.z1.s7().size() - 1)).z1() != null;
   }

   private com.aspose.slides.internal.e1.m1 k5(IHyperlink var1) {
      Hyperlink var2 = (Hyperlink)var1;
      com.aspose.slides.internal.e1.m1 var3 = null;
      switch (var2.getActionType()) {
         case 1:
         case 10:
         case 11:
            var3 = new com.aspose.slides.internal.e1.m1(this.k7.y4(), this.j5.n5() ? l6(var2.getExternalUrl()) : var2.getExternalUrl(), var1.getTooltip());
            break;
         case 2:
            var3 = new com.aspose.slides.internal.e1.m1(3, this.k7.y4(), var1.getTooltip());
            break;
         case 3:
            var3 = new com.aspose.slides.internal.e1.m1(2, this.k7.y4(), var1.getTooltip());
            break;
         case 4:
            var3 = new com.aspose.slides.internal.e1.m1(1, this.k7.y4(), var1.getTooltip());
            break;
         case 5:
            var3 = new com.aspose.slides.internal.e1.m1(4, this.k7.y4(), var1.getTooltip());
         case 6:
         case 9:
         default:
            break;
         case 7:
            var3 = new com.aspose.slides.internal.e1.m1(5, this.k7.y4(), var1.getTooltip());
            break;
         case 8:
            ISlide var4 = var2.getTargetSlide();
            if (var4 != null) {
               int var5 = ((Slide)var4).z8();
               if (this.z8 != null && var5 < this.z8.size()) {
                  var5 = this.z8.get_Item(var5);
               }

               if (var5 > -1) {
                  IShape[] var6 = SlideUtil.findShapesByPlaceholderType(var4, (byte)0);
                  String var7 = com.aspose.slides.ms.System.d1.n5(new String[]{"Reference to slide number ", com.aspose.slides.ms.System.a3.l6(var5)});
                  if (var6 != null && var6.length > 0) {
                     var7 = ((AutoShape)var6[0]).getTextFrame().getText();
                  }

                  var3 = new com.aspose.slides.internal.e1.m1(this.k7.y4(), var5, var7);
               }
            }
      }

      return var3;
   }

   private static String l6(String var0) {
      String var1 = var0;
      if (var1 == null) {
         var1 = "";
      }

      var0 = var1;

      String var3;
      try {
         com.aspose.slides.ms.System.r8 var2 = new com.aspose.slides.ms.System.r8(var0);
         if (!com.aspose.slides.ms.System.d1.n5(var2.t9()) && !com.aspose.slides.ms.System.d1.a6(var2.t9(), com.aspose.slides.ms.System.r8.l6)) {
            if (k5(var0) && var2.z3()) {
               var3 = var2.l6();
            } else {
               var3 = var0;
            }
         } else if (var2.s7()) {
            if (var2.c8()) {
               String var4 = com.aspose.slides.internal.z0k.z1.a6(var2.n5());
               if (com.aspose.slides.ms.System.d1.n5(var4)) {
                  return com.aspose.slides.ms.System.r8.x8(var2.l6());
               }
            }

            var3 = com.aspose.slides.ms.System.d1.n5(new String[]{"//", var2.a6(), com.aspose.slides.ms.System.r8.x8(var2.n5())});
         } else if (var2.z3()) {
            var3 = com.aspose.slides.ms.System.r8.x8(var2.n5());
         } else {
            var3 = com.aspose.slides.ms.System.r8.x8(var0);
         }
      } catch (UriFormatException var5) {
         var3 = k5(var0) ? com.aspose.slides.ms.System.r8.s7(var0) : com.aspose.slides.ms.System.r8.x8(var0);
      } catch (RuntimeException var6) {
         com.aspose.slides.internal.n8e.v4.n5(var6);
         var3 = var0;
      }

      return var3;
   }

   private static boolean k5(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         char var2 = var0.charAt(var1);
         if (var2 > 255) {
            return true;
         }
      }

      return false;
   }

   private static com.aspose.slides.internal.w0.l6 n5(u4z var0) {
      return n5(var0, 96.0F);
   }

   private static com.aspose.slides.internal.w0.l6 n5(u4z var0, float var1) {
      com.aspose.slides.internal.w0.u3 var2 = d4.n5(var0, var1);
      if (!com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.w0.t2.class)) {
         return var2;
      }

      com.aspose.slides.internal.o9b.y1 var3 = ((com.aspose.slides.internal.w0.t2)var2).a6().y4();
      if (var3.u3()) {
         var0.o0().a6(var3);
      }

      com.aspose.slides.internal.o9b.f2 var4 = new com.aspose.slides.internal.o9b.f2(var3.s7(), var3.k5());
      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var4.l6()), 14),
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var4.k5()), 14)
      );

      try {
         var5.n5(96.0F, 96.0F);
         com.aspose.slides.internal.o9b.z1 var6 = com.aspose.slides.internal.o9b.z1.n5(var5);

         try {
            com.aspose.slides.internal.x4g.m1 var7 = var6.m1();
            var7.k5(-var3.a6(), -var3.t2());
            var6.l6(var7);
            var6.l6(d4.n5(var0), var3.y4());
            com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2();

            com.aspose.slides.internal.w0.y4 var9;
            try {
               var5.n5(var8, com.aspose.slides.internal.j9e.x8.s7());
               var9 = new com.aspose.slides.internal.w0.y4(var8.toArray());
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }

            com.aspose.slides.internal.w0.c8 var10 = new com.aspose.slides.internal.w0.c8();
            var10.l6(var3.a6(), var3.t2());
            var9.n5(var10);
            return var9;
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   private static byte[] n5(byte[] var0, com.aspose.slides.internal.o9b.f2 var1, float var2, boolean var3) {
      com.aspose.slides.internal.o9b.l6 var4 = com.aspose.slides.internal.n8e.k7.n5(var0, var1.a6(), var2, var3);

      try {
         com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

         try {
            var4.n5(var5, com.aspose.slides.internal.j9e.x8.s7());
            return var5.toArray();
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   private static byte[] n5(byte[] var0, com.aspose.slides.internal.o9b.c8 var1) {
      if (!var1.t2()) {
         com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(new com.aspose.slides.internal.z0k.e2(var0));

         try {
            var2.n5(var1.o8());
            if (var2.x8().n5().equals(com.aspose.slides.internal.j9e.x8.c8().n5().k5())
               || var2.x8().n5().equals(com.aspose.slides.internal.j9e.x8.a6().n5().k5())
               || var2.x8().n5().equals(com.aspose.slides.internal.j9e.x8.t2().n5().k5())) {
               com.aspose.slides.internal.n8e.n1.n5(var2, var1.o8(), 99);
            }

            com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

            try {
               var2.n5(var3, com.aspose.slides.internal.j9e.x8.s7());
               return var3.toArray();
            } finally {
               if (var3 != null) {
                  var3.dispose();
               }
            }
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } else {
         return var0;
      }
   }

   private byte[] n5(IPPImage var1, com.aspose.slides.internal.o9b.f2 var2) {
      byte[] var3 = ((PPImage)var1).h0();
      if (("image/x-emf".equals(var1.getContentType()) || "image/x-wmf".equals(var1.getContentType())) && this.m1) {
         boolean var4 = var1.getSvgImage() != null;
         var3 = n5(var3, var2.a6(), this.j5.t9, var4);
      }

      return n5(var3, com.aspose.slides.internal.o9b.c8.u3.o8());
   }

   private AutoShape n5(IPortion var1) {
      if (var1 == null) {
         return null;
      }

      IGenericEnumerator var2 = var1.getSlide().getShapes().iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            AutoShape var4 = com.aspose.slides.internal.v6g.k5.n5(var3, AutoShape.class);
            if (var4 != null && var4.getTextFrame() != null && var4.getTextFrame().getParagraphs() != null) {
               IGenericEnumerator var5 = var4.getTextFrame().getParagraphs().iterator();

               try {
                  while (var5.hasNext()) {
                     IParagraph var6 = (IParagraph)var5.next();
                     if (var6.getPortions().contains(var1)) {
                        return var4;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   final boolean e2() {
      return this.m1;
   }

   @Override
   com.aspose.slides.internal.o9b.y1 t9() {
      return new com.aspose.slides.internal.o9b.y1();
   }

   @Override
   void n5(com.aspose.slides.internal.o9b.y1 var1) {
      this.y4().n5(com.aspose.slides.internal.e1.r4.n5(var1.y4()));
   }

   final w2 z1() {
      w2 var1 = new w2(this.s7(), this.x8(), this.t2, this.s7, this.m1, this.j5, this.m3, this.z8);
      var1.l6(this.q0());
      this.k7.a6(var1.k7);
      var1.n5(this.t4());
      var1.n5(this.m1());
      var1.n5(this.k7());
      var1.z1 = this.z1;
      return var1;
   }

   private static boolean n5(int var0) {
      switch (var0) {
         case 0:
         case 1:
         case 2:
         case 8:
         case 9:
            return false;
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         default:
            return true;
      }
   }
}
