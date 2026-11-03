package com.aspose.slides.internal.k4y;

public class b7i extends b3 {
   private u3n n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("geoLocation");

   public b7i(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new b7i$1(this, var1));
   }

   public b7i() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "geoLocation");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static u3n n5(b7i var0, u3n var1) {
      return var0.n5 = var1;
   }
}
