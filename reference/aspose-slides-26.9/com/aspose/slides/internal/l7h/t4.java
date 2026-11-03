package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class t4 extends z3 {
   @Override
   public boolean n5(char var1, int var2) {
      throw new m1(o0.n5("Unable to translate Unicode character \\\\u{0:X4} at index {1} to specified code page.", Integer.valueOf(var1), var2), var1, var2);
   }

   @Override
   public boolean n5(char var1, char var2, int var3) {
      if (!com.aspose.slides.ms.System.t9.a6(var1)) {
         throw new ArgumentOutOfRangeException("charUnknownHigh", o0.n5("Valid values are between {0} and {1}, inclusive.", 55296, 56319));
      }

      if (!com.aspose.slides.ms.System.t9.t2(var2)) {
         throw new ArgumentOutOfRangeException("charUnknownLow", o0.n5("Valid values are between {0} and {1}, inclusive.", 56320, 57343));
      }

      int var4 = com.aspose.slides.ms.System.t9.n5(var1, var2);
      throw new m1(o0.n5("Unable to translate Unicode character \\\\u{0:X4} at index {1} to specified code page.", var4, var3), var1, var2, var3);
   }

   @Override
   public char n5() {
      return '\u0000';
   }

   @Override
   public boolean l6() {
      return false;
   }

   @Override
   public int k5() {
      return 0;
   }
}
