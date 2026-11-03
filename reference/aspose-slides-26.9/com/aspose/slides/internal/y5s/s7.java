package com.aspose.slides.internal.y5s;

import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.e5;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@j3
public class s7 implements IDisposable {
   private boolean n5;

   public boolean h0() {
      return this.n5;
   }

   @Override
   public void dispose() {
      this.n5(true);
      e5.n5(this);
   }

   protected void u9() {
   }

   protected void c8() {
   }

   protected void t2() {
      if (this.h0()) {
         throw new ObjectDisposedException(j8.n5(this).s7());
      }
   }

   private void n5(boolean var1) {
      if (!this.n5) {
         try {
            this.c8();
            if (var1) {
               this.u9();
            }
         } finally {
            this.n5 = true;
         }
      }
   }
}
