package com.aspose.slides.internal.v3s;

import com.aspose.slides.internal.e1x.a5;
import com.aspose.slides.internal.e1x.f0;
import com.aspose.slides.internal.e1x.j5;
import com.aspose.slides.internal.e1x.u6;
import com.aspose.slides.internal.e1x.w1;

public class n5 extends u9 {
   private int[] n5;
   private long l6;
   private long k5;

   public n5(int var1, int var2, f0 var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(com.aspose.slides.internal.n2d.k5 var1) {
      var1.k5();
      var1.k5();
      this.l6 = var1.k5();
      this.k5 = var1.k5();
      this.n5 = new int[(int)(this.k5 & 4294967295L)];

      for (int var2 = 0; var2 < (this.k5 & 4294967295L); var2++) {
         this.n5[var2] = var1.a6();
      }

      super.n5(var1);
   }

   @Override
   public int n5(int var1) {
      return var1 >= (this.l6 & 4294967295L) && var1 < ((this.l6 & 4294967295L) + (this.k5 & 4294967295L) & 4294967295L)
         ? this.n5[(int)(var1 - (this.l6 & 4294967295L) & 4294967295L)] & 65535
         : 0;
   }

   @Override
   public a5 n5(w1 var1) {
      a5 var2 = new a5(((com.aspose.slides.internal.e1x.l6)this.u3()).k5());

      for (char var3 = (char)this.l6; var3 <= ((this.l6 & 4294967295L) + (this.k5 & 4294967295L) & 4294967295L); var3++) {
         int var4 = this.n5(var3);
         if (var4 != 0) {
            j5 var5 = var1.n5(var4).n5();
            u6 var6 = new u6(var3, var4, var5.n5 & 65535, var5.l6);
            var2.n5(var6);
            if (var6.l6() == 0) {
               var2.l6(var6);
            }
         }
      }

      return var2;
   }
}
