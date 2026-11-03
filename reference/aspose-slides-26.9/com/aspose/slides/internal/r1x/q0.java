package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.IDisposable;

@com.aspose.slides.ms.System.j3
public class q0 implements IDisposable {
   private boolean n5;

   public final boolean c8() {
      return this.n5;
   }

   @Override
   public final void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   protected void a6() {
   }

   protected void t2() {
   }

   protected final void s7() {
      if (this.c8()) {
         throw new ObjectDisposedException(com.aspose.slides.ms.System.j8.n5(this).s7());
      }
   }

   private void n5(boolean var1) {
      if (!this.n5) {
         try {
            this.t2();
            if (var1) {
               this.a6();
            }
         } finally {
            this.n5 = true;
         }
      }
   }
}
