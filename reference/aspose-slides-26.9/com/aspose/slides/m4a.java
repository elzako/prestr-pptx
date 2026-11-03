package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

final class m4a extends g8<Picture, m4a> implements IPictureEffectiveData {
   String n5 = null;
   PPImage l6;
   private ImageTransformOCollectionEffectiveData k5 = new ImageTransformOCollectionEffectiveData();
   private Presentation u3;

   final void n5() {
      this.k5.n5();
      this.n5 = null;
      this.l6 = null;
   }

   @Override
   public final IPPImage getImage() {
      return this.l6;
   }

   @Override
   public final String getLinkPathLong() {
      return this.n5;
   }

   @Override
   public final IImageTransformOCollectionEffectiveData getImageTransform() {
      return this.k5;
   }

   final com.aspose.slides.internal.k9.u9 n5(com.aspose.slides.internal.w0.c8 var1, com.aspose.slides.internal.o9b.f2 var2, s5u var3) {
      com.aspose.slides.internal.k9.h0 var4 = com.aspose.slides.internal.k9.h0.n5(this.l6.h0());
      String var5 = com.aspose.slides.ms.System.d1.n5("{0}:{1}PVI",new Object[]{ this.l6.n3().toString(), this.k5.l6()});
      if (!n5(this.k5)) {
         var4 = com.aspose.slides.internal.k9.h0.n5(var4, new com.aspose.slides.internal.k9.a6(var5));
      }

      String var6 = k8s.n5(null, var3, var2.a6(), false, var1);
      com.aspose.slides.internal.k9.h0 var7 = com.aspose.slides.internal.k9.h0.n5(
         var4, new com.aspose.slides.internal.k9.a6(com.aspose.slides.ms.System.d1.n5(new String[]{var5, var6}))
      );
      int var8 = this.u3 != null ? this.u3.n5(var7) : 1;
      com.aspose.slides.internal.k9.u9 var9 = null;
      com.aspose.slides.internal.k9.u9[] var10 = new com.aspose.slides.internal.k9.u9[]{var9};
      boolean var11 = var8 > 2 && this.u3.r4().n5(var7, var10);
      var9 = var10[0];
      if (var11) {
         return var9;
      }

      com.aspose.slides.internal.k9.h0[] var12 = new com.aspose.slides.internal.k9.h0[]{var4};
      com.aspose.slides.internal.k9.u9 var13 = this.n5(var3, var12);
      var4 = var12[0];
      if (!var13.l6()) {
         com.aspose.slides.internal.o9b.t4 var14 = com.aspose.slides.internal.n8e.k7.x8(var13.a6());
         var13 = new com.aspose.slides.internal.k9.u9(var14, var13.a6());
      }

      if (var3 != null && !com.aspose.slides.ms.System.n1.l6(var3.y4())) {
         var3.t4().n5(var4, var13);
         if (var8 > 1) {
            this.u3.n5(var4, var7, var13);
         }

         if (var3.h0() && com.aspose.slides.internal.n8e.k7.l6(var13.k5())) {
            return var13;
         }

         float var36 = Float.POSITIVE_INFINITY;
         float var15 = Float.POSITIVE_INFINITY;
         if (var1 != null) {
            com.aspose.slides.internal.o9b.w1[] var16 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 2)
            );
            var16[0] = new com.aspose.slides.internal.o9b.w1(1.0F, 0.0F);
            var16[1] = new com.aspose.slides.internal.o9b.w1(0.0F, 1.0F);
            com.aspose.slides.internal.n8e.n1.n5(var1, var16);
            var36 = (float)(var3.y4() / com.aspose.slides.ms.System.q1.z3(var16[0].l6() * var16[0].l6() + var16[0].k5() * var16[0].k5()));
            var15 = (float)(var3.y4() / com.aspose.slides.ms.System.q1.z3(var16[1].l6() * var16[1].l6() + var16[1].k5() * var16[1].k5()));
         } else {
            var36 = var15 = var3.y4();
         }

         double var17 = com.aspose.slides.ms.System.q1.z3(2.0);
         double var19 = 1.0;
         double var21 = (var2.l6() > 0.0F ? var2.l6() : 1.0F) * var36 / 72.0F * var17;
         double var23 = (var2.k5() > 0.0F ? var2.k5() : 1.0F) * var15 / 72.0F * var17;

         while (var13.k5().e2() / (float)var19 > var21) {
            var19 *= var17;
         }

         double var25 = 1.0;

         while (var13.k5().h0() / (float)var25 > var23) {
            var25 *= var17;
         }

         if (var19 == var17 * var25) {
            var19 = var25;
         } else if (var25 == var17 * var19) {
            var25 = var19;
         }

         if (com.aspose.slides.ms.System.q1.n5(var19 - 1.0) < 0.05 && com.aspose.slides.ms.System.q1.n5(var25 - 1.0) < 0.05) {
            return var13;
         }

