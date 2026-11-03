package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

final class q3d extends y4f implements IDisposable {
   private int h0 = -1;
   private int c8;
   private boolean t2 = true;
   private com.aspose.slides.internal.o9b.y1 s7 = new com.aspose.slides.internal.o9b.y1();
   private final d2k x8 = new d2k();
   private final d2k n3 = d2k.u3.u3();
   private byte y4 = 0;
   private int e2 = 0;
   private boolean t9;
   private PictureFillFormat z1;
   private com.aspose.slides.internal.y3.u3 t4;
   private String q0;
   private com.aspose.slides.internal.k9.u9 z3;
   private EffectFormat m1;
   private static final com.aspose.slides.internal.n8e.k8<Integer, Integer> k7 = new com.aspose.slides.internal.n8e.k8<>();
   private IPPImage m3;

   public q3d(j5m var1, f3f var2, boolean var3) {
      super(var1, var3);
      this.n5 = 4;
      if (var2.getPictureFillMode() == 1) {
         this.c8 = 1;
      } else {
         this.c8 = 0;
         if (var2.c8() != -1) {
            this.y4 = var2.c8();
         }

         this.e2 = k7.l6(var2.h0());
         var2.a6().a6().n5(this.x8);
         var2.u9().n5(this.n3);
      }

      m4a var4 = (m4a)var2.getPicture();
      PPImage var5 = (PPImage)var4.getImage();
      this.m3 = var5;
      if (var5 != null) {
         if (var2.getPictureFillMode() == 1) {
            s4s var6 = var2.u3().u3().l6();
            float var7 = this.u9.s7() * var6.l6.n5;
            float var8 = this.u9.k5() * var6.l6.l6;
            this.u9 = new com.aspose.slides.internal.o9b.y1(this.u9.x8() + var6.n5.n5 * this.u9.s7(), this.u9.n3() + var6.n5.l6 * this.u9.k5(), var7, var8);
            this.t9 = c1t.l6(var6.l6());
         }

         i2h var10 = var2.l6().k5();
         this.l6 = new com.aspose.slides.internal.s5.c8(var10.l6 / 100.0, var10.u3 / 100.0, var10.k5 / 100.0, var10.a6 / 100.0);
         if (var5.s7()) {
            this.l6 = var5.n5(var10.k5(), this.l6);
            this.t4 = new com.aspose.slides.internal.y3.u3(var5.getBinaryData());
         }

         int var11 = var1.u9 == null ? 72 : var1.u9.t9();
         if (var5.s7() && var5.t2().l6() < var11) {
            var11 = com.aspose.slides.internal.v6g.k5.u3(var5.t2().l6(), 13);
         }

         com.aspose.slides.internal.o9b.f2 var12 = this.n5(var5, var11).a6();
         com.aspose.slides.internal.o9b.f2 var9 = this.n5(var12.a6(), var10.k5(), var11).a6();
         this.z3 = var4.n5(var1.k5, var9.a6(), var1.u9);
         var2.n5(this.z3.k5().e2(), this.z3.k5().h0()).a6(this.s7);
         this.q0 = this.z3.u9();
         this.k5 = var4.getImageTransform();
      } else {
         this.v4();
      }

      this.h0 = -1;
   }

