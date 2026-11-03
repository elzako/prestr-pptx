package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class r7n extends b3 {
   private int n5;
   private u6p l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("prst", "avLst");

   public r7n(com.aspose.slides.ms.System.Xml.c7 var1) {
      r7n$1 var2 = new r7n$1(this);
      n5(var1, var2);
      n5(var1, new r7n$2(this, var1));
   }

   public r7n() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      var2.l6("prst", b9.n5(this.n5));
      if (this.l6 != null) {
         this.l6.n5("a", var2, "avLst");
      }

      var2.s7();
   }

   public final u6p n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <avLst> element can be added.");
      }

      this.l6 = new u6p();
      return this.l6;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final u6p k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(r7n var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static u6p n5(r7n var0, u6p var1) {
      return var0.l6 = var1;
   }
}
