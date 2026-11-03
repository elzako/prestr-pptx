package com.aspose.slides;

class p0i {
   public static MathNaryOperator n5(com.aspose.slides.internal.k4y.x6g var0, t5w var1) {
      b5i var2 = null;
      if (var0.n5() != null) {
         var2 = i5o.n5(var0.n5(), var1);
      }

      com.aspose.slides.ms.System.o5 var3 = new com.aspose.slides.ms.System.o5();
      com.aspose.slides.ms.System.o5 var4 = new com.aspose.slides.ms.System.o5();
      com.aspose.slides.ms.System.o5[] var5 = new com.aspose.slides.ms.System.o5[]{var3};
      com.aspose.slides.ms.System.o5[] var6 = new com.aspose.slides.ms.System.o5[]{var4};
      MathNaryOperator var7 = new MathNaryOperator(b6l.n5(var0.u3(), var1), b6l.n5(var0.l6(), var5, var1), b6l.n5(var0.k5(), var6, var1), var2);
      var3 = var5[0];
      var4 = var6[0];
      if (var3.l6() && var7.getSubscript() != null) {
         ((m0g)var7.getSubscript()).n5((Byte)var3.n5());
      }

      if (var4.l6() && var7.getSuperscript() != null) {
         ((m0g)var7.getSuperscript()).n5((Byte)var4.n5());
      }

      return var7;
   }

   public static com.aspose.slides.internal.k4y.x6g n5(MathNaryOperator var0, g6c var1) {
      com.aspose.slides.internal.k4y.x6g var2 = new com.aspose.slides.internal.k4y.x6g();
      b6l.n5(var2.u3(), var0.getBase(), var1);
      b6l.n5(var2.l6(), var0.getSubscript(), var1);
      b6l.n5(var2.k5(), var0.getSuperscript(), var1);
      if (!var0.l6()) {
         var2.n5(i5o.n5(var0, var1));
      }

      return var2;
   }
}
