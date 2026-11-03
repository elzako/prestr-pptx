package com.aspose.slides.internal.q9r;

import com.aspose.slides.exceptions.NotSupportedException;

public class z8 {
   public long n5;
   public long l6;
   public long k5;
   public long u3;
   public int a6;
   public int u9;
   public short h0;
   public short c8;
   public short t2;
   public short s7;
   public int x8;
   public int n3;
   public short y4;
   public short e2;
   public short t9;

   public z8(com.aspose.slides.internal.z5z.n5 var1) {
      this.n5 = var1.k5();
      if ((this.n5 & 4294967295L) == 131072L) {
         this.n5 = 65536L;
      }

      if ((this.n5 & 4294967295L) != 65536L) {
         throw new NotSupportedException("Unsupported font head version.");
      }

      this.l6 = var1.k5();
      this.k5 = var1.k5();
      this.u3 = var1.k5();
      if ((this.u3 & 4294967295L) != 1594834165L) {
         throw new NotSupportedException("Unsupported font head magic number.");
      }

      this.a6 = var1.a6();
      this.u9 = var1.a6();
      var1.l6();
      var1.l6();
      var1.l6();
      var1.l6();
      this.h0 = var1.u3();
      this.c8 = var1.u3();
      this.t2 = var1.u3();
      this.s7 = var1.u3();
      this.x8 = var1.a6();
      this.n3 = var1.a6();
      this.y4 = var1.u3();
      this.e2 = var1.u3();
      this.t9 = var1.u3();
   }

   public final int n5() {
      int var1 = 0;
      var1 |= (this.x8 & 65535 & 1) != 0 ? 1 : 0;
      var1 |= (this.x8 & 65535 & 2) != 0 ? 2 : 0;
      return var1 | ((this.x8 & 65535 & 4) != 0 ? 4 : 0);
   }
}
