package com.aspose.slides.internal.g7;

public abstract class b2 {
   protected i2 n5;
   protected com.aspose.slides.internal.z0k.t4 l6;

   public static b2 n5(i2 var0, com.aspose.slides.internal.z0k.t4 var1) {
      b2 var2 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var0, h3r.class)) {
         var2 = new r2n();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, u0a.class)) {
         var2 = new r6i();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, c4i.class)) {
         var2 = new i8n();
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var0, v0.class)) {
            throw new x5("Font saving error. Saving of requested font type is not supported.");
         }

         var2 = new z6();
      }

      var2.n5 = var0;
      var2.l6 = var1;
      return var2;
   }

   public abstract void n5();
}
