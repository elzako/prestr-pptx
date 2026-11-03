package com.aspose.slides.internal.e3m;

import com.aspose.slides.exceptions.AccessViolationException;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.l6j.l6;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.x9;
import com.aspose.slides.ms.System.y4;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

public class n5 {
   public static void n5(byte[] var0, int var1, x9 var2, int var3) {
      if (var2 != null && var2.k5() != null) {
         n5(var0, 1, var1, var2, var2.k5().k5(), var3);
      } else {
         throw new ArgumentNullException();
      }
   }

   public static void n5(int[] var0, int var1, x9 var2, int var3) {
      if (var2 != null && var2.k5() != null) {
         n5(var0, 4, var1, var2, var2.k5().k5(), var3);
      } else {
         throw new ArgumentNullException();
      }
   }

   public static void n5(x9 var0, byte[] var1, int var2, int var3) {
      if (var0 != null && var0.k5() != null) {
         n5(var0, var0.k5().k5(), var1, 1, var2, var3);
      } else {
         throw new ArgumentNullException();
      }
   }

   public static void n5(x9 var0, int[] var1, int var2, int var3) {
      if (var0 != null && var0.k5() != null) {
         n5(var0, var0.k5().k5(), var1, 4, var2, var3);
      } else {
         throw new ArgumentNullException();
      }
   }

   public static x9 n5(int var0) {
      if (var0 <= 0) {
         throw new ArgumentOutOfRangeException("cb", "Non-negative number required.");
      } else {
         return new x9(com.aspose.slides.internal.l6j.n5.n5(new byte[var0]));
      }
   }

   public static void n5(x9 var0) {
      var0.k5().u9();
   }

   public static byte n5(x9 var0, int var1) {
      if (var0 != null && var0.k5() != null) {
         byte[] var2 = new byte[1];
         n5(var0, var0.k5().k5() + var1, var2, 1, 0, 1);
         return var2[0];
      } else {
         throw new ArgumentNullException();
      }
   }

   public static void n5(x9 var0, int var1, byte var2) {
      if (var0 != null && var0.k5() != null) {
         n5(new byte[]{var2}, n5(byte.class), 0, var0, var0.k5().k5() + var1, 1);
      } else {
         throw new ArgumentNullException();
      }
   }

   public static int l6(x9 var0, int var1) {
      if (var0 != null && var0.k5() != null) {
         int[] var2 = new int[1];
         n5(var0, var0.k5().k5() + var1, var2, 4, 0, 1);
         return var2[0];
      } else {
         throw new ArgumentNullException();
      }
   }

   public static void k5(x9 var0, int var1) {
      if (var0 != null && var0.k5() != null) {
         n5(new int[]{var1}, 4, 0, var0, var0.k5().k5(), 1);
      } else {
         throw new ArgumentNullException();
      }
   }

   public static void n5(x9 var0, int var1, int var2) {
      if (var0 != null && var0.k5() != null) {
         n5(new int[]{var2}, 4, 0, var0, var0.k5().k5() + var1, 1);
      } else {
         throw new ArgumentNullException();
      }
   }

   public static int n5(Class var0) {
      if (var0 == x9.class || var0 == long.class || var0 == Long.class) {
         return 8;
      } else if (var0 == int.class || var0 == Integer.class) {
         return 4;
      } else if (var0 == short.class || var0 == Short.class) {
         return 2;
      } else if (var0 == byte.class || var0 == Byte.class) {
         return 1;
      } else if (var0 == char.class || var0 == Character.class) {
         return 2;
      } else if (var0 == boolean.class || var0 == Boolean.class) {
         return 1;
      } else if (var0 == float.class || var0 == Float.class) {
         return 4;
      } else if (var0 != double.class && var0 != Double.class) {
         throw new NotSupportedException(var0 + " type is not supported");
      } else {
         return 8;
      }
   }

