package com.aspose.slides.internal.a3p;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;

public final class x8 extends k5 {
   private com.aspose.slides.internal.u2w.t2[] n5;

   public x8(int var1) {
      super(var1 & 65535);
   }

   @Override
   public com.aspose.slides.ms.System.u3 x8() {
      return com.aspose.slides.ms.System.u3.n5((Object)(this.n5));
   }

   @Override
   public long n3() {
      return 8L;
   }

   @Override
   public int u3() {
      return 10;
   }

   @Override
   public Object h0() {
      return this.n5;
   }

   @Override
   public void n5(Object var1) {
      if (var1 != null && !com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.u2w.t2[].class)) {
         throw new ArgumentException("Only TiffSRational array is supported.");
      }

      this.n5 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.u2w.t2[].class);
   }

   @Override
   public long n5(com.aspose.slides.internal.v6s.a6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("dataStream");
      }

      com.aspose.slides.internal.u2w.t2[] var2 = this.n5;
      if (this.n5 == null || this.n5.length == 0) {
         var2 = new com.aspose.slides.internal.u2w.t2[]{new com.aspose.slides.internal.u2w.t2()};
      }

      var1.n5(var2);
      return 8L * com.aspose.slides.ms.System.u3.n5((Object)(var2)).u9();
   }

   @Override
   protected void n5(com.aspose.slides.internal.v6s.u3 var1, long var2, long var4) {
      long var6 = var1.n5(var2) & 4294967295L;
      if (var6 + var4 * 8L <= var1.n5()) {
         this.n5 = var1.a6(var6, var4);
      }
   }

   @Override
   protected com.aspose.slides.internal.u2w.a6 s7() {
      return new x8(this.k5());
   }

   @Override
   protected void n5(com.aspose.slides.internal.u2w.a6 var1) {
      ((x8)var1).n5 = n5(this.n5);
      super.n5(var1);
   }

   @Override
   protected void l6(com.aspose.slides.internal.v6s.a6 var1) {
      throw new NotImplementedException("The tag value cannot fit 4 bytes.");
   }

   private static com.aspose.slides.internal.u2w.t2[] n5(com.aspose.slides.internal.u2w.t2[] var0) {
      com.aspose.slides.internal.u2w.t2[] var1 = null;
      if (var0 != null) {
         var1 = new com.aspose.slides.internal.u2w.t2[var0.length];

         for (long var2 = 0L; (var2 & 4294967295L) < var0.length; var2++) {
            var1[(int)var2] = var0[(int)var2];
         }
      }

      return var1;
   }
}
