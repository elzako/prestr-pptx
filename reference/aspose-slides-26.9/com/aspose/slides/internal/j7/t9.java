package com.aspose.slides.internal.j7;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.e5a.i1;
import com.aspose.slides.internal.z0k.t4;

public class t9 {
   public static byte[] n5(byte[] var0, int var1, int var2) {
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var0);

      try {
         return n5(var3, var1, var2);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public static byte[] n5(t4 var0, int var1, int var2) {
      if (var1 == 0) {
         var1 = (int)var0.getLength();
      }

      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var1);
      t4 var4 = n5(var2, var0, 1);

      try {
         com.aspose.slides.internal.n2d.t4.n5(var4, var3);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      return var3.toArray();
   }

   public static byte[] n5(byte[] var0, int var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(var0);

      try {
         return n5(var2, var1);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public static byte[] n5(t4 var0, int var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         n5(var0, var2, var1);
         return var2.toArray();
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public static int n5(t4 var0, t4 var1, int var2) {
      int var3 = (int)var1.getPosition();
      t4 var4 = n5(var2, var1, 0);

      try {
         com.aspose.slides.internal.n2d.t4.n5(var0, var4);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      return (int)var1.getPosition() - var3;
   }

   public static int n5(byte[] var0, int var1, int var2, t4 var3, int var4) {
      int var5 = (int)var3.getPosition();
      t4 var6 = n5(var4, var3, 0);

      try {
         var6.write(var0, var1, var2);
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      return (int)var3.getPosition() - var5;
   }

   private static t4 n5(int var0, t4 var1, int var2) {
      switch (var0) {
         case 0:
            return new com.aspose.slides.internal.e5a.x8(var1, var2, true);
         case 1:
            return new i1(var1, var2, true);
         default:
            throw new InvalidOperationException("Unknown compression method specified.");
      }
   }
}
