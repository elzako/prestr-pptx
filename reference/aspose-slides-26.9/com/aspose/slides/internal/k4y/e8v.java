package com.aspose.slides.internal.k4y;

public class e8v extends b3 {
   private byte l6;
   private String k5;
   private int u3;
   private int a6;
   private int u9;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "presentation:play-full", "xlink:href", "xlink:type", "xlink:actuate", "xlink:show"
   );

   public e8v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      e8v$1 var2 = new e8v$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public e8v() {
      this.l6();
   }

   private void l6() {
      this.l6 = -1;
      this.u3 = n5;
      this.a6 = 0;
      this.u9 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != -1) {
         var2.l6("presentation:play-full", this.l6 == 1 ? "true" : "false");
      }

      var2.l6("xlink:href", this.k5);
      if (this.u3 != n5) {
         var2.l6("xlink:type", v5w.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("xlink:actuate", p9c.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("xlink:show", h9l.n5(this.u9));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static byte n5(e8v var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(e8v var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(e8v var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(e8v var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(e8v var0, int var1) {
      return var0.u9 = var1;
   }
}
