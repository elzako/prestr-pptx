package com.aspose.slides.internal.f7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.w0.z1;
import com.aspose.slides.ms.System.IDisposable;

public class u9 implements l6 {
   private final z1[] l6;
   private final Dictionary<Integer, Byte> k5;
   public final l6 n5;

   public u9(l6 var1) {
      this.n5 = var1;
      this.l6 = (z1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(z1.class), 256));
      this.k5 = new Dictionary<>();
   }

   @Override
   public final IGenericList<z1> n5(IGenericList<com.aspose.slides.internal.w0.n5> var1, byte[] var2) {
      this.k5.clear();
      int var3 = 0;
      int var4 = 0;
      IGenericEnumerator var5 = var1.iterator();

      try {
         while (var5.hasNext()) {
            com.aspose.slides.internal.w0.n5 var6 = (com.aspose.slides.internal.w0.n5)var5.next();
            int var7 = var6.l6();
            byte var8 = 0;
            Byte[] var9 = new Byte[]{var8};
            boolean var10 = !this.k5.tryGetValue(var7, var9);
            var8 = var9[0];
            if (var10) {
               if (var3 >= 256) {
                  var3++;
                  break;
               }

               var8 = (byte)this.k5.size();
               this.k5.addItem(var7, var8);
               var6.n5().n5(this.l6[var3]);
               var3++;
            }

            var2[var4] = var8;
            var4++;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if (var3 <= 256) {
         return new com.aspose.slides.internal.d8.k5<>(this.l6, 0, var3);
      } else if (this.n5 != null) {
         return this.n5.n5(var1, var2);
      } else {
         throw new NotSupportedException("Too many colors");
      }
   }
}
