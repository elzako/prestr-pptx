package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class g3x {
   public static com.aspose.slides.internal.k4y.b3 n5(IMathElement var0, g6c var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, MathDelimiter.class)) {
         return z5p.n5((MathDelimiter)var0, var1);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, MathArray.class)) {
         return s4.n5((MathArray)var0, var1);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, MathFraction.class)) {
         return o0y.n5((MathFraction)var0, var1);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, MathFunction.class)) {
         return z7o.n5((MathFunction)var0, var1);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, MathLimit.class)) {
         MathLimit var23 = (MathLimit)var0;
         return var23.getUpperLimit() ? c5f.n5(var23, var1) : l1p.n5(var23, var1);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, MathematicalText.class)) {
         MathematicalText var22 = (MathematicalText)var0;
         k3k var28 = new k3k(var22.getValue(), (PortionFormat)var22.getFormat());
         return n5(var28, var1);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, MathNaryOperator.class)) {
         return p0i.n5((MathNaryOperator)var0, var1);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, MathRadical.class)) {
         return m7c.n5((MathRadical)var0, var1);
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var0, k3k.class)) {
         if (com.aspose.slides.internal.v6g.k5.l6(var0, MathSubscriptElement.class)) {
            MathSubscriptElement var21 = (MathSubscriptElement)var0;
            com.aspose.slides.internal.k4y.x3s var27 = new com.aspose.slides.internal.k4y.x3s();
            if (var21.getBase() != null) {
               b6l.n5(var27.k5(), var21.getBase(), var1);
            }

            if (var21.getSubscript() != null) {
               b6l.n5(var27.u3(), var21.getSubscript(), var1);
            }

            s7u var32 = var21.n5;
            if (!var32.n5()) {
               com.aspose.slides.internal.k4y.i9o var35 = var27.n5();
               l0u.n5(var32, new g3x$3(var35), var1);
            }

            return var27;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathSuperscriptElement.class)) {
            MathSuperscriptElement var20 = (MathSuperscriptElement)var0;
            com.aspose.slides.internal.k4y.t8f var26 = new com.aspose.slides.internal.k4y.t8f();
            if (var20.getBase() != null) {
               b6l.n5(var26.k5(), var20.getBase(), var1);
            }

            if (var20.getSuperscript() != null) {
               b6l.n5(var26.u3(), var20.getSuperscript(), var1);
            }

            s7u var31 = var20.n5;
            if (!var31.n5()) {
               com.aspose.slides.internal.k4y.s6h var34 = var26.n5();
               l0u.n5(var31, new g3x$4(var34), var1);
            }

            return var26;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathRightSubSuperscriptElement.class)) {
            MathRightSubSuperscriptElement var19 = (MathRightSubSuperscriptElement)var0;
            com.aspose.slides.internal.k4y.a6c var25 = new com.aspose.slides.internal.k4y.a6c();
            com.aspose.slides.internal.k4y.l6r var30 = new com.aspose.slides.internal.k4y.l6r();
            var30.n5(o5b.n5(var19.getAlignScripts()));
            l0u.n5(var19.n5, new g3x$5(var30), var1);
            var25.n5(var30);
            if (var19.getBase() != null) {
               b6l.n5(var25.l6(), var19.getBase(), var1);
            }

            if (var19.getSubscript() != null) {
               b6l.n5(var25.k5(), var19.getSubscript(), var1);
            }

            if (var19.getSuperscript() != null) {
               b6l.n5(var25.u3(), var19.getSuperscript(), var1);
            }

            return var25;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathLeftSubSuperscriptElement.class)) {
            MathLeftSubSuperscriptElement var18 = (MathLeftSubSuperscriptElement)var0;
            com.aspose.slides.internal.k4y.f7s var24 = new com.aspose.slides.internal.k4y.f7s();
            if (var18.getBase() != null) {
               b6l.n5(var24.a6(), var18.getBase(), var1);
            }

            if (var18.getSubscript() != null) {
               b6l.n5(var24.k5(), var18.getSubscript(), var1);
            }

            if (var18.getSuperscript() != null) {
               b6l.n5(var24.u3(), var18.getSuperscript(), var1);
            }

            s7u var29 = var18.n5;
            if (!var29.n5()) {
               com.aspose.slides.internal.k4y.c0z var33 = var24.n5();
               l0u.n5(var29, new g3x$6(var33), var1);
            }

            return var24;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathBlock.class)) {
            com.aspose.slides.internal.k4y.o3d var17 = new com.aspose.slides.internal.k4y.o3d();
            a9a.n5((MathBlock)var0, var17, var1);
            return var17;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathAccent.class)) {
            com.aspose.slides.internal.k4y.b3x var16 = new com.aspose.slides.internal.k4y.b3x();
            s7.n5((MathAccent)var0, var16, var1);
            return var16;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathBar.class)) {
            com.aspose.slides.internal.k4y.q7l var15 = new com.aspose.slides.internal.k4y.q7l();
            z0.n5((MathBar)var0, var15, var1);
            return var15;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathBox.class)) {
            com.aspose.slides.internal.k4y.r3m var14 = new com.aspose.slides.internal.k4y.r3m();
            b3x.n5((MathBox)var0, var14, var1);
            return var14;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathGroupingCharacter.class)) {
            com.aspose.slides.internal.k4y.h9j var13 = new com.aspose.slides.internal.k4y.h9j();
            w7k.n5((MathGroupingCharacter)var0, var13, var1);
            return var13;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathBorderBox.class)) {
            com.aspose.slides.internal.k4y.r2v var12 = new com.aspose.slides.internal.k4y.r2v();
            x6.n5((MathBorderBox)var0, var12, var1);
            return var12;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathMatrix.class)) {
            com.aspose.slides.internal.k4y.e8a var11 = new com.aspose.slides.internal.k4y.e8a();
            d1w.n5((MathMatrix)var0, var11, var1);
            return var11;
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, MathPhantom.class)) {
            com.aspose.slides.internal.k4y.d2m var10 = new com.aspose.slides.internal.k4y.d2m();
            a1f.n5((MathPhantom)var0, var10, var1);
            return var10;
         } else {
            throw new NotImplementedException();
         }
      } else {
         k3k var2 = (k3k)var0;
         com.aspose.slides.internal.k4y.e8x var3 = new com.aspose.slides.internal.k4y.e8x();
         f0w var4 = new f0w(var2.a6());
         IGenericEnumerator var5 = var2.l6().iterator();

         try {
            while (var5.hasNext()) {
               y0v var6 = (y0v)var5.next();
               var3.n5(var4.n5(var6));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         w5d.n5(var2.a6(), new g3x$1(var3), var1);
         z4a var36 = new z4a();
         var36.l6(MathematicalText.n5(var2.a6()));
         if (!var36.h0()) {
            u3b.n5(var36, new g3x$2(var3), var1);
         }

         return var3;
      }
   }
}
