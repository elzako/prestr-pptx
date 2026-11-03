package com.aspose.slides.internal.k4y;

public class f2f extends b3 {
   private String l6;
   private String k5;
   private int u3;
   private int a6;
   private int u9;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "draw:frame-name", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate"
   );

   public f2f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f2f$1 var2 = new f2f$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public f2f() {
      this.l6();
   }

   private void l6() {
      this.u3 = n5;
      this.a6 = 0;
      this.u9 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("draw:frame-name", this.l6);
      }

      var2.l6("xlink:href", this.k5);
      if (this.u3 != n5) {
         var2.l6("xlink:type", v5w.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("xlink:show", h8e.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("xlink:actuate", r5n.n5(this.u9));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(f2f var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(f2f var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(f2f var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(f2f var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(f2f var0, int var1) {
      return var0.u9 = var1;
   }
}
