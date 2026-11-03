package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class n5h extends b3 {
   private String n5;
   private String l6;
   private j3x k5;
   private x3v u3;
   private i6f a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "manifest:checksum-type", "manifest:checksum", "algorithm", "start-key-generation", "key-derivation"
   );

   public n5h(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5h$1 var2 = new n5h$1(this);
      n5(var1, var2);
      n5(var1, new n5h$2(this, var1));
   }

   public n5h() {
      this.k5 = new j3x();
      this.a6 = new i6f();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("manifest:checksum-type", this.n5);
      var2.l6("manifest:checksum", this.l6);
      this.k5.n5("manifest", var2, "algorithm");
      if (this.u3 != null) {
         this.u3.n5("manifest", var2, "start-key-generation");
      }

      this.a6.n5("manifest", var2, "key-derivation");
      var2.s7();
   }

   public final x3v n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <start_key_generation> element can be added.");
      }

      this.u3 = new x3v();
      return this.u3;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String k5() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final j3x u3() {
      return this.k5;
   }

   public final x3v a6() {
      return this.u3;
   }

   public final i6f u9() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(n5h var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(n5h var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static j3x n5(n5h var0, j3x var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static x3v n5(n5h var0, x3v var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static i6f n5(n5h var0, i6f var1) {
      return var0.a6 = var1;
   }
}
