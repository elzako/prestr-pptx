package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentNullException;

public class p4l extends m9 {
   private e3m[] n5;
   private boolean l6;
   private boolean d5;

   protected p4l(j9e var1) {
      super(var1);

      while (var1.a0() == 4) {
         var1 = var1.y1();
      }

      u1s[] var2 = ((d4n)((u1s)var1).n5()).u9();
      this.n5 = new e3m[var2.length];

      for (int var3 = 0; var3 < var2.length; var3++) {
         this.n5[var3] = var2[var3].z7();
         if (var2[var3].b3().x8() == 1) {
            this.d5 = true;
         } else if (var2[var3].b3().x8() == 0) {
            this.l6 = true;
         }
      }
   }

   public static e3m n5(j9e var0) {
      return new p4l(var0);
   }

   @Override
   public Object n5(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      com.aspose.slides.ms.System.y8 var4 = com.aspose.slides.ms.System.j8.n5(var1);
      if (var4 == y4 && this.l6) {
         return ((x6)var1).n5(var2, var3);
      }

      if (var4 == c8 && this.d5) {
         return q9.n5.n5(var1, var2, var3);
      }

      if (var4 == n3) {
         if (var2 == n3) {
            return var1;
         }

         e4j var5 = (e4j)this.n5().b3().n5((String)var1, new com.aspose.slides.ms.System.Xml.j9(), var3, true);
         return var5.n5().z7().n5((String)var1, var2, var3);
      } else {
         throw this.l6(var4, var2);
      }
   }
}
