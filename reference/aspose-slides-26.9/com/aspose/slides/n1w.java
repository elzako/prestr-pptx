package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

class n1w {
   private static final Dictionary<Byte, int[]> n5 = new Dictionary<>();

   static byte n5(int[] var0) {
      Dictionary$Enumerator var1 = n5.iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            if (com.aspose.slides.internal.n2d.n5.n5((int[])var2.getValue(), var0)) {
               return (Byte)var2.getKey();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return -1;
   }

   static String n5(byte var0, double var1) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();

      for (int var7 : n5.get_Item(var0)) {
         var3.n5(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d2.n5(var7 * var1, com.aspose.slides.internal.x7n.l6.k5()), ", "}));
      }

      if (var3.l6() > 2) {
         var3.n5(var3.l6() - 2);
      }

      return var3.toString();
   }

   static {
      n5.addItem((byte)1, new int[]{0, 2});
      n5.addItem((byte)2, new int[]{2, 2});
      n5.addItem((byte)3, new int[]{4, 3});
      n5.addItem((byte)4, new int[]{4, 3, 1, 3});
      n5.addItem((byte)5, new int[]{8, 3});
      n5.addItem((byte)6, new int[]{8, 3, 1, 3});
      n5.addItem((byte)7, new int[]{8, 3, 1, 3, 1, 3});
   }
}
