package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;

public final class n3 {
   public static int n5(boolean var0, boolean var1) {
      if (var0 == var1) {
         return 0;
      } else {
         return !var0 ? -1 : 1;
      }
   }

   public static int n5(boolean var0, Object var1) {
      if (var1 == null) {
         return 1;
      } else if (var1.getClass() != Boolean.class) {
         throw new ArgumentException("Object is not a Boolean.");
      } else {
         boolean var2 = z3.n5(var1);
         if (var0 && !var2) {
            return 1;
         } else {
            return var0 == var2 ? 0 : -1;
         }
      }
   }

   public static boolean l6(boolean var0, boolean var1) {
      return var0 == var1;
   }

   public static int n5(boolean var0) {
      return var0 ? 1 : 0;
   }

   public static boolean n5(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("value");
      } else {
         var0 = d1.l6(var0);
         if (d1.n5(var0, "True", true, com.aspose.slides.internal.x7n.l6.k5()) == 0) {
            return true;
         } else if (d1.n5(var0, "False", true, com.aspose.slides.internal.x7n.l6.k5()) == 0) {
            return false;
         } else {
            throw new FormatException("Value is not equivalent to either TrueString or FalseString.");
         }
      }
   }

   public static boolean n5(String var0, boolean[] var1) {
      var1[0] = false;
      if (var0 == null) {
         return false;
      }

      var0 = d1.l6(var0);

      try {
         var1[0] = n5(var0);
         return true;
      } catch (FormatException var3) {
         return false;
      }
   }

   public static String l6(boolean var0) {
      return !var0 ? "False" : "True";
   }
}
