package com.aspose.slides;

class s6s {
   public static MathLeftSubSuperscriptElement n5(com.aspose.slides.internal.k4y.f7s var0, t5w var1) {
      com.aspose.slides.ms.System.o5 var2 = new com.aspose.slides.ms.System.o5();
      com.aspose.slides.ms.System.o5 var3 = new com.aspose.slides.ms.System.o5();
      com.aspose.slides.ms.System.o5[] var4 = new com.aspose.slides.ms.System.o5[]{var2};
      com.aspose.slides.ms.System.o5[] var5 = new com.aspose.slides.ms.System.o5[]{var3};
      MathLeftSubSuperscriptElement var6 = new MathLeftSubSuperscriptElement(
         b6l.n5(var0.a6(), var1), b6l.n5(var0.k5(), var4, var1), b6l.n5(var0.u3(), var5, var1)
      );
      var2 = var4[0];
      var3 = var5[0];
      if (var2.l6()) {
         ((m0g)var6.getSubscript()).n5((Byte)var2.n5());
      }

      if (var3.l6()) {
         ((m0g)var6.getSuperscript()).n5((Byte)var3.n5());
      }

      if (var0 != null && var0.l6() != null) {
         l0u.n5(var6.n5, var0.l6().l6(), var1);
      }

      return var6;
   }

   public static MathRightSubSuperscriptElement n5(com.aspose.slides.internal.k4y.a6c var0, t5w var1) {
      com.aspose.slides.ms.System.o5 var2 = new com.aspose.slides.ms.System.o5();
      com.aspose.slides.ms.System.o5 var3 = new com.aspose.slides.ms.System.o5();
      com.aspose.slides.ms.System.o5[] var4 = new com.aspose.slides.ms.System.o5[]{var2};
      com.aspose.slides.ms.System.o5[] var5 = new com.aspose.slides.ms.System.o5[]{var3};
      MathRightSubSuperscriptElement var6 = new MathRightSubSuperscriptElement(
         b6l.n5(var0.l6(), var1), b6l.n5(var0.k5(), var4, var1), b6l.n5(var0.u3(), var5, var1)
      );
      var2 = var4[0];
      var3 = var5[0];
      if (var2.l6()) {
         ((m0g)var6.getSubscript()).n5((Byte)var2.n5());
      }

      if (var3.l6()) {
         ((m0g)var6.getSuperscript()).n5((Byte)var3.n5());
      }

      if (var0 != null && var0.n5() != null) {
         if (var0.n5().l6() == null) {
            var6.setAlignScripts(false);
         } else {
            var6.setAlignScripts(var0.n5().l6().n5() == 0 || var0.n5().l6().n5() == 1);
         }

         l0u.n5(var6.n5, var0.n5().k5(), var1);
      }

      return var6;
   }

   public static MathSubscriptElement n5(com.aspose.slides.internal.k4y.x3s var0, t5w var1) {
      com.aspose.slides.ms.System.o5 var2 = new com.aspose.slides.ms.System.o5();
      com.aspose.slides.ms.System.o5[] var3 = new com.aspose.slides.ms.System.o5[]{var2};
      MathSubscriptElement var4 = new MathSubscriptElement(b6l.n5(var0.k5(), var1), b6l.n5(var0.u3(), var3, var1));
      var2 = var3[0];
      if (var2.l6()) {
         var4.l6().n5((Byte)var2.n5());
      }

      if (var0.l6() != null) {
         l0u.n5(var4.n5, var0.l6().l6(), var1);
      }

      return var4;
   }

   public static MathSuperscriptElement n5(com.aspose.slides.internal.k4y.t8f var0, t5w var1) {
      com.aspose.slides.ms.System.o5 var2 = new com.aspose.slides.ms.System.o5();
      com.aspose.slides.ms.System.o5[] var3 = new com.aspose.slides.ms.System.o5[]{var2};
      MathSuperscriptElement var4 = new MathSuperscriptElement(b6l.n5(var0.k5(), var1), b6l.n5(var0.u3(), var3, var1));
      var2 = var3[0];
      if (var2.l6()) {
         ((m0g)var4.getSuperscript()).n5((Byte)var2.n5());
      }

      if (var0.l6() != null) {
         l0u.n5(var4.n5, var0.l6().l6(), var1);
      }

      return var4;
   }
}
