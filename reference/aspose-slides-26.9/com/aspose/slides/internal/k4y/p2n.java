package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class p2n extends b3 {
   private b8n n5;
   private g7 l6;
   private a9t k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("idx", "delete", "txPr", "extLst");

   public p2n(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new p2n$1(this, var1));
   }

   public p2n() {
      this.n5 = new b8n();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("c", var2, "idx");
      if (this.l6 != null) {
         switch (u3.n5(this.l6.n5())) {
            case 1:
               ((c8q)this.l6.k5()).n5("c", var2, this.l6.n5());
               break;
            case 2:
               ((j3z)this.l6.k5()).n5("c", var2, this.l6.n5());
         }
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.k5 = (a9t)var1;
   }

   public final g7 n5(String var1) {
      if (this.l6 != null) {
         throw new Exception("DeleteOrContent already is initialized.");
      }

      switch (u3.n5(var1)) {
         case 1:
            this.l6 = new g7("delete", new c8q());
            break;
         case 2:
            this.l6 = new g7("txPr", new j3z());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.l6;
   }

   public final b8n n5() {
      return this.n5;
   }

   public final g7 l6() {
      return this.l6;
   }

   public final x8 k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static b8n n5(p2n var0, b8n var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(p2n var0, g7 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static a9t n5(p2n var0, a9t var1) {
      return var0.k5 = var1;
   }
}
