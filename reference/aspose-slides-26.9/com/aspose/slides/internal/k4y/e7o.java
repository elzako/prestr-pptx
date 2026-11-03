package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;

public final class e7o extends e2 {
   private r6x n5;
   private n5u l6;
   private List<g7> k5;
   private j9y u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("E2oFrame", "sp");

   public e7o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      n5(var1, new e7o$1(this, var1));
   }

   public e7o() {
      this.u9();
      this.n5 = new r6x();
      this.l6 = new n5u();
   }

   private void u9() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
   }

   @Override
   public void n5(x8 var1) {
      this.u3 = (j9y)var1;
   }

   @Override
   public g7 n5(String var1) {
      switch (a6.n5(var1)) {
         case 1:
            g7 var2 = new g7("cxnSp", new r0a());
            this.k5.addItem(var2);
            return var2;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }
   }

   @Override
   public t9 n5() {
      return this.n5;
   }

   @Override
   public n5u l6() {
      return this.l6;
   }

   @Override
   public List<g7> k5() {
      return this.k5;
   }

   @Override
   public x8 u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static List n5(e7o var0) {
      return var0.k5;
   }
}
