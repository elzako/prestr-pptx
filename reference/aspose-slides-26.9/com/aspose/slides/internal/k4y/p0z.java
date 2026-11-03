package com.aspose.slides.internal.k4y;

public class p0z extends b3 {
   private int k5;
   private String u3;
   private int a6;
   private int u9;
   private String h0;
   private String c8;
   private String t2;
   private com.aspose.slides.ms.System.s4 s7 = new com.aspose.slides.ms.System.s4();
   public static final int n5 = a3l.n5("copy-all");
   public static final int l6 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "table:mode", "table:table-name", "xlink:type", "xlink:actuate", "xlink:href", "table:filter-name", "table:filter-options", "table:refresh-delay"
   );

   public p0z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      p0z$1 var2 = new p0z$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public p0z() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
      this.a6 = l6;
      this.u9 = 0;
      com.aspose.slides.ms.System.s4.k5.u3(this.s7);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != n5) {
         var2.l6("table:mode", a3l.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("table:table-name", this.u3);
      }

      if (this.a6 != l6) {
         var2.l6("xlink:type", v5w.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("xlink:actuate", p9c.n5(this.u9));
      }

      var2.l6("xlink:href", this.h0);
      if (this.c8 != null) {
         var2.l6("table:filter-name", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("table:filter-options", this.t2);
      }

      var2.l6("table:refresh-delay", n5(this.s7.n3()));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return x8;
   }

   // $VF: synthetic method
   static int n5(p0z var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(p0z var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(p0z var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(p0z var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String l6(p0z var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String k5(p0z var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u3(p0z var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 n5(p0z var0) {
      return var0.s7;
   }
}
