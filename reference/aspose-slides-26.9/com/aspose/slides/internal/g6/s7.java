package com.aspose.slides.internal.g6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class s7 {
   private final Dictionary<Integer, com.aspose.slides.internal.m9.h0> n5 = new Dictionary<>();
   private final x8 l6 = new x8();

   public final x8 n5() {
      return this.l6;
   }

   public final void n5(int var1, com.aspose.slides.internal.m9.h0 var2) {
      this.n5.addItem(var1, var2);
   }

   public final void n5(int var1, byte[] var2) {
      this.n5(var1, com.aspose.slides.internal.m9.h0.n5(var2));
   }

   private static void n5(byte[] var0, int var1, int var2) {
      var0[var1] = (byte)(var2 >> 8);
      var0[var1 + 1] = (byte)var2;
   }

   private static void l6(byte[] var0, int var1, int var2) {
      var0[var1] = (byte)(var2 >> 24);
      var0[var1 + 1] = (byte)(var2 >> 16);
      var0[var1 + 2] = (byte)(var2 >> 8);
      var0[var1 + 3] = (byte)var2;
   }

   public final byte[] l6() {
      this.n5(com.aspose.slides.internal.x6.k5.k5, this.l6.n5());
      List var1 = new List();
      Dictionary$KeyCollection$Enumerator var2 = this.n5.getKeys().iterator();

      try {
         while (var2.hasNext()) {
            int var3 = com.aspose.slides.internal.v6g.k5.u3(var2.next(), int.class);
            var1.addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      var1.sort();
      int var29 = this.n5.size();
      int var4 = 12 + 16 * var29;
      Dictionary$Enumerator var5 = this.n5.iterator();

      try {
         while (var5.hasNext()) {
            KeyValuePair var6 = (KeyValuePair)var5.next();
            com.aspose.slides.internal.m9.h0 var7 = (com.aspose.slides.internal.m9.h0)var6.getValue();
            if (var7 != null) {
               var4 += ((com.aspose.slides.internal.m9.h0)var6.getValue()).n5() + 4 - 1 & -4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      byte[] var30 = new byte[var4];
      l6(var30, 0, 65536);
      n5(var30, 4, var29);
      int var31 = k5(var29);
      n5(var30, 6, var31 * 16);
      n5(var30, 8, u3(var31));
      n5(var30, 10, (var29 - var31) * 16);
      byte var8 = 12;
      int var9 = 12 + 16 * var29;
      List$Enumerator var10 = var1.iterator();

      try {
         for (; var10.hasNext(); var8 += 16) {
            int var11 = com.aspose.slides.internal.v6g.k5.u3(var10.next(), int.class);
            com.aspose.slides.internal.m9.h0 var12 = null;
            com.aspose.slides.internal.m9.h0[] var13 = new com.aspose.slides.internal.m9.h0[]{var12};
            this.n5.tryGetValue(var11, var13);
            var12 = var13[0];
            l6(var30, var8, var11);
            byte var14 = 0;
            l6(var30, var8 + 4, var14);
            if (var12 == null) {
               l6(var30, var8 + 8, 0);
               l6(var30, var8 + 12, 0);
            } else {
               l6(var30, var8 + 8, var9);
               int var15 = var12.n5();
               l6(var30, var8 + 12, var15);
               var12.n5(0, var30, var9, var15);
               var9 += var15 + 4 - 1 & -4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
            var10.dispose();
         }
      }

      return var30;
   }

   public static int n5(int var0) {
      var0 |= var0 >> 1;
      var0 |= var0 >> 2;
      var0 |= var0 >> 4;
      var0 |= var0 >> 8;
      var0 |= var0 >> 16;
      return var0 - (int)((var0 & 4294967295L) >> 1);
   }

   public static int l6(int var0) {
      if (var0 == 0) {
         return 32;
      }

      byte var1 = 1;
      if ((int)((var0 & 4294967295L) >> 16) == 0) {
         var1 += 16;
         var0 <<= 16;
      }

      if ((int)((var0 & 4294967295L) >> 24) == 0) {
         var1 += 8;
         var0 <<= 8;
      }

      if ((int)((var0 & 4294967295L) >> 28) == 0) {
         var1 += 4;
         var0 <<= 4;
      }

      if ((int)((var0 & 4294967295L) >> 30) == 0) {
         var1 += 2;
         var0 <<= 2;
      }

      return var1 - (int)((var0 & 4294967295L) >> 31);
   }

   private static int k5(int var0) {
      return n5(var0);
   }

   private static int u3(int var0) {
      return 31 - l6(var0);
   }
}