         com.aspose.slides.internal.k9.h0 var27 = com.aspose.slides.internal.k9.h0.n5(var4, new com.aspose.slides.internal.k9.u3(var19, var25));
         com.aspose.slides.internal.k9.u9 var28 = null;
         com.aspose.slides.internal.k9.u9[] var29 = new com.aspose.slides.internal.k9.u9[]{var28};
         boolean var30 = !var3.t4().n5(var27, var29);
         var28 = var29[0];
         if (var30) {
            com.aspose.slides.internal.o9b.t4 var31 = var13.k5();
            com.aspose.slides.internal.o9b.p8 var32 = new com.aspose.slides.internal.o9b.p8(
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var31.e2() / (float)var19), 14),
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var31.h0() / (float)var25), 14)
            );
            if (var32.l6() < 1) {
               var32.n5(1);
            }

            if (var32.k5() < 1) {
               var32.l6(1);
            }

            com.aspose.slides.internal.o9b.l6 var33 = var13.u3() && com.aspose.slides.internal.n8e.k7.h0(var13.a6())
               ? com.aspose.slides.internal.n8e.k7.n5(var13.a6(), var32.l6(), var32.k5())
               : new com.aspose.slides.internal.o9b.l6(var31, var32.u3());
            var28 = new com.aspose.slides.internal.k9.u9(var33);
            var3.t4().n5(var27, var28);
         }

         if (var8 > 1) {
            this.u3.n5(var27, var7, var28);
         }

         return var28;
      } else {
         return var13;
      }
   }

   final com.aspose.slides.internal.k9.u9 n5(s5u var1, com.aspose.slides.internal.k9.h0[] var2) {
      float var3 = 3000000.0F;
      com.aspose.slides.internal.k9.u9 var4 = null;
      if (var1 != null) {
         var3 = var1.x8();
         com.aspose.slides.internal.k9.u9[] var5 = new com.aspose.slides.internal.k9.u9[]{var4};
         boolean var6 = var1.t4().n5(var2[0], var5);
         var4 = var5[0];
         if (var6) {
            return var4;
         }
      }

      if (var4 != null) {
         return var4;
      }

      var4 = new com.aspose.slides.internal.k9.u9(this.l6.h0());
      boolean var22 = false;
      if (var1 != null) {
         if (var1.a6() && !var1.h0()) {
            var4.n5(((PPImage)this.getImage()).n5());
            if (!com.aspose.slides.internal.n8e.k7.l6(var4.k5())) {
               var22 = true;
            }
         }

         if (var22 && com.aspose.slides.internal.n8e.k7.h0(var4.a6())) {
            var22 &= var1.u9();
         }
      }

      if (this.k5.size() != 0 || var22) {
         if (!var4.l6()) {
            var4.n5(((PPImage)this.getImage()).n5());
         }

         com.aspose.slides.internal.o9b.t4 var23 = null;
         com.aspose.slides.internal.o9b.p8 var7 = var4.k5().n3().u3();
         boolean var8 = false;
         boolean var9 = false;
         if (com.aspose.slides.internal.n8e.k7.h0(var4.a6())) {
            if ((float)var7.l6() * var7.k5() > var3) {
               var8 = true;
               float var10 = (float)com.aspose.slides.ms.System.q1.z3(var3 / var7.l6() / var7.k5());
               var7 = new com.aspose.slides.internal.o9b.p8(
                  com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var7.l6() * var10), 14),
                  com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var7.k5() * var10), 14)
               );
               if (var7.l6() < 1) {
                  var7.n5(1);
               }

               if (var7.k5() < 1) {
                  var7.l6(1);
               }
            }

            com.aspose.slides.internal.o9b.l6 var24 = new com.aspose.slides.internal.o9b.l6(var7.l6(), var7.k5(), 2498570);
            if (var8) {
               float var11 = com.aspose.slides.internal.n2d.m1.n5(var4.k5()) * var24.e2() / var4.k5().e2();
               float var12 = com.aspose.slides.internal.n2d.m1.l6(var4.k5()) * var24.h0() / var4.k5().h0();
               var24.n5(var11, var12);
            } else {
               var24.n5(com.aspose.slides.internal.n2d.m1.n5(var4.k5()), com.aspose.slides.internal.n2d.m1.l6(var4.k5()));
            }

            var24 = var4.u3()
               ? com.aspose.slides.internal.n8e.k7.n5(var4.a6(), com.aspose.slides.internal.o9b.p8.n5(var7).a6())
               : com.aspose.slides.internal.n8e.k7.n5((com.aspose.slides.internal.j9e.y4)var4.k5(), com.aspose.slides.internal.o9b.p8.n5(var7).a6());
            var23 = var24;
            var9 = true;
         }

         boolean var26 = false;
         if (!n5(this.k5)) {
            var26 = true;
            com.aspose.slides.internal.o9b.t4 var27 = var23;
            if (var27 == null) {
               var27 = (com.aspose.slides.internal.o9b.t4)var4.k5().deepClone();
            }

            var23 = this.k5.n5(com.aspose.slides.internal.v6g.k5.n5(var27, com.aspose.slides.internal.o9b.l6.class), var22);
         } else if (var23 == null) {
            var23 = com.aspose.slides.internal.v6g.k5.n5(var4.k5(), com.aspose.slides.internal.o9b.l6.class);
         }

         byte[] var29 = null;
         com.aspose.slides.internal.k9.u9 var13 = s5u.l6(var1, var2[0], this.l6);
         if (var13 != null) {
            var29 = var13.a6();
         } else {
            var29 = this.l6.h0();
         }

         boolean var14 = false;
         byte[] var28;
         if (var29 != null && com.aspose.slides.internal.k4d.a6.l6(var29) == 4 && !var26) {
            com.aspose.slides.internal.z0k.e2 var15 = new com.aspose.slides.internal.z0k.e2();

            try {
               com.aspose.slides.internal.j9e.s7 var16 = com.aspose.slides.internal.s5.h0.n5(com.aspose.slides.internal.j9e.x8.c8());
               com.aspose.slides.internal.j9e.h0 var17 = new com.aspose.slides.internal.j9e.h0();
               var17.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.a6, 100L);
               var23.n5(var15, var16, var17);
               var28 = var15.toArray();
               var23 = com.aspose.slides.internal.n8e.k7.x8(var28);
            } finally {
               if (var15 != null) {
                  var15.dispose();
               }
            }

            var14 = true;
         } else if (!var26 && !var9) {
            var28 = var4.a6();
         } else {
            var28 = com.aspose.slides.internal.n8e.k7.n5(var23);
         }

         if (var26 || var9 || var14) {
            if (var4.k5() != null) {
               var4.k5().dispose();
            }

            com.aspose.slides.internal.k9.u9 var31 = new com.aspose.slides.internal.k9.u9(var23, var28);
            if (var1 != null) {
               var2[0] = com.aspose.slides.internal.k9.h0.n5(var28);
               var1.t4().n5(var2[0], var31);
            }

            return var31;
         }
      }

      return var4;
   }

   static boolean n5(ImageTransformOCollectionEffectiveData var0) {
      if (var0 != null && var0.size() != 0) {
         int var1 = 0;
         IGenericEnumerator var2 = var0.iterator();

         try {
            while (var2.hasNext()) {
               IEffectEffectiveData var3 = (IEffectEffectiveData)var2.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var3, o0.class)) {
                  o0 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, o0.class);
                  if (var4.getAmount() == 100.0F) {
                     var1++;
                  }
               } else if (com.aspose.slides.internal.v6g.k5.l6(var3, t9v.class)) {
                  t9v var8 = com.aspose.slides.internal.v6g.k5.n5(var3, t9v.class);
                  if (var8.getBrightness() == 0.0F && var8.getContrast() == 0.0F) {
                     var1++;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         return var0.size() - var1 <= 0;
      } else {
         return true;
      }
   }

   final void n5(i7b var1) {
      m4a var2 = (m4a)var1;
      this.n5 = var2.getLinkPathLong();
      this.l6 = (PPImage)var2.getImage();
      this.k5 = new ImageTransformOCollectionEffectiveData();
      IGenericEnumerator var3 = var2.getImageTransform().iterator();

      try {
         while (var3.hasNext()) {
            IEffectEffectiveData var4 = (IEffectEffectiveData)var3.next();
            this.k5.n5(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   void n5(i7b var1, Picture var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(Picture var1) {
      this.u3 = (Presentation)var1.getPresentation();
      this.n5 = var1.getLinkPathLong();
      this.l6 = (PPImage)var1.getImage();
      this.k5 = new ImageTransformOCollectionEffectiveData();
      IGenericEnumerator var2 = var1.getImageTransform().iterator();

      try {
         while (var2.hasNext()) {
            ImageTransformOperation var3 = (ImageTransformOperation)var2.next();
            this.k5.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      IGenericEnumerator var3 = this.k5.iterator();

      try {
         while (var3.hasNext()) {
            IEffectEffectiveData var4 = (IEffectEffectiveData)var3.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var4, t9f.class)) {
               ((t9f)var4).n5(var1, var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   boolean n5(m4a var1) {
      if (var1 == null) {
         return false;
      } else if (this.l6 == null && var1.getImage() != null) {
         return false;
      } else if (this.l6 != null && !this.l6.equals(var1.getImage())) {
         return false;
      } else {
         return !this.k5.n5(var1.k5) ? false : com.aspose.slides.ms.System.d1.a6(this.n5, var1.n5);
      }
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.m4a)recoveredArg);
   }
}
