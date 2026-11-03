package com.aspose.slides.internal.x7n;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;
import java.text.CollationKey;
import java.text.Collator;
import java.util.HashMap;
import java.util.Map;

public class n5 {
   private l6 n5;
   private int l6;
   private Map<n5$n5<Integer, Integer>, Collator> k5;
   private static final Map<Integer, Map<n5$n5<Integer, Integer>, Collator>> u3 = new HashMap<>();
   private final Map<Long, Collator> a6 = new HashMap<>();
   private static final boolean u9 = Collator.getInstance() == Collator.getInstance();

   private n5() {
   }

   n5(l6 var1) {
      this.n5 = var1;
      this.l6 = var1.t2();
   }

   private Collator n5(int var1, int var2) {
      if (this.k5 == null) {
         synchronized (u3) {
            if (this.k5 == null) {
               Map var4 = u3.get(this.l6);
               if (var4 == null) {
                  var4 = new HashMap(12);
                  u3.put(this.l6, var4);
               }

               this.k5 = var4;
            }
         }
      }

      synchronized (this.k5) {
         n5$n5 var13 = new n5$n5<>(this, var1, var2);
         Collator var5 = this.k5.get(var13);
         if (var5 == null) {
            var5 = Collator.getInstance(com.aspose.slides.internal.x7n.l6.n5(this.n5));
            if (u9) {
               var5 = (Collator)var5.clone();
            }

            var5.setStrength(var1);
            var5.setDecomposition(var2);
            this.k5.put(var13, var5);
         }

         long var6 = Thread.currentThread().getId();
         Collator var8 = this.a6.get(var6);
         if (var8 == null) {
            var8 = (Collator)var5.clone();
            this.a6.put(var6, var8);
         } else if (var8.getStrength() != var5.getStrength() || var8.getDecomposition() != var5.getDecomposition()) {
            var8 = (Collator)var5.clone();
            this.a6.put(var6, var8);
         }

         return var8;
      }
   }

   private int l6(String var1, int var2, int var3, String var4, int var5, int var6, long var7) {
      String var9 = var1.substring(var2, var2 + var3);
      String var10 = var4.substring(var5, var5 + var6);
      if (var7 != 1073741824L && var7 != 268435456L) {
         byte var11;
         if ((var7 & 1L) != 1L && (var7 & 268435456L) != 268435456L) {
            var11 = 2;
         } else if ((var7 & 2L) == 2L) {
            var11 = 0;
         } else {
            var11 = 1;
         }

         byte var12;
         if ((var7 & 8L) == 8L || (var7 & 4L) == 4L || (var7 & 16L) == 16L) {
            var12 = 2;
         } else if ((var7 & 2L) == 2L) {
            var12 = 1;
         } else {
            var12 = 0;
         }

         Collator var13 = this.n5(var11, var12);
         return var13.compare(var9, var10);
      } else {
         return this.n5(var9, var10, var7 == 268435456L);
      }
   }

   private int n5(String var1, String var2, boolean var3) {
      if (var3) {
         var1 = d1.l6(var1, com.aspose.slides.internal.x7n.l6.k5());
         var2 = d1.l6(var2, com.aspose.slides.internal.x7n.l6.k5());
      }

      int var4 = 0;

      for (int var5 = 0; var5 < var1.length() && var5 < var2.length(); var5++) {
         if (var1.charAt(var5) != var2.charAt(var5)) {
            var4 = var1.charAt(var5) - var2.charAt(var5);
            break;
         }
      }

      if (var4 == 0 && var1.length() != var2.length()) {
         var4 = var1.length() - var2.length() > 0 ? 1 : -1;
      }

      return var4;
   }

   public int n5(String var1, String var2) {
      return this.n5(var1, var2, 0L);
   }

   public int n5(String var1, String var2, long var3) {
      if ((var3 & 1879048223L) != var3) {
         throw new ArgumentException("options");
      } else if (var1 == null) {
         return var2 == null ? 0 : -1;
      } else if (var2 == null) {
         return 1;
      } else {
         return var1.length() == 0 && var2.length() == 0 ? 0 : this.l6(var1, 0, var1.length(), var2, 0, var2.length(), var3);
      }
   }

   public int n5(String var1, int var2, int var3, String var4, int var5, int var6, long var7) {
      if ((var7 & 1879048223L) != var7) {
         throw new ArgumentException("options");
      }

      if (var1 == null) {
         return var4 == null ? 0 : -1;
      }

      if (var4 == null) {
         return 1;
      }

      if (var1.length() != 0 && var2 != var1.length() && var3 != 0 || var4.length() != 0 && var5 != var4.length() && var6 != 0) {
         if (var2 < 0 || var3 < 0 || var5 < 0 || var6 < 0) {
            throw new ArgumentException("Parameter name: Offsets and lengths must not be less than zero");
         } else if (var2 > var1.length()) {
            throw new ArgumentException("Parameter name: Offset1 is greater than or equal to the length of string1");
         } else if (var5 > var4.length()) {
            throw new ArgumentException("Parameter name: Offset2 is greater than or equal to the length of string2");
         } else if (var3 > var1.length() - var2) {
            throw new ArgumentException("Parameter name: Length1 is greater than the number of characters from offset1 to the end of string1");
         } else if (var6 > var4.length() - var5) {
            throw new ArgumentException("Parameter name: Length2 is greater than the number of characters from offset2 to the end of string2");
         } else {
            return this.l6(var1, var2, var3, var4, var5, var6, var7);
         }
      } else {
         return 0;
      }
   }

