package com.aspose.slides.internal.u1s;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.n2d.k5;

class n5$l6 {
   public long n5;
   public long l6;
   public long k5;
   public int u3;
   public long a6;
   public int u9;
   public int h0;
   public long c8;
   public long t2;
   public long s7;
   public long x8;
   public long n3;

   private n5$l6() {
   }

   public final void n5(k5 var1) {
      this.n5 = var1.k5();
      if ((this.n5 & 4294967295L) != 2001684038L) {
         throw new NotSupportedException("Unsupported woff signature version.");
      }

      this.l6 = var1.k5();
      this.k5 = var1.k5();
      this.u3 = var1.a6();
      var1.a6();
      this.a6 = var1.k5();
      this.u9 = var1.a6();
      this.h0 = var1.a6();
      this.c8 = var1.k5();
      this.t2 = var1.k5();
      this.s7 = var1.k5();
      this.x8 = var1.k5();
      this.n3 = var1.k5();
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/u1s/n5$1;)V -> ()V
   n5$l6(com.aspose.slides.internal.u1s.n5$1 recoveredArg0) {
      this();
   }
}
