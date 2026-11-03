package com.aspose.slides.internal.t6w;

import com.aspose.slides.internal.q9r.c4;
import com.aspose.slides.internal.q9r.r4;
import com.aspose.slides.internal.q9r.s7;
import com.aspose.slides.internal.q9r.t2;

public class l6 extends c8 {
   private l6$n5[] n5;

   public l6(int var1, int var2, s7 var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(com.aspose.slides.internal.z5z.n5 var1) {
      var1.k5();
      var1.k5();
      long var2 = var1.k5();
      this.n5 = new l6$n5[(int)var2];

      for (int var4 = 0; var4 < (var2 & 4294967295L); var4++) {
         this.n5[var4] = new l6$n5(null);
         this.n5[var4].n5 = var1.k5();
         this.n5[var4].l6 = var1.k5();
         this.n5[var4].k5 = var1.k5();
      }

      super.n5(var1);
   }

   @Override
   public int n5(int var1) {
      for (int var2 = 0; var2 < this.n5.length; var2++) {
         if (var1 >= (this.n5[var2].n5 & 4294967295L) && var1 <= (this.n5[var2].l6 & 4294967295L)) {
            return (int)(((this.n5[var2].k5 & 4294967295L) + var1 & 4294967295L) - (this.n5[var2].n5 & 4294967295L));
         }

         if (var1 < (this.n5[var2].l6 & 4294967295L) && var1 < (this.n5[var2].n5 & 4294967295L)) {
            break;
         }
      }

      return 0;
   }

   @Override
   public t2 n5(c4 var1) {
      t2 var2 = new t2(((com.aspose.slides.internal.q9r.n5)this.n5()).l6());

      for (int var3 = 0; var3 < this.n5.length; var3++) {
         for (long var4 = this.n5[var3].n5; (var4 & 4294967295L) <= (this.n5[var3].l6 & 4294967295L); var4++) {
            int var6 = (int)(((this.n5[var3].k5 & 4294967295L) + (var4 & 4294967295L) & 4294967295L) - (this.n5[var3].n5 & 4294967295L));
            r4 var7 = var1.n5(var6).n5();
            com.aspose.slides.internal.q9r.c8 var8 = new com.aspose.slides.internal.q9r.c8((int)var4, var6, var7.n5 & 65535, var7.l6);
            var2.n5(var8);
            if (var8.l6() == 0) {
               var2.l6(var8);
            }
         }
      }

      return var2;
   }
}
