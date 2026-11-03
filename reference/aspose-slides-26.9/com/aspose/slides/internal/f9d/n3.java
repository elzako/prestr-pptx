package com.aspose.slides.internal.f9d;

import com.aspose.slides.exceptions.ArgumentNullException;

public class n3 extends s7 {
   private int n5;
   private int l6;
   private byte k5;
   private byte[] u3 = new byte[255];
   private final com.aspose.slides.internal.b8u.n5 a6;

   public n3(com.aspose.slides.internal.b8u.n5 var1, int var2) {
      super(var2, 2);
      if (var1 == null) {
         throw new ArgumentNullException("bufferProcessor");
      }

      this.a6 = var1;
   }

   @Override
   public void k5(int var1) {
      super.k5(var1);
      this.u3(this.l6());
      if ((this.k5 & 255) > 0) {
         this.n5(this.k5);
      }

      this.k5 = 0;
      if (this.l6 > 0) {
         this.u3[this.k5++ & 0xFF] = (byte)(this.n5 << 8 - this.l6);
      }

      this.a6.n5(this.u3, this.k5 & 255);
      this.a6.n5(var1);
      this.l6 = 0;
      this.k5 = 0;
      this.n5 = 0;
   }

   @Override
   protected int l6(int var1) {
      return var1 - 1;
   }

   @Override
   protected void u3(int var1) {
      this.n5 = this.n5 << this.u9() | var1;

      for (this.l6 = this.l6 + this.u9(); this.l6 >= 8; this.l6 -= 8) {
         this.u3[this.k5++ & 0xFF] = (byte)(this.n5 >> this.l6 - 8);
         if ((this.k5 & 255) == this.u3.length) {
            this.n5(this.k5);
            this.u3 = new byte[255];
            this.k5 = 0;
         }
      }
   }

   private void n5(byte var1) {
      this.a6.n5(this.u3, var1 & 255);
   }
}
