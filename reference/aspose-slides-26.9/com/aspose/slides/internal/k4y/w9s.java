package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class w9s extends b3 {
   private b9y n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("spPr");

   public w9s(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new w9s$1(this, var1));
   }

   public w9s() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "spPr");
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

   public final b9y l6() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static b9y n5(w9s var0, b9y var1) {
      return var0.n5 = var1;
   }
}
