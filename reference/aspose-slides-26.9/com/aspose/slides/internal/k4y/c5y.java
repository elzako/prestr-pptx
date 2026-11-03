package com.aspose.slides.internal.k4y;

public class c5y extends b3 {
   private g7 n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("patternFill", "gradientFill");

   public c5y(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new c5y$1(this, var1));
   }

   public c5y() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (l6.n5(this.n5.n5())) {
            case 0:
               ((o5z)this.n5.k5()).n5("ssml", var2, this.n5.n5());
               break;
            case 1:
               ((w9d)this.n5.k5()).n5("ssml", var2, this.n5.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static g7 n5(c5y var0, g7 var1) {
      return var0.n5 = var1;
   }
}
