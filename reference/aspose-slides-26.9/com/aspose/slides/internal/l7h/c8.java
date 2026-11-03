package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.DecoderFallbackException;

public final class c8 extends s7 {
   @Override
   public boolean n5(byte[] var1, int var2) {
      this.k5(var1, var2);
      return true;
   }

   @Override
   public char n5() {
      return '\u0000';
   }

   @Override
   public int l6() {
      return 0;
   }

   private void k5(byte[] var1, int var2) {
      a5 var3 = new a5(var1.length * 3);

      int var4;
      for (var4 = 0; var4 < var1.length && var4 < 20; var4++) {
         var3.n5('[');
         var3.n5(com.aspose.slides.ms.System.e2.n5(var1[var4], "X2", com.aspose.slides.internal.x7n.l6.k5()));
         var3.n5(']');
      }

      if (var4 == 20) {
         var3.n5(" ...");
      }

      throw new DecoderFallbackException(o0.n5("Unable to translate bytes {0} at index {1} from specified code page to Unicode.", var3, var2), var1, var2);
   }
}
