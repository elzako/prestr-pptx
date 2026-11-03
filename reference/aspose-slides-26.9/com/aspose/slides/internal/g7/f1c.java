package com.aspose.slides.internal.g7;

public class f1c extends v2s {
   public f1c(long var1, long var3) {
      super(var1, var3, "ClassDef");
      this.n5(new f1c$1(this));
      this.n5(new f1c$2(this));
   }

   public final int l6(r9 var1) {
      int var2 = this.n5(var1);
      return var2 == -1 ? 0 : var2;
   }

   private void k5(f3c var1) {
      int var2 = var1.n3();
      int var3 = var1.n3() & 65535;

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = (var2 & 65535) + var4 & 65535;
         int var6 = var1.n3() & 65535;
         this.n5(new k2(var5 & 65535), var6);
      }
   }

   private void u3(f3c var1) {
      int var2 = var1.n3() & 65535;

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var1.n3() & 65535;
         int var5 = var1.n3() & 65535;
         int var6 = var1.n3() & 65535;

         for (int var7 = var4; var7 < var5 + 1; var7++) {
            this.n5(new k2(var7), var6);
         }
      }
   }

   // $VF: synthetic method
   static void n5(f1c var0, f3c var1) {
      var0.k5(var1);
   }

   // $VF: synthetic method
   static void l6(f1c var0, f3c var1) {
      var0.u3(var1);
   }
}
