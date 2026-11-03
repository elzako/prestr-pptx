package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;

public final class h1u extends e2 {
   private r6x n5;
   private n5u l6;
   private List<g7> k5 = new List<>();
   private j9y u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("sp");

   public h1u(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new h1u$1(this, var1));
   }

   public h1u() {
      this.n5 = new r6x();
      this.l6 = new n5u();
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
         case 0:
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
   static List n5(h1u var0) {
      return var0.k5;
   }
}
