package com.aspose.slides.internal.c8m;

public class r7 {
   private String n5;
   private String l6;
   private String k5;
   private byte u3;
   private z6 a6;
   private boolean u9;

   public final String n5() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   public final j8 l6() {
      this.t2();
      return this.k5();
   }

   final j8 k5() {
      return this.u3 != 1 ? this.a6.u9(this.k5) : null;
   }

   public final String u3() {
      String var1 = this.l6;
      int var2 = com.aspose.slides.ms.System.d1.k5(var1, '/');
      return var2 < 0 ? var1 : com.aspose.slides.ms.System.d1.l6(var1, var2 + 1, var1.length() - var2 - 1);
   }

   public final String a6() {
      return this.n5;
   }

   public final String u9() {
      return this.l6;
   }

   public final byte h0() {
      return this.u3;
   }

   public final boolean c8() {
      return this.u9;
   }

   public final void t2() {
      this.u9 = true;
   }

   public r7(z6 var1, String var2, String var3, String var4, byte var5) {
      this.a6 = var1;
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
      this.u3 = var5;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("used==", com.aspose.slides.ms.System.n3.l6(this.u9), "; relId==", this.n5, "; target==", this.k5);
   }
}
