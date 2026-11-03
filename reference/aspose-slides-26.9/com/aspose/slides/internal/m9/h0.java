package com.aspose.slides.internal.m9;

import com.aspose.slides.exceptions.ArithmeticException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.z0k.j5;
import com.aspose.slides.ms.System.d1;

public class h0 extends l6 {
   private volatile boolean l6 = false;
   private Object k5 = new Object();
   private long u3;
   private volatile int[] a6;

   public static h0 n5(byte[] var0) {
      u9 var1 = new u9(var0);
      return new h0(var1);
   }

   protected h0(n5 var1) {
      super(var1);
   }

   protected h0(h0 var1, int var2) {
      super(var1, var2);
   }

   protected h0(h0 var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public l6 k5(int var1, int var2) {
      if (var1 >= 0 && var1 + var2 <= this.l6()) {
         return new h0(this, var1, var2);
      } else {
         throw new IndexOutOfRangeException("Attempt to bind data outside of its limits.");
      }
   }

   public l6 l6(int var1) {
      if (var1 >= 0 && var1 <= this.l6()) {
         return new h0(this, var1);
      } else {
         throw new IndexOutOfRangeException("Attempt to bind data outside of its limits.");
      }
   }

   public final long k5() {
      if (!this.l6) {
         this.u3();
      }

      return this.u3;
   }

   private void u3() {
      if (!this.l6) {
         long var1 = 0L;
         if (this.a6 == null) {
            var1 = this.u3(0, this.n5());
         } else {
            for (int var3 = 0; var3 < this.a6.length; var3 += 2) {
               int var4 = this.a6[var3];
               int var5 = var3 == this.a6.length - 1 ? this.n5() : this.a6[var3 + 1];
               var1 += this.u3(var4, var5);
            }
         }

         this.u3 = var1 & 4294967295L;
         this.l6 = true;
      }
   }

   private long u3(int var1, int var2) {
      long var3 = 0L;

      for (int var5 = var1; var5 <= var2 - 4; var5 += 4) {
         var3 += this.h0(var5);
      }

      int var10 = var2 & -4;
      if (var10 < var2) {
         int var6 = this.k5(var10);
         int var7 = var10 + 1 < var2 ? this.k5(var10 + 1) : 0;
         int var8 = var10 + 2 < var2 ? this.k5(var10 + 2) : 0;
         byte var9 = 0;
         var3 += var6 << 24 | var7 << 16 | var8 << 8 | var9;
      }

      return var3;
   }

   public final void n5(int[] var1) {
      if (var1 != null && var1.length > 0) {
         this.a6 = new int[var1.length];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), com.aspose.slides.ms.System.u3.n5((Object)(this.a6)), var1.length);
      } else {
         this.a6 = null;
      }

      this.l6 = false;
   }

   public final int k5(int var1) {
      int var2 = this.n5.n5(this.n5(var1));
      if (var2 < 0) {
         throw new IndexOutOfRangeException(d1.n5(new String[]{"Index attempted to be read from is out of bounds: ", d1.n5("{0:x}", new Object[]{var1})}));
      } else {
         return var2;
      }
   }

   public final int u3(int var1) {
      int var2 = this.n5.n5(this.n5(var1));
      if (var2 < 0) {
         throw new IndexOutOfRangeException(d1.n5(new String[]{"Index attempted to be read from is out of bounds: ", d1.n5("{0:x}", new Object[]{var1})}));
      } else {
         return var2 << 24 >> 24;
      }
   }

   public final int n5(int var1, byte[] var2, int var3, int var4) {
      return this.n5.n5(this.n5(var1), var2, var3, this.l6(var1, var4));
   }

   public final int a6(int var1) {
      return 65535 & (this.k5(var1) << 8 | this.k5(var1 + 1));
   }

   public final int u9(int var1) {
      return (this.u3(var1) << 8 | this.k5(var1 + 1)) << 16 >> 16;
   }

   public final long h0(int var1) {
      return 4294967295L & (this.k5(var1) << 24 | this.k5(var1 + 1) << 16 | this.k5(var1 + 2) << 8 | this.k5(var1 + 3));
   }

   public final int c8(int var1) {
      long var2 = this.h0(var1);
      if ((var2 & 2147483648L) == 2147483648L) {
         throw new ArithmeticException("Long value too large to fit into an integer.");
      } else {
         return (int)var2;
      }
   }

   public final int t2(int var1) {
      return this.u3(var1) << 24 | this.k5(var1 + 1) << 16 | this.k5(var1 + 2) << 8 | this.k5(var1 + 3);
   }

   public final int s7(int var1) {
      return this.t2(var1);
   }

   public final int x8(int var1) {
      return this.u9(var1);
   }

   public final int n5(j5 var1) {
      return this.n5.n5(var1, this.n5(0), this.n5());
   }

   public final int n5(c8 var1) {
      return this.n5.n5(var1.n5(0), var1.n5, this.n5(0), this.n5());
   }
}
