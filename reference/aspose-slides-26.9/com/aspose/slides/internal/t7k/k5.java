package com.aspose.slides.internal.t7k;

import com.aspose.slides.internal.r5w.x8;
import java.awt.Graphics2D;
import java.awt.Shape;

public abstract class k5 {
   protected final x8 n5;
   protected final Graphics2D l6;
   protected final com.aspose.slides.internal.o9b.u3 k5;

   public static k5 n5(x8 var0, com.aspose.slides.internal.o9b.u3 var1) {
      return new u3(var0, var1);
   }

   public static k5 l6(x8 var0, com.aspose.slides.internal.o9b.u3 var1) {
      return new l6(var0, var1);
   }

   protected k5(x8 var1, com.aspose.slides.internal.o9b.u3 var2) {
      this.n5 = var1;
      this.l6 = var1.z8();
      this.k5 = var2;
   }

   public abstract void n5(Shape var1);
}
