package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Arrays;

final class e6s implements IGenericEnumerable<KeyValuePair<String, c4y>>, com.aspose.slides.internal.e1x.r4, IDisposable {
   private static final Dictionary<String, com.aspose.slides.internal.v7u.k5> n5 = new Dictionary<>();
   private final Dictionary<String, c4y> l6;
   private static final Object k5 = new Object();
   private boolean u3 = false;

   public final int n5() {
      return this.l6.size();
   }

   public e6s() {
      this.l6 = new Dictionary<>();
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<String, c4y>> iterator() {
      return this.l6.iterator();
   }

   @Override
   public final com.aspose.slides.internal.e1x.i1 n5(String var1, int var2) {
      c4y var3 = null;
      c4y[] var4 = new c4y[]{var3};
      boolean var5 = !this.l6.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var5) {
         return null;
      }

      IGenericDictionary var6 = var3.h0();
      byte[] var7 = null;
      byte[][] var8 = new byte[][]{var7};
      boolean var9 = var6.tryGetValue(var2, var8);
      var7 = var8[0];
      if (!var9) {
         var8[0] = var7;
         boolean var10 = var6.tryGetValue(0, var8);
         var7 = var8[0];
         if (!var10) {
            var8[0] = var7;
            boolean var11 = var6.tryGetValue(1, var8);
            var7 = var8[0];
            if (!var11) {
               var8[0] = var7;
               boolean var12 = var6.tryGetValue(2, var8);
               var7 = var8[0];
               if (!var12) {
                  return null;
               }
            }
         }
      }

      return FontsManager.n5(var7, var1);
   }

