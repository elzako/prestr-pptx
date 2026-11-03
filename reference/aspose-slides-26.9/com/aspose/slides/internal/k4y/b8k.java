package com.aspose.slides.internal.k4y;

public class b8k extends b3 {
   private String n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("text:style-name");

   public b8k(com.aspose.slides.ms.System.Xml.c7 var1) {
      b8k$1 var2 = new b8k$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public b8k() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("text:style-name", this.n5);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static String n5(b8k var0, String var1) {
      return var0.n5 = var1;
   }
}
