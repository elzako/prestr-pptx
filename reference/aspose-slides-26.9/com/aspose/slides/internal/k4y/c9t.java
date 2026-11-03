package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class c9t extends b3 {
   private byte n5;
   private u6p l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("prst", "avLst");

   public c9t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      c9t$1 var2 = new c9t$1(this);
      n5(var1, var2);
      n5(var1, new c9t$2(this, var1));
   }

   public c9t() {
      this.a6();
   }

   private void a6() {
      this.n5 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("prst", r9.n5(this.n5));
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

   public final byte l6() {
      return this.n5;
   }

   public final void n5(byte var1) {
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
   static byte n5(c9t var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static u6p n5(c9t var0, u6p var1) {
      return var0.l6 = var1;
   }
}
