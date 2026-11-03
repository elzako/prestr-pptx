package com.aspose.slides.internal.b8c;

public final class s7 {
   private int n5;
   private long[] l6;

   private s7() {
   }

   public s7(int var1) {
      this.n5 = var1;
      this.l6 = new long[this.a6(var1 + 31)];
   }

   public final int n5() {
      return this.n5;
   }

   public final boolean n5(int var1) {
      return this.k5(var1);
   }

   public final void l6() {
      int var1 = this.l6.length;
      int var2 = var1;

      while (var2-- > 0) {
         this.l6[var2] = 0L;
      }
   }

   public final void l6(int var1) {
      int var2 = this.a6(var1);
      this.u9(var2 + 1);
      this.l6[var2] = (this.l6[var2] | 1L << (var1 & 31 & 31)) & 4294967295L;
   }

   public final boolean k5(int var1) {
      boolean var2 = false;
      if (var1 < this.n5) {
         int var3 = this.a6(var1);
         var2 = (this.l6[var3] & 4294967295L & 1 << (var1 & 31) & 4294967295L) != 0L;
      }

      return var2;
   }

   public final int u3(int var1) {
      int var2 = var1 + 1;
      if (var2 == this.n5) {
         return -1;
      }

      int var3 = this.a6(var2);
      var2 &= 31;

      long var4;
      for (var4 = (this.l6[var3] & 4294967295L) >> var2 & 4294967295L; (var4 & 4294967295L) == 0L; var4 = this.l6[var3]) {
         if (++var3 == this.l6.length) {
            return -1;
         }

         var2 = 0;
      }

      while ((var4 & 1L & 4294967295L) == 0L) {
         var4 = (var4 & 4294967295L) >> 1 & 4294967295L;
         var2++;
      }

      return (var3 << 5) + var2;
   }

   public final void n5(s7 var1) {
      if (this != var1) {
         int var2 = this.l6.length;
         int var3 = var1.l6.length;
         int var4 = var2 > var3 ? var3 : var2;
         int var5 = var4;

         while (var5-- > 0) {
            this.l6[var5] = this.l6[var5] & var1.l6[var5] & 4294967295L;
         }

         while (var4 < var2) {
            this.l6[var4] = 0L;
            var4++;
         }
      }
   }

   public final void l6(s7 var1) {
      if (this != var1) {
         int var2 = var1.l6.length;
         this.u9(var2);
         int var3 = var2;

         while (var3-- > 0) {
            this.l6[var3] = (this.l6[var3] | var1.l6[var3]) & 4294967295L;
         }
      }
   }

   @Override
   public int hashCode() {
      int var1 = 1234;
      int var2 = this.l6.length;

      while (--var2 >= 0) {
         var1 ^= (int)this.l6[var2] * (var2 + 1);
      }

      return var1 >> 32 ^ var1;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }

      if (this == obj) {
         return true;
      }

      s7 var2 = (s7)obj;
      int var3 = this.l6.length;
      int var4 = var2.l6.length;
      int var5 = var3 > var4 ? var4 : var3;
      int var6 = var5;

      while (var6-- > 0) {
         if ((this.l6[var6] & 4294967295L) != (var2.l6[var6] & 4294967295L)) {
            return false;
         }
      }

      if (var3 > var5) {
         var6 = var3;

         while (var6-- > var5) {
            if ((this.l6[var6] & 4294967295L) != 0L) {
               return false;
            }
         }
      } else {
         var6 = var4;

         while (var6-- > var5) {
            if ((var2.l6[var6] & 4294967295L) != 0L) {
               return false;
            }
         }
      }

      return true;
   }

   public final s7 k5() {
      s7 var1 = new s7();
      var1.n5 = this.n5;
      var1.l6 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).deepClone(), long[].class);
      return var1;
   }

   public final boolean u3() {
      long var1 = 0L;

      for (int var3 = 0; var3 < this.l6.length; var3++) {
         var1 = (var1 | this.l6[var3]) & 4294967295L;
      }

      return (var1 & 4294967295L) == 0L;
   }

   public final boolean k5(s7 var1) {
      int var2 = com.aspose.slides.ms.System.q1.l6(this.l6.length, var1.l6.length);

      while (--var2 >= 0) {
         if ((this.l6[var2] & var1.l6[var2] & 4294967295L) != 0L) {
            return true;
         }
      }

      return false;
   }

   private int a6(int var1) {
      return var1 >> 5;
   }

   private void u9(int var1) {
      if (var1 > this.l6.length) {
         int var2 = 2 * this.l6.length;
         if (var2 < var1) {
            var2 = var1;
         }

         long[] var3 = new long[var2];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), com.aspose.slides.ms.System.u3.n5((Object)(var3)), this.l6.length);
         this.l6 = var3;
      }
   }
}
