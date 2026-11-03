package com.aspose.slides.internal.l5;

import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.v4;

public class t2 implements IDisposable, v4 {
   private com.aspose.slides.internal.j9e.t2 n5;
   private int l6;
   private com.aspose.slides.internal.o9b.c8 k5 = new com.aspose.slides.internal.o9b.c8();

   public t2() {
      this.n5 = new com.aspose.slides.internal.j9e.t2();
   }

   @Override
   public final void dispose() {
      this.n5.dispose();
   }

   @Override
   public final Object deepClone() {
      t2 var1 = new t2();
      var1.n5 = (com.aspose.slides.internal.j9e.t2)this.n5.deepClone();
      return var1;
   }

   public final void n5(com.aspose.slides.internal.j9e.k5 var1) {
      this.n5.n5(var1);
   }

   public final int n5() {
      return this.l6;
   }

   public final com.aspose.slides.internal.o9b.c8 l6() {
      return this.k5;
   }

   public final com.aspose.slides.internal.j9e.t2 k5() {
      return this.n5;
   }
}
