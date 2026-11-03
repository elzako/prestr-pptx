package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentException;

class z3 {
   private byte[] n5;
   private int l6;
   private boolean k5;
   private int u3;
   private int a6;

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      if (var1 < 0) {
         throw new ArgumentException("Position cannot be less than zero");
      }

      if (var1 > this.n5.length) {
         throw new ArgumentException("Position is out of data bounds");
      }

      this.l6 = var1;
      this.a6 = this.k5 ? 7 : 0;
   }

   public z3(byte[] var1, boolean var2) {
      this.n5 = var1;
      this.k5 = var2;
      this.a6 = var2 ? 7 : 0;
   }

   public z3(byte[] var1) {
      this(var1, false);
   }

   public final boolean l6() {
      return this.k5 ? this.u3() : this.k5();
   }

   public final int l6(int var1) {
      byte var2 = 0;

      for (int var3 = var1 - 1; var3 >= 0; var3--) {
         var2 <<= 1;
         if (this.l6()) {
            var2 |= 1;
         }
      }

      return var2;
   }

   private boolean k5() {
      this.a6--;
      if (this.a6 < 0) {
         this.u3 = com.aspose.slides.internal.v6g.k5.u3(this.n5[this.l6], 6);
         this.l6++;
         this.a6 = 7;
      }

      byte var1 = (byte)(1 << this.a6);
      return (this.u3 & com.aspose.slides.internal.v6g.k5.u3(var1, 6)) == com.aspose.slides.internal.v6g.k5.u3(var1, 6);
   }

   private boolean u3() {
      this.a6++;
      if (this.a6 > 7) {
         this.u3 = com.aspose.slides.internal.v6g.k5.u3(this.n5[this.l6], 6);
         this.l6++;
         this.a6 = 0;
      }

      byte var1 = (byte)(1 << this.a6);
      return (this.u3 & com.aspose.slides.internal.v6g.k5.u3(var1, 6)) == com.aspose.slides.internal.v6g.k5.u3(var1, 6);
   }
}
