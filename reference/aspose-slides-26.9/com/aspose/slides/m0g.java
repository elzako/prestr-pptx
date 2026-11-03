package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;

class m0g {
   private IMathElement n5;
   private byte l6;
   private final boolean k5;

   final byte n5() {
      return this.l6;
   }

   final void n5(byte var1) {
      if (!this.k5) {
         throw new InvalidOperationException("The argument size cannot be changed on that argument by specification");
      }

      if (var1 >= -2 && var1 <= 2) {
         this.l6 = var1;
      } else {
         throw new ArgumentOutOfRangeException("ArgumentSize");
      }
   }

   public final IMathElement l6() {
      return this.n5;
   }

   public final void n5(IMathElement var1) {
      this.n5 = var1;
   }

   private m0g(IMathElement var1, boolean var2, byte var3) {
      this.n5(var1);
      this.k5 = var2;
      this.l6 = var3;
   }

   public static m0g n5(IMathElement var0, byte var1) {
      return new m0g(var0, true, var1);
   }

   public static m0g l6(IMathElement var0) {
      return new m0g(var0, false, (byte)0);
   }
}
