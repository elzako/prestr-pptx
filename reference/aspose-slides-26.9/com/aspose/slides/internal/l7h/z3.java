package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;

public abstract class z3 {
   public int n5;
   public int l6;
   public k7 k5;
   public boolean u3;
   public boolean a6;
   public boolean u9 = false;
   public int h0 = 0;

   public abstract boolean n5(char var1, int var2);

   public abstract boolean n5(char var1, char var2, int var3);

   public abstract char n5();

   public abstract boolean l6();

   public abstract int k5();

   public void u3() {
      while (this.n5() != 0) {
      }
   }

   public final void a6() {
      this.n5 = 0;
      this.u9 = false;
      this.h0 = 0;
      this.u3();
   }

   public final void n5(int var1, int var2, k7 var3, boolean var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = false;
      this.u9 = false;
      this.h0 = 0;
   }

   public final char u9() {
      char var1 = this.n5();
      this.u9 = var1 != 0;
      if (var1 == 0) {
         this.h0 = 0;
      }

      return var1;
   }

   public boolean n5(char var1, char[] var2, int[] var3) {
      int var4 = var3[0] - this.n5 - 1;
      if (com.aspose.slides.ms.System.t9.a6(var1)) {
         if (var3[0] >= this.l6) {
            if (this.k5 != null && !this.k5.u9()) {
               if (this.u3) {
                  this.a6 = true;
                  this.k5.k5 = var1;
               }

               this.u9 = false;
               return false;
            }
         } else {
            char var5 = var2[var3[0]];
            if (com.aspose.slides.ms.System.t9.t2(var5)) {
               if (this.u9 && this.h0++ > 250) {
                  this.n5(com.aspose.slides.ms.System.t9.n5(var1, var5));
               }

               var3[0]++;
               this.u9 = this.n5(var1, var5, var4);
               return this.u9;
            }
         }
      }

      if (this.u9 && this.h0++ > 250) {
         this.n5(var1);
      }

      this.u9 = this.n5(var1, var4);
      return this.u9;
   }

   public final void n5(int var1) {
      throw new ArgumentException(o0.n5("Recursive fallback not allowed for character \\\\u{0:X4}.", var1), "chars");
   }
}
