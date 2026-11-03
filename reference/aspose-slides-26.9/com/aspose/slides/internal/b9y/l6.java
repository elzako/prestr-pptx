package com.aspose.slides.internal.b9y;

public class l6 extends a6 {
   private int n5 = 1;
   private final int l6;
   private final byte[] k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;

   public l6(com.aspose.slides.internal.j3b.n5 var1, int var2) {
      this(var1, var2, 1, 0);
   }

   protected l6(com.aspose.slides.internal.j3b.n5 var1, int var2, int var3, int var4) {
      super(var1, var2, var4);
      this.n5 = var3;
      this.k5 = new byte[255 + this.n5];
      this.u9 = this.n5;
      this.l6 = this.k5.length;
      this.h0 = (1 << this.s7()) - 1;
   }

   @Override
   public void n5(int var1) {
      super.n5(var1);
      this.l6(this.u9());
      if (this.u9 != this.n5) {
         if (this.u3 != 0) {
            if (this.u9 < this.l6) {
               this.k5[this.u9++] = (byte)(this.a6 & 0xFF);
               this.k5(this.u9 - this.n5);
            } else {
               this.k5(this.u9 - this.n5);
               this.a6();
            }
         } else {
            this.k5(this.u9 - this.n5);
         }
      } else if (this.u3 != 0) {
         this.a6();
      }

      this.n5();
      this.l6().n5(var1);
   }

   @Override
   protected void l6(int var1) {
      var1 &= this.h0;
      this.a6 = this.a6 | var1 << this.u3;
      this.u3 = this.u3 + this.s7();

      while (this.u3 >= 8) {
         if (this.u9 < this.l6) {
            this.k5[this.u9++] = (byte)(this.a6 & 0xFF);
            this.a6 >>= 8;
            this.u3 -= 8;
         } else {
            this.k5(this.u9 - this.n5);
            this.u9 = this.n5;
         }
      }
   }

   @Override
   protected void u3() {
      this.h0 = (1 << this.s7()) - 1;
      super.u3();
   }

   protected void k5(int var1) {
      this.k5[0] = (byte)var1;
      this.l6().n5(this.k5, var1 + 1);
   }

   protected void n5() {
      this.l6().n5(new byte[1], 1);
   }

   private void a6() {
      byte[] var1;
      if (this.n5 > 0) {
         var1 = new byte[]{1, (byte)(this.a6 & 0xFF)};
      } else {
         var1 = new byte[]{(byte)(this.a6 & 0xFF)};
      }

      this.l6().n5(var1, var1.length);
   }
}
