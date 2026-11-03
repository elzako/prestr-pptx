package com.aspose.slides.internal.r3x;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.x9;

class u3 implements IDisposable {
   private com.aspose.slides.internal.o9b.l6 n5;
   private com.aspose.slides.internal.j9e.n5 l6;
   private x9 k5;
   private int u3;
   private byte[] a6;

   public final int n5() {
      return this.l6.a6();
   }

   public u3(com.aspose.slides.internal.o9b.l6 var1) {
      this.n5 = var1;
      this.l6 = this.n5.n5(new y2(0, 0, this.n5.e2(), this.n5.h0()), 3, 2498570);
      this.k5 = this.l6.u3();
      this.u3 = this.n5() * this.n5.h0();
      this.a6 = new byte[this.u3];
      com.aspose.slides.internal.e3m.n5.n5(this.k5, this.a6, 0, this.u3);
   }

   public final byte[] l6() {
      return this.a6;
   }

   public final com.aspose.slides.internal.o9b.l6 k5() {
      com.aspose.slides.internal.e3m.n5.n5(this.a6, 0, this.k5, this.u3);
      return this.n5;
   }

   @Override
   public final void dispose() {
      this.n5.n5(this.l6);
   }

   public final int u3() {
      return this.l6.l6();
   }

   public final int a6() {
      return this.l6.n5();
   }
}
