package com.aspose.slides.ms.System;

import com.aspose.slides.Collections.Comparer;
import com.aspose.slides.exceptions.ArgumentException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public abstract class d5$n5 {
   private final Class<?> c;
   private final Class<? extends Number> d;
   protected final d5$n5$n5 constants;
   String[] a;
   long[] b;

   protected d5$n5(Class<? extends d5> var1, Class<? extends Number> var2) {
      this.c = var1;
      this.d = var2;
      this.constants = new d5$n5$n5();
   }

   protected final void addConstant(String name, long value) {
      this.constants.put(name, value);
      this.a = null;
   }

   public final Class<?> getEnumClass() {
      return this.c;
   }

   public final Class<? extends Number> getUnderlineClass() {
      return this.d;
   }

   protected String getName(long value) {
      this.a();
      int var3 = a(this.b, value);
      return var3 >= 0 ? this.a[var3] : null;
   }

   private void a() {
      if (this.a == null || this.b == null) {
         long[] var1 = new long[this.constants.size()];
         String[] var2 = new String[this.constants.size()];
         Iterator var3 = this.constants.entrySet().iterator();

         for (int var4 = 0; var3.hasNext(); var4++) {
            Entry var5 = (Entry)var3.next();
            var1[var4] = (Long)var5.getValue();
            var2[var4] = (String)var5.getKey();
         }

         Comparer var12 = Comparer.Default;

         for (int var6 = 1; var6 < var1.length; var6++) {
            int var7 = var6;
            String var8 = var2[var6];
            long var9 = var1[var6];
            boolean var11 = false;

            while (var12.compare(var1[var7 - 1], var9) > 0) {
               var2[var7] = var2[var7 - 1];
               var1[var7] = var1[var7 - 1];
               var7--;
               var11 = true;
               if (var7 == 0) {
                  break;
               }
            }

            if (var11) {
               var2[var7] = var8;
               var1[var7] = var9;
            }
         }

         this.a = var2;
         this.b = var1;
      }
   }

   private static int a(long[] var0, long var1) {
      long[] var3 = new long[var0.length];
      System.arraycopy(var0, 0, var3, 0, var0.length);
      return u3.n5(u3.n5((Object)(var3)), var1);
   }

   protected String internalFormat(long value) {
      if (!(this instanceof d5$k5)) {
         String var3 = this.getName(value);
         return var3 == null ? Long.toString(value) : var3;
      } else {
         return this.internalFlagsFormat(value);
      }
   }

   protected String internalFlagsFormat(long value) {
      String var3 = this.getName(value);
      if (var3 != null) {
         return var3;
      }

      if (value == 0L) {
         return Long.toString(value);
      }

      long var4 = value;
      LinkedHashSet var6 = new LinkedHashSet();
      this.a();

      for (int var7 = 0; var7 < this.b.length; var7++) {
         long var8 = this.b[var7];
         String var10 = this.a[var7];
         if (var8 != 0L && (value & var8) == var8) {
            var6.add(var10);
            value ^= var8;
         }
      }

      if (value != 0L) {
         return Long.toString(var4);
      }

      StringBuilder var13 = new StringBuilder();
      Iterator var11 = var6.iterator();

      while (var11.hasNext()) {
         String var12 = (String)var11.next();
         var13.append(var12);
         if (!var11.hasNext()) {
            break;
         }

         var13.append(", ");
      }

      return var13.toString();
   }

   public final long getValue(String name, boolean ignoreCase) {
      for (Entry var4 : this.constants.entrySet()) {
         if (d1.n5((String)var4.getKey(), name, ignoreCase) == 0) {
            return (Long)var4.getValue();
         }
      }

      throw new ArgumentException("Requested value '{0}' was not found.", name);
   }
}