   public q3d(j5m var1, f3f var2, byte var3, EffectFormat var4, boolean var5) {
      this(var1, var2, var5);
      this.m1 = var4;
      this.m3 = var2.getPicture().getImage();
      if (n5(var3)) {
         s5u var6 = var1.u9;
         com.aspose.slides.internal.o9b.t4 var7 = this.y1();
         com.aspose.slides.internal.k9.h0 var8 = var6.n5(var7);
         if (var8 != null) {
            int var9 = 0;
            switch (var3) {
               case 2:
                  var9 = (byte)-6;
                  break;
               case 3:
                  var9 = (byte)-8;
                  break;
               case 4:
                  var9 = (byte)6;
                  break;
               case 5:
                  var9 = (byte)8;
                  break;
               default:
                  throw new InvalidOperationException("Fill source must be darker/lighter");
            }

            com.aspose.slides.internal.k9.h0 var10 = com.aspose.slides.internal.k9.h0.n5(var8, new com.aspose.slides.internal.k9.n5(var9));
            com.aspose.slides.internal.k9.u9 var11 = null;
            com.aspose.slides.internal.k9.u9[] var12 = new com.aspose.slides.internal.k9.u9[]{var11};
            boolean var13 = !var6.t4().n5(var10, var12);
            var11 = var12[0];
            if (var13) {
               com.aspose.slides.internal.o9b.l6 var14 = com.aspose.slides.internal.v6g.k5.n5(var7, com.aspose.slides.internal.o9b.l6.class);
               if (var14 == null) {
                  var14 = new com.aspose.slides.internal.o9b.l6(var7);
               }

               com.aspose.slides.internal.o9b.l6 var15 = var14;
               c0v var16 = c0v.n5(var15);
               if (var9 > 0) {
                  for (int var17 = 0; var17 < var16.a6().length; var17 += 4) {
                     var16.a6()[var17 + 2] = (byte)((var16.a6()[var17 + 2] & 255) / 10 * var9);
                     var16.a6()[var17 + 1] = (byte)((var16.a6()[var17 + 1] & 255) / 10 * var9);
                     var16.a6()[var17] = (byte)((var16.a6()[var17] & 255) / 10 * var9);
                  }
               } else {
                  var9 = -var9;

                  for (int var21 = 0; var21 < var16.a6().length; var21 += 4) {
                     var16.a6()[var21 + 2] = (byte)(255 - (255 - (var16.a6()[var21 + 2] & 255)) / 10 * var9);
                     var16.a6()[var21 + 1] = (byte)(255 - (255 - (var16.a6()[var21 + 1] & 255)) / 10 * var9);
                     var16.a6()[var21] = (byte)(255 - (255 - (var16.a6()[var21] & 255)) / 10 * var9);
                  }
               }

               var11 = new com.aspose.slides.internal.k9.u9(var16.s7());
               var6.t4().n5(var10, var11);
            }

            this.z3 = var11;
            this.q0 = var11.u9();
         }
      }
   }

   public q3d(j5m var1, f3f var2) {
      super(var1);
      this.n5 = 4;
      this.a6 = var1.u3;
      m4a var3 = (m4a)var2.getPicture();
      this.m3 = var3.getImage();
      if (var3.getImage() != null) {
         i2h var4 = var2.l6().k5();
         float var5 = var4.u3 + var4.l6;
         float var6 = var4.a6 + var4.k5;
         var5 = var5 == 100.0F ? 0.99F : 1.0F - var5 / 100.0F;
         var6 = var6 == 100.0F ? 0.99F : 1.0F - var6 / 100.0F;
         if (var2.getPictureFillMode() == 1) {
            s4s var7 = var2.u3().u3().l6();
            float var8 = this.u9.s7() * var7.l6.n5;
            float var9 = this.u9.k5() * var7.l6.l6;
            this.u9 = new com.aspose.slides.internal.o9b.y1(this.u9.x8() + var7.n5.n5 * this.u9.s7(), this.u9.n3() + var7.n5.l6 * this.u9.k5(), var8, var9);
            this.t9 = c1t.l6(var7.l6());
         }

         d2k var12 = d2k.u3.n5(this.u9.s7() / var5, this.u9.k5() / var6).u3();
         this.z3 = var3.n5(var1.k5, new com.aspose.slides.internal.o9b.f2(var12.n5, var12.l6), var1.u9);
         var2.n5(this.z3.k5().e2(), this.z3.k5().h0()).a6(this.s7);
         this.q0 = this.z3.u9();
         this.l6 = new com.aspose.slides.internal.s5.c8(var4.l6 / 100.0, var4.u3 / 100.0, var4.k5 / 100.0, var4.a6 / 100.0);
      } else {
         this.z3 = new com.aspose.slides.internal.k9.u9(new com.aspose.slides.internal.o9b.l6(16, 16));
         this.s7 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, 16.0F, 16.0F);
         this.q0 = "dummy";
      }

