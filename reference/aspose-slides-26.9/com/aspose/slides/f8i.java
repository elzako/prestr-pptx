package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class f8i {
   private static final Object n5 = new Object();
   private final a5c l6;
   private final com.aspose.slides.internal.e1x.r4 k5;

   public f8i(com.aspose.slides.internal.e1x.r4 var1) {
      this.l6 = new a5c();
      this.k5 = var1;
   }

   public f8i(int var1, com.aspose.slides.internal.e1x.r4 var2) {
      this.l6 = new a5c(var1);
      this.k5 = var2;
   }

   public final e4z n5(String var1, byte var2, int var3, float var4, int var5, boolean var6) {
      e4z var7 = this.l6(var1, var2, var3, var4, var5, var6);
      if (var7 == null) {
         var7 = this.n5(this.k5, var1, var2, var3, var4, var5, var6);
         if (var7 != null) {
            this.n5(var7);
         }
      }

      return var7;
   }

   public final com.aspose.slides.internal.o9b.n3 n5(String var1, float var2, int var3) {
      return this.k5.n5(var1, var2, var3);
   }

   public void n5() {
      this.l6();
   }

   public final void l6() {
      synchronized (n5) {
         this.l6.n5();
      }
   }

   protected e4z n5(com.aspose.slides.internal.e1x.r4 var1, String var2, byte var3, int var4, float var5, int var6, boolean var7) {
      return i2j.n5(var2, var6, var1, var7, var5, var3, var4, false);
   }

   protected final void n5(e4z var1) {
      synchronized (n5) {
         this.l6.n5(var1);
         this.l6.k5();
      }
   }

   private e4z l6(String var1, byte var2, int var3, float var4, int var5, boolean var6) {
      synchronized (n5) {
         com.aspose.slides.internal.n8e.o5 var8 = this.l6.l6();
         IGenericEnumerator var9 = var8.iterator();

         try {
            while (var9.hasNext()) {
               e4z var10 = (e4z)var9.next();
               if (e4z.n5(var10, var1, var2, var3, var5, var4, var6)) {
                  return var10;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
               var9.dispose();
            }
         }

         return null;
      }
   }
}
