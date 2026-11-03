package com.aspose.slides.internal.g7;

class j6 {
   private int n5;

   public j6(int var1) {
      switch (var1) {
         case 0:
            this.n5 = 55665;
            break;
         case 1:
            this.n5 = 4330;
      }
   }

   public final byte n5(byte var1) {
      byte var2 = (byte)(this.n5 >> 8);
      byte var3 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var1, 6) ^ com.aspose.slides.internal.v6g.k5.u3(var2, 6));
      this.n5 = (com.aspose.slides.internal.v6g.k5.u3(var1, 6) + this.n5) * 52845 + 22719 & 65535;
      return var3;
   }

   public final byte l6(byte var1) {
      byte var2 = (byte)(this.n5 >> 8);
      byte var3 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var1, 6) ^ com.aspose.slides.internal.v6g.k5.u3(var2, 6));
      this.n5 = (com.aspose.slides.internal.v6g.k5.u3(var3, 6) + this.n5) * 52845 + 22719 & 65535;
      return var3;
   }
}
