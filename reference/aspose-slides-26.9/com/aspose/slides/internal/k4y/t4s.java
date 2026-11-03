package com.aspose.slides.internal.k4y;

public class t4s extends b3 {
   private String n5;
   private String l6;
   private int k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "table:label-cell-range-address", "table:data-cell-range-address", "table:orientation"
   );

   public t4s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      t4s$1 var2 = new t4s$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public t4s() {
      this.l6();
   }

   private void l6() {
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:label-cell-range-address", this.n5);
      var2.l6("table:data-cell-range-address", this.l6);
      var2.l6("table:orientation", x2p.n5(this.k5));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(t4s var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(t4s var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(t4s var0, int var1) {
      return var0.k5 = var1;
   }
}
