package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class t7 implements z9l {
   public final char n5;
   public final z9l l6;
   public final z9l k5;

   public t7(char var1, z9l var2, z9l var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public static boolean n5(char var0) {
      switch (var0) {
         case '*':
         case '+':
         case '-':
         case '/':
            return true;
         case ',':
         case '.':
         default:
            return false;
      }
   }

   @Override
   public final float n5(r9g var1) {
      float var2 = this.l6.n5(var1);
      float var3 = this.k5.n5(var1);
      switch (this.n5) {
         case '*':
            return var2 * var3;
         case '+':
            return var2 + var3;
         case ',':
         case '.':
         default:
            throw new NotImplementedException();
         case '-':
            return var2 - var3;
         case '/':
            return var2 / var3;
      }
   }
}
