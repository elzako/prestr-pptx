package com.aspose.slides.internal.b1r;

import com.aspose.slides.internal.j3b.c8;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.z3;

public abstract class u3 implements com.aspose.slides.internal.j3b.u9 {
   private final c8 n5;

   public u3(c8 var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(j5 var1, int[] var2, z3 var3, z3 var4) {
      this.n5.n5(var1.n3(), this.n5(var2), var3.u3(), var4.u3());
   }

   protected abstract byte[] n5(int[] var1);
}
