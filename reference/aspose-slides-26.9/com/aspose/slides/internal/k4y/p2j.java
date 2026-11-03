package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class p2j extends b3 {
   private u2q n5;
   private k7v l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("cBhvr", "to");

   public p2j(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new p2j$1(this, var1));
   }

   public p2j() {
      this.n5 = new u2q();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("p", var2, "cBhvr");
      if (this.l6 != null) {
         this.l6.n5("p", var2, "to");
      }

      var2.s7();
   }

   public final k7v n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <to> element can be added.");
      }

      this.l6 = new k7v();
      return this.l6;
   }

   public final u2q l6() {
      return this.n5;
   }

   public final k7v k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static u2q n5(p2j var0, u2q var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static k7v n5(p2j var0, k7v var1) {
      return var0.l6 = var1;
   }
}
