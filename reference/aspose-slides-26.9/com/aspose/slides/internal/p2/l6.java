package com.aspose.slides.internal.p2;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.v2.e2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.t9;
import com.aspose.slides.ms.System.z3;

public abstract class l6 implements e2 {
   public final Dictionary<Integer, String> n5 = new Dictionary<>();
   public final Dictionary<String, Integer> l6 = new Dictionary<>();
   private static final Dictionary<String, String> k5 = new Dictionary<>();
   private static final Dictionary<String, String> u3 = new Dictionary<>();

   private static void n5(String var0, String var1) {
      if (!k5.containsKey(var0)) {
         k5.addItem(var0, var1);
      } else {
         k5.set_Item(var0, var1);
      }
   }

   private static void l6(String var0, String var1) {
      if (!u3.containsKey(var0)) {
         u3.addItem(var0, var1);
      } else {
         u3.set_Item(var0, var1);
      }
   }

   private int k5(int var1) {
      String var2 = a3.l6(var1);
      int var3 = 0;

      for (int var4 = 0; var4 < var2.length(); var4++) {
         char var5 = var2.charAt(var2.length() - 1 - var4);
         short var6 = this.n5(var5);
         var3 += var6 * this.n5(8, var4);
      }

      return var3;
   }

   private short n5(char var1) {
      switch (var1) {
         case '0':
            return 0;
         case '1':
            return 1;
         case '2':
            return 2;
         case '3':
            return 3;
         case '4':
            return 4;
         case '5':
            return 5;
         case '6':
            return 6;
         case '7':
            return 7;
         case '8':
            return 8;
         case '9':
            return 9;
         default:
            throw new InvalidOperationException(d1.n5("Could not convert the character {0} to a short.", new Object[]{var1}));
      }
   }

   private int n5(int var1, int var2) {
      int var3 = 1;

      while (var2 != 0) {
         if ((var2 & 1) == 1) {
            var3 *= var1;
         }

         var1 *= var1;
         var2 >>= 1;
      }

      return var3;
   }

   public final void n5(int var1, String var2) {
      int var3 = this.k5(var1);
      this.l6(var3, var2);
   }

   public final void l6(int var1, String var2) {
      if (!this.n5.containsKey(var1)) {
         this.n5.addItem(var1, var2);
      } else {
         this.n5.set_Item(var1, var2);
      }

      if (!this.l6.containsKey(var2)) {
         this.l6.addItem(var2, var1);
      } else {
         this.l6.set_Item(var2, var1);
      }
   }

   public final String n5(int var1) {
      return !this.n5.containsKey(var1) ? d1.n5 : this.n5.get_Item(var1);
   }

   public final String l6(int var1) {
      String var2 = this.n5(var1);
      return var2 != null ? this.n5(var2) : null;
   }

   public final String n5(String var1) {
      String var2 = null;
      if (k5.containsKey(var1)) {
         var2 = k5.get_Item(var1);
      }

      if (var2 == null) {
         if (d1.u3(var1, '.') > 0) {
            var2 = this.n5(d1.l6(var1, 0, d1.u3(var1, '.')));
         } else if (d1.l6(var1, "uni")) {
            int var3 = var1.length();
            a5 var4 = new a5();

            try {
               for (int var5 = 3; var5 + 4 <= var3; var5 += 4) {
                  int var6 = z3.l6(d1.l6(var1, var5, var5 + 4), 16);
                  if (var6 <= 55295 || var6 >= 57344) {
                     var4.n5((char)var6);
                  }
               }

               var2 = var4.toString();
               n5(var1, var2);
            } catch (FormatException var8) {
               var2 = var1;
            }
         } else if (d1.l6(var1, "u")) {
            try {
               int var9 = z3.l6(d1.k5(var1, 1), 16);
               if (var9 <= 55295 || var9 >= 57344) {
                  var2 = z3.t9((char)var9);
                  n5(var1, var2);
               }
            } catch (RuntimeException var7) {
               var2 = var1;
            }
         } else if (this.l6.containsKey(var1)) {
            int var10 = this.l6.get_Item(var1);
            var2 = t9.q0((char)var10);
         } else {
            var2 = var1;
         }
      }

      return var2;
   }

   static {
      n5(".notdef", "");
      n5("fi", "fi");
      n5("fl", "fl");
      n5("ffi", "ffi");
      n5("ff", "ff");
      n5("pi", "pi");
      Dictionary$Enumerator var0 = k5.iterator();

      try {
         while (var0.hasNext()) {
            KeyValuePair var1 = (KeyValuePair)var0.next();
            l6((String)var1.getValue(), (String)var1.getKey());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var0, IDisposable.class)) {
            var0.dispose();
         }
      }
   }
}
