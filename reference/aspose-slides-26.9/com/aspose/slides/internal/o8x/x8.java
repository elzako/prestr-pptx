package com.aspose.slides.internal.o8x;

import com.aspose.slides.internal.l7h.a5;

public final class x8 {
   private s7[] n5 = new s7[32];
   private int l6 = 0;
   private s7 k5;

   public final s7 n5(
      String var1, String var2, String var3, String var4, c8[] var5, c8[] var6, c8[] var7, com.aspose.slides.internal.x6s.l6 var8, int var9, int var10
   ) {
      s7 var11;
      if (this.k5 == null) {
         var11 = new s7(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      } else {
         var11 = this.k5;
         this.k5 = var11.y4();
         var11.n5(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      }

      return this.n5(var11);
   }

   private s7 n5(s7 var1) {
      for (s7 var2 = this.n5[var1.hashCode() & this.n5.length - 1]; var2 != null; var2 = var2.y4()) {
         if (var1.equals(var2)) {
            var1.n5(this.k5);
            this.k5 = var1;
            return var2;
         }
      }

      if (this.l6 >= this.n5.length) {
         s7[] var3 = this.n5;
         this.n5 = new s7[var3.length * 2];

         for (int var4 = 0; var4 < var3.length; var4++) {
            s7 var6 = var3[var4];

            while (var6 != null) {
               s7 var5 = var6.y4();
               this.l6(var6);
               var6 = var5;
            }
         }
      }

      this.l6(var1);
      return var1;
   }

   private void l6(s7 var1) {
      int var2 = var1.hashCode() & this.n5.length - 1;
      var1.n5(this.n5[var2]);
      this.n5[var2] = var1;
      this.l6++;
   }

   @Override
   public String toString() {
      a5 var1 = new a5();

      for (int var2 = 0; var2 < this.n5.length; var2++) {
         var1.n5("{0,4}: ", var2);

         for (s7 var3 = this.n5[var2]; var3 != null; var3 = var3.y4()) {
            if (var3 != this.n5[var2]) {
               var1.n5("\n      ");
            }

            var1.n5(var3);
         }

         var1.n5('\n');
      }

      return var1.toString();
   }
}
