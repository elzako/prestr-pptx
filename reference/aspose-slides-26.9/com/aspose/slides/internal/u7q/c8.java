package com.aspose.slides.internal.u7q;

public class c8 extends l6 {
   private float[] t2;

   @Override
   public void n5(com.aspose.slides.internal.w2i.s7 var1) {
      this.h0 = (int)var1.k5();
      this.y4();
      this.c8 = var1.k5();
      this.l6 = var1.n5();
      this.k5 = var1.n5();
      byte var2 = var1.n5();
      var1.n5();
      this.t2 = var1.u3(9);
      int var3 = this.l6(var1);
      int var4 = this.l6(var1);
      this.n5(this.k5(), var1, var3);
      com.aspose.slides.internal.d9l.n5 var5 = this.n5(var2, this.e2());
      var5.l6(var1);
      this.n5(this.n5(), var1, var4);
   }

   @Override
   public void n5(long var1, long var3) {
      this.n5(this.t2);
      super.n5(var1, var3);
   }

   @Override
   protected void y4() {
      if (this.h0 != 1835430961) {
         throw new com.aspose.slides.internal.d3l.h0();
      }
   }

   protected int l6(com.aspose.slides.internal.w2i.s7 var1) {
      return 256;
   }

   protected float[] n5(com.aspose.slides.internal.w2i.s7 var1, int var2) {
      return var1.l6(var2 & 65535);
   }

   private void n5(n5[] var1, com.aspose.slides.internal.w2i.s7 var2, int var3) {
      for (byte var4 = 0; (var4 & 255) < var1.length; var4++) {
         var1[var4 & 0xFF] = (n5)com.aspose.slides.internal.u7q.k5.n5(1668641398);
         var1[var4 & 0xFF].n5(this.n5(var2, var3));
      }
   }

   protected byte e2() {
      return 1;
   }
}