      this.h0 = -1;
      if (var2.getPictureFillMode() == 1) {
         this.c8 = 1;
      } else {
         this.c8 = 0;
         if (var2.c8() != -1) {
            this.y4 = var2.c8();
         }

         this.e2 = k7.l6(var2.h0());
         var2.a6().a6().n5(this.x8);
         var2.u9().n5(this.n3);
      }
   }

   public q3d(j5m var1, EffectFormat var2, PictureFillFormat var3, boolean var4) {
      this(var1, var3, var4);
      this.m1 = var2;
      this.a6 = var1.u3;
      this.m3 = var3.getPicture().getImage();
   }

   public q3d(j5m var1, PictureFillFormat var2) {
      this(var1, var2, false);
      this.m3 = var2.getPicture().getImage();
   }

   public q3d(j5m var1, PictureFillFormat var2, boolean var3) {
      super(var1, var3);
      if (var2 != null) {
         this.n5 = 4;
         if (var2.getPictureFillMode() == 1) {
            this.c8 = 1;
         } else {
            this.c8 = 0;
            l6g var4 = var2.h0();
            if (var4.u9() != -1) {
               this.y4 = var4.u9();
            }

            this.e2 = k7.l6(var4.a6());
            var4.k5().a6().n5(this.x8);
            var4.u3().n5(this.n3);
         }

         Picture var12 = (Picture)var2.getPicture();
         this.m3 = var12.getImage();
         if (!com.aspose.slides.ms.System.d1.n5(var12.getLinkPathLong()) && var12.getImage() == null) {
            var12.setImage(((ImageCollection)var12.getPresentation().getImages()).n5(var12.getLinkPathLong(), null));
         }

         if (var12.getImage() != null && !((PPImage)var12.getImage()).k5().k5()) {
            if (!com.aspose.slides.ms.System.d1.n5(var12.l6().l6())) {
               var12.getImage().setSvgImage(((ImageCollection)var12.getPresentation().getImages()).n5(var12.l6().l6()));
            }

            if (var2.getPictureFillMode() == 1) {
               s4s var5 = var2.h0().n5().l6();
               float var6 = this.u9.s7() * var5.l6.n5;
               float var7 = this.u9.k5() * var5.l6.l6;
               this.u9 = new com.aspose.slides.internal.o9b.y1(this.u9.x8() + var5.n5.n5 * this.u9.s7(), this.u9.n3() + var5.n5.l6 * this.u9.k5(), var6, var7);
               this.t9 = c1t.l6(var5.l6());
            }

            i2h var13 = var2.u3().k5();
            this.l6 = new com.aspose.slides.internal.s5.c8(var13.l6 / 100.0, var13.u3 / 100.0, var13.k5 / 100.0, var13.a6 / 100.0);
            PPImage var14 = (PPImage)var12.getImage();
            if (var14.s7()) {
               this.l6 = var14.n5(var13.k5(), this.l6);
               this.t4 = new com.aspose.slides.internal.y3.u3(var14.getBinaryData());
            }

            boolean var15 = !this.l6.n5();
            byte var8 = 72;
            int var9 = var1.u9 == null ? 72 : var1.u9.t9();
            if (var14.s7() && var14.t2().l6() < var9 && var14.t2().l6() > 72.0F) {
               var9 = com.aspose.slides.internal.v6g.k5.u3(var14.t2().l6(), 13);
            }

            com.aspose.slides.internal.o9b.f2 var10 = this.n5(var14, var9).a6();
            com.aspose.slides.internal.o9b.f2 var11 = this.n5(var10.a6(), var2.u3().k5(), var9).a6();
            if (var11.l6() < 1.0F) {
               var11.n5(1.0F);
            }

            if (var11.k5() < 1.0F) {
               var11.l6(1.0F);
            }

            this.z1 = var2;
            this.z3 = var12.n5(var1, var11.a6(), var1.u9, var1.a6, var15, var2);
            if (this.z3.n5() && this.d5() != 2) {
               this.s7 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, this.z3.k5().e2(), this.z3.k5().h0());
            } else {
               var2.n5(this.z3.k5().e2(), this.z3.k5().h0()).a6(this.s7);
            }

            this.q0 = this.z3.u9();
            this.k5 = null;
         } else {
            this.v4();
         }

         this.h0 = -1;
      }
   }

   @Override
   public final void dispose() {
      if (this.z3 != null && this.z3.l6() && "dummy".equals(this.q0)) {
         this.z3.k5().dispose();
         this.z3 = null;
      }
   }

   public final EffectFormat y4() {
      return this.m1;
   }

   public final com.aspose.slides.internal.x4g.s7 e2() {
      return this.a6;
   }

   public final com.aspose.slides.internal.s5.c8 t9() {
      return this.l6;
   }

   public final int z1() {
      return this.c8;
   }

   public final String t4() {
      return this.h0 >= 0 ? com.aspose.slides.ms.System.a3.n5(this.h0, "x") : this.q0;
   }

   public final com.aspose.slides.internal.o9b.y1 q0() {
      return this.s7;
   }

   public final void l6(com.aspose.slides.internal.o9b.y1 var1) {
      var1.a6(this.s7);
   }

   public final int z3() {
      return this.e2;
   }

   public final d2k m1() {
      return this.x8;
   }

   public final byte k7() {
      return this.y4;
   }

   public final d2k m3() {
      return this.x8;
   }

   public final d2k z8() {
      return this.n3;
   }

   public final boolean j5() {
      return this.t9;
   }

   public final Picture w1() {
      return this.z1 != null ? (Picture)this.z1.getPicture() : null;
   }

   public final byte[] r4() {
      com.aspose.slides.internal.k9.u9 var1 = this.z3;
      return var1 != null ? var1.a6() : null;
   }

   public final com.aspose.slides.internal.k9.u9 c4() {
      return this.z3;
   }

   public final PictureFillFormat y2() {
      return this.z1;
   }

   public final com.aspose.slides.internal.o9b.t4 y1() {
      return this.z3 != null ? this.z3.k5() : null;
   }

   public final boolean a0() {
      return this.t4 != null;
   }

   public final boolean d2() {
      if (this.k5() != null && this.k5().size() != 0) {
         IGenericEnumerator var1 = this.k5().iterator();

         try {
            while (var1.hasNext()) {
               IEffectEffectiveData var2 = (IEffectEffectiveData)var1.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var2, IAlphaModulateFixedEffectiveData.class)) {
                  IAlphaModulateFixedEffectiveData var3 = (IAlphaModulateFixedEffectiveData)var2;
                  return var3.getAmount() != 0.0F;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public final int d5() {
      if (this.t4 == null) {
         throw new InvalidOperationException("Source image is not a metafile");
      } else {
         return this.t4.z1();
      }
   }

   public final com.aspose.slides.internal.o9b.y1 l6(float var1) {
      this.y1();
      float var2 = this.u9.x8();
      float var3 = this.u9.n3();
      float var4 = this.z3.k5().h0() * var1 / com.aspose.slides.internal.n2d.m1.l6(this.z3.k5()) * this.n3.l6;
      float var5 = this.z3.k5().e2() * var1 / com.aspose.slides.internal.n2d.m1.n5(this.z3.k5()) * this.n3.n5;
      switch (this.y4) {
         case 1:
            var2 = this.u9.a6() + (this.u9.s7() - var5) / 2.0F;
            break;
         case 2:
            var2 = this.u9.h0() - var5;
            break;
         case 3:
            var3 = this.u9.t2() + (this.u9.k5() - var4) / 2.0F;
            break;
         case 4:
            var2 = this.u9.a6() + (this.u9.s7() - var5) / 2.0F;
            var3 = this.u9.t2() + (this.u9.k5() - var4) / 2.0F;
            break;
         case 5:
            var2 = this.u9.h0() - var5;
            var3 = this.u9.t2() + (this.u9.k5() - var4) / 2.0F;
            break;
         case 6:
            var3 = this.u9.l6() - var4;
            break;
         case 7:
            var2 = this.u9.a6() + (this.u9.s7() - var5) / 2.0F;
            var3 = this.u9.l6() - var4;
            break;
         case 8:
            var2 = this.u9.h0() - var5;
            var3 = this.u9.l6() - var4;
      }

      return new com.aspose.slides.internal.o9b.y1(var2, var3, var5, var4);
   }

   public final IPPImage s3() {
      return this.m3;
   }

   public final byte[] p8() {
      if (this.t4 == null) {
         throw new InvalidOperationException("Source image is not a metafile");
      } else {
         return this.t4.l6();
      }
   }

   private void v4() {
      this.z3 = new com.aspose.slides.internal.k9.u9(new com.aspose.slides.internal.o9b.l6(16, 16));
      this.s7 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, 16.0F, 16.0F);
      this.q0 = "dummy";
   }

   private com.aspose.slides.internal.o9b.f2 n5(com.aspose.slides.internal.o9b.f2 var1, i2h var2, int var3) {
      float var4 = var2.u3 + var2.l6;
      float var5 = var2.a6 + var2.k5;
      com.aspose.slides.internal.o9b.y1 var6 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, 1.0F, 1.0F);
      if (var4 < 101.0F && var5 < 101.0F) {
         var4 = var4 == 100.0F ? 0.99F : 1.0F - var4 / 100.0F;
         var5 = var5 == 100.0F ? 0.99F : 1.0F - var5 / 100.0F;
         var6 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var1.l6() / var4, var1.k5() / var5);
      }

      com.aspose.slides.internal.o9b.y1 var7 = new c1t().n5(var6.y4()).y4();
      com.aspose.slides.internal.o9b.f2 var8 = com.aspose.slides.internal.n8e.k7.n5(var3, var7.c8().a6()).a6();
      return var3 <= 96 && this.u3 != null && this.u3.n5 != null && var8.l6() > this.u3.n5.s7() && var8.k5() > this.u3.n5.x8() ? var7.c8() : var8;
   }

   private com.aspose.slides.internal.o9b.f2 n5(IPPImage var1, int var2) {
      if (var1 != null && (var2 == 0 || this.c8 != 1)) {
         return ((PPImage)var1).s7() && var2 == 0 ? this.u9.c8() : new com.aspose.slides.internal.o9b.f2(var1.getWidth(), var1.getHeight());
      } else {
         return this.u9.c8();
      }
   }

   static {
      k7.n5(0, 0);
      k7.n5(1, 1);
      k7.n5(2, 2);
      k7.n5(3, 3);
      k7.n5(-1, 0);
   }
}
