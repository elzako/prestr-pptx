package com.aspose.slides.internal.k4y;

public class w3t extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("table:column", "table:row", "table:table");

   public w3t(com.aspose.slides.ms.System.Xml.c7 var1) {
      w3t$1 var2 = new w3t$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public w3t() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:column", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      var2.l6("table:row", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      var2.l6("table:table", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(w3t var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(w3t var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(w3t var0, int var1) {
      return var0.k5 = var1;
   }
}
