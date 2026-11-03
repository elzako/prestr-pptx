package com.aspose.slides.internal.k4y;

public class n6k extends b3 {
   private String l6;
   private String k5;
   private int u3;
   private int a6;
   private int u9;
   private g7 h0;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "draw:notify-on-update-of-ranges", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "document", "math"
   );

   public n6k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n6k$1 var2 = new n6k$1(this);
      n5(var1, var2);
      n5(var1, new n6k$2(this, var1));
   }

   public n6k() {
      this.u3();
   }

   private void u3() {
      this.u3 = n5;
      this.a6 = 0;
      this.u9 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("draw:notify-on-update-of-ranges", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("xlink:href", this.k5);
      }

      if (this.u3 != n5) {
         var2.l6("xlink:type", v5w.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("xlink:show", h8e.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("xlink:actuate", r5n.n5(this.u9));
      }

      if (this.h0 != null) {
         switch (c8.n5(this.h0.n5())) {
            case 5:
               ((q7u)this.h0.k5()).n5("office", var2, this.h0.n5());
               break;
            case 6:
               ((p6s)this.h0.k5()).n5("math", var2, this.h0.n5());
         }
      }

      var2.s7();
   }

   public final String n5() {
      return this.k5;
   }

   public final int l6() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(n6k var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(n6k var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(n6k var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(n6k var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(n6k var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static g7 n5(n6k var0, g7 var1) {
      return var0.h0 = var1;
   }
}