   public final String[] n5(int var1) {
      List var2 = new List();
      Dictionary$ValueCollection$Enumerator var3 = this.l6.getValues().iterator();

      try {
         while (var3.hasNext()) {
            c4y var4 = (c4y)var3.next();
            int var5 = var1 >> 4;
            if (var5 > 5) {
               var5 = 0;
            }

            if (var4.k5() == var5) {
               var2.addItem(var4.getFontName());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return (String[])var2.toArray(new String[0]);
   }

   @Override
   public com.aspose.slides.internal.o9b.n3 n5(String var1, float var2, int var3) {
      if (!this.l6.containsKey(var1)) {
         return null;
      }

      c4y var4 = this.l6.get_Item(var1);
      int var5 = var3;
      if (!var4.h0().containsKey(var3)) {
         if (var4.h0().containsKey(0)) {
            var5 = 0;
         } else if (var4.h0().containsKey(1)) {
            var5 = 1;
         } else {
            if (!var4.h0().containsKey(2)) {
               return null;
            }

            var5 = 2;
         }
      }

      com.aspose.slides.internal.o9b.y4 var6 = null;
      String var7 = var4.n5(var5);
      if (n5.containsKey(var7)) {
         var6 = n5.get_Item(var7).n5()[0];
      }

      if (var6 != null) {
         try {
            return var5 == 1 && var3 == 3 && var6.c8(var3)
               ? com.aspose.slides.internal.o9b.n3.n5(var6, var2, var3)
               : com.aspose.slides.internal.o9b.n3.n5(var6, var2, var5);
         } catch (RuntimeException var9) {
            return null;
         }
      } else {
         return null;
      }
   }

   public final c4y n5(String var1) {
      if (this.l6 != null && this.l6.size() != 0) {
         Dictionary$Enumerator var2 = this.l6.iterator();

         try {
            while (var2.hasNext()) {
               KeyValuePair var3 = (KeyValuePair)var2.next();
               if (com.aspose.slides.ms.System.d1.a6((String)var3.getKey(), var1)) {
                  return (c4y)var3.getValue();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Override
   public final void dispose() {
      this.n5(true);
   }

   private void n5(boolean var1) {
      if (!this.u3) {
         if (var1) {
            this.l6.clear();
            n5.clear();
         }

         this.u3 = true;
      }
   }

   final void n5(e6s var1) {
      if (var1 != null && var1.n5() != 0) {
         Dictionary$Enumerator var2 = var1.l6.iterator();

         try {
            while (var2.hasNext()) {
               KeyValuePair var3 = (KeyValuePair)var2.next();
               String var4 = (String)var3.getKey();
               if (!this.l6.containsKey(var4)) {
                  c4y var5 = (c4y)var3.getValue();
                  c4y var6 = new c4y(var5.getFontName(), var5.l6(), var5.a6(), var5.u3(), var5.n5().u3(), var5.t2());
                  var6.n5(var5);
                  IGenericEnumerator var7 = var5.h0().iterator();

                  try {
                     while (var7.hasNext()) {
                        KeyValuePair var8 = (KeyValuePair)var7.next();
                        var6.h0().addItem((Integer)var8.getKey(), (byte[])var8.getValue());
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                        var7.dispose();
                     }
                  }

                  IGenericEnumerator var24 = var5.c8().iterator();

                  try {
                     while (var24.hasNext()) {
                        KeyValuePair var9 = (KeyValuePair)var24.next();
                        var6.c8().addItem((Integer)var9.getKey(), (byte[])var9.getValue());
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
                        var24.dispose();
                     }
                  }

                  this.l6.addItem(var4, var6);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   final c4y n5(String var1, byte var2, byte[] var3, int var4, int var5, byte[] var6, boolean var7, LoadOptions var8) {
      byte[] var9 = null;
      byte[] var13;
      if (com.aspose.slides.internal.g7.h9.n5(var6)) {
         com.aspose.slides.internal.z0k.e2 var10 = new com.aspose.slides.internal.z0k.e2(var6);

         try {
            com.aspose.slides.internal.g7.r5 var11 = new com.aspose.slides.internal.g7.r5(var10);
            if (var11.n5().a6() == 1 && var3 != null && (var3[1] & 255) != (var11.n5().u3().n5()[1] & 255)) {
               var1 = var11.n5().u9();
               var2 = (byte)var11.n5().a6();
               var3 = var11.n5().u3().n5();
            }
         } finally {
            if (var10 != null) {
               var10.dispose();
            }
         }

         var9 = var6;
         var13 = FontsManager.l6(var6);
      } else {
         FontData var17 = null;
         FontData[] var19 = new FontData[]{var17};
         var9 = FontsManager.n5(var6, var19);
         var17 = var19[0];
         var13 = var6;
         if (!com.aspose.slides.ms.System.d1.n5(var17.getFontName())
            && var2 != var17.n5()
            && !com.aspose.slides.ms.System.d1.l6(var17.getFontName(), var1)
            && var3 != null
            && !Arrays.equals(var3, var17.k5())) {
            var1 = var17.getFontName();
            var2 = var17.n5();
            var3 = var17.k5();
         }
      }

      return this.n5(var1, var2, var3, var4, var5, var13, var9, var7, var8);
   }

   final c4y n5(String var1, byte var2, byte[] var3, int var4, int var5, byte[] var6, byte[] var7, boolean var8, LoadOptions var9) {
      c4y var10;
      if (this.l6.containsKey(var1)) {
         var10 = this.l6.get_Item(var1);
      } else {
         var10 = new c4y(var1, var2, var3, var4, var5, var8);
         this.l6.addItem(var1, var10);
      }

      var10.n5(var5, var6, var7);
      this.n5(var6, var1, var9, var10.n5(var5));
      return var10;
   }

   final void n5(c4y var1) {
      if (var1 == null) {
         throw new ArgumentNullException("embeddedFont");
      }

      if (!this.l6.containsKey(var1.getFontName())) {
         throw new InvalidOperationException(com.aspose.slides.ms.System.d1.n5("Collection does not contain {0} font", new Object[]{var1.getFontName()}));
      }

      this.l6.removeItemByKey(var1.getFontName());
   }

   private void n5(byte[] var1, String var2, LoadOptions var3, String var4) {
      synchronized (k5) {
         try {
            if (!n5.containsKey(var4)) {
               com.aspose.slides.internal.v7u.k5 var6 = new com.aspose.slides.internal.v7u.k5();
               if (!"OTTO".equals(com.aspose.slides.internal.l7h.j5.z3().l6(var1, 0, 4))) {
                  var6.n5(com.aspose.slides.internal.l6j.n5.n5(var1).a6(), var1.length);
               } else {
                  byte[] var7 = com.aspose.slides.internal.c8e.n5.n5(var1);
                  var6.n5(com.aspose.slides.internal.l6j.n5.n5(var7).a6(), var7.length);
               }

               n5.addItem(var4, var6);
            }
         } catch (FileNotFoundException var13) {
            com.aspose.slides.internal.n8e.v4.n5(var13);
            if (var3 != null) {
               var3.n5(com.aspose.slides.ms.System.d1.n5("Font {0} could not be loaded", new Object[]{var2}), 1);
            }
         } finally {
            ;
         }
      }
   }
}
