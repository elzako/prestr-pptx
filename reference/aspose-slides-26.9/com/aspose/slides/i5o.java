package com.aspose.slides;

class i5o {
   public static b5i n5(com.aspose.slides.internal.k4y.w3g var0, t5w var1) {
      if (var0 == null) {
         return null;
      }

      b5i var2 = new b5i();
      var2.setOperator(u1s.n5(var0.l6()));
      var2.setLimitLocation(u9e.n5(var0.k5()));
      var2.setGrowToMatchOperandHeight(o5b.n5(var0.u3()));
      var2.setHideSubscript(o5b.n5(var0.a6()));
      var2.setHideSuperscript(o5b.n5(var0.u9()));
      l0u.n5(var2.l6(), var0.h0(), var1);
      return var2;
   }

   public static com.aspose.slides.internal.k4y.w3g n5(MathNaryOperator var0, g6c var1) {
      com.aspose.slides.internal.k4y.w3g var2 = new com.aspose.slides.internal.k4y.w3g();
      var2.n5(u1s.n5(var0.getOperator()));
      var2.n5(u9e.n5(var0.getLimitLocation()));
      var2.n5(o5b.n5(var0.getGrowToMatchOperandHeight()));
      var2.l6(o5b.n5(var0.getHideSubscript()));
      var2.k5(o5b.n5(var0.getHideSuperscript()));
      l0u.n5(var0.getControlCharacterProperties(), new i5o$1(var2), var1);
      return var2;
   }
}
