package com.aspose.slides.internal.u6p;

import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.internal.h3d.n3;
import com.aspose.slides.internal.h3d.s3;
import com.aspose.slides.ms.System.c4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j5;
import com.aspose.slides.ms.System.s4;
import com.aspose.slides.ms.System.x9;
import com.aspose.slides.ms.System.y8;

class n5 {
   public static byte[] n5 = new byte[]{0, 1, 0, 0, 0, -1, -1, -1, -1, 1, 0, 0, 0, 0, 0, 0, 0};
   static y8[] l6 = new y8[19];
   static byte[] k5 = new byte[30];
   public static boolean u3 = false;

   public static boolean n5(y8 var0) {
      return var0.e5() && var0 != com.aspose.slides.internal.v6g.k5.n5(x9.class)
         || var0 == com.aspose.slides.internal.v6g.k5.n5(j5.class)
         || var0 == com.aspose.slides.internal.v6g.k5.n5(s4.class)
         || var0 == com.aspose.slides.internal.v6g.k5.n5(c4.class);
   }

   public static byte l6(y8 var0) {
      return var0 == com.aspose.slides.internal.v6g.k5.n5(s4.class) ? 12 : k5[y8.u3(var0)];
   }

   public static y8 n5(int var0) {
      return l6[var0];
   }

   public static void n5(y8 var0, n3 var1, s3 var2) {
      if (!var0.d5() && !var0.y2()) {
         n3[] var3 = new n3[]{var1};
         boolean var4 = var1 != null && var1.n5(var0, var2.k5(), var3) != null;
         var1 = var3[0];
         if (!var4) {
            throw new SerializationException(d1.n5(new Object[]{"Type ", var0, " is not marked as Serializable."}));
         }
      }
   }

   static {
      l6[1] = com.aspose.slides.internal.v6g.k5.n5(boolean.class);
      l6[2] = com.aspose.slides.internal.v6g.k5.n5(byte.class);
      l6[3] = com.aspose.slides.internal.v6g.k5.n5(char.class);
      l6[12] = com.aspose.slides.internal.v6g.k5.n5(s4.class);
      l6[13] = com.aspose.slides.internal.v6g.k5.n5(j5.class);
      l6[5] = com.aspose.slides.internal.v6g.k5.n5(c4.class);
      l6[6] = com.aspose.slides.internal.v6g.k5.n5(double.class);
      l6[7] = com.aspose.slides.internal.v6g.k5.n5(short.class);
      l6[8] = com.aspose.slides.internal.v6g.k5.n5(int.class);
      l6[9] = com.aspose.slides.internal.v6g.k5.n5(long.class);
      l6[10] = com.aspose.slides.internal.v6g.k5.n5(byte.class);
      l6[11] = com.aspose.slides.internal.v6g.k5.n5(float.class);
      l6[14] = com.aspose.slides.internal.v6g.k5.n5(int.class);
      l6[15] = com.aspose.slides.internal.v6g.k5.n5(long.class);
      l6[16] = com.aspose.slides.internal.v6g.k5.n5(long.class);
      l6[17] = null;
      l6[18] = com.aspose.slides.internal.v6g.k5.n5(String.class);
      k5[3] = 1;
      k5[6] = 2;
      k5[4] = 3;
      k5[16] = 13;
      k5[15] = 5;
      k5[14] = 6;
      k5[7] = 7;
      k5[9] = 8;
      k5[11] = 9;
      k5[5] = 10;
      k5[13] = 11;
      k5[8] = 14;
      k5[10] = 15;
      k5[12] = 16;
      k5[18] = 18;
      u3 = true;
   }
}
