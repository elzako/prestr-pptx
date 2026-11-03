package com.aspose.slides.internal.k4y;

public class d0f extends b3 {
   private String l6;
   private int k5;
   private int u3;
   private String a6;
   private String u9;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "xlink:href", "xlink:type", "xlink:show", "text:section-name", "text:filter-name"
   );

   public d0f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d0f$1 var2 = new d0f$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public d0f() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
      this.u3 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("xlink:href", this.l6);
      }

      if (this.k5 != n5) {
         var2.l6("xlink:type", v5w.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("xlink:show", h8e.n5(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("text:section-name", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("text:filter-name", this.u9);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(d0f var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(d0f var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(d0f var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(d0f var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(d0f var0, String var1) {
      return var0.u9 = var1;
   }
}
