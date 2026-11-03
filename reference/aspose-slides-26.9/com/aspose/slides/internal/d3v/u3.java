package com.aspose.slides.internal.d3v;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.z6;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.e5;

public class u3 extends com.aspose.slides.internal.u2w.k5 implements IDisposable {
   private final int u9;
   private final int h0;
   private n5 c8;
   private boolean t2;

   public u3(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      super(var1, var2, var3);
      this.u9 = var2;
      this.h0 = var3;
   }

   @Override
   public void n5(int[] var1, y2 var2, com.aspose.slides.internal.b8u.n5 var3) {
      if (this.c8 == null) {
         this.c8 = new n5(this.u9, this.h0, var3, this.c8());
      }

      this.c8.n5(var1, var2.n3());
   }

   @Override
   public final void dispose() {
      this.n5(true);
      e5.n5(this);
   }

   private void n5(boolean var1) {
      if (!this.t2) {
         try {
            if (var1 && this.c8 != null) {
               this.c8.dispose();
               this.c8 = null;
            }
         } finally {
            this.t2 = true;
         }
      }
   }

   @Override
   public void n5(byte[] var1, y2 var2, com.aspose.slides.internal.b8u.n5 var3, z6 var4) {
      throw new NotImplementedException();
   }
}
