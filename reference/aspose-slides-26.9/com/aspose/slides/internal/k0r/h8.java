package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.Dictionary;

public class h8 extends r4 {
   private byte[] n5 = null;
   private Dictionary<Long, e6r> l6 = new Dictionary<>();

   public void n5(g2 var1) {
      this.e2().addItem(var1);
   }

   public g2 n5(long var1) {
      e6r var3 = null;
      e6r[] var4 = new e6r[]{var3};
      this.l6.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var3 != null) {
         return var3 instanceof g2 ? (g2)var3 : null;
      }

      if (var1 >= 0L && var1 < this.n5.length) {
         com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2(this.n5);
         com.aspose.slides.internal.z0k.n5 var6 = new com.aspose.slides.internal.z0k.n5(var5);
         var5.setPosition(var1);
         z6z var7 = new z6z(var6);
         var3 = p5k.n5(var7, null, null, var6);
         if (!(var3 instanceof g2)) {
            return null;
         }

         var3.n5(var6, var7);
         this.e2().addItem(var3);
         this.l6.addItem(var1, var3);
         return var3 instanceof g2 ? (g2)var3 : null;
      } else {
         return null;
      }
   }

   public boolean l6() {
      return this.n5 != null && this.n5.length > 7;
   }

   public h8(com.aspose.slides.internal.x1.x8 var1) {
      com.aspose.slides.internal.x1.u9 var2 = (com.aspose.slides.internal.x1.u9)var1.n5().u3("Pictures");
      if (var2 != null) {
         this.n5 = var2.n5();
      }
   }

   h8() {
   }
}
