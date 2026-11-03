package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class r2o extends b3 {
   private int n5;
   private v1w l6;
   private h6m k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("unit", "unitsLabel", "extLst");

   public r2o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      r2o$1 var2 = new r2o$1(this);
      n5(var1, var2);
      n5(var1, new r2o$2(this, var1));
   }

   public r2o() {
      this.a6();
   }

   private void a6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("unit", d4p.n5(this.n5));
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "unitsLabel");
      }

      if (this.k5 != null) {
         this.k5.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final v1w n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <unitsLabel> element can be added.");
      }

      this.l6 = new v1w();
      return this.l6;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final v1w k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(r2o var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static v1w n5(r2o var0, v1w var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static h6m n5(r2o var0, h6m var1) {
      return var0.k5 = var1;
   }
}
