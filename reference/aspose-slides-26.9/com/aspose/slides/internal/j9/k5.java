package com.aspose.slides.internal.j9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public abstract class k5 {
   private static final k5 n5 = new u3();

   public static k5 n5(int var0) {
      switch (var0) {
         case 26:
            return n5;
         case 27:
            return null;
         default:
            throw new ArgumentException("Illegal border-collapse mode.");
      }
   }

   private static int k5(int var0, int var1) {
      if (var0 < var1) {
         return -1;
      } else {
         return var0 == var1 ? 0 : 1;
      }
   }

   private static int l6(int var0) {
      switch (var0) {
         case 31:
            return -2;
         case 36:
            return -3;
         case 37:
            return 0;
         case 55:
            return -6;
         case 67:
            return -7;
         case 101:
            return -5;
         case 119:
            return -4;
         case 133:
            return -1;
         default:
            throw new InvalidOperationException(d1.n5(new String[]{"Illegal border style: ", a3.l6(var0)}));
      }
   }

   public static int n5(int var0, int var1) {
      int var2 = l6(var0);
      int var3 = l6(var1);
      return k5(var2, var3);
   }

   private static int k5(int var0) {
      switch (var0) {
         case 71:
            return -4;
         case 72:
         case 74:
         default:
            throw new InvalidOperationException();
         case 73:
         case 77:
         case 78:
            return -2;
         case 75:
            return 0;
         case 76:
            return -3;
         case 79:
            return -1;
      }
   }

   public static int l6(int var0, int var1) {
      int var2 = k5(var0);
      int var3 = k5(var1);
      return k5(var2, var3);
   }

   public abstract com.aspose.slides.internal.u6.n5 n5(com.aspose.slides.internal.u6.n5 var1, com.aspose.slides.internal.u6.n5 var2);
}
