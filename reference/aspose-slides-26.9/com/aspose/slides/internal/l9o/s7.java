package com.aspose.slides.internal.l9o;

public class s7 extends z7 {
   public s7(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2) {
      super(var1, var2);
   }

   @Override
   protected void n5(int var1, com.aspose.slides.internal.p4t.u3 var2) {
      byte var3 = (byte)(var1 >> 24 & 0xFF);
      byte var4 = (byte)(var1 >> 16 & 0xFF);
      byte var5 = (byte)(var1 >> 8 & 0xFF);
      byte var6 = (byte)(var1 & 0xFF);
      this.n5(var2, var6);
      this.n5(var2, var5);
      this.n5(var2, var4);
      int var7 = (var3 & 255) << 5;
      var2.n5((byte)(var7 % 255));
      var2.n5((byte)(var7 / 255 & 0xFF));
   }

   private void n5(com.aspose.slides.internal.p4t.u3 var1, byte var2) {
      for (byte var6 : this.n5(var2)) {
         var1.n5(var6);
      }
   }
}
