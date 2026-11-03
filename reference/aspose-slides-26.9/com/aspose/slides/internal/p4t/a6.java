package com.aspose.slides.internal.p4t;

public class a6 extends u3 {
   private int a6 = 7;

   public a6(int var1, int var2, byte[] var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(byte var1) {
      this.k5[this.u3] = (byte)(this.k5[this.u3] | var1 << this.a6);
      this.a6--;
      if (this.a6 == -1) {
         this.a6 = 7;
         this.u3++;
      }
   }

   @Override
   public byte n5() {
      byte var1 = this.k5[this.u3];
      byte var2 = (byte)(var1 >> this.a6 & 1);
      this.a6--;
      if (this.a6 == -1) {
         this.a6 = 7;
         this.u3++;
      }

      return var2;
   }

   @Override
   public void l6() {
      this.a6 = 7;
      if (this.n5 % 8 == 0) {
         this.u3 = this.u3 + this.l6;
      } else {
         this.u3 = this.u3 + this.l6 + 1;
      }
   }
}
