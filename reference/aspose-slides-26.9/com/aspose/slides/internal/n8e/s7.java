package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

public class s7 implements j9 {
   private int n5 = 1252;
   private SortedList<Long, String> l6 = new SortedList<>();

   public final SortedList<Long, String> n5() {
      return this.l6;
   }

   s7() {
      this.n5 = 1200;
   }

   s7(byte[] var1, int var2) {
      this.n5 = var2;
      int var3 = (int)y2.u3(var1, 0);
      int var4 = 4;

      for (int var5 = 0; var5 < var3; var5++) {
         long var6 = y2.u3(var1, var4) & 4294967295L;
         long var8 = y2.u3(var1, var4 + 4) & 4294967295L;
         var4 += 8;
         if ((var8 & 4294967295L) < var1.length) {
            com.aspose.slides.internal.l7h.a5 var10 = new com.aspose.slides.internal.l7h.a5((int)var8);

            for (int var11 = 0; var11 < (var8 & 4294967295L); var11++) {
               if ((var2 & 65535) == 1200) {
                  var10.n5((char)y2.l6(var1, var4 + var11 * 2));
               } else {
                  var10.n5(com.aspose.slides.internal.n2d.x8.n5(var2 & 65535).n5(new byte[]{var1[var4 + var11]}));
               }
            }

            while (var10.l6(var10.l6() - 1) == 0) {
               var10.n5(var10.l6() - 1);
            }

            if ((var2 & 65535) == 1200) {
               if (((var8 & 4294967295L) % 2L & 4294967295L) == 1L) {
                  var8++;
               }

               var4 += (int)((var8 & 4294967295L) + (var8 & 4294967295L));
            } else {
               var4 += (int)var8;
            }

            this.l6.set_Item(var6, var10.toString());
         }
      }
   }

   @Override
   public final byte[] l6() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.z0k.l6 var2 = new com.aspose.slides.internal.z0k.l6(var1);
      int var3 = this.l6.size();
      var2.n5(var3 & 4294967295L);
      IGenericEnumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var4.next();
            var2.n5((Long)var5.getKey());
            String var6 = (String)var5.getValue();
            int var7 = var6.length() + 1;
            var2.n5(var7 & 4294967295L);
            if ((this.n5 & 65535) == 1200) {
               if (var7 % 2 == 1) {
                  var7++;
               }

               var7 += var7;
            }

            byte[] var8 = new byte[var7];
            byte[] var9 = com.aspose.slides.internal.n2d.x8.n5(this.n5 & 65535).u3(var6);
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var9)), com.aspose.slides.ms.System.u3.n5((Object)(var8)), var9.length);
            var2.n5(var8);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      int var13 = (int)var1.getLength() % 4;
      if (var13 > 0) {
         byte[] var14 = new byte[var13];
         var2.n5(var14);
      }

      var2.l6();
      return var1.toArray();
   }
}
