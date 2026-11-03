package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public abstract class u3 extends r4 implements z7 {
   private String n5;

   protected u3(String var1) {
      this.n5 = var1;
   }

   @Override
   public int u3() {
      return 10;
   }

   @Override
   public String a6() {
      return d1.n5(':', this.n5);
   }

   public final String n5() {
      return this.n5;
   }
}
