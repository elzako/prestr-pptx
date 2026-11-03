package com.aspose.slides.internal.k4y;

public class o1l extends b3 {
   private String k5;
   private int u3;
   private int a6;
   private String u9;
   private com.aspose.slides.ms.System.j5 h0 = new com.aspose.slides.ms.System.j5();
   public static final int n5 = v5w.n5("simple");
   public static final com.aspose.slides.ms.System.j5 l6 = com.aspose.slides.ms.System.j5.l6.m3();
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "xlink:href", "xlink:type", "xlink:actuate", "xlink:title", "meta:date"
   );

   public o1l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      o1l$1 var2 = new o1l$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public o1l() {
      this.l6();
   }

   private void l6() {
      this.u3 = n5;
      this.a6 = 0;
      l6.u3(this.h0);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("xlink:href", this.k5);
      if (this.u3 != n5) {
         var2.l6("xlink:type", v5w.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("xlink:actuate", p9c.n5(this.a6));
      }

      if (this.u9 != null) {
         var2.l6("xlink:title", this.u9);
      }

      if (com.aspose.slides.ms.System.j5.c8(this.h0, l6)) {
         var2.l6("meta:date", com.aspose.slides.ms.System.Xml.f4.n5(this.h0.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(o1l var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(o1l var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(o1l var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String l6(o1l var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(o1l var0) {
      return var0.h0;
   }
}
