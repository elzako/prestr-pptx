package com.aspose.slides.internal.l9o;

public class x8 extends z7 {
   public x8(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2) {
      super(var1, var2);
   }

   @Override
   protected void n5(int var1, com.aspose.slides.internal.p4t.u3 var2) {
      int var3 = var1 >> 24 & 0xFF;
      int var4 = var1 >> 16 & 0xFF;
      int var5 = var1 >> 8 & 0xFF;
      int var6 = var1 & 0xFF;
      this.n5(var2, var6, var3);
      this.n5(var2, var5, var3);
      this.n5(var2, var4, var3);
      int var7 = (var3 & 0xFF) << 5;
      var2.n5((byte)(var7 % 255));
      var2.n5((byte)(var7 / 255 & 0xFF));
   }

   private void n5(com.aspose.slides.internal.p4t.u3 var1, int var2, int var3) {
      int var4 = (var2 << 8 | var3) & 65535;
      int var5 = com.aspose.slides.internal.t5g.u3.u3()[var4];
      var1.n5((byte)(var5 >> 8 & 0xFF));
      var1.n5((byte)(var5 & 0xFF));
   }
}
