package com.aspose.slides.internal.y9w;

import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;

public class u3 extends t2 {
   private final t4 n5;
   private final u9 l6;

   public u3(t4 var1, u9 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final void n5() {
      t2 var1 = com.aspose.slides.internal.y9w.n5.n5(this.n5, this.l6.u9, this.l6.x8, this.l6.n3);
      byte[] var2 = new byte[512];
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(new e2(var2), j5.z1());

      for (long var4 = 0L; (var4 & 4294967295L) < this.l6.u9; var4++) {
         this.n5.setPosition(s7.n5(var1.l6(var4), true));
         this.n5.read(var2, 0, 512);
         var3.x8().setPosition(0L);

         for (int var6 = 0; var6 < 128; var6++) {
            this.n5(var3.c4());
         }
      }
   }

   public final void l6() {
      e2 var1 = super.k5();
      com.aspose.slides.internal.z0k.l6 var2 = new com.aspose.slides.internal.z0k.l6(this.n5, j5.z1());
      long var3 = s7.l6(this.n5.getPosition(), true);
      int var5 = super.u3();
      int var6 = com.aspose.slides.internal.n2d.t4.n5(var5, 128);
      var6 = com.aspose.slides.internal.n2d.t4.n5(var5 + var6, 128);
      this.n5.write(var1.getBuffer(), 0, (int)var1.getLength());

      for (int var7 = 0; var7 < var6; var7++) {
         var2.n5(4294967293L);
      }

      int var11 = com.aspose.slides.internal.n2d.t4.n5(var5 + var6, 128);
      if (var11 > 109) {
         int var8 = com.aspose.slides.internal.n2d.t4.n5(var11 - 109, 127);

         for (int var9 = 0; var9 < var8; var9++) {
            var2.n5(4294967293L);
         }

         for (int var12 = 0; var12 < var8; var12++) {
            var2.n5(4294967292L);
         }

         var11 = com.aspose.slides.internal.n2d.t4.n5(var5 + var6 + var8, 128);
      }

      this.l6.u9 = var11;
      s7.n5(var2);
      com.aspose.slides.internal.y9w.n5.n5(this.n5, var3, var11, this.l6);
   }
}
