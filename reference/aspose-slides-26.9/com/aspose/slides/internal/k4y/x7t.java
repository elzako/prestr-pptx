package com.aspose.slides.internal.k4y;

public class x7t extends b3 {
   private String n5;
   private String l6;
   private int k5;
   private String u3;
   private String a6;
   private int u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "draw:name", "draw:display-name", "draw:style", "draw:color", "draw:distance", "draw:rotation"
   );

   public x7t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      x7t$1 var2 = new x7t$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x7t() {
      this.h0();
   }

   private void h0() {
      this.k5 = 0;
      this.u9 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("draw:name", this.n5);
      if (this.l6 != null) {
         var2.l6("draw:display-name", this.l6);
      }

      var2.l6("draw:style", b3t.n5(this.k5));
      if (this.u3 != null) {
         var2.l6("draw:color", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("draw:distance", this.a6);
      }

      if (this.u9 != 0) {
         var2.l6("draw:rotation", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final int l6() {
      return this.k5;
   }

   public final String k5() {
      return this.u3;
   }

   public final String u3() {
      return this.a6;
   }

   public final int a6() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(x7t var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(x7t var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(x7t var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(x7t var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(x7t var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int l6(x7t var0, int var1) {
      return var0.u9 = var1;
   }
}