   private static void n5(Object var0, int var1, int var2, x9 var3, int var4, int var5) {
      if (var3 == null || var3.n5()) {
         throw new ArgumentNullException("Destination cannot be null");
      }

      if (var0 == null) {
         throw new ArgumentNullException("Source cannot be null");
      }

      com.aspose.slides.internal.l6j.n5 var6 = var3.k5();
      if (!(var6 instanceof l6)) {
         throw new ArgumentException("invalid type of destination", "destination");
      }

      l6 var7 = (l6)var6;
      if (var7.n5() instanceof byte[] && var0 instanceof int[]) {
         int[] var12 = (int[])var0;
         byte[] var13 = (byte[])var7.n5();
         n5(var2, var4, var5, var6, var7, var12.length, var13.length);
         ByteBuffer var10 = ByteBuffer.wrap(var13, var4, var5 * var1).order(ByteOrder.LITTLE_ENDIAN);
         var10.asIntBuffer().put(var12, var2, var5);
      } else {
         u3 var8 = u3.n5((Object)(var0));
         u3 var9 = u3.n5((Object)(var6.n5()));
         n5(var2, var4, var5, var6, var7, var8.a6(), var9.a6());

         try {
            y4.n5(var8, var2 * var1, var9, var4, var5 * var1);
         } catch (ArgumentException var11) {
            throw new AccessViolationException("Cannot write. Address inaccessible");
         }
      }
   }

   private static void n5(int var0, int var1, int var2, com.aspose.slides.internal.l6j.n5 var3, l6 var4, int var5, int var6) {
      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
      }

      if (var0 < 0) {
         throw new ArgumentOutOfRangeException("sourceStartIndex", "Non-negative number required.");
      }

      if (var0 > var5 - var2) {
         throw new ArgumentOutOfRangeException("Source array was not long enough");
      }

      if (var1 > var6 - var2) {
         throw new AccessViolationException("Source array was not long enough");
      }

      if (var3.k5() > (var6 - var2) * var4.h0()) {
         throw new ArgumentOutOfRangeException("Destination array was not long enough");
      }
   }

   private static void n5(x9 var0, int var1, Object var2, int var3, int var4, int var5) {
      if (var0 == null || var0.n5()) {
         throw new ArgumentNullException("Destination cannot be null");
      }

      if (var2 == null) {
         throw new ArgumentNullException("Source cannot be null");
      }

      com.aspose.slides.internal.l6j.n5 var6 = var0.k5();
      if (!(var6 instanceof l6)) {
         throw new ArgumentException("invalid type of source", "source");
      }

      l6 var7 = (l6)var6;
      if (var6.n5() instanceof byte[] && var2 instanceof int[]) {
         byte[] var12 = (byte[])var6.n5();
         int[] var13 = (int[])var2;
         l6(var1, var4, var5, var6, var7, var12.length, var13.length);
         IntBuffer var10 = ByteBuffer.wrap(var12, var1, var5 * 4).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
         var10.get(var13);
      } else {
         u3 var8 = u3.n5((Object)(var6.n5()));
         u3 var9 = u3.n5((Object)(var2));
         l6(var1, var4, var5, var6, var7, var8.a6(), var9.a6());

         try {
            y4.n5(var8, var1, var9, var4 * var3, var5 * var3);
         } catch (ArgumentException var11) {
            throw new AccessViolationException("Cannot read. Address inaccessible");
         }
      }
   }

   private static void l6(int var0, int var1, int var2, com.aspose.slides.internal.l6j.n5 var3, l6 var4, int var5, int var6) {
      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
      }

      if (var0 > var5 - var2) {
         throw new ArgumentOutOfRangeException("Source array was not long enough");
      }

      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("destinationStartIndex", "Non-negative number required.");
      }

      if (var1 > var6 - var2) {
         throw new ArgumentOutOfRangeException("Destination array was not long enough");
      }

      if (var3.k5() > (var5 - var2) * var4.h0()) {
         throw new ArgumentOutOfRangeException("Source array was not long enough");
      }
   }
}
