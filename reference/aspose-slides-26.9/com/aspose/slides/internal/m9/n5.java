package com.aspose.slides.internal.m9;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.z0k.j5;
import com.aspose.slides.internal.z0k.m3;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public abstract class n5 {
   private final int n5;
   private int l6;
   private boolean k5;

   protected n5(int var1, int var2, boolean var3) {
      this.n5 = var2;
      this.l6(var1);
      this.k5 = var3;
   }

   protected n5(int var1, int var2) {
      this(var1, var2, false);
   }

   public final int n5(int var1) {
      return var1 >= 0 && var1 < this.l6 ? this.k5(var1) & 0xFF : -1;
   }

   public final int n5(int var1, byte[] var2, int var3, int var4) {
      if (var1 >= 0 && var1 < this.l6) {
         int var5 = q1.l6(var4, this.l6 - var1);
         return this.u3(var1, var2, var3, var5);
      } else {
         return 0;
      }
   }

   public final int n5() {
      return this.l6;
   }

   public final int l6() {
      return this.n5;
   }

   public final int l6(int var1) {
      this.l6 = q1.l6(var1, this.n5);
      return this.l6;
   }

   public final void n5(int var1, byte var2) {
      if (var1 >= 0 && var1 < this.l6()) {
         this.l6(var1, var2);
         this.l6 = q1.n5(this.l6, var1 + 1);
      } else {
         throw new IndexOutOfRangeException("Attempt to write outside the bounds of the data.");
      }
   }

   public final int l6(int var1, byte[] var2, int var3, int var4) {
      if (var1 >= 0 && var1 < this.l6()) {
         int var5 = q1.l6(var4, this.l6() - var1);
         int var6 = this.k5(var1, var2, var3, var5);
         this.l6 = q1.n5(this.l6, var1 + var6);
         return var6;
      } else {
         throw new IndexOutOfRangeException("Attempt to write outside the bounds of the data.");
      }
   }

   public final int n5(int var1, n5 var2, int var3, int var4) {
      byte[] var5 = new byte[8192];
      int var6 = 0;
      int var7 = 0;

      for (int var8 = q1.l6(var5.length, var4); (var6 = this.n5(var7 + var3, var5, 0, var8)) > 0; var8 = q1.l6(var5.length, var4)) {
         var2.l6(var7 + var1, var5, 0, var6);
         var7 += var6;
         var4 -= var6;
      }

      return var7;
   }

   public int n5(j5 var1, int var2, int var3) {
      byte[] var4 = new byte[8192];
      int var5 = 0;
      int var6 = 0;

      for (int var7 = q1.l6(var4.length, var3); (var5 = this.n5(var6 + var2, var4, 0, var7)) > 0; var7 = q1.l6(var4.length, var3 - var6)) {
         var1.n5().write(var4, 0, var5);
         var6 += var5;
      }

      return var6;
   }

   public final void n5(m3 var1, int var2) {
      byte[] var3 = new byte[8192];
      int var4 = 0;
      int var5 = 0;

      for (int var6 = q1.l6(var3.length, var2); (var4 = var1.n5().read(var3, 0, var6)) > 0; var6 = q1.l6(var3.length, var2)) {
         if (this.l6(var5, var3, 0, var4) != var4) {
            throw new IOException("Error writing bytes.");
         }

         var5 += var4;
         var2 -= var4;
      }
   }

   public final void n5(m3 var1) {
      byte[] var2 = new byte[8192];
      int var3 = 0;
      int var4 = 0;
      int var5 = var2.length;

      while ((var3 = var1.n5().read(var2, 0, var5)) > 0) {
         if (this.l6(var4, var2, 0, var3) != var3) {
            throw new IOException("Error writing bytes.");
         }

         var4 += var3;
      }
   }

   protected abstract void l6(int var1, byte var2);

   protected abstract int k5(int var1, byte[] var2, int var3, int var4);

   protected abstract int k5(int var1);

   protected abstract int u3(int var1, byte[] var2, int var3, int var4);

   public final String n5(int var1, int var2) {
      if (var2 == -1) {
         var2 = this.n5();
      }

      var2 = q1.l6(var2, this.n5());
      a5 var3 = new a5();
      var3.n5(d1.n5("[l=", a3.l6(this.l6), ", s=", a3.l6(this.l6()), "]"));
      if (var2 > 0) {
         var3.n5("\n");
      }

      for (int var4 = 0; var4 < var2; var4++) {
         int var5 = this.n5(var4 + var1);
         if (var5 < 16) {
            var3.n5("0");
         }

         var3.n5(d1.n5("{0:x}", new Object[]{var5}));
         var3.n5(" ");
         if (var4 > 0 && (var4 + 1) % 16 == 0) {
            var3.n5("\n");
         }
      }

      return var3.toString();
   }

   @Override
   public final String toString() {
      return this.n5(0, 0);
   }
}
