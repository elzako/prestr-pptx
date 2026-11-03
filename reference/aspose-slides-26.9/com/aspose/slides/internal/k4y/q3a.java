package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class q3a extends b3 {
   private byte n5;
   private byte l6;
   private byte k5;
   private n0d u3;
   private z2x a6;
   private z2x u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "concurrent", "prevAc", "nextAc", "cTn", "prevCondLst", "nextCondLst"
   );

   public q3a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.s7();
      q3a$1 var2 = new q3a$1(this);
      n5(var1, var2);
      n5(var1, new q3a$2(this, var1));
   }

   public q3a() {
      this.s7();
      this.u3 = new n0d();
   }

   private void s7() {
      this.n5 = -1;
      this.l6 = -1;
      this.k5 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("concurrent", this.n5 == 1 ? "1" : "0");
      }

      if (this.l6 != -1) {
         var2.l6("prevAc", i0.n5(this.l6));
      }

      if (this.k5 != -1) {
         var2.l6("nextAc", g8.n5(this.k5));
      }

      this.u3.n5("p", var2, "cTn");
      if (this.a6 != null) {
         this.a6.n5("p", var2, "prevCondLst");
      }

      if (this.u9 != null) {
         this.u9.n5("p", var2, "nextCondLst");
      }

      var2.s7();
   }

   public final z2x n5() {
      if (this.a6 != null) {
         throw new Exception("Only one <prevCondLst> element can be added.");
      }

      this.a6 = new z2x();
      return this.a6;
   }

   public final z2x l6() {
      if (this.u9 != null) {
         throw new Exception("Only one <nextCondLst> element can be added.");
      }

      this.u9 = new z2x();
      return this.u9;
   }

   public final byte k5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final byte u3() {
      return this.l6;
   }

   public final byte a6() {
      return this.k5;
   }

   public final void l6(byte var1) {
      this.k5 = var1;
   }

   public final n0d u9() {
      return this.u3;
   }

   public final z2x h0() {
      return this.a6;
   }

   public final z2x c8() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return h0;
   }

   // $VF: synthetic method
   static byte n5(q3a var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte l6(q3a var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte k5(q3a var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static n0d n5(q3a var0, n0d var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static z2x n5(q3a var0, z2x var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static z2x l6(q3a var0, z2x var1) {
      return var0.u9 = var1;
   }
}
