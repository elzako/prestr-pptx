package com.aspose.slides.internal.y6;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.e1x.x8;
import com.aspose.slides.internal.i3.v4;
import com.aspose.slides.internal.k1.w1;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.y4;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.q6.s7;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class c8 {
   public static <T> boolean n5(T[] var0, T[] var1) {
      if (var0 == var1) {
         return true;
      }

      if (var0 != null && var1 != null) {
         if (var0.length != var1.length) {
            return false;
         }

         for (int var2 = 0; var2 < var0.length; var2++) {
            if (!var0[var2].equals(var1[var2])) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean n5(byte[] var0, byte[] var1) {
      if (var0 == var1) {
         return true;
      }

      if (var0 != null && var1 != null) {
         if (var0.length != var1.length) {
            return false;
         }

         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var0[var2] != var1[var2]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean n5(int[] var0, int[] var1) {
      if (var0 == var1) {
         return true;
      }

      if (var0 != null && var1 != null) {
         if (var0.length != var1.length) {
            return false;
         }

         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var0[var2] != var1[var2]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean n5(short[] var0, short[] var1) {
      if (var0 == var1) {
         return true;
      }

      if (var0 != null && var1 != null) {
         if (var0.length != var1.length) {
            return false;
         }

         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var0[var2] != var1[var2]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean n5(long[] var0, long[] var1) {
      if (var0 == var1) {
         return true;
      }

      if (var0 != null && var1 != null) {
         if (var0.length != var1.length) {
            return false;
         }

         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var0[var2] != var1[var2]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean n5(float[] var0, float[] var1) {
      if (var0 == var1) {
         return true;
      }

      if (var0 != null && var1 != null) {
         if (var0.length != var1.length) {
            return false;
         }

         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var0[var2] != var1[var2]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static w1 n5(w1 var0) {
      float var1 = 72.0F;
      return new w1(
         com.aspose.slides.internal.v6g.k5.a6(q1.u3((float)(var0.n5() & 4294967295L) / var1 * 25.4F), 14),
         com.aspose.slides.internal.v6g.k5.a6(q1.u3((float)(var0.l6() & 4294967295L) / var1 * 25.4F), 14)
      );
   }

   public static float n5(com.aspose.slides.internal.o9b.w1 var0, String var1, n3 var2, int var3, float var4) {
      float var5 = var0.k5();
      y4 var6 = var2.l6();
      int var7 = var2.x8();
      int var8 = var6.h0(var7);
      float var9 = (float)var2.a6() / var8;
      int var10 = var6.k5(var7);
      int var11 = var6.a6(var7);
      i1 var12 = x8.u3().n5(var2.h0(), var2.x8());
      if (var12 != null) {
         var5 += (float)(var12.s7() - var10) * var2.a6() / var8;
         var10 = var12.s7();
         var11 = var12.x8();
      }

      int var13 = var10 + var11;
      if ((var3 & 65535 & 24) == 24) {
         var5 -= var10 * var9;
      } else if ((var3 & 65535 & 8) == 8) {
         var5 -= var13 * var9;
      }

      return var5;
   }

   public static float n5(com.aspose.slides.internal.o9b.w1 var0, String var1, n3 var2, z1 var3, int var4, float var5) {
      float var6 = var0.l6();
      float var7 = n5(var1, var3, var2);
      float var8 = var7 * var5;
      if ((var4 & 65535 & 6) == 6) {
         var6 -= var8 / 2.0F;
      } else if ((var4 & 65535 & 2) == 2) {
         var6 -= var8;
      }

      return var6;
   }

   public static com.aspose.slides.internal.o9b.w1 l6(com.aspose.slides.internal.o9b.w1 var0, String var1, n3 var2, z1 var3, int var4, float var5) {
      float var6 = n5(var0.u3(), var1, var2, var3, var4, var5);
      float var7 = n5(var0.u3(), var1, var2, var4, var5);
      return new com.aspose.slides.internal.o9b.w1(var6, var7);
   }

   private static float n5(String var0, z1 var1, n3 var2) {
      if (d1.n5(var0)) {
         return 0.0F;
      }

      boolean var3 = true;

      for (int var4 = 0; var4 < var0.length(); var4++) {
         char var5 = var0.charAt(var4);
         if (var5 != 8203) {
            var3 = false;
            break;
         }
      }

      if (var3) {
         return 0.0F;
      }

      e5 var9 = new e5(e5.t2());
      var9.k5(var9.k5() | 2048);
      com.aspose.slides.internal.o9b.u9[] var10 = new com.aspose.slides.internal.o9b.u9[]{new com.aspose.slides.internal.o9b.u9(0, var0.length())};
      var9.n5(var10);
      a0[] var6 = var1.n5(var0, var2, y1.n5(y2.n5).y4(), var9);
      if (var6.length > 0) {
         y1 var7 = var6[0].n5(var1).y4();
         if (var7.c8().n5()) {
            f2 var8 = var1.n5(var0, var2, new com.aspose.slides.internal.o9b.w1(), var9).a6();
            if (var8.n5()) {
               throw new NotImplementedException();
            }

            var7.l6(var8.l6());
         }

         return var7.s7();
      } else {
         return 0.0F;
      }
   }

   public static long n5(long var0, long var2, byte var4) {
      long var5 = 4278190080L;
      int var7 = (int)(var0 & 4294967295L & 255L);
      int var8 = (int)(var2 & 4294967295L & 255L);
      var5 = (var5 | var8 + (var7 - var8) * (var4 & 255) / 255 & 4294967295L) & 4294967295L;
      var7 = (int)(var0 & 4294967295L & 65280L);
      var8 = (int)(var2 & 4294967295L & 65280L);
      var5 = (var5 | var8 + (var7 - var8) * (var4 & 255) / 255 & 0xFF00 & 4294967295L) & 4294967295L;
      var7 = (int)((var0 & 4294967295L) >> 16 & 4294967295L & 255L);
      var8 = (int)((var2 & 4294967295L) >> 16 & 4294967295L & 255L);
      return (var5 | var8 + (var7 - var8) * (var4 & 255) / 255 << 16 & 4294967295L) & 4294967295L;
   }

   public static byte[] n5(t4 var0) {
      long var1 = var0.getPosition();
      byte[] var3 = null;

      try {
         var0.setPosition(0L);
         l6 var4 = l6.n5(var0);

         try {
            if (var4.l6() == 1) {
               IGenericEnumerator var5 = var4.n5().iterator();

               try {
                  while (var5.hasNext()) {
                     v4 var6 = (v4)var5.next();
                     if (var6.t9() == 65535) {
                        var3 = ((s7)var6).l6();
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } finally {
         var0.setPosition(var1);
      }

      return var3;
   }
}
