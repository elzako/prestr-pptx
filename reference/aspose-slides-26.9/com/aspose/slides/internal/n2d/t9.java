package com.aspose.slides.internal.n2d;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.l7h.a5;

public class t9 {
   private int[] n5 = new int[16];
   private int l6;

   public void n5(int var1) {
      if (var1 != this.n5.length) {
         if (var1 < this.l6) {
            throw new ArgumentOutOfRangeException("value");
         }

         if (var1 > 0) {
            int[] var2 = new int[var1];
            if (this.l6 > 0) {
               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, this.l6);
            }

            this.n5 = var2;
         } else {
            this.n5 = new int[16];
         }
      }
   }

   public int n5() {
      return this.l6;
   }

   public int l6(int var1) {
      if (var1 >= 0 && var1 < this.l6) {
         return this.n5[var1];
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   public int k5(int var1) {
      if (this.l6 == this.n5.length) {
         this.u3(this.l6 + 1);
      }

      this.n5[this.l6] = var1;
      return this.l6++;
   }

   private void u3(int var1) {
      if (this.n5.length < var1) {
         int var2 = this.n5.length == 0 ? 16 : this.n5.length * 2;
         if (var2 < var1) {
            var2 = var1;
         }

         this.n5(var2);
      }
   }

   @Override
   public String toString() {
      a5 var1 = new a5();

      for (int var2 = 0; var2 < this.n5(); var2++) {
         var1.k5(this.l6(var2));
         if (var2 < this.n5() - 1) {
            var1.n5(" ");
         }
      }

      return var1.toString();
   }
}
