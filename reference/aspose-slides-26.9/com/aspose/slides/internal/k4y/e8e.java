package com.aspose.slides.internal.k4y;

public class e8e extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private int u9;
   private int h0;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "script:event-name", "script:language", "script:macro-name", "xlink:href", "xlink:type", "xlink:actuate"
   );

   public e8e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      e8e$1 var2 = new e8e$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public e8e() {
      this.l6();
   }

   private void l6() {
      this.u9 = n5;
      this.h0 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("script:event-name", this.l6);
      var2.l6("script:language", this.k5);
      if (this.u3 != null) {
         var2.l6("script:macro-name", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("xlink:href", this.a6);
      }

      if (this.u9 != n5) {
         var2.l6("xlink:type", v5w.n5(this.u9));
      }

      if (this.h0 != 0) {
         var2.l6("xlink:actuate", p9c.n5(this.h0));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(e8e var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(e8e var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(e8e var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(e8e var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int n5(e8e var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int l6(e8e var0, int var1) {
      return var0.h0 = var1;
   }
}
