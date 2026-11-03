package com.aspose.slides.internal.k4y;

public class q8j extends b3 {
   private String n5;
   private w3t l6;
   private e7n k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("table:id", "cell-address", "change-track-table-cell");

   public q8j(com.aspose.slides.ms.System.Xml.c7 var1) {
      q8j$1 var2 = new q8j$1(this);
      n5(var1, var2);
      n5(var1, new q8j$2(this, var1));
   }

   public q8j() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("table:id", this.n5);
      }

      if (this.l6 != null) {
         this.l6.n5("table", var2, "cell-address");
      }

      if (this.k5 != null) {
         this.k5.n5("table", var2, "change-track-table-cell");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(q8j var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static w3t n5(q8j var0, w3t var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static e7n n5(q8j var0, e7n var1) {
      return var0.k5 = var1;
   }
}
