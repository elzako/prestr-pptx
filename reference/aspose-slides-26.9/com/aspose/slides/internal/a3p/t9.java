package com.aspose.slides.internal.a3p;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.w2a.z3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.l4;
import com.aspose.slides.ms.System.s3;

public final class t9 extends com.aspose.slides.internal.u2w.a6 {
   private final long n5;
   private final com.aspose.slides.internal.v6s.u3 l6;
   private final long k5;
   private final int u3;

   public t9(com.aspose.slides.internal.v6s.u3 var1, int var2, int var3, long var4, long var6) {
      super(var3);
      this.l6 = var1;
      this.k5 = var4;
      this.u3 = var2;
      this.n5 = var6;
   }

   @Override
   public long n5() {
      return this.k5;
   }

   @Override
   public int u3() {
      return this.u3 & 65535;
   }

   @Override
   public long u9() {
      throw new NotImplementedException();
   }

   @Override
   public Object h0() {
      throw new NotImplementedException();
   }

   @Override
   public void n5(Object var1) {
      throw new NotImplementedException();
   }

   @Override
   public long n5(com.aspose.slides.internal.v6s.a6 var1) {
      throw new NotImplementedException();
   }

   @Override
   public String toString() {
      return d1.n5(
         "Tag: ",
         s3.n5(z3.class, this.k5()),
         " Type: ",
         s3.n5(com.aspose.slides.internal.w2a.h0.class, this.u3()),
         " Count: ",
         l4.l6(this.n5()),
         " Undefined value: ",
         l4.l6(this.n5)
      );
   }

   @Override
   protected void n5(com.aspose.slides.internal.v6s.u3 var1, long var2, long var4) {
      throw new NotImplementedException();
   }

   @Override
   protected void l6(com.aspose.slides.internal.v6s.a6 var1, long var2) {
      throw new NotImplementedException();
   }

   @Override
   protected com.aspose.slides.internal.u2w.a6 s7() {
      return new t9(this.l6, this.u3, this.k5() & 65535, this.k5, this.n5);
   }
}
