package com.aspose.slides.internal.t6w;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.q9r.c4;
import com.aspose.slides.internal.q9r.r4;
import com.aspose.slides.internal.q9r.s7;
import com.aspose.slides.internal.q9r.t2;

public class u9 extends c8 {
   private int u3;
   private int[] a6;
   private int[] u9;
   private int[] h0;
   private int[] c8;
   private int[] t2;
   private int s7;
   public int n5;
   public int l6;
   public int k5;
   private SortedList<Integer, Integer> x8 = new SortedList<>();

   public u9(int var1, int var2, s7 var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(com.aspose.slides.internal.z5z.n5 var1) {
      int var2 = var1.a6();
      this.s7 = var1.a6() & 65535;
      this.u3 = (var1.a6() & 65535) / 2 & 65535;
      this.n5 = var1.a6() & 65535;
      this.l6 = var1.a6() & 65535;
      this.k5 = var1.a6() & 65535;
      this.a6 = new int[this.u3];

      for (int var3 = 0; var3 < this.a6.length; var3++) {
         this.a6[var3] = var1.a6() & 65535;
      }

      var1.a6();
      this.u9 = new int[this.u3];
      this.h0 = new int[this.u3];
      this.t2 = new int[this.u3];

      for (int var5 = 0; var5 < this.u9.length; var5++) {
         this.u9[var5] = var1.a6() & 65535;
      }

      for (int var6 = 0; var6 < this.h0.length; var6++) {
         this.h0[var6] = var1.a6() & 65535;
      }

      for (int var7 = 0; var7 < this.t2.length; var7++) {
         this.t2[var7] = var1.a6() & 65535;
      }

      int var8 = ((var2 & 65535) - (8 * this.u3 + 16)) / 2;
      if (var8 < 0) {
         var8 = this.u3;
      }

      this.c8 = new int[var8];

      for (int var4 = 0; var4 < var8; var4++) {
         this.c8[var4] = var1.a6() & 65535;
      }

      super.n5(var1);
   }

   @Override
   public t2 n5(c4 var1) {
      t2 var2 = new t2(((com.aspose.slides.internal.q9r.n5)this.n5()).l6());

      for (int var3 = 0; var3 < this.u3; var3++) {
         for (int var4 = this.u9[var3]; var4 <= this.a6[var3]; var4++) {
            int var5;
            if (var4 < 65535) {
               var5 = this.n5((char)var4, var3);
            } else {
               var5 = 0;
            }

            r4 var6 = var1.n5(var5).n5();
            com.aspose.slides.internal.q9r.c8 var7 = new com.aspose.slides.internal.q9r.c8((char)var4, var5, var6.n5 & 65535, var6.l6);
            var2.n5(var7);
            if (var7.l6() == 0) {
               var2.l6(var7);
            }
         }
      }

      return var2;
   }

   @Override
   public int n5(int var1) {
      for (int var2 = 0; var2 < this.u3; var2++) {
         if (var1 <= this.a6[var2] && this.u9[var2] <= var1) {
            return this.n5(var1, var2);
         }

         if (var1 <= this.a6[var2]) {
            break;
         }
      }

      return 0;
   }

   private int n5(int var1, int var2) {
      if (this.t2[var2] > 0) {
         int var3 = this.t2[var2] / 2 + (var1 - this.u9[var2]) - (this.u3 - var2);
         if (var3 < this.c8.length) {
            return this.c8[var3];
         }
      }

      return (this.h0[var2] + var1) % 65536;
   }
}
