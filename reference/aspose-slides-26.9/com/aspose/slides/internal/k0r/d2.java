package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class d2 {
   private com.aspose.slides.ms.System.j5 n5 = new com.aspose.slides.ms.System.j5();

   public final com.aspose.slides.ms.System.j5 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.n5);
   }

   final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      short var2 = var1.k7();
      short var3 = var1.k7();
      var1.k7();
      short var4 = var1.k7();
      short var5 = var1.k7();
      short var6 = var1.k7();
      short var7 = var1.k7();
      short var8 = var1.k7();

      try {
         this.n5 = new com.aspose.slides.ms.System.j5(var2, var3, var4, var5, var6, var7, var8);
      } catch (RuntimeException var10) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var10, ArgumentOutOfRangeException.class)) {
            com.aspose.slides.internal.n8e.v4.n5(var10);
            com.aspose.slides.ms.System.t4.n5(var10);
            throw var10;
         }

         this.n5 = new com.aspose.slides.ms.System.j5();
      }
   }

   final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5((short)this.n5.e2());
      var1.n5((short)this.n5.c8());
      var1.n5((short)this.n5.k5());
      var1.n5((short)this.n5.l6());
      var1.n5((short)this.n5.u3());
      var1.n5((short)this.n5.h0());
      var1.n5((short)this.n5.x8());
      var1.n5((short)this.n5.u9());
   }
}
