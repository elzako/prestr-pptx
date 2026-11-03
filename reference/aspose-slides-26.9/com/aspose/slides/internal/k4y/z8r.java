package com.aspose.slides.internal.k4y;

public class z8r extends b3 {
   private String l6;
   private int k5;
   private String u3;
   private boolean a6;
   private g7 u9;
   public static final int n5 = c9g.n5("self");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "table:target-range-address",
      "table:condition-source",
      "table:condition-source-range-address",
      "table:display-duplicates",
      "filter-condition",
      "filter-and",
      "filter-or"
   );

   public z8r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      z8r$1 var2 = new z8r$1(this);
      n5(var1, var2);
      n5(var1, new z8r$2(this, var1));
   }

   public z8r() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
      this.a6 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("table:target-range-address", this.l6);
      }

      if (this.k5 != n5) {
         var2.l6("table:condition-source", c9g.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("table:condition-source-range-address", this.u3);
      }

      if (!this.a6) {
         var2.l6("table:display-duplicates", this.a6 ? "true" : "false");
      }

      if (this.u9 != null) {
         switch (h0.n5(this.u9.n5())) {
            case 4:
               ((f3f)this.u9.k5()).n5("table", var2, this.u9.n5());
               break;
            case 5:
               ((v4d)this.u9.k5()).n5("table", var2, this.u9.n5());
               break;
            case 6:
               ((e3u)this.u9.k5()).n5("table", var2, this.u9.n5());
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(z8r var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(z8r var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(z8r var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(z8r var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(z8r var0, g7 var1) {
      return var0.u9 = var1;
   }
}
