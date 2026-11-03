package com.aspose.slides.internal.k4y;

public class l6l extends b3 {
   private int l6;
   private v6p k5;
   public static final int n5 = g5g.n5("none");
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("style", "color");

   public l6l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      l6l$1 var2 = new l6l$1(this);
      n5(var1, var2);
      n5(var1, new l6l$2(this, var1));
   }

   public l6l() {
      this.u3();
   }

   private void u3() {
      this.l6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("style", g5g.n5(this.l6));
      }

      if (this.k5 != null) {
         this.k5.n5("ssml", var2, "color");
      }

      var2.s7();
   }

   public final int n5() {
      return this.l6;
   }

   public final v6p l6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(l6l var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static v6p n5(l6l var0, v6p var1) {
      return var0.k5 = var1;
   }
}
