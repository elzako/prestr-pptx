package com.aspose.slides.internal.t6w;

import com.aspose.slides.internal.q9r.c4;
import com.aspose.slides.internal.q9r.r4;
import com.aspose.slides.internal.q9r.s7;
import com.aspose.slides.internal.q9r.t2;

public class h0 extends c8 {
   private int n5;
   private int l6;
   private int[] k5;

   public h0(int var1, int var2, s7 var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(com.aspose.slides.internal.z5z.n5 var1) {
      var1.a6();
      var1.a6();
      this.n5 = var1.a6();
      this.l6 = var1.a6();
      this.k5 = new int[this.l6 & 65535];

      for (int var2 = 0; var2 < (this.l6 & 65535); var2++) {
         this.k5[var2] = var1.a6();
      }

      super.n5(var1);
   }

   @Override
   public int n5(int var1) {
      return var1 >= (this.n5 & 65535) && var1 < (this.n5 & 65535) + (this.l6 & 65535) ? this.k5[var1 - (this.n5 & 65535)] & 65535 : 0;
   }

   @Override
   public t2 n5(c4 var1) {
      t2 var2 = new t2(((com.aspose.slides.internal.q9r.n5)this.n5()).l6());

      for (char var3 = (char)this.n5; var3 <= (this.n5 & 65535) + (this.l6 & 65535); var3++) {
         int var4 = this.n5(var3);
         if (var4 != 0) {
            r4 var5 = var1.n5(var4).n5();
            com.aspose.slides.internal.q9r.c8 var6 = new com.aspose.slides.internal.q9r.c8(var3, var4, var5.n5 & 65535, var5.l6);
            var2.n5(var6);
            if (var6.l6() == 0) {
               var2.l6(var6);
            }
         }
      }

      return var2;
   }
}
