package com.aspose.slides.internal.p4l;

import com.aspose.slides.ms.System.e9;
import com.aspose.slides.ms.System.y8;
import java.lang.reflect.Field;

public abstract class y4 extends e2 {
   public abstract int n5();

   protected y4() {
   }

   public abstract Field u3();

   public abstract y8 a6();

   public abstract Object n5(Object var1);

   public void n5(Object var1, Object var2) {
      this.n5(var1, var2, 0, y8.v4(), null);
   }

   public abstract void n5(Object var1, Object var2, int var3, l6 var4, com.aspose.slides.internal.x7n.l6 var5);

   @Override
   public int l6() {
      return 4;
   }

   public boolean u9() {
      return (this.n5() & 16) != 0;
   }

   public boolean h0() {
      return (this.n5() & 7) == 6;
   }

   public boolean c8() {
      Object[] var1 = this.l6(com.aspose.slides.internal.v6g.k5.n5(e9.class), false);
      return var1.length != 0;
   }
}
