package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import java.util.concurrent.atomic.AtomicReference;

public final class i1 extends z3 {
   private char c8 = 0;
   private f2 t2;
   private int s7 = -1;
   private int x8;
   private static AtomicReference<Object> n3 = new AtomicReference<>();

   private static Object h0() {
      if (n3.get() == null) {
         Object var0 = new Object();
         n3.set(var0);
      }

      return n3.get();
   }

   public i1(f2 var1) {
      this.t2 = var1;
      if (this.t2.l6 == null) {
         synchronized (h0()) {
            if (this.t2.l6 == null) {
               this.t2.l6 = var1.n5.z8();
            }
         }
      }
   }

   @Override
   public boolean n5(char var1, int var2) {
      this.s7 = this.x8 = 1;
      this.c8 = this.n5(var1);
      if (this.c8 == 0) {
         this.c8 = '?';
      }

      return true;
   }

   @Override
   public boolean n5(char var1, char var2, int var3) {
      if (!com.aspose.slides.ms.System.t9.a6(var1)) {
         throw new ArgumentOutOfRangeException("charUnknownHigh", o0.n5("Valid values are between {0} and {1}, inclusive.", 55296, 56319));
      }

      if (!com.aspose.slides.ms.System.t9.t2(var2)) {
         throw new ArgumentOutOfRangeException("charUnknownLow", o0.n5("Valid values are between {0} and {1}, inclusive.", 56320, 57343));
      }

      this.c8 = '?';
      this.s7 = this.x8 = 2;
      return true;
   }

   @Override
   public char n5() {
      this.s7--;
      if (this.s7 < 0) {
         return '\u0000';
      } else if (this.s7 == Integer.MAX_VALUE) {
         this.s7 = -1;
         return '\u0000';
      } else {
         return this.c8;
      }
   }

   @Override
   public boolean l6() {
      if (this.s7 >= 0) {
         this.s7++;
      }

      return this.s7 >= 0 && this.s7 <= this.x8;
   }

   @Override
   public int k5() {
      return this.s7 > 0 ? this.s7 : 0;
   }

   @Override
   public void u3() {
      this.s7 = -1;
      this.n5 = 0;
      this.u9 = false;
   }

   private char n5(char var1) {
      int var2 = 0;
      int var3 = this.t2.l6.length;

      int var4;
      while ((var4 = var3 - var2) > 6) {
         int var5 = var4 / 2 + var2 & 65534;
         char var6 = this.t2.l6[var5];
         if (var6 == var1) {
            return this.t2.l6[var5 + 1];
         }

         if (var6 < var1) {
            var2 = var5;
         } else {
            var3 = var5;
         }
      }

      for (int var7 = var2; var7 < var3; var7 += 2) {
         if (this.t2.l6[var7] == var1) {
            return this.t2.l6[var7 + 1];
         }
      }

      return '\u0000';
   }
}
