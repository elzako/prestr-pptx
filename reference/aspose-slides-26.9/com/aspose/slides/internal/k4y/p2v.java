package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class p2v extends b3 {
   private g3p n5;
   private r6c l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("degHide", "ctrlPr");

   public p2v(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new p2v$1(this, var1));
   }

   public p2v() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "degHide");
      }

      if (this.l6 != null) {
         this.l6.n5("m", var2, "ctrlPr");
      }

      var2.s7();
   }

   public final void n5(g3p var1) {
      this.n5 = var1;
   }

   public final r6c n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <ctrlPr> element can be added.");
      }

      this.l6 = new r6c();
      return this.l6;
   }

   public final g3p l6() {
      return this.n5;
   }

   public final r6c k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static g3p n5(p2v var0, g3p var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static r6c n5(p2v var0, r6c var1) {
      return var0.l6 = var1;
   }
}
