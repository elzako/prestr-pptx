package com.aspose.slides.internal.g7;

public class x4a extends s7k {
   private l2p n5;

   public x4a(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
   }

   public final l2p n5() {
      this.s3();
      return this.n5;
   }

   @Override
   public void n5(f3c var1) {
      super.n5(var1);
   }

   @Override
   public void l6(f3c var1) {
      super.l6(var1);
      this.n5 = new l2p(this.y1().l6());
      var1.n5(this.d2() & 4294967295L);
      var1.n3();
      int var2 = var1.n3();

      for (int var3 = 0; var3 < (var2 & 65535); var3++) {
         var1.n3();
         var1.n3();
         int var4 = var1.n3();
         int var5 = (var4 & 65535 & 0xFF00) >> 8;
         if (var5 == 0) {
            int var6 = var1.n3();
            var1.n3();
            var1.n3();
            var1.n3();

            for (int var7 = 0; var7 < (var6 & 65535); var7++) {
               int var8 = var1.n3();
               int var9 = var1.n3();
               short var10 = var1.u9();
               this.n5.n5(new k2(var8 & 65535), new k2(var9 & 65535), var10);
            }
         } else if (var5 == 2) {
         }
      }
   }
}
