package com.aspose.slides.internal.g7;

public class e2o {
   private z4 n5;
   private n2 l6;
   private static com.aspose.slides.internal.r7c.c8 k5 = new com.aspose.slides.internal.r7c.c8("\\/FontName[^\\/]*?\\/((.)*?)((\\Wdef)|(\\Wreadonly def))", 0);

   public final n2 n5(z4 var1) {
      try {
         this.n5 = var1;
         this.n5();
         return this.l6;
      } catch (l0 var3) {
         throw var3;
      } catch (RuntimeException var4) {
         throw new f9d("Unexpected font parsing exception", var4);
      }
   }

   private void n5() {
      String var1 = com.aspose.slides.ms.System.d1.n5;
      com.aspose.slides.internal.z0k.t4 var2 = this.n5.l6();

      try {
         var2.setPosition(0L);
         byte[] var3 = new byte[(int)var2.getLength()];
         var2.read(var3, 0, (int)var2.getLength());
         String var4 = com.aspose.slides.internal.l7h.j5.e2().l6(var3);
         com.aspose.slides.internal.r7c.u9 var5 = k5.k5(var4);
         if (var5.n5() > 0) {
            var1 = var5.n5(0).a6().n5(1).k5();
         }

         this.l6 = new n2(var1, var1, 1, new p9(this.n5));
      } finally {
         if (this.n5 != null && this.n5.u3()) {
            var2.close();
         }
      }
   }
}
