package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class t1h extends b3 {
   private m0l n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("rPr");

   public t1h(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new t1h$1(this, var1));
   }

   public t1h() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("a", var2, "rPr");
      }

      var2.s7();
   }

   public final m0l n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <rPr> element can be added.");
      }

      this.n5 = new m0l();
      return this.n5;
   }

   public final m0l l6() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static m0l n5(t1h var0, m0l var1) {
      return var0.n5 = var1;
   }
}
