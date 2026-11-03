package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class a1w implements c0e {
   public final float n5;
   public final com.aspose.slides.internal.f3.u3<PortionFormat, com.aspose.slides.internal.o9b.u3> l6;
   public final com.aspose.slides.internal.f3.u3<String, com.aspose.slides.internal.g7.u0a> k5;
   public final a1w$n5 u3;
   public final boolean a6;
   public Presentation u9;
   public final MathParagraph h0;
   private boolean c8;

   a1w(
      MathParagraph var1,
      float var2,
      com.aspose.slides.internal.f3.u3<String, com.aspose.slides.internal.g7.u0a> var3,
      com.aspose.slides.internal.f3.u3<PortionFormat, com.aspose.slides.internal.o9b.u3> var4,
      a1w$n5 var5,
      boolean var6
   ) {
      this.h0 = var1;
      this.n5 = var2;
      this.l6 = var4;
      this.k5 = var3;
      this.u3 = var5;
      this.a6 = var6;
   }

   @Override
   public final a1w a6() {
      return this;
   }

   public final r3p n5() {
      return c6x.n5;
   }

   public final e8s n5(IMathElement var1, c0e var2, w1g var3) {
      if (var2 == null) {
         throw new ArgumentNullException("parent");
      }

      e8s var4 = this.l6(var1, var2, var3.n5());
      var4.t2();
      return var4;
   }

   final boolean l6() {
      return this.c8;
   }

   final void n5(boolean var1) {
      this.c8 = var1;
   }

   private e8s l6(IMathElement var1, c0e var2, w1g var3) {
      if (var1 == null) {
         return new n3p(var2);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, MathBlock.class)) {
         return new t7e((MathBlock)var1, var2, var3.n5());
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, MathematicalText.class)) {
         return new b4i((MathematicalText)var1, var2, var3.n5(), null);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, MathFraction.class)) {
         if (!this.h0.n5() && !var3.h0) {
            var3.a6 *= 0.772F;
            var3.h0 = true;
            var3.n3 = 0.9F;
            var3.y4 = 1.0F;
         }

         MathFraction var4 = (MathFraction)var1;
         switch (var4.getFractionType()) {
            case 2:
               return new m0d(var4, var2, var3.n5());
            case 3:
               return new l1q(var4, var2, var3.n5());
            default:
               return new k3i(var4, var2, var3.n5());
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathLeftSubSuperscriptElement.class)) {
         return new v4n((MathLeftSubSuperscriptElement)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathRightSubSuperscriptElement.class)) {
         return new v4n((MathRightSubSuperscriptElement)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathSubscriptElement.class)) {
         return new g5s((MathSubscriptElement)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathSuperscriptElement.class)) {
         return new g5s((MathSuperscriptElement)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathRadical.class)) {
         return new q3b((MathRadical)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathFunction.class)) {
         return new s7b((MathFunction)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathDelimiter.class)) {
         return new w2k((MathDelimiter)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathArray.class)) {
         return new d1((MathArray)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathMatrix.class)) {
         return new l4i((MathMatrix)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathLimit.class)) {
         return new i4f((MathLimit)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathNaryOperator.class)) {
         return new q3m((MathNaryOperator)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathAccent.class)) {
         return new t2((MathAccent)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathBar.class)) {
         return new x0((MathBar)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathBox.class)) {
         return new k9((MathBox)var1, var2, var3.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MathPhantom.class)) {
         return new m0i((MathPhantom)var1, var2, var3.n5());
      } else {
         throw new NotImplementedException();
      }
   }

   public static boolean n5(IMathParagraph var0) {
      IGenericEnumerator var1 = var0.iterator();

      try {
         while (var1.hasNext()) {
            MathBlock var2 = (MathBlock)var1.next();
            if (!n5(var2)) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return true;
   }

   final p1e n5(float var1) {
      return new p1e(var1);
   }

   public static boolean n5(IMathElement var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, MathematicalText.class)) {
         return true;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, MathPhantom.class)) {
         return true;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, MathDelimiter.class)) {
         MathDelimiter var3 = (MathDelimiter)var0;
         return s4z.n5(var3.getSeparatorCharacter()) && s4z.n5(var3.getBeginningCharacter()) && s4z.n5(var3.getEndingCharacter()) && l6(var0);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, MathNaryOperator.class)) {
         MathNaryOperator var2 = (MathNaryOperator)var0;
         return s4z.n5(var2.getOperator()) && l6(var0);
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var0, MathAccent.class)) {
         return !com.aspose.slides.internal.v6g.k5.l6(var0, MathBlock.class)
               && !com.aspose.slides.internal.v6g.k5.l6(var0, MathFraction.class)
               && !com.aspose.slides.internal.v6g.k5.l6(var0, BaseScript.class)
               && !com.aspose.slides.internal.v6g.k5.l6(var0, MathRadical.class)
               && !com.aspose.slides.internal.v6g.k5.l6(var0, MathFunction.class)
               && !com.aspose.slides.internal.v6g.k5.l6(var0, MathArray.class)
               && !com.aspose.slides.internal.v6g.k5.l6(var0, MathMatrix.class)
               && !com.aspose.slides.internal.v6g.k5.l6(var0, MathLimit.class)
               && !com.aspose.slides.internal.v6g.k5.l6(var0, MathBar.class)
               && !com.aspose.slides.internal.v6g.k5.l6(var0, MathBox.class)
            ? false
            : l6(var0);
      }

      MathAccent var1 = (MathAccent)var0;
      return s4z.n5(var1.getCharacter()) && l6(var0);
   }

   private static boolean l6(IMathElement var0) {
      for (IMathElement var4 : var0.getChildren()) {
         if (!n5(var4)) {
            return false;
         }
      }

      return true;
   }

   final com.aspose.slides.internal.o9b.n3 n5(MathematicalText var1, byte var2, float var3) {
      if (this.u3 != null) {
         return this.u3.n5(var1, var2, var3);
      }

      com.aspose.slides.internal.o9b.n3 var4 = t1g.n5();
      return com.aspose.slides.internal.o9b.n3.n5(var4.l6(), var3, 0);
   }

   final boolean n5(q8r var1, e8s var2, com.aspose.slides.internal.o9b.u3[] var3) {
      PortionFormat var4 = (PortionFormat)var1.getControlCharacterProperties().l6();
      if (var4 != null) {
         var3[0] = this.l6.invoke(var4);
         return true;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, b4i.class)) {
         var3[0] = com.aspose.slides.internal.v6g.k5.n5(var2, b4i.class).k5();
         return true;
      } else {
         var3[0] = null;
         return false;
      }
   }
}
