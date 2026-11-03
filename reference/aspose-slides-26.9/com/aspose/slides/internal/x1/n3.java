package com.aspose.slides.internal.x1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.n8e.v4;
import com.aspose.slides.internal.n8e.y2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.q1;

public class n3 extends n5 {
   private int u3 = 0;
   private e2 a6 = null;
   private long u9 = 4294967294L;

   public final void n5(e2 var1) {
      this.a6 = var1;
   }

   public final long[] u3() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.n5.length; var2++) {
         if (var2 - 109 + 1 <= 0 || (var2 - 109 + 1) % 128 != 0) {
            var1.addItem(this.n5[var2]);
         }
      }

      return v4.u9(var1);
   }

   public final long a6() {
      return this.u9;
   }

   public n3(int var1) {
      this.n5(0, var1);
   }

   public n3(int var1, int var2) {
      this.n5(var1, var2);
   }

   private void n5(int var1, int var2) {
      this.l6 = 109;
      if (var1 > 0) {
         this.n5 = new long[109 + var2 / 4 * var1];
      } else {
         this.n5 = new long[109];
      }

      v4.n5(this.n5, 4294967295L);
      this.u3 = 0;
   }

   public final void n5(t4 var1) {
      int var2 = 0;
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var1);

      while (var2 < 109) {
         this.n5[var2] = var3.c4();
         var2++;
      }

      if (var2 == 109) {
         this.k5 = 109;
      } else {
         this.h0();
      }
   }

   public final void l6(long var1) {
      if (this.u3 > this.n5.length - 1 && this.n5.length == 109 || this.u3 > this.n5.length - 2 && this.n5.length != 109) {
         if (this.n5.length == 109) {
            this.k5();
            this.u9 = this.a6.a6();
         } else {
            this.k5();
            this.n5[this.u3] = this.a6.a6();
            this.u3++;
         }
      }

      this.n5[this.u3] = var1;
      this.u3++;
   }

   @Override
   public int l6() {
      this.h0();
      return this.k5;
   }

   private void h0() {
      this.k5 = -1;

      while (this.n5.length > ++this.k5 && (this.n5[this.k5] & 4294967295L) >= 0L) {
      }
   }

   public final void n5(s7 var1, long var2) {
      long var4 = var2;

      while ((var4 & 4294967295L) < 4294967290L && this.l6 < this.n5.length) {
         y4 var6 = var1.n5((int)var4);
         if (var6 == null) {
            break;
         }

         int var7 = var6.n5().length - 4;
         var7 = q1.l6(var7, (this.n5.length - this.l6) * 4);
         this.n5(var6, var7);
         var4 = this.n5(var6);
      }

      this.l6 = 109;
      this.h0();
   }

   private long n5(y4 var1) {
      byte[] var2 = new byte[4];
      System.arraycopy(var1.n5(), var1.n5().length - 4, var2, 0, 4);
      return y2.k5(var2) & 4294967295L;
   }

   @Override
   public List<y4> l6(int var1) {
      int var2 = this.l6();
      List var3 = new List();
      if (var2 <= 109) {
         return new List<>();
      }

      int var4 = 109;

      while (var4 < var2) {
         byte[] var5 = new byte[var1];
         v4.n5(var5, (byte)-1);
         int var6 = 0;

         for (int var7 = var4 * 4 + var1 < var2 * 4 ? var1 : (var2 - var4) * 4; var6 < var7; var4++) {
            var5[var6] = (byte)(this.n5[var4] & 4294967295L & 255L & 4294967295L);
            var5[var6 + 1] = (byte)((this.n5[var4] & 4294967295L) >> 8 & 4294967295L & 255L & 4294967295L);
            var5[var6 + 2] = (byte)((this.n5[var4] & 4294967295L) >> 16 & 4294967295L & 255L & 4294967295L);
            var5[var6 + 3] = (byte)((this.n5[var4] & 4294967295L) >> 24 & 4294967295L & 255L & 4294967295L);
            var6 += 4;
         }

         var3.addItem(new y4(var5));
      }

      return var3;
   }

   @Override
   public int n5(int var1) {
      return com.aspose.slides.internal.v6g.k5.u3(q1.l6((this.n5.length - 109) * 4.0 / var1), 14);
   }

   public final byte[] u9() {
      byte[] var1 = new byte[436];
      v4.n5(var1, (byte)-1);

      for (int var2 = 0; var2 < this.l6() && var2 < 109; var2++) {
         var1[4 * var2] = (byte)(this.n5[var2] & 4294967295L & 255L & 4294967295L);
         var1[4 * var2 + 1] = (byte)((this.n5[var2] & 4294967295L) >> 8 & 4294967295L & 255L & 4294967295L);
         var1[4 * var2 + 2] = (byte)((this.n5[var2] & 4294967295L) >> 16 & 4294967295L & 255L & 4294967295L);
         var1[4 * var2 + 3] = (byte)((this.n5[var2] & 4294967295L) >> 24 & 4294967295L & 255L & 4294967295L);
      }

      return var1;
   }
}
