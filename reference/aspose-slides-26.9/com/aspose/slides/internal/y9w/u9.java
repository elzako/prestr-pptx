package com.aspose.slides.internal.y9w;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;

public class u9 {
   public int n5;
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   public int u9;
   public long h0;
   public long c8;
   public long t2;
   public int s7;
   public long x8;
   public int n3;

   public u9() {
      this.n5 = 33;
      this.l6 = 3;
      this.k5 = 9;
      this.u3 = 6;
      this.c8 = 4096L;
   }

   public u9(com.aspose.slides.internal.z0k.n5 var1) {
      long var2 = var1.z8();
      if (var2 != -2226271756974174256L) {
         throw new InvalidOperationException("This is not a structured storage file.");
      }

      var1.c8(16);
      this.n5 = var1.r4();
      this.l6 = var1.r4();
      if ((this.l6 & 65535) > 3) {
         throw new NotSupportedException("This structured storage version is not supported.");
      }

      var1.r4();
      this.k5 = var1.r4();
      this.u3 = var1.r4();
      var1.r4();
      var1.c4();
      this.a6 = var1.m3();
      this.u9 = var1.m3();
      this.h0 = var1.c4();
      var1.c4();
      this.c8 = var1.c4();
      this.t2 = var1.c4();
      this.s7 = var1.m3();
      this.x8 = var1.c4();
      this.n3 = var1.m3();
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(-2226271756974174256L);
      var1.n5(new byte[16]);
      var1.n5(this.n5 & 65535);
      var1.n5(this.l6 & 65535);
      var1.n5(65534);
      var1.n5(this.k5 & 65535);
      var1.n5(this.u3 & 65535);
      var1.n5((short)0);
      var1.l6(0);
      var1.l6(this.a6);
      var1.l6(this.u9);
      var1.n5(this.h0 & 4294967295L);
      var1.l6(0);
      var1.n5(this.c8 & 4294967295L);
      var1.n5(this.t2 & 4294967295L);
      var1.l6(this.s7);
      var1.n5(this.x8 & 4294967295L);
      var1.l6(this.n3);
   }

   public final boolean n5(long var1) {
      return var1 >= (this.c8 & 4294967295L);
   }

   public final int n5() {
      return this.s7 * 512;
   }
}
