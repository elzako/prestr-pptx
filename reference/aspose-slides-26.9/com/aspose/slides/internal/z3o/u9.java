package com.aspose.slides.internal.z3o;

import com.aspose.slides.internal.o9b.w1;
import java.util.List;

public class u9 {
   public w1 l6;
   public a6 k5;
   public w1 u3;

   protected u9(com.aspose.slides.internal.x7u.u9 var1, w1 var2, w1 var3) {
      this.l6 = var2;
      this.k5 = var1.l6(var3.l6(), var3.k5());
      this.u3 = var3;
   }

   public boolean n5() {
      return false;
   }

   public List<u9> l6() {
      throw new UnsupportedOperationException("Not CompoundMarginData does not support CompoundMargins");
   }

   public static u9 n5(com.aspose.slides.internal.x7u.u9 var0, float var1, float var2, float var3, float var4) {
      return n5(var0, new w1(var1, var2), new w1(var3, var4));
   }

   public static u9 n5(com.aspose.slides.internal.x7u.u9 var0, w1 var1, w1 var2) {
      return var0.n5() ? new n5((com.aspose.slides.internal.x7u.k5)var0, var1, var2) : new u9(var0, var1, var2);
   }
}