   @Override
   public boolean equals(Object value) {
      n5 var2 = value instanceof n5 ? (n5)value : null;
      return var2 == null ? false : var2.l6 == this.l6;
   }

   @Override
   public int hashCode() {
      return this.n5();
   }

   public CollationKey n5(String var1, long var2) {
      byte var4;
      if ((var2 & 1L) == 1L) {
         if ((var2 & 2L) == 2L) {
            var4 = 0;
         } else {
            var4 = 1;
         }
      } else {
         var4 = 2;
      }

      byte var5;
      if ((var2 & 8L) == 8L || (var2 & 4L) == 4L || (var2 & 16L) == 16L) {
         var5 = 2;
      } else if ((var2 & 2L) == 2L) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      Collator var6 = this.n5(var4, var5);
      return var6.getCollationKey(var1);
   }

   public boolean l6(String var1, String var2, long var3) {
      if (var1 == null) {
         throw new ArgumentNullException("source");
      } else if (var2 == null) {
         throw new ArgumentNullException("prefix");
      } else if ((var3 & 1342177311L) != var3) {
         throw new ArgumentException("options");
      } else {
         return var1.length() < var2.length() ? false : this.n5(var1, 0, var2.length(), var2, 0, var2.length(), var3) == 0;
      }
   }

   public boolean k5(String var1, String var2, long var3) {
      if (var1 == null) {
         throw new ArgumentNullException("source");
      } else if (var2 == null) {
         throw new ArgumentNullException("suffix");
      } else if ((var3 & 1342177311L) != var3) {
         throw new ArgumentException("options");
      } else {
         return var1.length() < var2.length() ? false : this.n5(var1, var1.length() - var2.length(), var2.length(), var2, 0, var2.length(), var3) == 0;
      }
   }

   public int u3(String var1, String var2, long var3) {
      return this.n5(var1, var2, 0, var1.length(), var3);
   }

   public int n5(String var1, String var2, int var3, int var4) {
      return this.n5(var1, var2, var3, var4, 0L);
   }

   public int n5(String var1, String var2, int var3, int var4, long var5) {
      if (var1 == null) {
         throw new ArgumentNullException("source");
      }

      if (var2 == null) {
         throw new ArgumentNullException("value");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("startIndex");
      }

      if (var4 < 0 || var1.length() - var3 < var4) {
         throw new ArgumentOutOfRangeException("count");
      }

      if ((var5 & 1342177311L) != var5) {
         throw new ArgumentException("options");
      }

      if (var2.length() == 0) {
         return var3;
      }

      if (var4 == 0) {
         return -1;
      }

      if (var1.length() != var2.length()) {
         for (int var7 = var3; var7 < var3 + var4; var7++) {
            int var8 = var2.length();
            String var9 = d1.l6(var1, var7, Math.min(var8, var1.length() - var7));
            if (this.n5(var9, var2, var5) == 0 && var7 >= var3 && var7 + var8 <= var4 + var3) {
               return var7;
            }
         }

         return -1;
      } else {
         return this.n5(var1, var3, var4, var2, 0, var2.length(), var5) == 0 ? var3 : -1;
      }
   }

   public int l6(String var1, String var2, int var3, int var4) {
      return this.l6(var1, var2, var3, var4, 0L);
   }

   public int l6(String var1, String var2, int var3, int var4, long var5) {
      if (var1 == null) {
         throw new ArgumentNullException("source");
      }

      if (var2 == null) {
         throw new ArgumentNullException("value");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("startIndex");
      }

      if (var4 < 0 || var3 - var4 < -1) {
         throw new ArgumentOutOfRangeException("count");
      }

      if ((var5 & 1342177311L) != var5) {
         throw new ArgumentException("options");
      }

      if (var4 == 0) {
         return -1;
      }

      int var7 = var2.length();
      if (var7 == 0) {
         return var3;
      }

      if (var1.length() != var2.length()) {
         for (int var8 = var3; var8 > var3 - var4; var8--) {
            int var9 = var2.length();
            String var10 = d1.l6(var1, var8, Math.min(var9, var1.length() - var8));
            if (this.n5(var10, var2, var5) == 0 && var8 <= var3 && var8 >= var3 - var4 && var8 + var9 - 1 <= var3 && var7 <= var4) {
               return var8;
            }
         }

         return -1;
      } else {
         return this.n5(var1, var2, var5) == 0 ? 0 : -1;
      }
   }

   @Override
   public String toString() {
      return "CompareInfo - " + this.l6;
   }

   public int n5() {
      return this.l6;
   }
}
