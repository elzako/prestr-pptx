package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class m6c extends b3 {
   private r1g n5;
   private s0m l6;
   private s0m k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("limUppPr", "e", "lim");

   public m6c(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new m6c$1(this, var1));
   }

   public m6c() {
      this.l6 = new s0m();
      this.k5 = new s0m();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "limUppPr");
      }

      this.l6.n5("m", var2, "e");
      this.k5.n5("m", var2, "lim");
      var2.s7();
   }

   public final r1g n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <limUppPr> element can be added.");
      }

      this.n5 = new r1g();
      return this.n5;
   }

   public final r1g l6() {
      return this.n5;
   }

   public final s0m k5() {
      return this.l6;
   }

   public final s0m u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static r1g n5(m6c var0, r1g var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static s0m n5(m6c var0, s0m var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static s0m l6(m6c var0, s0m var1) {
      return var0.k5 = var1;
   }
}
