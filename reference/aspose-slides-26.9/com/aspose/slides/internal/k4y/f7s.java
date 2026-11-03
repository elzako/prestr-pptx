package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class f7s extends b3 {
   private c0z n5;
   private s0m l6;
   private s0m k5;
   private s0m u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("sPrePr", "sub", "sup", "e");

   public f7s(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new f7s$1(this, var1));
   }

   public f7s() {
      this.l6 = new s0m();
      this.k5 = new s0m();
      this.u3 = new s0m();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "sPrePr");
      }

      this.l6.n5("m", var2, "sub");
      this.k5.n5("m", var2, "sup");
      this.u3.n5("m", var2, "e");
      var2.s7();
   }

   public final c0z n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <sPrePr> element can be added.");
      }

      this.n5 = new c0z();
      return this.n5;
   }

   public final c0z l6() {
      return this.n5;
   }

   public final s0m k5() {
      return this.l6;
   }

   public final s0m u3() {
      return this.k5;
   }

   public final s0m a6() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return a6;
   }

   // $VF: synthetic method
   static c0z n5(f7s var0, c0z var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static s0m n5(f7s var0, s0m var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static s0m l6(f7s var0, s0m var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static s0m k5(f7s var0, s0m var1) {
      return var0.u3 = var1;
   }
}
