package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.Hashtable;

public class w9 {
   private Hashtable n5;

   public final com.aspose.slides.internal.z0k.t4 n5(
      com.aspose.slides.ms.System.r8 var1,
      com.aspose.slides.internal.g8v.f2 var2,
      com.aspose.slides.internal.g8v.v4 var3,
      com.aspose.slides.internal.k1d.k5 var4
   ) {
      return "file".equals(var1.t9()) ? new com.aspose.slides.internal.z0k.n3(var1.x8(), 3, 1, 1, 1) : this.l6(var1, var2, var3, var4);
   }

   private com.aspose.slides.internal.z0k.t4 l6(
      com.aspose.slides.ms.System.r8 var1,
      com.aspose.slides.internal.g8v.f2 var2,
      com.aspose.slides.internal.g8v.v4 var3,
      com.aspose.slides.internal.k1d.k5 var4
   ) {
      com.aspose.slides.internal.g8v.b5 var5 = com.aspose.slides.internal.g8v.b5.n5(var1);
      if (var2 != null) {
         var5.n5(var2);
      }

      if (var3 != null) {
         var5.n5(var3);
      }

      com.aspose.slides.internal.g8v.u8 var6 = var5.z8();
      com.aspose.slides.internal.g8v.w1 var7 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.g8v.w1.class);
      if (var7 != null) {
         synchronized (this) {
            if (this.n5 == null) {
               this.n5 = new Hashtable();
            }

            e9 var9 = (e9)this.n5.get_Item(var7.n5().a6());
            if (var9 == null) {
               var9 = new e9();
            }

            if (var9.n5 < var7.m3().l6() - 1) {
               if (var9.n5 == 0) {
                  this.n5.addItem(var7.n5().a6(), var9);
               }

               var9.n5++;
               return new k2(var6.u9(), this, var7.n5().a6());
            } else {
               return new w8(var6.l6(), var6.u9());
            }
         }
      } else {
         return var6.u9();
      }
   }

   public final void n5(String var1) {
      synchronized (this) {
         e9 var3 = (e9)this.n5.get_Item(var1);
         if (var3 != null && --var3.n5 == 0) {
            this.n5.removeItem(var1);
         }
      }
   }
}
