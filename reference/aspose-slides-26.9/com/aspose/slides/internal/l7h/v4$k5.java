package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;

final class v4$k5 extends s7 {
   private char k5 = 0;
   private int u3 = -1;
   private int a6;

   public v4$k5(v4$l6 var1) {
   }

   @Override
   public boolean n5(byte[] var1, int var2) {
      this.k5 = (char)(var1[0] & 0xFF);
      if (this.k5 == 0) {
         return false;
      }

      this.u3 = this.a6 = 1;
      return true;
   }

   @Override
   public char n5() {
      return this.u3-- > 0 ? this.k5 : '\u0000';
   }

   @Override
   public int l6() {
      return this.u3 > 0 ? this.u3 : 0;
   }

   @Override
   public void k5() {
      this.u3 = -1;
      this.n5 = 0;
   }

   @Override
   public int l6(byte[] var1, int var2) {
      if (var1.length != 1) {
         throw new ArgumentException("String contains invalid Unicode code points.");
      } else {
         return (var1[0] & 0xFF) == 0 ? 0 : 1;
      }
   }
}
