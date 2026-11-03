package com.aspose.slides.internal.p4t;

public class u9 extends u3 {
   private boolean a6 = true;

   public u9(int var1, int var2, byte[] var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(byte var1) {
      if (this.a6) {
         this.k5[this.u3] = (byte)((var1 & 15) << 4);
      } else {
         this.k5[this.u3] = (byte)(this.k5[this.u3] | var1 & 15);
         this.u3++;
      }

      this.a6 = !this.a6;
   }

   @Override
   public byte n5() {
      byte var1 = this.k5[this.u3];
      byte var2;
      if (this.a6) {
         var2 = (byte)(var1 >> 4 & 15);
      } else {
         var2 = (byte)(var1 & 15);
         this.u3++;
      }

      this.a6 = !this.a6;
      return var2;
   }

   @Override
   public void l6() {
      boolean var1 = !this.a6;
      if (var1) {
         this.u3 = this.u3 + this.l6 + 1;
      } else {
         this.u3 = this.u3 + this.l6;
      }

      this.a6 = true;
   }
}
