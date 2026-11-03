package com.aspose.slides.internal.v1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.ms.System.d1;

public class h0 {
   private final IGenericDictionary<com.aspose.slides.internal.v2.c8, t2> n5 = new Dictionary<>();

   public h0() {
      c8 var1 = new c8();
      new a6();
      k5 var3 = new k5();
      n3 var4 = new n3();
      l6 var5 = new l6();
      n5 var6 = new n5();
      e2 var7 = new e2();
      u3 var8 = new u3();
      x8 var9 = new x8();
      s7 var10 = new s7();
      this.n5.addItem(com.aspose.slides.internal.v2.c8.v9, var1);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.r9, var1);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.u5, var9);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.w8, var9);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.y0, var3);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.j9, var3);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.s5, var4);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.l2, var4);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.z3, var5);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.m1, var5);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.t9, var6);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.z1, var6);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.l7h, var7);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.r7c, var7);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.a7, var8);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.q8, var9);
      this.n5.addItem(com.aspose.slides.internal.v2.c8.q7, var10);
   }

   public final t2 n5(com.aspose.slides.internal.v2.c8 var1) {
      if (!this.n5.containsKey(var1)) {
         String var2 = d1.n5("Unknown stream filter is encountered: {0}", new Object[]{var1});
         throw new IOException(var2);
      } else {
         return this.n5.get_Item(var1);
      }
   }
}
