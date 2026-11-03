package com.aspose.slides.internal.j7;

import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.e5;

public class h0 implements IDisposable {
   private boolean n5 = false;
   private com.aspose.slides.internal.o9b.z1 l6;
   private final int k5;

   public h0(n5 var1) {
      this(var1.c8());
   }

   public h0(t4 var1) {
      this.l6 = com.aspose.slides.internal.o9b.z1.n5(var1);
      this.k5 = this.l6.z3();
   }

   @Override
   public final void dispose() {
      this.n5(true);
      e5.n5(this);
   }

   protected void n5(boolean var1) {
      if (!this.n5) {
         this.n5();
         this.n5 = true;
      }
   }

   public final void n5() {
      if (this.l6 != null) {
         this.l6.c8(this.k5);
         this.l6.dispose();
         this.l6 = null;
      }
   }

   public final void n5(float var1, float var2) {
      this.l6.l6(var1, var2);
   }

   public final com.aspose.slides.internal.o9b.z1 l6() {
      return this.l6;
   }
}
