package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class t7p extends b3 {
   private r5w n5;
   private g7 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("ln", "effectLst", "effectDag");

   public t7p(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new t7p$1(this, var1));
   }

   public t7p() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("a", var2, "ln");
      }

      if (this.l6 != null) {
         switch (k5.n5(this.l6.n5())) {
            case 1:
               ((o9b)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 2:
               ((f8y)this.l6.k5()).n5("a", var2, this.l6.n5());
         }
      }

      var2.s7();
   }

   public final r5w n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <ln> element can be added.");
      }

      this.n5 = new r5w();
      return this.n5;
   }

   public final r5w l6() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static r5w n5(t7p var0, r5w var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(t7p var0, g7 var1) {
      return var0.l6 = var1;
   }
}
