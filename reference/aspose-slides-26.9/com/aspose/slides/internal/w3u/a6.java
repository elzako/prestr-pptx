package com.aspose.slides.internal.w3u;

import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.ms.System.a5;
import com.aspose.slides.ms.System.j8;

class a6 implements a5<a6>, Comparable<a6> {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;

   public a6(int var1, int var2, int var3, int var4) {
      this.n5(var1, var2, var3, var4);
   }

   public final c8 n5() {
      int var1 = this.k5 / this.n5;
      int var2 = this.u3 / this.n5;
      int var3 = this.a6 / this.n5;
      if (var1 < 0) {
         var1 = 0;
      }

      if (var1 > 255) {
         var1 = 255;
      }

      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 > 255) {
         var2 = 255;
      }

      if (var3 < 0) {
         var3 = 0;
      }

      if (var3 > 255) {
         var3 = 255;
      }

      return c8.n5(255, var1, var2, var3);
   }

   public static int n5(int var0, int var1, int var2) {
      int var3 = var0 >> 2;
      int var4 = var1 >> 2;
      int var5 = var2 >> 2;
      return (var3 << 12) + (var4 << 6) + var5;
   }

   public final void n5(int var1, int var2, int var3, int var4) {
      this.l6 += var1;
      this.k5 += var2;
      this.u3 += var3;
      this.a6 += var4;
      this.n5++;
   }

   @Override
   public int hashCode() {
      return -this.n5;
   }

   @Override
   public boolean equals(Object obj1) {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(obj1, a6.class));
   }

   public final boolean n5(a6 var1) {
      if (j8.l6(var1, null)) {
         return false;
      } else if (j8.l6(this, var1)) {
         return true;
      } else {
         return j8.n5(this) != j8.n5(var1) ? false : this.hashCode() == var1.hashCode();
      }
   }

   public final int l6(a6 var1) {
      return this.hashCode() - var1.hashCode();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(a6 bridgeArg0) {
      return this.l6(bridgeArg0);
   }

}
