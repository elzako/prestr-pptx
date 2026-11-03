package com.aspose.slides.internal.b3z;

import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.d1;

public class s7 {
   private float n5;
   private float l6;
   private float k5;
   private float u3;

   public s7() {
   }

   public s7(float var1, float var2, float var3, float var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public final y1 n5(n3 var1) {
      return new y1(var1.k5(this.n5), var1.k5(this.l6), var1.k5(this.k5), var1.k5(this.u3));
   }

   public static s7 n5(String var0) {
      if (d1.n5(var0)) {
         return null;
      }

      String[] var1 = d1.n5(var0, new String[]{" ", ","}, 1);
      if (var1.length < 4) {
         return null;
      }

      s7 var2 = new s7();

      try {
         var2.n5 = c8.n5(var1[0], 0.0F);
         var2.l6 = c8.n5(var1[1], 0.0F);
         var2.k5 = c8.n5(var1[2], 0.0F);
         var2.u3 = c8.n5(var1[3], 0.0F);
      } catch (RuntimeException var4) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var4;
         }
      }

      return var2;
   }

   @Override
   public String toString() {
      return d1.n5("{0} {1} {2} {3}",new Object[]{ c8.n5(this.n5), c8.n5(this.l6), c8.n5(this.k5), c8.n5(this.u3)});
   }
}
