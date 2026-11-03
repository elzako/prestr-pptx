package com.aspose.slides.internal.g7;

public class p6w extends v2s {
   public p6w(long var1, long var3) {
      super(var1, var3, "Coverage");
      this.u9();
   }

   public p6w(long var1) {
      super(var1, "Coverage");
      this.u9();
   }

   public final boolean l6(r9 var1) {
      return this.l6.containsKey(var1);
   }

   public final int k5(r9 var1) {
      return this.n5(var1);
   }

   public final int a6() {
      return this.l6.keySet().size();
   }

   private void u9() {
      this.n5(new p6w$1(this));
      this.n5(new p6w$2(this));
   }

   private void k5(f3c var1) {
      int var2 = var1.n3() & 65535;

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var1.n3();
         this.n5(new k2(var4 & 65535), var3);
      }
   }

   private void u3(f3c var1) {
      int var2 = var1.n3() & 65535;

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var1.n3() & 65535;
         int var5 = var1.n3() & 65535;
         int var6 = var1.n3() & 65535;

         for (int var7 = var4; var7 < var5 + 1; var7++) {
            this.n5(new k2(var7), var6 + var7 - var4);
         }
      }
   }

   // $VF: synthetic method
   static void n5(p6w var0, f3c var1) {
      var0.k5(var1);
   }

   // $VF: synthetic method
   static void l6(p6w var0, f3c var1) {
      var0.u3(var1);
   }
}
