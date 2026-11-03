package com.aspose.slides.internal.x1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.internal.n8e.v4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public abstract class n5 {
   protected long[] n5 = null;
   protected int l6 = 0;
   protected int k5 = 0;

   public long[] n5() {
      return this.n5;
   }

   protected final void n5(y4 var1, int var2) {
      byte[] var3 = var1.n5();
      int var4 = 0;

      while (var4 < var2) {
         this.n5[this.l6] = (
                  ((var3[var4 + 0] & 0xFF) + ((var3[var4 + 1] & 255) << 8 & 4294967295L) & 4294967295L) + ((var3[var4 + 2] & 255) << 16 & 4294967295L)
                     & 4294967295L
               )
               + ((var3[var4 + 3] & 255) << 24 & 4294967295L)
            & 4294967295L;
         var4 += 4;
         this.l6++;
      }
   }

   protected n5() {
      this.n5 = new long[0];
   }

   public int l6() {
      return this.n5.length;
   }

   public final long[] n5(long var1) {
      if (this.n5.length == 0) {
         return new long[0];
      }

      List var3 = new List();
      long var4 = var1;

      do {
         var3.addItem(var4);
         if (var3.size() > this.n5.length) {
            throw new InvalidDataException(d1.n5("Length of 'resultchain' is too long for SIDarray of length {0}", new Object[]{this.n5.length}));
         }

         var4 = this.n5[(int)var4];
      } while (
         ((var4 & 4294967295L) < this.n5.length || (var4 & 4294967295L) >= 4294967290L)
            && (var4 & 4294967295L) != 4294967294L
            && (var4 & 4294967295L) != 4294967295L
      );

      return v4.u9(var3);
   }

   protected final void k5() {
      if (this.n5 == null) {
         this.n5 = new long[128];
      } else {
         long[] var1 = new long[this.n5.length + 128];
         v4.n5(var1, 4294967295L);
         System.arraycopy(this.n5, 0, var1, 0, this.n5.length);
         this.n5 = var1;
      }
   }

   public int n5(int var1) {
      return com.aspose.slides.internal.v6g.k5.u3(q1.l6(this.n5.length * 4.0 / var1), 14);
   }

   public List<y4> l6(int var1) {
      List var2 = new List();
      int var3 = 0;

      while (var3 < this.l6()) {
         byte[] var4 = new byte[var1];
         v4.n5(var4, (byte)-1);
         int var5 = 0;

         for (int var6 = var3 * 4 + var1 < this.l6() * 4 ? var1 : (this.l6() - var3) * 4; var5 < var6; var3++) {
            var4[var5] = (byte)(this.n5[var3] & 4294967295L & 255L & 4294967295L);
            var4[var5 + 1] = (byte)((this.n5[var3] & 4294967295L) >> 8 & 4294967295L & 255L & 4294967295L);
            var4[var5 + 2] = (byte)((this.n5[var3] & 4294967295L) >> 16 & 4294967295L & 255L & 4294967295L);
            var4[var5 + 3] = (byte)((this.n5[var3] & 4294967295L) >> 24 & 4294967295L & 255L & 4294967295L);
            var5 += 4;
         }

         var2.addItem(new y4(var4));
      }

      return var2;
   }
}
