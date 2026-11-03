package com.aspose.slides.internal.r0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.n2d.m1;
import com.aspose.slides.internal.n2d.x8;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.IDisposable;

public class l6 {
   private static final Dictionary<Byte, Integer> n5 = new Dictionary<>();

   public static j5 n5(byte var0, i1 var1) {
      j5 var2 = j5.z3();
      if (var0 == 1) {
         if (var1 != null && m1.n5) {
            var2 = x8.n5();
            if (var1.r4().n5(3, 1).length > 0 || var2.t9() == 936 && var1.r4().n5(3, 3).length > 0 || var2.t9() == 932 && var1.r4().n5(3, 2).length > 0) {
               return var2;
            }
         }

         var2 = x8.n5(1252);
      } else {
         int var3 = 0;
         Integer[] var4 = new Integer[]{var3};
         boolean var5 = n5.tryGetValue(var0, var4);
         var3 = var4[0];
         if (var5) {
            var2 = x8.n5(var3);
         }
      }

      return var2;
   }

   public static byte n5(int var0) {
      if (var0 == 1252) {
         return 1;
      }

      Dictionary$Enumerator var1 = n5.iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            if ((Integer)var2.getValue() == var0) {
               return (Byte)var2.getKey();
            }
         }
      } finally {
         if (k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return 1;
   }

   public static j5 n5(byte var0) {
      int var1 = l6(var0);
      return j5.u3(var1);
   }

   public static int l6(byte var0) {
      int var1 = 0;
      Integer[] var2 = new Integer[]{var1};
      boolean var3 = n5.tryGetValue(var0, var2);
      var1 = var2[0];
      return var3 ? var1 : 1252;
   }

   static {
      n5.addItem((byte)1, 1252);
      n5.addItem((byte)0, 1252);
      n5.addItem((byte)-78, 1256);
      n5.addItem((byte)-70, 1257);
      n5.addItem((byte)-120, 950);
      n5.addItem((byte)-18, 1250);
      n5.addItem((byte)-122, 936);
      n5.addItem((byte)-95, 1253);
      n5.addItem((byte)-127, 949);
      n5.addItem((byte)-79, 1255);
      n5.addItem((byte)-126, 1361);
      n5.addItem((byte)77, 10029);
      n5.addItem((byte)-1, 437);
      n5.addItem((byte)-52, 1251);
      n5.addItem((byte)-128, 932);
      n5.addItem((byte)2, 1252);
      n5.addItem((byte)-34, 874);
      n5.addItem((byte)-94, 1254);
      n5.addItem((byte)-93, 1258);
   }
}
