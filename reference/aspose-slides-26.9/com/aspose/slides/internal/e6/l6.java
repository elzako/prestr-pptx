package com.aspose.slides.internal.e6;

import com.aspose.slides.internal.v2.a6;
import com.aspose.slides.internal.v2.e2;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.internal.v2.t2;

public class l6 implements e2 {
   private com.aspose.slides.internal.v2.n5 n5;
   private int l6;

   public l6() {
      this.n5 = new com.aspose.slides.internal.v2.n5();
      this.n5.n5(new a6(0.0F));
      this.n5.n5(new a6(1.0F));
      this.l6 = 0;
   }

   public l6(com.aspose.slides.internal.v2.n5 var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final s7 t2() {
      return this.n5;
   }

   public final float n5() {
      t2 var1 = (t2)this.n5.l6(this.l6 * 2);
      return var1.u3();
   }

   public final float l6() {
      t2 var1 = (t2)this.n5.l6(this.l6 * 2 + 1);
      return var1.u3();
   }
}
