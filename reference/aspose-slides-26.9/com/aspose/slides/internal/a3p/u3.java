package com.aspose.slides.internal.a3p;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;

public final class u3 extends k5 {
   private double[] n5;

   public u3(int var1) {
      super(var1 & 65535);
   }

   @Override
   public com.aspose.slides.ms.System.u3 x8() {
      return com.aspose.slides.ms.System.u3.n5((Object)(this.n5));
   }

   @Override
   public int u3() {
      return 12;
   }

   @Override
   public long n3() {
      return 8L;
   }

   @Override
   public Object h0() {
      return this.n5;
   }

   @Override
   public void n5(Object var1) {
      if (var1 != null && !com.aspose.slides.internal.v6g.k5.l6(var1, double[].class)) {
         throw new ArgumentException("Only double array is supported.");
      }

      this.n5 = com.aspose.slides.internal.v6g.k5.n5(var1, double[].class);
   }

   @Override
   public long n5(com.aspose.slides.internal.v6s.a6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("dataStream");
      }

      double[] var2 = this.n5;
      if (this.n5 == null || this.n5.length == 0) {
         var2 = new double[]{0.0};
      }

      var1.n5(var2);
      return com.aspose.slides.ms.System.u3.n5((Object)(var2)).u9() * 8L;
   }

   @Override
   protected void n5(com.aspose.slides.internal.v6s.u3 var1, long var2, long var4) {
      long var6 = var1.n5(var2) & 4294967295L;
      if (var6 + var4 * 8L <= var1.n5()) {
         this.n5 = var1.l6(var6, var4);
      }
   }

   @Override
   protected com.aspose.slides.internal.u2w.a6 s7() {
      return new u3(this.k5());
   }

   @Override
   protected void n5(com.aspose.slides.internal.u2w.a6 var1) {
      ((u3)var1).n5 = com.aspose.slides.internal.r1x.k5.n5(this.n5);
      super.n5(var1);
   }

   @Override
   protected void l6(com.aspose.slides.internal.v6s.a6 var1) {
      throw new NotImplementedException("The tag value cannot fit 4 bytes.");
   }
}
