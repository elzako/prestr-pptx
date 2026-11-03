package com.aspose.slides.internal.x1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.n8e.v4;
import com.aspose.slides.ms.System.q1;

public class e2 extends n5 {
   private int u3 = 0;
   private long a6 = 0L;
   private n3 u9 = null;

   public e2(int var1) {
      this.u3 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void n5(n3 var1, s7 var2) {
      long[] var3 = var1.n5();
      long var4 = var2.n5().k5();
      this.n5 = new long[(int)var4 * this.u3 / 4];
      v4.n5(this.n5, 4294967295L);

      for (int var6 = 0; var6 < var4; var6++) {
         if ((var3[var6] & 4294967295L) < 4294967290L) {
            y4 var7 = var2.n5((int)var3[var6]);
            if (var7 != null) {
               this.n5(var7, var7.n5().length);
            }
         } else {
            this.l6 = this.l6 + this.u3 / 4;
         }
      }
   }

   public final long l6(long var1) {
      Object var3 = null;
      if ((var1 & 4294967295L) < 4294967290L) {
         var3 = this.n5(var1);
      } else {
         var3 = new long[0];
      }

      long var4 = this.h0();
      if (((long[])var3).length != 0) {
         this.n5[(int)((long[])var3)[((long[])var3).length - 1]] = var4;
      }

      this.n5[(int)var4] = 4294967294L;
      return var4;
   }

   public final long k5(int var1) {
      long var2 = this.l6(4294967290L);
      long var4 = var2;

      for (int var6 = 1; var6 < var1; var6++) {
         var2 = this.l6(var2);
      }

      return var4;
   }

   private long h0() {
      if (((this.a6 & 4294967295L) + 1L & 4294967295L) > this.n5.length - 1) {
         this.k5();

         while ((this.n5[(int)this.a6] & 4294967295L) != 4294967295L) {
            this.a6++;
         }

         this.n5[(int)this.a6] = 4294967293L;
         this.u9.l6(this.a6);
      }

      while ((this.n5[(int)this.a6] & 4294967295L) != 4294967295L) {
         this.a6++;
      }

      return this.a6;
   }

   @Override
   public int n5(int var1) {
      return this.n5 != null ? com.aspose.slides.internal.v6g.k5.u3(q1.l6(this.n5.length * 4.0 / var1), 14) : 0;
   }

   public final long a6() {
      long var1 = this.h0();
      this.n5[(int)var1] = 4294967292L;
      return var1;
   }

   public final void n5(n3 var1) {
      this.u9 = var1;
   }

   public final long[] u9() {
      int var1 = this.l6();
      List var2 = new List();

      for (int var3 = 0; var3 < var1; var3++) {
         if (this.n5[var3] == 4294967292L) {
            var2.addItem(var3 & 4294967295L);
         }
      }

      return v4.u9(var2);
   }
}
