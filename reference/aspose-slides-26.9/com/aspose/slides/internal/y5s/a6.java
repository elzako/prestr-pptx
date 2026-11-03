package com.aspose.slides.internal.y5s;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;
import com.aspose.slides.ms.System.q1;

public class a6 {
   private static final List<a6$n5> n5 = new List<>();
   private static int l6;
   private static int k5;
   private static int u3;
   private static String a6 = com.aspose.slides.internal.z0k.z1.n5();
   private static boolean u9;

   public static long n5() {
      long var0 = 0L;

      for (a6$n5 var3 : n5) {
         if (var3.n5() == 0) {
            var0 += var3.l6();
         }
      }

      return var0;
   }

   public static long l6() {
      long var0 = 0L;

      for (a6$n5 var3 : n5) {
         if (var3.n5() == 1) {
            var0 += var3.l6();
         }
      }

      return var0;
   }

   public static int k5() {
      return l6;
   }

   public static int u3() {
      return u3;
   }

   public static a0 n5(long var0) {
      a6$n5 var2 = null;
      if (u3 == 2 || u3 == 0) {
         if (l6 != 0 && n5() + var0 > l6) {
            if (u3 == 2) {
               throw new OutOfMemoryException(d1.n5("Cannot allocate {0} bytes in-memory as upper limit has reached.", new Object[]{var0}));
            }
         } else {
            try {
               var2 = new a6$n5(new com.aspose.slides.internal.z0k.e2(), 0);
               var2.setLength(var0);
               n5.addItem(var2);
            } catch (RuntimeException var6) {
               if (var2 != null) {
                  var2.dispose();
                  var2 = null;
               }

               if (u3 == 2) {
                  throw var6;
               }
            }
         }
      }

      if (var2 == null && (u3 == 1 || u3 == 0)) {
         com.aspose.slides.internal.z0k.t4 var3 = l6(var0);

         try {
            var2 = new a6$n5(var3, 1);
            n5.addItem(var2);
         } catch (RuntimeException var5) {
            if (var2 != null) {
               var2.dispose();
            }

            var3.dispose();
            throw var5;
         }
      }

      return new a0(var2, true);
   }

   private static com.aspose.slides.internal.z0k.t4 l6(long var0) {
      com.aspose.slides.internal.z0k.n3 var2 = null;
      if (k5 != 0 && l6() + var0 > k5) {
         throw new OutOfMemoryException(d1.n5("Cannot allocate {0} bytes on disk as upper limit has reached.", new Object[]{var0}));
      }

      String var3 = null;

      try {
         do {
            var3 = com.aspose.slides.internal.z0k.z1.l6(a6, d1.n5(new String[]{o0.l6().toString(), ".tmp"}));
         } while (com.aspose.slides.internal.z0k.u9.k5(var3));

         var2 = com.aspose.slides.internal.z0k.u9.n5(var3);
         var2.setLength(var0);
         return var2;
      } catch (RuntimeException var5) {
         if (var2 != null) {
            var2.dispose();
         }

         throw var5;
      }
   }

   private static void l6(a6$n5 var0) {
      n5.removeItem(var0);
   }

   private static void l6(a6$n5 var0, long var1) {
      long var3 = var1 - var0.l6();
      if (u9 && var3 > 0L) {
         if (var0.n5() == 0) {
            if (k5() != 0 && n5() + var3 > k5()) {
               com.aspose.slides.internal.z0k.t4 var5 = l6(var0.getLength());

               try {
                  long var6 = var0.getPosition();
                  var0.seek(0L, 0);
                  n5(var0, var5);
                  var5.setPosition(0L);
                  var0.n5(var5, 1);
                  var5.setPosition(var6);
               } catch (RuntimeException var9) {
                  var5.dispose();
                  throw var9;
               }
            }
         } else if (k5 != 0 && l6() + var3 > k5) {
            throw new OutOfMemoryException(d1.n5("Cannot perform reallocate for additional {0} bytes on disk as upper limit has reached.", new Object[]{var3}));
         }
      }
   }

   private static void n5(com.aspose.slides.internal.z0k.t4 var0, com.aspose.slides.internal.z0k.t4 var1) {
      n5(var0, var1, 4096, var0.getLength());
   }

   private static void n5(com.aspose.slides.internal.z0k.t4 var0, com.aspose.slides.internal.z0k.t4 var1, int var2, long var3) {
      byte[] var5 = new byte[(int)Math.min(var2, var3)];

      int var6;
      while (var3 > 0L && (var6 = var0.read(var5, 0, (int)q1.k5(var5.length, var3))) > 0) {
         var1.write(var5, 0, var6);
         var3 -= var6;
      }
   }

   // $VF: synthetic method
   static void n5(a6$n5 var0, long var1) {
      l6(var0, var1);
   }

   // $VF: synthetic method
   static void n5(a6$n5 var0) {
      l6(var0);
   }
}
