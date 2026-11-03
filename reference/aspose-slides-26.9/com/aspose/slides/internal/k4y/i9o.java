package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class i9o extends b3 {
   private r6c n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("ctrlPr");

   public i9o(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new i9o$1(this, var1));
   }

   public i9o() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "ctrlPr");
      }

      var2.s7();
   }

   public final r6c n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <ctrlPr> element can be added.");
      }

      this.n5 = new r6c();
      return this.n5;
   }

   public final r6c l6() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static r6c n5(i9o var0, r6c var1) {
      return var0.n5 = var1;
   }
}
