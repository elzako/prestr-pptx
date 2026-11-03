package com.aspose.slides.internal.y1;

import com.aspose.slides.internal.r4.t9;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.r8;
import com.aspose.slides.ms.System.z3;
import com.aspose.slides.ms.System.Xml.k1;

public class k5 implements c8 {
   private k1 n5 = new k1();
   private boolean l6 = false;
   private com.aspose.slides.internal.r4.c8 k5;

   public final com.aspose.slides.internal.r4.c8 n5() {
      return this.k5;
   }

   public k5() {
      this(false);
   }

   public k5(boolean var1) {
      this.l6 = var1;
   }

   public static r8 n5(String var0, String var1) {
      r8 var2;
      if (var0 != null && var0.length() > 0) {
         var2 = new r8(z1.l6(var0, var1));
      } else {
         var2 = new r8(var1);
      }

      return var2;
   }

   @Override
   public final t4 n5(String var1, String var2, String var3) {
      String var4 = "data:([\\w/]+);(\\w+),(.*)";
      com.aspose.slides.internal.r7c.u3 var5 = com.aspose.slides.internal.r7c.c8.n5(var1, var4, 66);
      if (var5.u3()) {
         String var6 = var5.a6().n5(1).k5();
         String var7 = var5.a6().n5(2).k5();
         String var8 = var5.a6().n5(3).k5();
         if (d1.c8(var6, "image") != -1 && "base64".equals(var7)) {
            return new e2(z3.s7(var8));
         }
      }

      if (this.k5 != null) {
         t9 var10 = this.k5.n5(this, new com.aspose.slides.internal.r4.e2(var1));
         return var10.n5() == null ? null : new e2(var10.n5());
      }

      r8 var9;
      if (var2 != null && var2.length() > 0) {
         var9 = this.n5.n5(new r8(var2), var1);
      } else if (!d1.n5(var1) && d1.l6(var1, "http")) {
         var9 = new r8(var1);
      } else {
         var9 = n5(var3, var1);
      }

      return (t4)this.n5.n5(var9, null, com.aspose.slides.internal.v6g.k5.n5(t4.class));
   }

   public final void n5(com.aspose.slides.internal.r4.c8 var1) {
      this.k5 = var1;
   }
}
