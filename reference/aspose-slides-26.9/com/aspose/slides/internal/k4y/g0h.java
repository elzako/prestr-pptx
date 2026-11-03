package com.aspose.slides.internal.k4y;

public class g0h extends b3 {
   private int l6;
   private String k5;
   public static final int n5 = m3c.n5("equal");
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("operator", "val");

   public g0h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      g0h$1 var2 = new g0h$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public g0h() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("operator", m3c.n5(this.l6));
      }

      if (this.k5 != null) {
         var2.l6("val", this.k5);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(g0h var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(g0h var0, String var1) {
      return var0.k5 = var1;
   }
}
