package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class l1b extends b3 {
   private int n5;
   private p6r l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("path", "fillToRect");

   public l1b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      l1b$1 var2 = new l1b$1(this);
      n5(var1, var2);
      n5(var1, new l1b$2(this, var1));
   }

   public l1b() {
      this.a6();
   }

   private void a6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("path", h9s.n5(this.n5));
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "fillToRect");
      }

      var2.s7();
   }

   public final p6r n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <fillToRect> element can be added.");
      }

      this.l6 = new p6r();
      return this.l6;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final p6r k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(l1b var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static p6r n5(l1b var0, p6r var1) {
      return var0.l6 = var1;
   }
}
