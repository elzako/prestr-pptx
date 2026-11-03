package com.aspose.slides.internal.l7h;

public final class y4 extends s7 {
   private String k5;
   private int u3 = -1;
   private int a6 = -1;

   public y4(n3 var1) {
      this.k5 = var1.a6();
   }

   @Override
   public boolean n5(byte[] var1, int var2) {
      if (this.u3 >= 1) {
         this.n5(var1);
      }

      if (this.k5.length() == 0) {
         return false;
      }

      this.u3 = this.k5.length();
      this.a6 = -1;
      return true;
   }

   @Override
   public char n5() {
      this.u3--;
      this.a6++;
      if (this.u3 < 0) {
         return '\u0000';
      } else if (this.u3 == Integer.MAX_VALUE) {
         this.u3 = -1;
         return '\u0000';
      } else {
         return this.k5.charAt(this.a6);
      }
   }

   @Override
   public int l6() {
      return this.u3 < 0 ? 0 : this.u3;
   }

   @Override
   public void k5() {
      this.u3 = -1;
      this.a6 = -1;
      this.n5 = 0;
   }

   @Override
   public int l6(byte[] var1, int var2) {
      return this.k5.length();
   }
}
