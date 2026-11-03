package com.aspose.slides.internal.k4y;

public final class m4f extends b3 {
   private char n5 = 0;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("m:val");

   public m4f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();
      n5(var1, new m4f$1(this));
      l6(var1);
   }

   public m4f() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("m:val", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      } else {
         var2.l6("m:val", "");
      }

      var2.s7();
   }

   public final char n5() {
      return this.n5;
   }

   public final void n5(char var1) {
      this.n5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static char n5(m4f var0, char var1) {
      return var0.n5 = var1;
   }
}
