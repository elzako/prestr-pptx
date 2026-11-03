package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class e5s extends b3 {
   private b9y n5;
   private h6m l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("spPr", "extLst");

   public e5s(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new e5s$1(this, var1));
   }

   public e5s() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "spPr");
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final b9y n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.n5 = new b9y();
      return this.n5;
   }

   public final void n5(h6m var1) {
      this.l6 = var1;
   }

   public final b9y l6() {
      return this.n5;
   }

   public final h6m k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static b9y n5(e5s var0, b9y var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static h6m n5(e5s var0, h6m var1) {
      return var0.l6 = var1;
   }
}
