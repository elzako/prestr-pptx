package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class x7u extends b3 {
   private m5k n5;
   private t4p l6;
   private b9y k5;
   private a9t u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("symbol", "size", "spPr", "extLst");

   public x7u(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new x7u$1(this, var1));
   }

   public x7u() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "symbol");
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "size");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "spPr");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final m5k n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <symbol> element can be added.");
      }

      this.n5 = new m5k();
      return this.n5;
   }

   public final t4p l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <size> element can be added.");
      }

      this.l6 = new t4p();
      return this.l6;
   }

   public final b9y k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.k5 = new b9y();
      return this.k5;
   }

   public final void n5(x8 var1) {
      this.u3 = (a9t)var1;
   }

   public final m5k u3() {
      return this.n5;
   }

   public final t4p a6() {
      return this.l6;
   }

   public final b9y u9() {
      return this.k5;
   }

   public final x8 h0() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return a6;
   }

   // $VF: synthetic method
   static m5k n5(x7u var0, m5k var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static t4p n5(x7u var0, t4p var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static b9y n5(x7u var0, b9y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static a9t n5(x7u var0, a9t var1) {
      return var0.u3 = var1;
   }
}
