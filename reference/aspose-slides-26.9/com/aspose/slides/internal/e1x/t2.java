package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;

public class t2 {
   private com.aspose.slides.internal.n2d.k5 n5;
   private long l6;
   private long k5;
   private Dictionary<Long, Long> u3;

   public final Dictionary<Long, Long> n5() {
      return this.u3;
   }

   public t2(com.aspose.slides.internal.n2d.k5 var1, long var2) {
      this.n5 = var1;
      this.l6 = this.n5.n5().getPosition();
      this.k5 = var2;
      this.u3 = new Dictionary<>();
   }

   public final void l6() {
      this.n5.n5().setPosition(this.k5);
      int var1 = this.n5.a6() & 65535;
      int var2 = this.n5.a6() & 65535;
      if (var1 == 1) {
         for (long var3 = 0L; (var3 & 4294967295L) < var2; var3++) {
            this.u3.addItem(var3, this.n5.a6() & 65535L);
         }
      } else {
         for (int var5 = 0; var5 < var2; var5++) {
            long var6 = this.n5.a6() & 65535;
            long var8 = this.n5.a6() & 65535;
            long var10 = this.n5.a6() & 65535;

            for (long var12 = 0L; (var12 & 4294967295L) < (((var8 & 4294967295L) - (var6 & 4294967295L) & 4294967295L) + 1L & 4294967295L); var12++) {
               this.u3
                  .addItem(
                     (var10 & 4294967295L) + (var12 & 4294967295L) & 4294967295L, (var6 & 4294967295L) + (var12 & 4294967295L) & 4294967295L & 4294967295L
                  );
            }
         }
      }

      this.n5.n5().setPosition(this.l6);
   }
}
