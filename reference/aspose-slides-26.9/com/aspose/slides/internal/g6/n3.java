package com.aspose.slides.internal.g6;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class n3 {
   private static final List<Integer> n5 = n5();

   private static List<Integer> n5() {
      List var0 = new List();
      var0.addItem(com.aspose.slides.internal.x6.k5.d2);
      var0.addItem(com.aspose.slides.internal.x6.k5.n3);
      var0.addItem(com.aspose.slides.internal.x6.k5.s7);
      var0.addItem(com.aspose.slides.internal.x6.k5.y4);
      var0.addItem(com.aspose.slides.internal.x6.k5.c4);
      var0.addItem(com.aspose.slides.internal.x6.k5.k5);
      return var0;
   }

   public final byte[] n5(com.aspose.slides.internal.x6.n5 var1) {
      if (var1.l6(com.aspose.slides.internal.x6.k5.n3) != null && var1.l6(com.aspose.slides.internal.x6.k5.y4) != null) {
         s7 var2 = new s7();
         Dictionary$Enumerator var3 = var1.u3().iterator();

         try {
            while (var3.hasNext()) {
               KeyValuePair var4 = (KeyValuePair)var3.next();
               int var5 = (Integer)var4.getKey();
               if (!n5.containsItem(var5)) {
                  var2.n5(var5, ((com.aspose.slides.internal.l7.h0)var4.getValue()).n5());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         com.aspose.slides.internal.q5.u3 var13 = (com.aspose.slides.internal.q5.u3)var1.l6(com.aspose.slides.internal.x6.k5.k5);
         var2.n5().n5(var13);
         a6 var14 = new a6();
         var14.n5(var1);
         var2.n5(com.aspose.slides.internal.x6.k5.n3, var14.n5());
         var2.n5(com.aspose.slides.internal.x6.k5.y4, (com.aspose.slides.internal.m9.h0)null);
         com.aspose.slides.internal.e4.k5 var6 = (com.aspose.slides.internal.e4.k5)var1.l6(com.aspose.slides.internal.x6.k5.s7);
         if (var6 != null) {
            l6 var7 = new l6();
            var7.n5(var6);
            var2.n5(com.aspose.slides.internal.x6.k5.s7, var7.n5());
         }

         com.aspose.slides.internal.q5.a6 var15 = (com.aspose.slides.internal.q5.a6)var1.l6(com.aspose.slides.internal.x6.k5.c4);
         if (var15 != null) {
            var2.n5(com.aspose.slides.internal.x6.k5.c4, new u9().n5(var1));
         }

         byte[] var8 = var2.l6();
         byte[] var9 = var14.l6();
         byte[] var10 = var14.k5();
         return n5(var8, var9, var10);
      } else {
         return null;
      }
   }

   private static void n5(byte[] var0, int var1, int var2) {
      var0[var2] = (byte)(var1 >> 16 & 0xFF);
      var0[var2 + 1] = (byte)(var1 >> 8 & 0xFF);
      var0[var2 + 2] = (byte)(var1 & 0xFF);
   }

   private static byte[] n5(byte[] var0, byte[] var1, byte[] var2) {
      int var3 = q1.n5(var0.length, q1.n5(var1.length, var2.length)) + c8.n5();
      byte[] var4 = c8.n5(var0);
      byte[] var5 = c8.n5(var1);
      byte[] var6 = c8.n5(var2);
      int var7 = 10 + var4.length + var5.length + var6.length;
      byte[] var8 = new byte[var7];
      var8[0] = 3;
      n5(var8, var3, 1);
      int var9 = 10 + var4.length;
      int var10 = var9 + var5.length;
      n5(var8, var9, 4);
      n5(var8, var10, 7);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var8)), 10, var4.length);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var5)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var8)), var9, var5.length);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var6)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var8)), var10, var6.length);
      return var8;
   }
}
