package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class v2o extends b3 {
   private v1y n5;
   private a9t l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("manualLayout", "extLst");

   public v2o(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new v2o$1(this, var1));
   }

   public v2o() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "manualLayout");
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final v1y n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <manualLayout> element can be added.");
      }

      this.n5 = new v1y();
      return this.n5;
   }

   public final void n5(x8 var1) {
      this.l6 = (a9t)var1;
   }

   public final v1y l6() {
      return this.n5;
   }

   public final x8 k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static v1y n5(v2o var0, v1y var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static a9t n5(v2o var0, a9t var1) {
      return var0.l6 = var1;
   }
}
